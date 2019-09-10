// Generated from Amrdf.g4 by ANTLR 4.7.1

    package com.es.weso.amrdf.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AmrdfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AmrdfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#amrset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmrset(AmrdfParser.AmrsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#amr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmr(AmrdfParser.AmrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(AmrdfParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(AmrdfParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(AmrdfParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(AmrdfParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#coreRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoreRule(AmrdfParser.CoreRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#nonCoreRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonCoreRule(AmrdfParser.NonCoreRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg0(AmrdfParser.Arg0Context ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg1(AmrdfParser.Arg1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg2(AmrdfParser.Arg2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg3(AmrdfParser.Arg3Context ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg4(AmrdfParser.Arg4Context ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg0Of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg0Of(AmrdfParser.Arg0OfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg1Of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg1Of(AmrdfParser.Arg1OfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg2Of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg2Of(AmrdfParser.Arg2OfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg3Of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg3Of(AmrdfParser.Arg3OfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#arg4Of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg4Of(AmrdfParser.Arg4OfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#domain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain(AmrdfParser.DomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(AmrdfParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#wiki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWiki(AmrdfParser.WikiContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(AmrdfParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#modeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeRule(AmrdfParser.ModeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(AmrdfParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#degree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegree(AmrdfParser.DegreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(AmrdfParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#destination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestination(AmrdfParser.DestinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(AmrdfParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#beneficiary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeneficiary(AmrdfParser.BeneficiaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#accompanier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccompanier(AmrdfParser.AccompanierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#topic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopic(AmrdfParser.TopicContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(AmrdfParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#instrument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrument(AmrdfParser.InstrumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#medium}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedium(AmrdfParser.MediumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#manner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManner(AmrdfParser.MannerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#purpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurpose(AmrdfParser.PurposeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#cause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCause(AmrdfParser.CauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#concession}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcession(AmrdfParser.ConcessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(AmrdfParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(AmrdfParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#subevent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubevent(AmrdfParser.SubeventContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#example}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExample(AmrdfParser.ExampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(AmrdfParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#frequency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrequency(AmrdfParser.FrequencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtent(AmrdfParser.ExtentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#poss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoss(AmrdfParser.PossContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(AmrdfParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#polarity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolarity(AmrdfParser.PolarityContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#quant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuant(AmrdfParser.QuantContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(AmrdfParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(AmrdfParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#consist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsist(AmrdfParser.ConsistContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#consistOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsistOf(AmrdfParser.ConsistOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#domainOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainOf(AmrdfParser.DomainOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#modeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeOf(AmrdfParser.ModeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#modOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOf(AmrdfParser.ModOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#locationOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationOf(AmrdfParser.LocationOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#degreeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegreeOf(AmrdfParser.DegreeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#sourceOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceOf(AmrdfParser.SourceOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#destinationOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestinationOf(AmrdfParser.DestinationOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#pathOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathOf(AmrdfParser.PathOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#beneficiaryOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeneficiaryOf(AmrdfParser.BeneficiaryOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#accompanierOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccompanierOf(AmrdfParser.AccompanierOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#topicOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopicOf(AmrdfParser.TopicOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#durationOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDurationOf(AmrdfParser.DurationOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#instrumentOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrumentOf(AmrdfParser.InstrumentOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#mediumOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediumOf(AmrdfParser.MediumOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#mannerOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMannerOf(AmrdfParser.MannerOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#purposeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurposeOf(AmrdfParser.PurposeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#causeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCauseOf(AmrdfParser.CauseOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#concessionOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcessionOf(AmrdfParser.ConcessionOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#conditionOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOf(AmrdfParser.ConditionOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#partOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartOf(AmrdfParser.PartOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#subeventOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubeventOf(AmrdfParser.SubeventOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#exampleOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExampleOf(AmrdfParser.ExampleOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#directionOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectionOf(AmrdfParser.DirectionOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#frequencyOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrequencyOf(AmrdfParser.FrequencyOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#extentOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtentOf(AmrdfParser.ExtentOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#possOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossOf(AmrdfParser.PossOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#quantOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantOf(AmrdfParser.QuantOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#nameOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameOf(AmrdfParser.NameOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#unitOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitOf(AmrdfParser.UnitOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(AmrdfParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(AmrdfParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(AmrdfParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp4(AmrdfParser.Op4Context ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#op1Of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1Of(AmrdfParser.Op1OfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#op2Of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2Of(AmrdfParser.Op2OfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#op3Of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3Of(AmrdfParser.Op3OfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmrdfParser#op4Of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp4Of(AmrdfParser.Op4OfContext ctx);
}