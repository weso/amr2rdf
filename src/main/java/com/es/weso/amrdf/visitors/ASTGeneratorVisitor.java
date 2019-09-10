package com.es.weso.amrdf.visitors;

import com.es.weso.amrdf.antlr.AmrdfBaseVisitor;
import com.es.weso.amrdf.antlr.AmrdfParser;
import com.es.weso.amrdf.ast.*;
import com.es.weso.amrdf.ast.coreRules.*;
import com.es.weso.amrdf.ast.nonCoreRules.*;

import java.util.List;
import java.util.stream.Collectors;

public class ASTGeneratorVisitor extends AmrdfBaseVisitor<AST> {

    @Override
    public AST visitAmrset(AmrdfParser.AmrsetContext ctx) {
        List<Amr> amrs = ctx.amr().stream().map(a -> (Amr) visit(a)).collect(Collectors.toList());
        return new AmrSet(amrs);
    }

    @Override
    public AST visitAmr(AmrdfParser.AmrContext ctx) {
        VarName varName = (VarName) visit(ctx.varName());
        VarType varType = (VarType) visit(ctx.varType());
        List<CoreRule> coreRules =
                ctx.coreRule().stream().map(cr -> (CoreRule) visit(cr)).collect(Collectors.toList());
        List<NonCoreRule> nonCoreRules =
                ctx.nonCoreRule().stream().map(ncr -> (NonCoreRule) visit(ncr)).collect(Collectors.toList());
        return new Amr(varName, varType, coreRules, nonCoreRules);
    }

    @Override
    public AST visitText(AmrdfParser.TextContext ctx) {
        return new Text(ctx.TEXT().getText());
    }

    @Override
    public AST visitTerminal(AmrdfParser.TerminalContext ctx) {
        if(ctx.amr() != null) {
            return visit(ctx.amr());
        } else if(ctx.text() != null) {
            return visit(ctx.text());
        } else if(ctx.TEXT() != null) {
            return new Text(ctx.TEXT().getText());
        } else {
            return new Text(ctx.DASH().getText());
        }
    }

    @Override
    public AST visitVarName(AmrdfParser.VarNameContext ctx) {
        if(ctx.TEXT() != null) {
            return new VarName(ctx.TEXT().getText());
        } else {
            return new VarName(ctx.DASH().getText());
        }
    }

    @Override
    public AST visitVarType(AmrdfParser.VarTypeContext ctx) {
        if(ctx.TEXT() != null) {
            return new VarType(ctx.TEXT().getText());
        } else if(ctx.DASH() != null) {
            return new VarType(ctx.DASH().getText());
        } else {
            return new VarType(ctx.AMRUNKNOWN().getText());
        }
    }

    @Override
    public AST visitCoreRule(AmrdfParser.CoreRuleContext ctx) {
        return ctx.children.stream().filter(c -> c != null).map(c -> visit(c)).findFirst().get();
    }

    @Override
    public AST visitNonCoreRule(AmrdfParser.NonCoreRuleContext ctx) {
        return ctx.children.stream().filter(c -> c != null).map(c -> visit(c)).findFirst().get();
    }

    @Override
    public AST visitArg0(AmrdfParser.Arg0Context ctx) {
        return new Arg0(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitArg1(AmrdfParser.Arg1Context ctx) {
        return new Arg1(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitArg2(AmrdfParser.Arg2Context ctx) {
        return new Arg2(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitArg3(AmrdfParser.Arg3Context ctx) {
        return new Arg3(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitArg4(AmrdfParser.Arg4Context ctx) {
        return new Arg4(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitArg0Of(AmrdfParser.Arg0OfContext ctx) {
        return new Arg0Of(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitArg1Of(AmrdfParser.Arg1OfContext ctx) {
        return new Arg1Of(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitArg2Of(AmrdfParser.Arg2OfContext ctx) {
        return new Arg2Of(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitArg3Of(AmrdfParser.Arg3OfContext ctx) {
        return new Arg3Of(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitArg4Of(AmrdfParser.Arg4OfContext ctx) {
        return new Arg4Of(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDomain(AmrdfParser.DomainContext ctx) {
        return new Domain(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitName(AmrdfParser.NameContext ctx) {
        return new Name(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitWiki(AmrdfParser.WikiContext ctx) {
        return new Wiki(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitMod(AmrdfParser.ModContext ctx) {
        return new Mod(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitModeRule(AmrdfParser.ModeRuleContext ctx) {
        return new Mode(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitLocation(AmrdfParser.LocationContext ctx) {
        return new Location(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDegree(AmrdfParser.DegreeContext ctx) {
        return new Degree(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitSource(AmrdfParser.SourceContext ctx) {
        return new Source(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDestination(AmrdfParser.DestinationContext ctx) {
        return new Destination(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitPath(AmrdfParser.PathContext ctx) {
        return new Path(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitBeneficiary(AmrdfParser.BeneficiaryContext ctx) {
        return new Beneficiary(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitAccompanier(AmrdfParser.AccompanierContext ctx) {
        return new Accompanier(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitTopic(AmrdfParser.TopicContext ctx) {
        return new Topic(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDuration(AmrdfParser.DurationContext ctx) {
        return new Duration(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitInstrument(AmrdfParser.InstrumentContext ctx) {
        return new Instrument(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitMedium(AmrdfParser.MediumContext ctx) {
        return new Medium(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitManner(AmrdfParser.MannerContext ctx) {
        return new Manner(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitPurpose(AmrdfParser.PurposeContext ctx) {
        return new Purpose(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitCause(AmrdfParser.CauseContext ctx) {
        return new Cause(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitConcession(AmrdfParser.ConcessionContext ctx) {
        return new Concession(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitCondition(AmrdfParser.ConditionContext ctx) {
        return new Condition(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitPart(AmrdfParser.PartContext ctx) {
        return new Part(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitSubevent(AmrdfParser.SubeventContext ctx) {
        return new Subevent(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitExample(AmrdfParser.ExampleContext ctx) {
        return new Example(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDirection(AmrdfParser.DirectionContext ctx) {
        return new Direction(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitFrequency(AmrdfParser.FrequencyContext ctx) {
        return new Frequency(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitExtent(AmrdfParser.ExtentContext ctx) {
        return new Extent(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitPoss(AmrdfParser.PossContext ctx) {
        return new Poss(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitUnit(AmrdfParser.UnitContext ctx) {
        return new Unit(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitPolarity(AmrdfParser.PolarityContext ctx) {
        return new Polarity(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitQuant(AmrdfParser.QuantContext ctx) {
        return new Quant(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitTime(AmrdfParser.TimeContext ctx) {
        return new Time(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitYear(AmrdfParser.YearContext ctx) {
        return new Year(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitConsist(AmrdfParser.ConsistContext ctx) {
        return new Consist(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitConsistOf(AmrdfParser.ConsistOfContext ctx) {
        return new ConsistOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDomainOf(AmrdfParser.DomainOfContext ctx) {
        return new DomainOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitModeOf(AmrdfParser.ModeOfContext ctx) {
        return new ModeOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitModOf(AmrdfParser.ModOfContext ctx) {
        return new ModOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitLocationOf(AmrdfParser.LocationOfContext ctx) {
        return new LocationOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDegreeOf(AmrdfParser.DegreeOfContext ctx) {
        return new DegreeOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitSourceOf(AmrdfParser.SourceOfContext ctx) {
        return new SourceOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDestinationOf(AmrdfParser.DestinationOfContext ctx) {
        return new DestinationOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitPathOf(AmrdfParser.PathOfContext ctx) {
        return new PathOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitBeneficiaryOf(AmrdfParser.BeneficiaryOfContext ctx) {
        return new BeneficiaryOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitAccompanierOf(AmrdfParser.AccompanierOfContext ctx) {
        return new AccompanierOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitTopicOf(AmrdfParser.TopicOfContext ctx) {
        return new TopicOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDurationOf(AmrdfParser.DurationOfContext ctx) {
        return new DurationOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitInstrumentOf(AmrdfParser.InstrumentOfContext ctx) {
        return new InstrumentOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitMediumOf(AmrdfParser.MediumOfContext ctx) {
        return new MediumOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitMannerOf(AmrdfParser.MannerOfContext ctx) {
        return new MannerOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitPurposeOf(AmrdfParser.PurposeOfContext ctx) {
        return new PurposeOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitCauseOf(AmrdfParser.CauseOfContext ctx) {
        return new CauseOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitConcessionOf(AmrdfParser.ConcessionOfContext ctx) {
        return new ConcessionOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitConditionOf(AmrdfParser.ConditionOfContext ctx) {
        return new ConditionOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitPartOf(AmrdfParser.PartOfContext ctx) {
        return new PartOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitSubeventOf(AmrdfParser.SubeventOfContext ctx) {
        return new SubeventOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitExampleOf(AmrdfParser.ExampleOfContext ctx) {
        return new ExampleOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitDirectionOf(AmrdfParser.DirectionOfContext ctx) {
        return new DirectionOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitFrequencyOf(AmrdfParser.FrequencyOfContext ctx) {
        return new FrequencyOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitExtentOf(AmrdfParser.ExtentOfContext ctx) {
        return new ExtentOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitPossOf(AmrdfParser.PossOfContext ctx) {
        return new PossOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitQuantOf(AmrdfParser.QuantOfContext ctx) {
        return new QuantOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitNameOf(AmrdfParser.NameOfContext ctx) {
        return new NameOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitUnitOf(AmrdfParser.UnitOfContext ctx) {
        return new UnitOf(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitOp1(AmrdfParser.Op1Context ctx) {
        return new Op1(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitOp2(AmrdfParser.Op2Context ctx) {
        return new Op2(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitOp3(AmrdfParser.Op3Context ctx) {
        return new Op3(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitOp4(AmrdfParser.Op4Context ctx) {
        return new Op4(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitOp1Of(AmrdfParser.Op1OfContext ctx) {
        return new Op1Of(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitOp2Of(AmrdfParser.Op2OfContext ctx) {
        return new Op2(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitOp3Of(AmrdfParser.Op3OfContext ctx) {
        return new Op3Of(getTerminal(ctx.terminal()));
    }

    @Override
    public AST visitOp4Of(AmrdfParser.Op4OfContext ctx) {
        return new Op4Of(getTerminal(ctx.terminal()));
    }

    private Terminal getTerminal(AmrdfParser.TerminalContext ctx) {
        return (Terminal) visit(ctx);
    }

}
