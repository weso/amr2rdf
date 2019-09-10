package com.es.weso.amrdf.visitors;

import com.es.weso.amrdf.ast.*;
import com.es.weso.amrdf.ast.coreRules.*;
import com.es.weso.amrdf.ast.nonCoreRules.*;

import java.util.List;

public class BaseVisitor<A, B> implements Visitor<A, B> {

    @Override
    public B visit(AmrSet amrSet, A optionalArgument) {
        amrSet.getAmrs().forEach(a -> a.accept(this, optionalArgument));
        return null;
    }

    @Override
    public B visit(Amr amr, A optionalArgument) {
        amr.getCoreRules().forEach(cr -> cr.accept(this, optionalArgument));
        amr.getNonCoreRules().forEach(ncr -> ncr.accept(this, optionalArgument));
        amr.getVarName().accept(this, optionalArgument);
        amr.getVarType().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg0 arg0, A optionalArgument) {
        arg0.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg1 arg1, A optionalArgument) {
        arg1.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg2 arg2, A optionalArgument) {
        arg2.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg3 arg3, A optionalArgument) {
        arg3.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg4 arg4, A optionalArgument) {
        arg4.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg5 arg5, A optionalArgument) {
        arg5.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg0Of arg0Of, A optionalArgument) {
        arg0Of.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg1Of arg1Of, A optionalArgument) {
        arg1Of.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg2Of arg2Of, A optionalArgument) {
        arg2Of.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg3Of arg3Of, A optionalArgument) {
        arg3Of.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Arg4Of arg4Of, A optionalArgument) {
        arg4Of.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Accompanier accompanier, A optionalArgument) {
        accompanier.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(AccompanierOf accompanierOf, A optionalArgument) {
        accompanierOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Beneficiary beneficiary, A optionalArgument) {
        beneficiary.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(BeneficiaryOf beneficiaryOf, A optionalArgument) {
        beneficiaryOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Cause cause, A optionalArgument) {
        cause.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(CauseOf causeOf, A optionalArgument) {
        causeOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Concession concession, A optionalArgument) {
        concession.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(ConcessionOf concessionOf, A optionalArgument) {
        concessionOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Condition condition, A optionalArgument) {
        condition.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(ConditionOf conditionOf, A optionalArgument) {
        conditionOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Consist consist, A optionalArgument) {
        consist.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(ConsistOf consistOf, A optionalArgument) {
        consistOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Degree degree, A optionalArgument) {
        degree.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(DegreeOf degreeOf, A optionalArgument) {
        degreeOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Destination destination, A optionalArgument) {
        destination.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(DestinationOf destinationOf, A optionalArgument) {
        destinationOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Direction direction, A optionalArgument) {
        direction.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(DirectionOf directionOf, A optionalArgument) {
        directionOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Domain domain, A optionalArgument) {
        domain.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(DomainOf domainOf, A optionalArgument) {
        domainOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Duration duration, A optionalArgument) {
        duration.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(DurationOf durationOf, A optionalArgument) {
        durationOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Example example, A optionalArgument) {
        example.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(ExampleOf exampleOf, A optionalArgument) {
        exampleOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Extent extent, A optionalArgument) {
        extent.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(ExtentOf extentOf, A optionalArgument) {
        extentOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Frequency frequency, A optionalArgument) {
        frequency.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(FrequencyOf frequencyOf, A optionalArgument) {
        frequencyOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Instrument instrument, A optionalArgument) {
        instrument.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(InstrumentOf instrumentOf, A optionalArgument) {
        instrumentOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Location location, A optionalArgument) {
        location.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(LocationOf locationOf, A optionalArgument) {
        locationOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Manner manner, A optionalArgument) {
        manner.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(MannerOf mannerOf, A optionalArgument) {
        mannerOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Medium medium, A optionalArgument) {
        medium.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(MediumOf mediumOf, A optionalArgument) {
        mediumOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Mod mod, A optionalArgument) {
        mod.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(ModOf modOf, A optionalArgument) {
        modOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Mode mode, A optionalArgument) {
        mode.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(ModeOf modeOf, A optionalArgument) {
        modeOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Name name, A optionalArgument) {
        name.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(NameOf nameOf, A optionalArgument) {
        nameOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Part part, A optionalArgument) {
        part.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(PartOf partOf, A optionalArgument) {
        partOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Path path, A optionalArgument) {
        path.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(PathOf pathOf, A optionalArgument) {
        pathOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Polarity polarity, A optionalArgument) {
        polarity.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Poss poss, A optionalArgument) {
        poss.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(PossOf possOf, A optionalArgument) {
        possOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Purpose purpose, A optionalArgument) {
        purpose.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(PurposeOf purposeOf, A optionalArgument) {
        purposeOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Quant quant, A optionalArgument) {
        quant.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(QuantOf quantOf, A optionalArgument) {
        quantOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Source source, A optionalArgument) {
        source.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(SourceOf sourceOf, A optionalArgument) {
        sourceOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Subevent subevent, A optionalArgument) {
        subevent.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(SubeventOf subeventOf, A optionalArgument) {
        subeventOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Time time, A optionalArgument) {
        time.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Topic topic, A optionalArgument) {
        topic.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(TopicOf topicOf, A optionalArgument) {
        topicOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Unit unit, A optionalArgument) {
        unit.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(UnitOf unitOf, A optionalArgument) {
        unitOf.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Wiki wiki, A optionalArgument) {
        wiki.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Year year, A optionalArgument) {
        year.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Op1 op1, A optionalArgument) {
        op1.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Op1Of op1Of, A optionalArgument) {
        op1Of.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Op2 op2, A optionalArgument) {
        op2.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Op2Of op2Of, A optionalArgument) {
        op2Of.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Op3 op3, A optionalArgument) {
        op3.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Op3Of op3Of, A optionalArgument) {
        op3Of.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Op4 op4, A optionalArgument) {
        op4.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Op4Of op4Of, A optionalArgument) {
        op4Of.getTerminal().accept(this, optionalArgument);
        return null;
    }

    @Override
    public B visit(Text text, A optionalArgument) {
        return null;
    }

    @Override
    public B visit(VarName varName, A optionalArgument) {
        return null;
    }

    @Override
    public B visit(VarType varType, A optionalArgument) {
        return null;
    }
}
