package com.es.weso.amrdf.persistence.model;


public class SparqlResult {
    /*
    Sorted array of headers in the table of results.
     */
    private String[] _keys;

    /*
    First index ---> a row of a result in the table results
    Second index ---> a fild whitin a row of results
     */
    private String[][] _results;


    public SparqlResult(String[] headers, String[][] results){
        this._keys = headers;
        this._results = results;
    }

    public int getIndexOfKey(String key){
        int result = 0;
        for (String aKey : _keys) {
            if (aKey.equals(key)) {
                return result;
            }
            result++;
        }
        throw new IllegalArgumentException("The key is not among the results");
    }

    public int numberOfRows(){
        if (_results == null){
            return 0;
        }
        return _results.length;
    }

    /*
    WARNING! here im not cloning the results, it may be dangerous, but faster in the right hands.
     */
    public String[][] getAllRows(){
        return _results;
    }

    public String[] getSortedKeys(){
        return _keys.clone();
    }

    /*
    WARNING! here im not cloning the results, it may be dangerous, but faster in the right hands.
     */
    public String[] getRow(int rowIndex){
        if (_results == null || rowIndex >= _results.length){
            throw new IndexOutOfBoundsException("There are not that many result rows");
        }
        return _results[rowIndex];
    }

}
