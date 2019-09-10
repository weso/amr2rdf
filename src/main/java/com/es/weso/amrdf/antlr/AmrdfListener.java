// Generated from Amrdf.g4 by ANTLR 4.7.1

    package com.es.weso.amrdf.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AmrdfParser}.
 */
public interface AmrdfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#amrset}.
	 * @param ctx the parse tree
	 */
	void enterAmrset(AmrdfParser.AmrsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#amrset}.
	 * @param ctx the parse tree
	 */
	void exitAmrset(AmrdfParser.AmrsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#amr}.
	 * @param ctx the parse tree
	 */
	void enterAmr(AmrdfParser.AmrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#amr}.
	 * @param ctx the parse tree
	 */
	void exitAmr(AmrdfParser.AmrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(AmrdfParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(AmrdfParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(AmrdfParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(AmrdfParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(AmrdfParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(AmrdfParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(AmrdfParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(AmrdfParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#coreRule}.
	 * @param ctx the parse tree
	 */
	void enterCoreRule(AmrdfParser.CoreRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#coreRule}.
	 * @param ctx the parse tree
	 */
	void exitCoreRule(AmrdfParser.CoreRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#nonCoreRule}.
	 * @param ctx the parse tree
	 */
	void enterNonCoreRule(AmrdfParser.NonCoreRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#nonCoreRule}.
	 * @param ctx the parse tree
	 */
	void exitNonCoreRule(AmrdfParser.NonCoreRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg0}.
	 * @param ctx the parse tree
	 */
	void enterArg0(AmrdfParser.Arg0Context ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg0}.
	 * @param ctx the parse tree
	 */
	void exitArg0(AmrdfParser.Arg0Context ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg1}.
	 * @param ctx the parse tree
	 */
	void enterArg1(AmrdfParser.Arg1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg1}.
	 * @param ctx the parse tree
	 */
	void exitArg1(AmrdfParser.Arg1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg2}.
	 * @param ctx the parse tree
	 */
	void enterArg2(AmrdfParser.Arg2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg2}.
	 * @param ctx the parse tree
	 */
	void exitArg2(AmrdfParser.Arg2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg3}.
	 * @param ctx the parse tree
	 */
	void enterArg3(AmrdfParser.Arg3Context ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg3}.
	 * @param ctx the parse tree
	 */
	void exitArg3(AmrdfParser.Arg3Context ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg4}.
	 * @param ctx the parse tree
	 */
	void enterArg4(AmrdfParser.Arg4Context ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg4}.
	 * @param ctx the parse tree
	 */
	void exitArg4(AmrdfParser.Arg4Context ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg0Of}.
	 * @param ctx the parse tree
	 */
	void enterArg0Of(AmrdfParser.Arg0OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg0Of}.
	 * @param ctx the parse tree
	 */
	void exitArg0Of(AmrdfParser.Arg0OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg1Of}.
	 * @param ctx the parse tree
	 */
	void enterArg1Of(AmrdfParser.Arg1OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg1Of}.
	 * @param ctx the parse tree
	 */
	void exitArg1Of(AmrdfParser.Arg1OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg2Of}.
	 * @param ctx the parse tree
	 */
	void enterArg2Of(AmrdfParser.Arg2OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg2Of}.
	 * @param ctx the parse tree
	 */
	void exitArg2Of(AmrdfParser.Arg2OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg3Of}.
	 * @param ctx the parse tree
	 */
	void enterArg3Of(AmrdfParser.Arg3OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg3Of}.
	 * @param ctx the parse tree
	 */
	void exitArg3Of(AmrdfParser.Arg3OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#arg4Of}.
	 * @param ctx the parse tree
	 */
	void enterArg4Of(AmrdfParser.Arg4OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#arg4Of}.
	 * @param ctx the parse tree
	 */
	void exitArg4Of(AmrdfParser.Arg4OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterDomain(AmrdfParser.DomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitDomain(AmrdfParser.DomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(AmrdfParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(AmrdfParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#wiki}.
	 * @param ctx the parse tree
	 */
	void enterWiki(AmrdfParser.WikiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#wiki}.
	 * @param ctx the parse tree
	 */
	void exitWiki(AmrdfParser.WikiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(AmrdfParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(AmrdfParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#modeRule}.
	 * @param ctx the parse tree
	 */
	void enterModeRule(AmrdfParser.ModeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#modeRule}.
	 * @param ctx the parse tree
	 */
	void exitModeRule(AmrdfParser.ModeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(AmrdfParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(AmrdfParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#degree}.
	 * @param ctx the parse tree
	 */
	void enterDegree(AmrdfParser.DegreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#degree}.
	 * @param ctx the parse tree
	 */
	void exitDegree(AmrdfParser.DegreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(AmrdfParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(AmrdfParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#destination}.
	 * @param ctx the parse tree
	 */
	void enterDestination(AmrdfParser.DestinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#destination}.
	 * @param ctx the parse tree
	 */
	void exitDestination(AmrdfParser.DestinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(AmrdfParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(AmrdfParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#beneficiary}.
	 * @param ctx the parse tree
	 */
	void enterBeneficiary(AmrdfParser.BeneficiaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#beneficiary}.
	 * @param ctx the parse tree
	 */
	void exitBeneficiary(AmrdfParser.BeneficiaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#accompanier}.
	 * @param ctx the parse tree
	 */
	void enterAccompanier(AmrdfParser.AccompanierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#accompanier}.
	 * @param ctx the parse tree
	 */
	void exitAccompanier(AmrdfParser.AccompanierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#topic}.
	 * @param ctx the parse tree
	 */
	void enterTopic(AmrdfParser.TopicContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#topic}.
	 * @param ctx the parse tree
	 */
	void exitTopic(AmrdfParser.TopicContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(AmrdfParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(AmrdfParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#instrument}.
	 * @param ctx the parse tree
	 */
	void enterInstrument(AmrdfParser.InstrumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#instrument}.
	 * @param ctx the parse tree
	 */
	void exitInstrument(AmrdfParser.InstrumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#medium}.
	 * @param ctx the parse tree
	 */
	void enterMedium(AmrdfParser.MediumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#medium}.
	 * @param ctx the parse tree
	 */
	void exitMedium(AmrdfParser.MediumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#manner}.
	 * @param ctx the parse tree
	 */
	void enterManner(AmrdfParser.MannerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#manner}.
	 * @param ctx the parse tree
	 */
	void exitManner(AmrdfParser.MannerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#purpose}.
	 * @param ctx the parse tree
	 */
	void enterPurpose(AmrdfParser.PurposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#purpose}.
	 * @param ctx the parse tree
	 */
	void exitPurpose(AmrdfParser.PurposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#cause}.
	 * @param ctx the parse tree
	 */
	void enterCause(AmrdfParser.CauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#cause}.
	 * @param ctx the parse tree
	 */
	void exitCause(AmrdfParser.CauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#concession}.
	 * @param ctx the parse tree
	 */
	void enterConcession(AmrdfParser.ConcessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#concession}.
	 * @param ctx the parse tree
	 */
	void exitConcession(AmrdfParser.ConcessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AmrdfParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AmrdfParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(AmrdfParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(AmrdfParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#subevent}.
	 * @param ctx the parse tree
	 */
	void enterSubevent(AmrdfParser.SubeventContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#subevent}.
	 * @param ctx the parse tree
	 */
	void exitSubevent(AmrdfParser.SubeventContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#example}.
	 * @param ctx the parse tree
	 */
	void enterExample(AmrdfParser.ExampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#example}.
	 * @param ctx the parse tree
	 */
	void exitExample(AmrdfParser.ExampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(AmrdfParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(AmrdfParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#frequency}.
	 * @param ctx the parse tree
	 */
	void enterFrequency(AmrdfParser.FrequencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#frequency}.
	 * @param ctx the parse tree
	 */
	void exitFrequency(AmrdfParser.FrequencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#extent}.
	 * @param ctx the parse tree
	 */
	void enterExtent(AmrdfParser.ExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#extent}.
	 * @param ctx the parse tree
	 */
	void exitExtent(AmrdfParser.ExtentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#poss}.
	 * @param ctx the parse tree
	 */
	void enterPoss(AmrdfParser.PossContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#poss}.
	 * @param ctx the parse tree
	 */
	void exitPoss(AmrdfParser.PossContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(AmrdfParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(AmrdfParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#polarity}.
	 * @param ctx the parse tree
	 */
	void enterPolarity(AmrdfParser.PolarityContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#polarity}.
	 * @param ctx the parse tree
	 */
	void exitPolarity(AmrdfParser.PolarityContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#quant}.
	 * @param ctx the parse tree
	 */
	void enterQuant(AmrdfParser.QuantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#quant}.
	 * @param ctx the parse tree
	 */
	void exitQuant(AmrdfParser.QuantContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(AmrdfParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(AmrdfParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(AmrdfParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(AmrdfParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#consist}.
	 * @param ctx the parse tree
	 */
	void enterConsist(AmrdfParser.ConsistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#consist}.
	 * @param ctx the parse tree
	 */
	void exitConsist(AmrdfParser.ConsistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#consistOf}.
	 * @param ctx the parse tree
	 */
	void enterConsistOf(AmrdfParser.ConsistOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#consistOf}.
	 * @param ctx the parse tree
	 */
	void exitConsistOf(AmrdfParser.ConsistOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#domainOf}.
	 * @param ctx the parse tree
	 */
	void enterDomainOf(AmrdfParser.DomainOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#domainOf}.
	 * @param ctx the parse tree
	 */
	void exitDomainOf(AmrdfParser.DomainOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#modeOf}.
	 * @param ctx the parse tree
	 */
	void enterModeOf(AmrdfParser.ModeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#modeOf}.
	 * @param ctx the parse tree
	 */
	void exitModeOf(AmrdfParser.ModeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#modOf}.
	 * @param ctx the parse tree
	 */
	void enterModOf(AmrdfParser.ModOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#modOf}.
	 * @param ctx the parse tree
	 */
	void exitModOf(AmrdfParser.ModOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#locationOf}.
	 * @param ctx the parse tree
	 */
	void enterLocationOf(AmrdfParser.LocationOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#locationOf}.
	 * @param ctx the parse tree
	 */
	void exitLocationOf(AmrdfParser.LocationOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#degreeOf}.
	 * @param ctx the parse tree
	 */
	void enterDegreeOf(AmrdfParser.DegreeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#degreeOf}.
	 * @param ctx the parse tree
	 */
	void exitDegreeOf(AmrdfParser.DegreeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#sourceOf}.
	 * @param ctx the parse tree
	 */
	void enterSourceOf(AmrdfParser.SourceOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#sourceOf}.
	 * @param ctx the parse tree
	 */
	void exitSourceOf(AmrdfParser.SourceOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#destinationOf}.
	 * @param ctx the parse tree
	 */
	void enterDestinationOf(AmrdfParser.DestinationOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#destinationOf}.
	 * @param ctx the parse tree
	 */
	void exitDestinationOf(AmrdfParser.DestinationOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#pathOf}.
	 * @param ctx the parse tree
	 */
	void enterPathOf(AmrdfParser.PathOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#pathOf}.
	 * @param ctx the parse tree
	 */
	void exitPathOf(AmrdfParser.PathOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#beneficiaryOf}.
	 * @param ctx the parse tree
	 */
	void enterBeneficiaryOf(AmrdfParser.BeneficiaryOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#beneficiaryOf}.
	 * @param ctx the parse tree
	 */
	void exitBeneficiaryOf(AmrdfParser.BeneficiaryOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#accompanierOf}.
	 * @param ctx the parse tree
	 */
	void enterAccompanierOf(AmrdfParser.AccompanierOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#accompanierOf}.
	 * @param ctx the parse tree
	 */
	void exitAccompanierOf(AmrdfParser.AccompanierOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#topicOf}.
	 * @param ctx the parse tree
	 */
	void enterTopicOf(AmrdfParser.TopicOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#topicOf}.
	 * @param ctx the parse tree
	 */
	void exitTopicOf(AmrdfParser.TopicOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#durationOf}.
	 * @param ctx the parse tree
	 */
	void enterDurationOf(AmrdfParser.DurationOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#durationOf}.
	 * @param ctx the parse tree
	 */
	void exitDurationOf(AmrdfParser.DurationOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#instrumentOf}.
	 * @param ctx the parse tree
	 */
	void enterInstrumentOf(AmrdfParser.InstrumentOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#instrumentOf}.
	 * @param ctx the parse tree
	 */
	void exitInstrumentOf(AmrdfParser.InstrumentOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#mediumOf}.
	 * @param ctx the parse tree
	 */
	void enterMediumOf(AmrdfParser.MediumOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#mediumOf}.
	 * @param ctx the parse tree
	 */
	void exitMediumOf(AmrdfParser.MediumOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#mannerOf}.
	 * @param ctx the parse tree
	 */
	void enterMannerOf(AmrdfParser.MannerOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#mannerOf}.
	 * @param ctx the parse tree
	 */
	void exitMannerOf(AmrdfParser.MannerOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#purposeOf}.
	 * @param ctx the parse tree
	 */
	void enterPurposeOf(AmrdfParser.PurposeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#purposeOf}.
	 * @param ctx the parse tree
	 */
	void exitPurposeOf(AmrdfParser.PurposeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#causeOf}.
	 * @param ctx the parse tree
	 */
	void enterCauseOf(AmrdfParser.CauseOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#causeOf}.
	 * @param ctx the parse tree
	 */
	void exitCauseOf(AmrdfParser.CauseOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#concessionOf}.
	 * @param ctx the parse tree
	 */
	void enterConcessionOf(AmrdfParser.ConcessionOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#concessionOf}.
	 * @param ctx the parse tree
	 */
	void exitConcessionOf(AmrdfParser.ConcessionOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#conditionOf}.
	 * @param ctx the parse tree
	 */
	void enterConditionOf(AmrdfParser.ConditionOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#conditionOf}.
	 * @param ctx the parse tree
	 */
	void exitConditionOf(AmrdfParser.ConditionOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#partOf}.
	 * @param ctx the parse tree
	 */
	void enterPartOf(AmrdfParser.PartOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#partOf}.
	 * @param ctx the parse tree
	 */
	void exitPartOf(AmrdfParser.PartOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#subeventOf}.
	 * @param ctx the parse tree
	 */
	void enterSubeventOf(AmrdfParser.SubeventOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#subeventOf}.
	 * @param ctx the parse tree
	 */
	void exitSubeventOf(AmrdfParser.SubeventOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#exampleOf}.
	 * @param ctx the parse tree
	 */
	void enterExampleOf(AmrdfParser.ExampleOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#exampleOf}.
	 * @param ctx the parse tree
	 */
	void exitExampleOf(AmrdfParser.ExampleOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#directionOf}.
	 * @param ctx the parse tree
	 */
	void enterDirectionOf(AmrdfParser.DirectionOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#directionOf}.
	 * @param ctx the parse tree
	 */
	void exitDirectionOf(AmrdfParser.DirectionOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#frequencyOf}.
	 * @param ctx the parse tree
	 */
	void enterFrequencyOf(AmrdfParser.FrequencyOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#frequencyOf}.
	 * @param ctx the parse tree
	 */
	void exitFrequencyOf(AmrdfParser.FrequencyOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#extentOf}.
	 * @param ctx the parse tree
	 */
	void enterExtentOf(AmrdfParser.ExtentOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#extentOf}.
	 * @param ctx the parse tree
	 */
	void exitExtentOf(AmrdfParser.ExtentOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#possOf}.
	 * @param ctx the parse tree
	 */
	void enterPossOf(AmrdfParser.PossOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#possOf}.
	 * @param ctx the parse tree
	 */
	void exitPossOf(AmrdfParser.PossOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#quantOf}.
	 * @param ctx the parse tree
	 */
	void enterQuantOf(AmrdfParser.QuantOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#quantOf}.
	 * @param ctx the parse tree
	 */
	void exitQuantOf(AmrdfParser.QuantOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#nameOf}.
	 * @param ctx the parse tree
	 */
	void enterNameOf(AmrdfParser.NameOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#nameOf}.
	 * @param ctx the parse tree
	 */
	void exitNameOf(AmrdfParser.NameOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#unitOf}.
	 * @param ctx the parse tree
	 */
	void enterUnitOf(AmrdfParser.UnitOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#unitOf}.
	 * @param ctx the parse tree
	 */
	void exitUnitOf(AmrdfParser.UnitOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(AmrdfParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(AmrdfParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(AmrdfParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(AmrdfParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(AmrdfParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(AmrdfParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#op4}.
	 * @param ctx the parse tree
	 */
	void enterOp4(AmrdfParser.Op4Context ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#op4}.
	 * @param ctx the parse tree
	 */
	void exitOp4(AmrdfParser.Op4Context ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#op1Of}.
	 * @param ctx the parse tree
	 */
	void enterOp1Of(AmrdfParser.Op1OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#op1Of}.
	 * @param ctx the parse tree
	 */
	void exitOp1Of(AmrdfParser.Op1OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#op2Of}.
	 * @param ctx the parse tree
	 */
	void enterOp2Of(AmrdfParser.Op2OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#op2Of}.
	 * @param ctx the parse tree
	 */
	void exitOp2Of(AmrdfParser.Op2OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#op3Of}.
	 * @param ctx the parse tree
	 */
	void enterOp3Of(AmrdfParser.Op3OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#op3Of}.
	 * @param ctx the parse tree
	 */
	void exitOp3Of(AmrdfParser.Op3OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmrdfParser#op4Of}.
	 * @param ctx the parse tree
	 */
	void enterOp4Of(AmrdfParser.Op4OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmrdfParser#op4Of}.
	 * @param ctx the parse tree
	 */
	void exitOp4Of(AmrdfParser.Op4OfContext ctx);
}