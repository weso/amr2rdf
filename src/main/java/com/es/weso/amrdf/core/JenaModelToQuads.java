package com.es.weso.amrdf.core;

import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.graph.Node;
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.sparql.core.Quad;
import org.apache.jena.graph.NodeFactory;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


public class JenaModelToQuads {


    private static final String UTF_8 = "UTF-8";
    private static final String PROPBANK_NAMESPACE = "http://amr.isi.edu/frames/ld/v1.2.2/";
    private static final String AMR_TERMS_NAMESPACE = "http://amr.isi.edu/rdf/amr-terms#";
    private static final String WESO_NAMESPACE = "http://example.org/onto/";
    private static final String WESO_ENTITIES_NAMESPACE = "http://example.org/resource/";
    private static final String DBPEDIA_BASE_URI = "http://dbpedia.org/page/";

    private static Property AMR_TYPE_AMR;
    private static Property SENTENCE_PROP_AMR;
    private static Property DATE_PROP_AMR;
    private static Property ID_PROP_AMR;
    private static Property ROOT_PROP_AMR;
    private static Property YEAR_TYPE_AMR;
    private static Property DATE_ENTITY_TYPE_AMR;

    private static Property WIKI_PROP_AMR_TERMS;
    private static Property MODE_PROP_AMR_TERMS;
    private static Property TIME_PROP_AMR_TERMS;

    private static Property DATE_PROP_WESO;
    private static Property SENTENCE_PROP_WESO;
    private static Property PREDICATE_PROP_WESO;
    private static Property SUBJECT_PROP_WESO;
    private static Property OBJECT_PROP_WESO;
    private static Property ACTION_PROP_WESO;


    private Model model;





    public JenaModelToQuads(Model model){
        this.model = model;

        AMR_TYPE_AMR =  model.createProperty( "http://amr.isi.edu/rdf/core-amr#AMR" );
        SENTENCE_PROP_AMR = model.createProperty("http://amr.isi.edu/rdf/core-amr#has-sentence");
        DATE_PROP_AMR = model.createProperty("http://amr.isi.edu/rdf/core-amr#has-date");
        ID_PROP_AMR = model.createProperty("http://amr.isi.edu/rdf/core-amr#has-id");
        ROOT_PROP_AMR = model.createProperty("http://amr.isi.edu/rdf/core-amr#root");
        YEAR_TYPE_AMR = model.createProperty("http://amr.isi.edu/rdf/core-amr#year");
        DATE_ENTITY_TYPE_AMR = model.createProperty("http://amr.isi.edu/rdf/core-amr#date-entity");

        WIKI_PROP_AMR_TERMS =  model.createProperty("http://amr.isi.edu/rdf/amr-terms#wiki");
        MODE_PROP_AMR_TERMS = model.createProperty("http://amr.isi.edu/rdf/amr-terms#mode");
        TIME_PROP_AMR_TERMS = model.createProperty("http://amr.isi.edu/rdf/amr-terms#time");



        SENTENCE_PROP_WESO = model.createProperty(WESO_NAMESPACE + "sentence");
        DATE_PROP_WESO = model.createProperty(WESO_NAMESPACE + "date");
        PREDICATE_PROP_WESO = model.createProperty(WESO_NAMESPACE + "predicate");
        SUBJECT_PROP_WESO = model.createProperty(WESO_NAMESPACE + "subject");
        OBJECT_PROP_WESO = model.createProperty(WESO_NAMESPACE + "object");
        ACTION_PROP_WESO = model.createProperty(WESO_NAMESPACE + "action");

    }


    public List<Quad> generateQuads() {
        List<Quad> resultQuads = new ArrayList<Quad>();
        List<Resource> amrNodes = detectAmrNodes();
        for (Resource amrNode : amrNodes){
            String sentence = detectSentence(amrNode);
            String date = detectDate(amrNode);
            String id = detectId(amrNode);
            Resource bnode = ResourceFactory.createResource();
            Node graphNode = NodeFactory.createURI(buidlUriOfGraph(id));
            for (Statement statement : generateBaseTriplesOfAmr(bnode, sentence, date)){
                resultQuads.add(new Quad(graphNode, statement.asTriple()));
            }
            RDFNode root = detectRootNode(amrNode);
            for (Statement statement : generateTriplesAssociatedToRootNode(root, bnode)){
                resultQuads.add(new Quad(graphNode, statement.asTriple()));
            }
        }

        return resultQuads;
    }


    private List<Statement> generateTriplesAssociatedToRootNode(RDFNode root, Resource targetBnode){
        List<Statement> results = new ArrayList<Statement>();
        for (StmtIterator ite = model.listStatements(root.asResource(), null,  (Resource) null); ite.hasNext();) {
            Statement target = ite.next();
            addNeededStatementsFromTargetKnowledge(target, results, targetBnode);
        }
        return results;
    }


    private RDFNode getPredicateInRoot(RDFNode root){
        List<RDFNode> types = getObjectsOfProperty(root.asResource(), RDF.type);
        if (types.size() != 1){
            throw new RuntimeException("Root with more than one type, impossible to detect predicate: " + root.toString());
        }
        RDFNode typeOfRoot = types.get(0);
        String targetElem = getElemInNamespace(PROPBANK_NAMESPACE, typeOfRoot.toString());
        return ResourceFactory.createResource(WESO_ENTITIES_NAMESPACE + targetElem);

    }


    private String getElemInNamespace(String namespace, String URI){
        if (! URI.contains(namespace)){
            throw new RuntimeException("The target string does not contain tue specified namespace: URI: " + URI + ". Namespace: " + namespace);
        }
        return URI.substring(namespace.length(), URI.length());
    }

    private String getCustomAmrIdFromUri(String URI){
        int lastSlashPosition = URI.lastIndexOf("/");
        return URI.substring(lastSlashPosition +1, URI.length());

    }



    private void addNeededStatementsFromTargetKnowledge(Statement target, List<Statement> results, RDFNode bnode){
        Property predicate = target.getPredicate();
        if (predicate.equals(RDF.type)){
            addTripleOfPredicate(target, results, bnode);
        }
        else if( isFromNamespace(PROPBANK_NAMESPACE, predicate)){
            addTriplesOfPropbank(target, results, bnode);
        }
        else if (isFromNamespace(AMR_TERMS_NAMESPACE, predicate)){
            addTriplesOfAmrTerms(target, results, bnode);
        }
        else{
            addTripleWithUnknownProperty(target, results, bnode);
        }
    }


    private void addTriplesOfAmrTerms(Statement statement, List<Statement> results, RDFNode bnode){
        Property predicate = statement.getPredicate();
        if (isAmrModeProperty(predicate)){
            addTripleOfAmrMode(statement, results, bnode);
        }
        else if (isAmrTimeProperty(predicate)){
            addTriplesOfAmrTime(statement, results, bnode);
        }
        else{
            addTripleWithUnknownProperty(statement, results, bnode);
        }
    }

    private void addTriplesOfAmrTime(Statement statement, List<Statement> results, RDFNode bnode) {
        RDFNode typeTime = findTypeTimeNode(statement.getObject());
        if (typeTime.equals(YEAR_TYPE_AMR)){
            results.add(ResourceFactory.createStatement(bnode.asResource(), TIME_PROP_AMR_TERMS, typeTime));
        }
        else if (typeTime.equals(DATE_ENTITY_TYPE_AMR)){
            addTripleOfDateEntityElem(statement.getObject(), results, bnode);
        }
        else{
            logUnexpectedStatement(statement, typeTime, "Unknown node of type time, ignoreing knowledge: " + statement.getObject().toString());
//            throw new RuntimeException("Unknown node of type time: " + statement.getObject().toString());
        }

    }

    private void addTripleOfDateEntityElem(RDFNode timeNode, List<Statement> results, RDFNode bnode) {
        for (StmtIterator ite = model.listStatements(timeNode.asResource(), null,  (Resource) null); ite.hasNext();){
            Statement target = ite.next();
            if (! target.getPredicate().equals(RDF.type)){
                results.add(ResourceFactory.createStatement(bnode.asResource(), target.getPredicate(), target.getObject()));
            }
        }
    }


    private RDFNode findTypeTimeNode(RDFNode timeNode) {
        List<RDFNode> types = getObjectsOfProperty(timeNode.asResource(), RDF.type);
        if (types.size() != 1){
            throw new RuntimeException("Time node with more than one type, mapping cannot be performed: " + timeNode.toString());
        }
        return types.get(0);
    }

    private void addTripleOfAmrMode(Statement statement, List<Statement> results, RDFNode bnode){
        results.add(ResourceFactory.createStatement(bnode.asResource(), statement.getPredicate(), statement.getObject()));
    }

    private boolean isAmrTimeProperty(Property predicate) {
        return predicate.equals(TIME_PROP_AMR_TERMS);
    }

    private boolean isAmrModeProperty(Property predicate){
        return predicate.equals(MODE_PROP_AMR_TERMS);
    }


    private void addTriplesOfPropbank(Statement statement, List<Statement> results, RDFNode bnode){
        Property predicate = statement.getPredicate();
        if (isAnARGproperty(predicate)){
            addTriplesOfArg(statement, results, bnode);
        }
        else {
            addTripleWithUnknownProperty(statement, results, bnode);
        }

    }

    private boolean isAnARGproperty(RDFNode targetNode){
        String uri = targetNode.toString();
        if (".ARG".equals(uri.substring(uri.length()-5, uri.length()-1))){
            return true;
        }
        return false;
    }

    private void addTriplesOfArg(Statement statement, List<Statement> results, RDFNode bnode){
        RDFNode object = getProperObjectAndAddNeededTriples(statement.getObject(), results);
        Property predicate = inferPropertyFromArgId(statement.getPredicate());
        results.add(ResourceFactory.createStatement(bnode.asResource(), predicate, object));
    }

    private Property inferPropertyFromArgId(Property argProperty){
        String stringProperty = argProperty.toString();
        if (stringProperty.endsWith("ARG0")){
            return SUBJECT_PROP_WESO;
        }
        else if (stringProperty.endsWith("ARG1")){
            return OBJECT_PROP_WESO;
        }
        else if (stringProperty.endsWith("ARG2")){
            return ACTION_PROP_WESO;
        }
        else{
            throw new RuntimeException("Unrecognized type of ARG property: " + stringProperty);
        }
    }


    private void addTripleWithUnknownProperty(Statement statement, List<Statement> results, RDFNode bnode){
        logUnexpectedStatement(statement, bnode, "Unknown property");
        RDFNode object = getProperObjectAndAddNeededTriples(statement.getObject(), results);
        results.add(ResourceFactory.createStatement(bnode.asResource(), statement.getPredicate(), object));
    }

    private RDFNode getProperObjectAndAddNeededTriples(RDFNode targetNode, List<Statement> results){
        if (targetNode.isLiteral()){
            return targetNode;
        }
        RDFNode properObject = null;
        RDFNode type = null;
        List<RDFNode[]> otherElemns = new ArrayList<RDFNode[]>();
        for (StmtIterator ite = model.listStatements(targetNode.asResource(), null,  (Resource) null); ite.hasNext();){
            Statement target = ite.next();
            if (target.getPredicate().equals(WIKI_PROP_AMR_TERMS)){
                properObject = ResourceFactory.createResource(buildDBpediaUri(target.getObject().toString()));
            }
            else if (target.getPredicate().equals(RDF.type)){
                type = target.getObject();
            }
            else{
                otherElemns.add(new RDFNode[]{target.getPredicate(), target.getObject()});

            }
        }
        if (properObject == null){
            properObject = ResourceFactory.createResource();
            logUnexpectedStatement(properObject, "Entity not identified by wiki: " + targetNode.toString() );

        }
        if (type != null){
            results.add(ResourceFactory.createStatement(properObject.asResource(), RDF.type, type));
        }
        for (RDFNode[] extraStatement: otherElemns){
            if (isAmrModeProperty((Property)extraStatement[0])){
                RDFNode newProperObject = getProperObjectAndAddNeededTriples(extraStatement[1], results);
                results.add(ResourceFactory.createStatement(properObject.asResource(), (Property) extraStatement[0], newProperObject));
            }
            else {
                results.add(ResourceFactory.createStatement(properObject.asResource(), (Property) extraStatement[0], extraStatement[1]));
            }
        }

        return properObject;

    }

    private String buildDBpediaUri(String entry){
        return DBPEDIA_BASE_URI + entry;
    }

    private void logUnexpectedStatement(Statement statement, RDFNode bnode, String msg){
        ; //TODO
    }

    private void logUnexpectedStatement(RDFNode bnode, String msg){
        ; //TODO
    }

    private boolean isFromNamespace(String namespace, Object rdfElem){
        if (rdfElem.toString().startsWith(namespace))
                return true;
        return false;
    }

    private void addTripleOfPredicate(Statement target, List<Statement> results, RDFNode bnode){
        results.add(ResourceFactory.createStatement(bnode.asResource(), PREDICATE_PROP_WESO, getPredicateInRoot(target.getSubject())));
    }

    private RDFNode detectRootNode(Resource amrNode) {
        List<RDFNode> roots = getObjectsOfProperty(amrNode, ROOT_PROP_AMR);
        if (roots.size() == 1)
            return roots.get(0);
        else
            throw new RuntimeException("Node with non 1 root exactly: " + amrNode.toString());
    }

    private List<Statement> generateBaseTriplesOfAmr(Resource bnode, String sentence, String date){
        List<Statement> result = new ArrayList<Statement>();

        //Sentence
        result.add(ResourceFactory.createStatement(bnode, SENTENCE_PROP_WESO, ResourceFactory.createTypedLiteral(sentence, XSDDatatype.XSDstring)));
        //Date  TODO: improve datatype
        result.add(ResourceFactory.createStatement(bnode, DATE_PROP_WESO, ResourceFactory.createTypedLiteral(date, XSDDatatype.XSDdate)));

        return result;
    }

    private String buidlUriOfGraph(String graphId){
        try {
            return "http://" + URLEncoder.encode(graphId, UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("We cannot handdle UTF-8 encoding!");
        }
    }


    private String detectId(Resource amrNode){
        List<RDFNode> ids = getObjectsOfProperty(amrNode, ID_PROP_AMR);
        if (ids.size() == 1)
            return ids.get(0).toString();
        else
            return "";
    }

    private String detectDate(Resource amrNode){
        List<RDFNode> dates = getObjectsOfProperty(amrNode, DATE_PROP_AMR);
        if (dates.size() == 1)
            return dates.get(0).toString();
        else
            return "";
    }

    private String detectSentence(Resource amrNode){
        List<RDFNode> result = getObjectsOfProperty(amrNode, SENTENCE_PROP_AMR);
        if (result.size() == 1)
            return result.get(0).toString();
        else
            return "";
    }

    private List<Resource> detectAmrNodes(){
        return getSubjectsWithProperty(RDF.type, AMR_TYPE_AMR);
    }


    private List<RDFNode> getObjectsOfProperty(Resource subject, Property property){
        List<RDFNode> result = new ArrayList<RDFNode>();
        for (NodeIterator res = model.listObjectsOfProperty(subject, property); res.hasNext(); ) {
            result.add(res.next());
        }
        return result;
    }

    private List<RDFNode> getObjectsOfProperty(Property property){
        List<RDFNode> result = new ArrayList<RDFNode>();
        for (NodeIterator res = model.listObjectsOfProperty(property); res.hasNext(); ) {
            result.add(res.next());
        }
        return result;
    }

    private List<Resource> getSubjectsWithProperty(Property property, Resource object){
        List<Resource> result = new ArrayList<Resource>();
        for (ResIterator res = model.listResourcesWithProperty(property, object); res.hasNext(); ) {
            result.add(res.next());
        }
        return result;
    }

    private List<Resource> getSubjectsWithProperty(Property property){
        List<Resource> result = new ArrayList<Resource>();
        for (ResIterator res = model.listResourcesWithProperty(property); res.hasNext(); ) {
            result.add(res.next());
        }

        return result;
    }
}


