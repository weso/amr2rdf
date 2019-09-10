package com.es.weso.amrdf.app;

import com.es.weso.amrdf.antlr.AmrdfLexer;
import com.es.weso.amrdf.antlr.AmrdfParser;
import com.es.weso.amrdf.ast.AST;
import com.es.weso.amrdf.visitors.ASTGeneratorVisitor;
import com.es.weso.amrdf.visitors.AmrFactReturn;
import com.es.weso.amrdf.visitors.TranslatorVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TranslatorLauncher {

    public List<AmrFactReturn> launchTranslation(InputStream inputStream) throws IOException {
        return doLaunchTranslation(CharStreams.fromStream(inputStream));
    }

    public List<AmrFactReturn> launchTranslation(String input) {
        return doLaunchTranslation(CharStreams.fromString(input));
    }

    private List<AmrFactReturn> doLaunchTranslation(CharStream input) {
        AmrdfLexer lexer = new AmrdfLexer(input);
        AmrdfParser parser = new AmrdfParser(new CommonTokenStream(lexer));
        AST ast = new ASTGeneratorVisitor().visit(parser.amrset());
        List<AmrFactReturn> results =
                (List<AmrFactReturn>) ast.accept(new TranslatorVisitor(), "http://example.com/");
        return results;
    }

}
