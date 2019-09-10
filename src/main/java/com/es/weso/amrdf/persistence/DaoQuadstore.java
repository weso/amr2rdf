package com.es.weso.amrdf.persistence;

import com.es.weso.amrdf.persistence.model.SparqlResult;

import java.util.List;

public interface DaoQuadstore {

    public void addQuad(String[] tuple);

    public void addTuples(List<String> tuples);

    public SparqlResult performRawQueryOneCol(String query);

    public void removeGraph(String graphID);

}
