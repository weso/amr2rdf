package com.es.weso.amrdf.inOut.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

public class RdfReader {

    private String fileName;

    public RdfReader(String fileName){
        this.fileName = fileName;
    }

    public Model loadGraph(){
        Model model = ModelFactory.createDefaultModel() ;
        model.read(fileName) ;
        return model;

    }
}
