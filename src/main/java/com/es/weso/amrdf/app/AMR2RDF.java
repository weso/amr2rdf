package com.es.weso.amrdf.app;


import com.es.weso.amrdf.visitors.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import picocli.CommandLine;

import java.io.*;
import java.util.List;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "amr2rdf", mixinStandardHelpOptions = true, version = "amr2rdf 0.1",
        description = "Takes an AMR input and transforms it to RDF")
public class AMR2RDF implements Callable<Integer> {

    @CommandLine.Parameters(index = "0", description = "The file with the AMR or AMRs")
    private File file;

    @CommandLine.Option(names = {"-t", "--outputFormat"}, description = "Turtle, N3, JSON-LD, ...")
    private String outputFormat;


    public Integer call(){
        try {
            InputStream is = new FileInputStream(file);
            List<AmrFactReturn> results = new TranslatorLauncher().launchTranslation(is);
            results.forEach(r -> {
                if(r instanceof AmrQueryReturn) System.out.println(((AmrQueryReturn) r).getQuery());
                else {
                    Model model = ModelFactory.createDefaultModel();
                    model.add(r.getStatements());
                    model.setNsPrefix("dbr", "http://dbpedia.org/resource/");
                    model.setNsPrefix("", "http://example.com/");
                    model.write(System.out, outputFormat);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new AMR2RDF()).execute(args);
        System.exit(exitCode);
    }
}
