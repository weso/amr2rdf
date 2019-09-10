package com.es.weso.amrdf.visitors;

import com.es.weso.amrdf.ast.*;
import com.es.weso.amrdf.ast.coreRules.*;
import com.es.weso.amrdf.ast.nonCoreRules.*;

public interface Visitor<A, B> {

    B visit(AmrSet amrSet, A optionalArgument);

    B visit(Amr amr, A optionalArgument);

    B visit(Arg0 arg0, A optionalArgument);

    B visit(Arg1 arg1, A optionalArgument);

    B visit(Arg2 arg2, A optionalArgument);

    B visit(Arg3 arg3, A optionalArgument);

    B visit(Arg4 arg4, A optionalArgument);

    B visit(Arg5 arg5, A optionalArgument);

    B visit(Arg0Of arg0Of, A optionalArgument);

    B visit(Arg1Of arg1Of, A optionalArgument);

    B visit(Arg2Of arg2Of, A optionalArgument);

    B visit(Arg3Of arg3Of, A optionalArgument);

    B visit(Arg4Of arg4Of, A optionalArgument);

    B visit(Accompanier accompanier, A optionalArgument);

    B visit(AccompanierOf accompanierOf, A optionalArgument);

    B visit(Beneficiary beneficiary, A optionalArgument);

    B visit(BeneficiaryOf beneficiaryOf, A optionalArgument);

    B visit(Cause cause, A optionalArgument);

    B visit(CauseOf causeOf, A optionalArgument);

    B visit(Concession concession, A optionalArgument);

    B visit(ConcessionOf concessionOf, A optionalArgument);

    B visit(Condition condition, A optionalArgument);

    B visit(ConditionOf conditionOf, A optionalArgument);

    B visit(Consist consist, A optionalArgument);

    B visit(ConsistOf consistOf, A optionalArgument);

    B visit(Degree degree, A optionalArgument);

    B visit(DegreeOf degreeOf, A optionalArgument);

    B visit(Destination destination, A optionalArgument);

    B visit(DestinationOf destinationOf, A optionalArgument);

    B visit(Direction direction, A optionalArgument);

    B visit(DirectionOf directionOf, A optionalArgument);

    B visit(Domain domain, A optionalArgument);

    B visit(DomainOf domainOf, A optionalArgument);

    B visit(Duration duration, A optionalArgument);

    B visit(DurationOf durationOf, A optionalArgument);

    B visit(Example example, A optionalArgument);

    B visit(ExampleOf exampleOf, A optionalArgument);

    B visit(Extent extent, A optionalArgument);

    B visit(ExtentOf extentOf, A optionalArgument);

    B visit(Frequency frequency, A optionalArgument);

    B visit(FrequencyOf frequencyOf, A optionalArgument);

    B visit(Instrument instrument, A optionalArgument);

    B visit(InstrumentOf instrumentOf, A optionalArgument);

    B visit(Location location, A optionalArgument);

    B visit(LocationOf locationOf, A optionalArgument);

    B visit(Manner manner, A optionalArgument);

    B visit(MannerOf mannerOf, A optionalArgument);

    B visit(Medium medium, A optionalArgument);

    B visit(MediumOf mediumOf, A optionalArgument);

    B visit(Mod mod, A optionalArgument);

    B visit(ModOf modOf, A optionalArgument);

    B visit(Mode mode, A optionalArgument);

    B visit(ModeOf modeOf, A optionalArgument);

    B visit(Name name, A optionalArgument);

    B visit(NameOf nameOf, A optionalArgument);

    B visit(Part part, A optionalArgument);

    B visit(PartOf partOf, A optionalArgument);

    B visit(Path path, A optionalArgument);

    B visit(PathOf pathOf, A optionalArgument);

    B visit(Polarity polarity, A optionalArgument);

    B visit(Poss poss, A optionalArgument);

    B visit(PossOf possOf, A optionalArgument);

    B visit(Purpose purpose, A optionalArgument);

    B visit(PurposeOf purposeOf, A optionalArgument);

    B visit(Quant quant, A optionalArgument);

    B visit(QuantOf quantOf, A optionalArgument);

    B visit(Source source, A optionalArgument);

    B visit(SourceOf sourceOf, A optionalArgument);

    B visit(Subevent subevent, A optionalArgument);

    B visit(SubeventOf subeventOf, A optionalArgument);

    B visit(Time time, A optionalArgument);

    B visit(Topic topic, A optionalArgument);

    B visit(TopicOf topicOf, A optionalArgument);

    B visit(Unit unit, A optionalArgument);

    B visit(UnitOf unitOf, A optionalArgument);

    B visit(Wiki wiki, A optionalArgument);

    B visit(Year year, A optionalArgument);

    B visit(Op1 op1, A optionalArgument);

    B visit(Op1Of op1Of, A optionalArgument);

    B visit(Op2 op2, A optionalArgument);

    B visit(Op2Of op2Of, A optionalArgument);

    B visit(Op3 op3, A optionalArgument);

    B visit(Op3Of op3Of, A optionalArgument);

    B visit(Op4 op4, A optionalArgument);

    B visit(Op4Of op4Of, A optionalArgument);

    B visit(Text text, A optionalArgument);

    B visit(VarName varName, A optionalArgument);

    B visit(VarType varType, A optionalArgument);

}
