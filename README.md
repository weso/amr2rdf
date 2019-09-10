# AMR2RDF
AMR2RDF is a library that translates from an AMR input to an RDF output. 
This is a work in progress and, for now, only work-01 and bear-02 core rules can be translated.

## Usage via command line
Jar library can be used via command line using the following command:
```java -jar amr2rdf-0.1.jar <file> -t <format>``` where the `<file>` is
the path to the file containing the AMR tree or trees and `<format>` is the
output format for the RDF graph (e.g., turtle, N3, JSON-LD, etc.).

## Usage via JAVA API
The jar library can be used also programmatically with a syntax similar to the following one:
```
try {
    InputStream is = new FileInputStream(file);
    List<AmrFactReturn> results = new TranslatorLauncher().launchTranslation(is);
    results.forEach(r -> {
        if(r instanceof AmrQueryReturn) 
            System.out.println(((AmrQueryReturn) r).getQuery());
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
```

