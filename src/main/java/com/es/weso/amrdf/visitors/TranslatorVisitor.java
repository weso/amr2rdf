package com.es.weso.amrdf.visitors;

import com.es.weso.amrdf.ast.Amr;
import com.es.weso.amrdf.ast.AmrSet;
import com.es.weso.amrdf.ast.Text;
import com.es.weso.amrdf.ast.coreRules.*;
import com.es.weso.amrdf.ast.nonCoreRules.*;
import com.es.weso.amrdf.translator.*;
import org.apache.jena.rdf.model.Statement;

import java.util.*;
import java.util.stream.Collectors;

public class TranslatorVisitor extends BaseVisitor<Object, Object> {

    private final static String AMRUNKNOWN = "amr-unknown";
    private final static String QUESTION_VARIABLE = "?q";

    private TranslatorDictionary translatorDictionary = new TranslatorDictionary();
    private String firstPrefix;

    @Override
    public Object visit(AmrSet amrSet, Object optionalArgument) {
        Map<String, String> optionalArguments = new HashMap<>();
        firstPrefix = optionalArgument.toString();
        optionalArguments.put("prefix", optionalArgument.toString());
        return amrSet.getAmrs().stream().map(a -> a.accept(this, optionalArguments)).collect(Collectors.toList());
    }

    @Override
    public Object visit(Amr amr, Object optionalArgument) {
        ((Map<String, String>)optionalArgument).put("prefix", firstPrefix);
        List<NonCoreRuleTranslation> nonCoreRuleTranslations =
                amr.getNonCoreRules().stream().map(ncr -> (NonCoreRuleTranslation) ncr.accept(this, optionalArgument))
                        .filter(ncr -> ncr != null)
                        .collect(Collectors.toList());
        QuerySearcherVisitor qsv = new QuerySearcherVisitor();
        amr.accept(qsv, "");
        String suffix = qsv.isQuestion() ? "-question" : "";
        Translator<?> translator = translatorDictionary.get(amr.getVarType().getText() + suffix);
        String arg0 = visitArg(amr, Arg0.class, optionalArgument);
        String arg1 = visitArg(amr, Arg1.class, optionalArgument);
        String arg2 = visitArg(amr, Arg2.class, optionalArgument);
        String arg3 = visitArg(amr, Arg3.class, optionalArgument);
        String arg4 = visitArg(amr, Arg4.class, optionalArgument);
        List<Statement> statements = new ArrayList<>();
        if(translator != null) translator.addNonCoreRules(nonCoreRuleTranslations);
        if(translator instanceof FactTranslator) {
            statements.addAll(((FactTranslator)translator).translate(arg0, arg1, arg2, arg3, arg4, null));
            return new AmrFactReturn(amr.getVarType().getText(), statements, nonCoreRuleTranslations);
        }
        if(translator instanceof QueryTranslator) {
            String query = ((QueryTranslator) translator).translate(arg0, arg1, arg2, arg3, arg4, null);
            return new AmrQueryReturn(amr.getVarType().getText(), statements, nonCoreRuleTranslations, query);
        }
        return new AmrFactReturn(amr.getVarType().getText(), statements, nonCoreRuleTranslations);
    }

    @Override
    public Object visit(Arg0 arg0, Object optionalArgument) {
        return searchForArgValue(arg0, optionalArgument);
    }

    @Override
    public Object visit(Arg1 arg1, Object optionalArgument) {
        return searchForArgValue(arg1, optionalArgument);
    }

    @Override
    public Object visit(Arg2 arg2, Object optionalArgument) {
        return searchForArgValue(arg2, optionalArgument);
    }

    @Override
    public Object visit(Arg3 arg3, Object optionalArgument) {
        return searchForArgValue(arg3, optionalArgument);
    }

    @Override
    public Object visit(Arg4 arg4, Object optionalArgument) {
        return searchForArgValue(arg4, optionalArgument);
    }

    @Override
    public Object visit(Text text, Object optionalArgument) {
        Map<String, String> optionalArguments = (Map<String, String>) optionalArgument;
        return optionalArguments.get("prefix") + text.getText();
    }

    @Override
    public Object visit(Wiki wiki, Object optionalArgument) {
        ((Map<String, String>)optionalArgument).put("prefix", "http://dbpedia.org/resource/");
        String value = (String) wiki.getTerminal().accept(this, optionalArgument);
        return new NonCoreRuleTranslation("wiki", Optional.empty(), value);
    }

    @Override
    public Object visit(Polarity polarity, Object optionalArgument) {
        String value = ((AmrFactReturn) polarity.getTerminal().accept(this, optionalArgument)).getAmrType();
        return new NonCoreRuleTranslation("polarity", Optional.empty(), value);
    }

    @Override
    public Object visit(Time time, Object optionalArgument) {
        Object terminal = time.getTerminal().accept(this, optionalArgument);
        if(terminal instanceof AmrFactReturn) {
            AmrFactReturn amrReturn = (AmrFactReturn) terminal;
            NonCoreRuleTranslation ncrt = amrReturn.getNonCoreRuleTranslations()
                    .stream().filter(a -> a.getNonCoreRuleTitle().equals("op1")).findFirst()
                    .orElse(new NonCoreRuleTranslation(AMRUNKNOWN, Optional.empty(), QUESTION_VARIABLE));
            return new NonCoreRuleTranslation("time", Optional.of(amrReturn.getAmrType()), ncrt.getValue());
        } return new NonCoreRuleTranslation("time", Optional.empty(), terminal.toString());
    }

    @Override
    public Object visit(Year year, Object optionalArgument) {
        Object terminal = year.getTerminal().accept(this, optionalArgument);
        String prefix = "http://dbpedia.org/resource/";
        if(terminal instanceof AmrFactReturn) {
            String value = ((AmrFactReturn) terminal).getAmrType().replace("a", "");
            return new NonCoreRuleTranslation("year", Optional.empty(), prefix + value);
        }
        String value = terminal.toString().replace("a", "");
        return new NonCoreRuleTranslation("year", Optional.empty(), prefix + value);
    }

    @Override
    public Object visit(Location location, Object optionalArgument) {
        Object terminal = location.getTerminal().accept(this, optionalArgument);
        String prefix = "http://dbpedia.org/resource/";
        if(terminal instanceof AmrFactReturn) {
            AmrFactReturn amrReturn = (AmrFactReturn) terminal;
            NonCoreRuleTranslation ncrt = amrReturn.getNonCoreRuleTranslations()
                    .stream().filter(a -> a.getNonCoreRuleTitle().equals("wiki")).findFirst().get();
            String value = ncrt.getValue();
            return new NonCoreRuleTranslation("location", Optional.of("location"), value);
        }
        return new NonCoreRuleTranslation("location", Optional.of("location"), terminal.toString());
    }

    @Override
    public Object visit(Op1 op1, Object optionalArgument) {
        Object terminal = op1.getTerminal().accept(this, optionalArgument);
        if(terminal instanceof AmrFactReturn) {
            NonCoreRuleTranslation ncrt = ((AmrFactReturn) terminal).getNonCoreRuleTranslations()
                    .stream().filter(a -> a.getNonCoreRuleTitle().equals("year")).findFirst().get();
            return new NonCoreRuleTranslation("op1", Optional.empty(), ncrt.getValue());
        } return new NonCoreRuleTranslation("op1", Optional.empty(), terminal.toString());
    }

    private <T extends CoreRule> String visitArg(Amr amr, Class<T> clazz, Object optionalArgument) {
        return (String) amr.getCoreRules().stream().filter(clazz::isInstance)
                .map(a -> a.accept(this, optionalArgument)).findFirst().orElse(null);
    }

    private String searchForArgValue(CoreRule coreRule, Object optionalArgument) {
        AmrFactReturn amrReturn = (AmrFactReturn) coreRule.getTerminal().accept(this, optionalArgument);
        Optional<NonCoreRuleTranslation> wiki = amrReturn.getNonCoreRuleTranslations()
                .stream().filter(ncr -> ncr != null).filter(ncr -> ncr.getNonCoreRuleTitle().equals("wiki")).findFirst();
        if(wiki.isPresent())
            return wiki.get().getValue();
        else return ((Map<String, String>) optionalArgument).get("prefix") + amrReturn.getAmrType();
    }

}