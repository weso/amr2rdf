package com.es.weso.amrdf.translator;

import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.rdf.model.Statement;

import java.util.List;

public interface FactTranslator extends Translator<List<Statement>> {

    default Statement createStatement(String s, String p, String o) {
        return ResourceFactory.createStatement(
                ResourceFactory.createResource(s),
                ResourceFactory.createProperty(p),
                ResourceFactory.createResource(o)
        );
    }

    default Statement createStatementWithLiteral(String s, String p, String o, XSDDatatype xsdType) {
        return ResourceFactory.createStatement(
                ResourceFactory.createResource(s),
                ResourceFactory.createProperty(p),
                ResourceFactory.createTypedLiteral(o, xsdType)
        );
    }
}
