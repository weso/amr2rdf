// Generated from Amrdf.g4 by ANTLR 4.7.1

    package com.es.weso.amrdf.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AmrdfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LEFT_BRACE=2, RIGHT_BRACE=3, SLASH=4, COLON=5, DASH=6, ARG0=7, 
		ARG0OF=8, ARG1=9, ARG1OF=10, ARG2=11, ARG2OF=12, ARG3=13, ARG3OF=14, ARG4=15, 
		ARG4OF=16, DOMAIN=17, DOMAINOF=18, NAME=19, CONSISTOF=20, WIKI=21, MODEOF=22, 
		MODOF=23, MOD=24, MODE=25, LOCATION=26, DEGREE=27, SOURCE=28, DESTINATION=29, 
		PATH=30, BENEFICIARY=31, ACCOMPANIER=32, TOPIC=33, DURATION=34, INSTRUMENT=35, 
		MEDIUM=36, MANNER=37, PURPOSE=38, CAUSE=39, CONCESSION=40, CONDITION=41, 
		PART=42, SUBEVENT=43, EXAMPLE=44, DIRECTION=45, FREQUENCY=46, EXTENT=47, 
		POSS=48, UNIT=49, POLARITY=50, QUANT=51, TIME=52, YEAR=53, CONSIST=54, 
		LOCATIONOF=55, DEGREEOF=56, SOURCEOF=57, DESTINATIONOF=58, PATHOF=59, 
		BENEFICIARYOF=60, ACCOMPANIEROF=61, TOPICOF=62, DURATIONOF=63, INSTRUMENTOF=64, 
		MEDIUMOF=65, MANNEROF=66, PURPOSEOF=67, CAUSEOF=68, CONCESSIONOF=69, CONDITIONOF=70, 
		PARTOF=71, SUBEVENTOF=72, EXAMPLEOF=73, DIRECTIONOF=74, FREQUENCYOF=75, 
		EXTENTOF=76, POSSOF=77, QUANTOF=78, NAMEOF=79, UNITOF=80, OP1=81, OP2=82, 
		OP3=83, OP4=84, OP1OF=85, OP2OF=86, OP3OF=87, OP4OF=88, AMRUNKNOWN=89, 
		TEXT=90, COMMENT=91, WS=92;
	public static final int
		RULE_amrset = 0, RULE_amr = 1, RULE_text = 2, RULE_terminal = 3, RULE_varName = 4, 
		RULE_varType = 5, RULE_coreRule = 6, RULE_nonCoreRule = 7, RULE_arg0 = 8, 
		RULE_arg1 = 9, RULE_arg2 = 10, RULE_arg3 = 11, RULE_arg4 = 12, RULE_arg0Of = 13, 
		RULE_arg1Of = 14, RULE_arg2Of = 15, RULE_arg3Of = 16, RULE_arg4Of = 17, 
		RULE_domain = 18, RULE_name = 19, RULE_wiki = 20, RULE_mod = 21, RULE_modeRule = 22, 
		RULE_location = 23, RULE_degree = 24, RULE_source = 25, RULE_destination = 26, 
		RULE_path = 27, RULE_beneficiary = 28, RULE_accompanier = 29, RULE_topic = 30, 
		RULE_duration = 31, RULE_instrument = 32, RULE_medium = 33, RULE_manner = 34, 
		RULE_purpose = 35, RULE_cause = 36, RULE_concession = 37, RULE_condition = 38, 
		RULE_part = 39, RULE_subevent = 40, RULE_example = 41, RULE_direction = 42, 
		RULE_frequency = 43, RULE_extent = 44, RULE_poss = 45, RULE_unit = 46, 
		RULE_polarity = 47, RULE_quant = 48, RULE_time = 49, RULE_year = 50, RULE_consist = 51, 
		RULE_consistOf = 52, RULE_domainOf = 53, RULE_modeOf = 54, RULE_modOf = 55, 
		RULE_locationOf = 56, RULE_degreeOf = 57, RULE_sourceOf = 58, RULE_destinationOf = 59, 
		RULE_pathOf = 60, RULE_beneficiaryOf = 61, RULE_accompanierOf = 62, RULE_topicOf = 63, 
		RULE_durationOf = 64, RULE_instrumentOf = 65, RULE_mediumOf = 66, RULE_mannerOf = 67, 
		RULE_purposeOf = 68, RULE_causeOf = 69, RULE_concessionOf = 70, RULE_conditionOf = 71, 
		RULE_partOf = 72, RULE_subeventOf = 73, RULE_exampleOf = 74, RULE_directionOf = 75, 
		RULE_frequencyOf = 76, RULE_extentOf = 77, RULE_possOf = 78, RULE_quantOf = 79, 
		RULE_nameOf = 80, RULE_unitOf = 81, RULE_op1 = 82, RULE_op2 = 83, RULE_op3 = 84, 
		RULE_op4 = 85, RULE_op1Of = 86, RULE_op2Of = 87, RULE_op3Of = 88, RULE_op4Of = 89;
	public static final String[] ruleNames = {
		"amrset", "amr", "text", "terminal", "varName", "varType", "coreRule", 
		"nonCoreRule", "arg0", "arg1", "arg2", "arg3", "arg4", "arg0Of", "arg1Of", 
		"arg2Of", "arg3Of", "arg4Of", "domain", "name", "wiki", "mod", "modeRule", 
		"location", "degree", "source", "destination", "path", "beneficiary", 
		"accompanier", "topic", "duration", "instrument", "medium", "manner", 
		"purpose", "cause", "concession", "condition", "part", "subevent", "example", 
		"direction", "frequency", "extent", "poss", "unit", "polarity", "quant", 
		"time", "year", "consist", "consistOf", "domainOf", "modeOf", "modOf", 
		"locationOf", "degreeOf", "sourceOf", "destinationOf", "pathOf", "beneficiaryOf", 
		"accompanierOf", "topicOf", "durationOf", "instrumentOf", "mediumOf", 
		"mannerOf", "purposeOf", "causeOf", "concessionOf", "conditionOf", "partOf", 
		"subeventOf", "exampleOf", "directionOf", "frequencyOf", "extentOf", "possOf", 
		"quantOf", "nameOf", "unitOf", "op1", "op2", "op3", "op4", "op1Of", "op2Of", 
		"op3Of", "op4Of"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", "'('", "')'", "'/'", "':'", "'-'", null, null, null, null, 
		null, null, null, null, null, null, "':domain'", "':domain-of'", "':name'", 
		"':consist-of'", "':wiki'", "':mode-of'", "':mod-of'", "':mod'", "':mode'", 
		"':location'", "':degree'", "':source'", "':destination'", "':path'", 
		"':beneficiary'", "':accompanier'", "':topic'", "':duration'", "':instrument'", 
		"':medium'", "':manner'", "':purpose'", "':cause'", "':concession'", "':condition'", 
		"':part'", "':subevent'", "':example'", "':direction'", "':frequency'", 
		"':extent'", "':poss'", "':unit'", "':polarity'", "':quant'", "':time'", 
		"':year'", "':consist'", "':location-of'", "':degree-of'", "':source-of'", 
		"':destination-of'", "':path-of'", "':beneficiary-of'", "':accompanier-of'", 
		"':topic-of'", "':duration-of'", "':instrument-of'", "':medium-of'", "':manner-of'", 
		"':purpose-of'", "':cause-of'", "':concession-of'", "':condition-of'", 
		"':part-of'", "':subevent-of'", "':example-of'", "':direction-of'", "':frequency-of'", 
		"':extent-of'", "':poss-of'", "':quant-of'", "':name-of'", "':unit-of'", 
		"':op1'", "':op2'", "':op3'", "':op4'", "':op1-of'", "':op2-of'", "':op3-of'", 
		"':op4-of'", "'amr-unknown'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LEFT_BRACE", "RIGHT_BRACE", "SLASH", "COLON", "DASH", "ARG0", 
		"ARG0OF", "ARG1", "ARG1OF", "ARG2", "ARG2OF", "ARG3", "ARG3OF", "ARG4", 
		"ARG4OF", "DOMAIN", "DOMAINOF", "NAME", "CONSISTOF", "WIKI", "MODEOF", 
		"MODOF", "MOD", "MODE", "LOCATION", "DEGREE", "SOURCE", "DESTINATION", 
		"PATH", "BENEFICIARY", "ACCOMPANIER", "TOPIC", "DURATION", "INSTRUMENT", 
		"MEDIUM", "MANNER", "PURPOSE", "CAUSE", "CONCESSION", "CONDITION", "PART", 
		"SUBEVENT", "EXAMPLE", "DIRECTION", "FREQUENCY", "EXTENT", "POSS", "UNIT", 
		"POLARITY", "QUANT", "TIME", "YEAR", "CONSIST", "LOCATIONOF", "DEGREEOF", 
		"SOURCEOF", "DESTINATIONOF", "PATHOF", "BENEFICIARYOF", "ACCOMPANIEROF", 
		"TOPICOF", "DURATIONOF", "INSTRUMENTOF", "MEDIUMOF", "MANNEROF", "PURPOSEOF", 
		"CAUSEOF", "CONCESSIONOF", "CONDITIONOF", "PARTOF", "SUBEVENTOF", "EXAMPLEOF", 
		"DIRECTIONOF", "FREQUENCYOF", "EXTENTOF", "POSSOF", "QUANTOF", "NAMEOF", 
		"UNITOF", "OP1", "OP2", "OP3", "OP4", "OP1OF", "OP2OF", "OP3OF", "OP4OF", 
		"AMRUNKNOWN", "TEXT", "COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Amrdf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AmrdfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AmrsetContext extends ParserRuleContext {
		public List<AmrContext> amr() {
			return getRuleContexts(AmrContext.class);
		}
		public AmrContext amr(int i) {
			return getRuleContext(AmrContext.class,i);
		}
		public AmrsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amrset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterAmrset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitAmrset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitAmrset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmrsetContext amrset() throws RecognitionException {
		AmrsetContext _localctx = new AmrsetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_amrset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				amr();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_BRACE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmrContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<CoreRuleContext> coreRule() {
			return getRuleContexts(CoreRuleContext.class);
		}
		public CoreRuleContext coreRule(int i) {
			return getRuleContext(CoreRuleContext.class,i);
		}
		public List<NonCoreRuleContext> nonCoreRule() {
			return getRuleContexts(NonCoreRuleContext.class);
		}
		public NonCoreRuleContext nonCoreRule(int i) {
			return getRuleContext(NonCoreRuleContext.class,i);
		}
		public AmrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterAmr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitAmr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitAmr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmrContext amr() throws RecognitionException {
		AmrContext _localctx = new AmrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_amr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LEFT_BRACE);
			setState(186);
			varName();
			setState(187);
			match(SLASH);
			setState(188);
			varType();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARG0) | (1L << ARG0OF) | (1L << ARG1) | (1L << ARG1OF) | (1L << ARG2) | (1L << ARG2OF) | (1L << ARG3) | (1L << ARG3OF) | (1L << ARG4) | (1L << ARG4OF) | (1L << DOMAIN) | (1L << DOMAINOF) | (1L << NAME) | (1L << CONSISTOF) | (1L << WIKI) | (1L << MODEOF) | (1L << MODOF) | (1L << MOD) | (1L << MODE) | (1L << LOCATION) | (1L << DEGREE) | (1L << SOURCE) | (1L << DESTINATION) | (1L << PATH) | (1L << BENEFICIARY) | (1L << ACCOMPANIER) | (1L << TOPIC) | (1L << DURATION) | (1L << INSTRUMENT) | (1L << MEDIUM) | (1L << MANNER) | (1L << PURPOSE) | (1L << CAUSE) | (1L << CONCESSION) | (1L << CONDITION) | (1L << PART) | (1L << SUBEVENT) | (1L << EXAMPLE) | (1L << DIRECTION) | (1L << FREQUENCY) | (1L << EXTENT) | (1L << POSS) | (1L << UNIT) | (1L << POLARITY) | (1L << QUANT) | (1L << TIME) | (1L << YEAR) | (1L << CONSIST) | (1L << LOCATIONOF) | (1L << DEGREEOF) | (1L << SOURCEOF) | (1L << DESTINATIONOF) | (1L << PATHOF) | (1L << BENEFICIARYOF) | (1L << ACCOMPANIEROF) | (1L << TOPICOF) | (1L << DURATIONOF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INSTRUMENTOF - 64)) | (1L << (MEDIUMOF - 64)) | (1L << (MANNEROF - 64)) | (1L << (PURPOSEOF - 64)) | (1L << (CAUSEOF - 64)) | (1L << (CONCESSIONOF - 64)) | (1L << (CONDITIONOF - 64)) | (1L << (PARTOF - 64)) | (1L << (SUBEVENTOF - 64)) | (1L << (EXAMPLEOF - 64)) | (1L << (DIRECTIONOF - 64)) | (1L << (FREQUENCYOF - 64)) | (1L << (EXTENTOF - 64)) | (1L << (POSSOF - 64)) | (1L << (QUANTOF - 64)) | (1L << (NAMEOF - 64)) | (1L << (UNITOF - 64)) | (1L << (OP1 - 64)) | (1L << (OP2 - 64)) | (1L << (OP3 - 64)) | (1L << (OP4 - 64)) | (1L << (OP1OF - 64)) | (1L << (OP2OF - 64)) | (1L << (OP3OF - 64)) | (1L << (OP4OF - 64)))) != 0)) {
				{
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARG0:
				case ARG0OF:
				case ARG1:
				case ARG1OF:
				case ARG2:
				case ARG2OF:
				case ARG3:
				case ARG3OF:
				case ARG4:
				case ARG4OF:
					{
					setState(189);
					coreRule();
					}
					break;
				case DOMAIN:
				case DOMAINOF:
				case NAME:
				case CONSISTOF:
				case WIKI:
				case MODEOF:
				case MODOF:
				case MOD:
				case MODE:
				case LOCATION:
				case DEGREE:
				case SOURCE:
				case DESTINATION:
				case PATH:
				case BENEFICIARY:
				case ACCOMPANIER:
				case TOPIC:
				case DURATION:
				case INSTRUMENT:
				case MEDIUM:
				case MANNER:
				case PURPOSE:
				case CAUSE:
				case CONCESSION:
				case CONDITION:
				case PART:
				case SUBEVENT:
				case EXAMPLE:
				case DIRECTION:
				case FREQUENCY:
				case EXTENT:
				case POSS:
				case UNIT:
				case POLARITY:
				case QUANT:
				case TIME:
				case YEAR:
				case CONSIST:
				case LOCATIONOF:
				case DEGREEOF:
				case SOURCEOF:
				case DESTINATIONOF:
				case PATHOF:
				case BENEFICIARYOF:
				case ACCOMPANIEROF:
				case TOPICOF:
				case DURATIONOF:
				case INSTRUMENTOF:
				case MEDIUMOF:
				case MANNEROF:
				case PURPOSEOF:
				case CAUSEOF:
				case CONCESSIONOF:
				case CONDITIONOF:
				case PARTOF:
				case SUBEVENTOF:
				case EXAMPLEOF:
				case DIRECTIONOF:
				case FREQUENCYOF:
				case EXTENTOF:
				case POSSOF:
				case QUANTOF:
				case NAMEOF:
				case UNITOF:
				case OP1:
				case OP2:
				case OP3:
				case OP4:
				case OP1OF:
				case OP2OF:
				case OP3OF:
				case OP4OF:
					{
					setState(190);
					nonCoreRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AmrdfParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__0);
			setState(199);
			match(TEXT);
			setState(200);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext {
		public AmrContext amr() {
			return getRuleContext(AmrContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(AmrdfParser.TEXT, 0); }
		public TerminalNode DASH() { return getToken(AmrdfParser.DASH, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_terminal);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				amr();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				text();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(TEXT);
				}
				break;
			case DASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(DASH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AmrdfParser.TEXT, 0); }
		public TerminalNode DASH() { return getToken(AmrdfParser.DASH, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==DASH || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AmrdfParser.TEXT, 0); }
		public TerminalNode AMRUNKNOWN() { return getToken(AmrdfParser.AMRUNKNOWN, 0); }
		public TerminalNode DASH() { return getToken(AmrdfParser.DASH, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==DASH || _la==AMRUNKNOWN || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoreRuleContext extends ParserRuleContext {
		public Arg0Context arg0() {
			return getRuleContext(Arg0Context.class,0);
		}
		public Arg1Context arg1() {
			return getRuleContext(Arg1Context.class,0);
		}
		public Arg2Context arg2() {
			return getRuleContext(Arg2Context.class,0);
		}
		public Arg3Context arg3() {
			return getRuleContext(Arg3Context.class,0);
		}
		public Arg4Context arg4() {
			return getRuleContext(Arg4Context.class,0);
		}
		public Arg0OfContext arg0Of() {
			return getRuleContext(Arg0OfContext.class,0);
		}
		public Arg1OfContext arg1Of() {
			return getRuleContext(Arg1OfContext.class,0);
		}
		public Arg2OfContext arg2Of() {
			return getRuleContext(Arg2OfContext.class,0);
		}
		public Arg3OfContext arg3Of() {
			return getRuleContext(Arg3OfContext.class,0);
		}
		public Arg4OfContext arg4Of() {
			return getRuleContext(Arg4OfContext.class,0);
		}
		public CoreRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coreRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterCoreRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitCoreRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitCoreRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoreRuleContext coreRule() throws RecognitionException {
		CoreRuleContext _localctx = new CoreRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_coreRule);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARG0:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				arg0();
				}
				break;
			case ARG1:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				arg1();
				}
				break;
			case ARG2:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				arg2();
				}
				break;
			case ARG3:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				arg3();
				}
				break;
			case ARG4:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				arg4();
				}
				break;
			case ARG0OF:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				arg0Of();
				}
				break;
			case ARG1OF:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				arg1Of();
				}
				break;
			case ARG2OF:
				enterOuterAlt(_localctx, 8);
				{
				setState(219);
				arg2Of();
				}
				break;
			case ARG3OF:
				enterOuterAlt(_localctx, 9);
				{
				setState(220);
				arg3Of();
				}
				break;
			case ARG4OF:
				enterOuterAlt(_localctx, 10);
				{
				setState(221);
				arg4Of();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonCoreRuleContext extends ParserRuleContext {
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public WikiContext wiki() {
			return getRuleContext(WikiContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public ModeRuleContext modeRule() {
			return getRuleContext(ModeRuleContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public DegreeContext degree() {
			return getRuleContext(DegreeContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public BeneficiaryContext beneficiary() {
			return getRuleContext(BeneficiaryContext.class,0);
		}
		public AccompanierContext accompanier() {
			return getRuleContext(AccompanierContext.class,0);
		}
		public TopicContext topic() {
			return getRuleContext(TopicContext.class,0);
		}
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public InstrumentContext instrument() {
			return getRuleContext(InstrumentContext.class,0);
		}
		public MediumContext medium() {
			return getRuleContext(MediumContext.class,0);
		}
		public MannerContext manner() {
			return getRuleContext(MannerContext.class,0);
		}
		public PurposeContext purpose() {
			return getRuleContext(PurposeContext.class,0);
		}
		public CauseContext cause() {
			return getRuleContext(CauseContext.class,0);
		}
		public ConcessionContext concession() {
			return getRuleContext(ConcessionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public SubeventContext subevent() {
			return getRuleContext(SubeventContext.class,0);
		}
		public ExampleContext example() {
			return getRuleContext(ExampleContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public FrequencyContext frequency() {
			return getRuleContext(FrequencyContext.class,0);
		}
		public ExtentContext extent() {
			return getRuleContext(ExtentContext.class,0);
		}
		public PossContext poss() {
			return getRuleContext(PossContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public PolarityContext polarity() {
			return getRuleContext(PolarityContext.class,0);
		}
		public QuantContext quant() {
			return getRuleContext(QuantContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public ConsistContext consist() {
			return getRuleContext(ConsistContext.class,0);
		}
		public LocationOfContext locationOf() {
			return getRuleContext(LocationOfContext.class,0);
		}
		public DegreeOfContext degreeOf() {
			return getRuleContext(DegreeOfContext.class,0);
		}
		public SourceOfContext sourceOf() {
			return getRuleContext(SourceOfContext.class,0);
		}
		public DestinationOfContext destinationOf() {
			return getRuleContext(DestinationOfContext.class,0);
		}
		public PathOfContext pathOf() {
			return getRuleContext(PathOfContext.class,0);
		}
		public BeneficiaryOfContext beneficiaryOf() {
			return getRuleContext(BeneficiaryOfContext.class,0);
		}
		public AccompanierOfContext accompanierOf() {
			return getRuleContext(AccompanierOfContext.class,0);
		}
		public TopicOfContext topicOf() {
			return getRuleContext(TopicOfContext.class,0);
		}
		public DurationOfContext durationOf() {
			return getRuleContext(DurationOfContext.class,0);
		}
		public InstrumentOfContext instrumentOf() {
			return getRuleContext(InstrumentOfContext.class,0);
		}
		public MediumOfContext mediumOf() {
			return getRuleContext(MediumOfContext.class,0);
		}
		public MannerOfContext mannerOf() {
			return getRuleContext(MannerOfContext.class,0);
		}
		public PurposeOfContext purposeOf() {
			return getRuleContext(PurposeOfContext.class,0);
		}
		public CauseOfContext causeOf() {
			return getRuleContext(CauseOfContext.class,0);
		}
		public ConcessionOfContext concessionOf() {
			return getRuleContext(ConcessionOfContext.class,0);
		}
		public ConditionOfContext conditionOf() {
			return getRuleContext(ConditionOfContext.class,0);
		}
		public PartOfContext partOf() {
			return getRuleContext(PartOfContext.class,0);
		}
		public SubeventOfContext subeventOf() {
			return getRuleContext(SubeventOfContext.class,0);
		}
		public ExampleOfContext exampleOf() {
			return getRuleContext(ExampleOfContext.class,0);
		}
		public DirectionOfContext directionOf() {
			return getRuleContext(DirectionOfContext.class,0);
		}
		public FrequencyOfContext frequencyOf() {
			return getRuleContext(FrequencyOfContext.class,0);
		}
		public ExtentOfContext extentOf() {
			return getRuleContext(ExtentOfContext.class,0);
		}
		public QuantOfContext quantOf() {
			return getRuleContext(QuantOfContext.class,0);
		}
		public NameOfContext nameOf() {
			return getRuleContext(NameOfContext.class,0);
		}
		public UnitOfContext unitOf() {
			return getRuleContext(UnitOfContext.class,0);
		}
		public ConsistOfContext consistOf() {
			return getRuleContext(ConsistOfContext.class,0);
		}
		public DomainOfContext domainOf() {
			return getRuleContext(DomainOfContext.class,0);
		}
		public ModeOfContext modeOf() {
			return getRuleContext(ModeOfContext.class,0);
		}
		public ModOfContext modOf() {
			return getRuleContext(ModOfContext.class,0);
		}
		public PossOfContext possOf() {
			return getRuleContext(PossOfContext.class,0);
		}
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
		}
		public Op1OfContext op1Of() {
			return getRuleContext(Op1OfContext.class,0);
		}
		public Op2OfContext op2Of() {
			return getRuleContext(Op2OfContext.class,0);
		}
		public Op3OfContext op3Of() {
			return getRuleContext(Op3OfContext.class,0);
		}
		public Op4OfContext op4Of() {
			return getRuleContext(Op4OfContext.class,0);
		}
		public NonCoreRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonCoreRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterNonCoreRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitNonCoreRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitNonCoreRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonCoreRuleContext nonCoreRule() throws RecognitionException {
		NonCoreRuleContext _localctx = new NonCoreRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nonCoreRule);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOMAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				domain();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				name();
				}
				break;
			case WIKI:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				wiki();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				mod();
				}
				break;
			case MODE:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				modeRule();
				}
				break;
			case LOCATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				location();
				}
				break;
			case DEGREE:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				degree();
				}
				break;
			case SOURCE:
				enterOuterAlt(_localctx, 8);
				{
				setState(231);
				source();
				}
				break;
			case DESTINATION:
				enterOuterAlt(_localctx, 9);
				{
				setState(232);
				destination();
				}
				break;
			case PATH:
				enterOuterAlt(_localctx, 10);
				{
				setState(233);
				path();
				}
				break;
			case BENEFICIARY:
				enterOuterAlt(_localctx, 11);
				{
				setState(234);
				beneficiary();
				}
				break;
			case ACCOMPANIER:
				enterOuterAlt(_localctx, 12);
				{
				setState(235);
				accompanier();
				}
				break;
			case TOPIC:
				enterOuterAlt(_localctx, 13);
				{
				setState(236);
				topic();
				}
				break;
			case DURATION:
				enterOuterAlt(_localctx, 14);
				{
				setState(237);
				duration();
				}
				break;
			case INSTRUMENT:
				enterOuterAlt(_localctx, 15);
				{
				setState(238);
				instrument();
				}
				break;
			case MEDIUM:
				enterOuterAlt(_localctx, 16);
				{
				setState(239);
				medium();
				}
				break;
			case MANNER:
				enterOuterAlt(_localctx, 17);
				{
				setState(240);
				manner();
				}
				break;
			case PURPOSE:
				enterOuterAlt(_localctx, 18);
				{
				setState(241);
				purpose();
				}
				break;
			case CAUSE:
				enterOuterAlt(_localctx, 19);
				{
				setState(242);
				cause();
				}
				break;
			case CONCESSION:
				enterOuterAlt(_localctx, 20);
				{
				setState(243);
				concession();
				}
				break;
			case CONDITION:
				enterOuterAlt(_localctx, 21);
				{
				setState(244);
				condition();
				}
				break;
			case PART:
				enterOuterAlt(_localctx, 22);
				{
				setState(245);
				part();
				}
				break;
			case SUBEVENT:
				enterOuterAlt(_localctx, 23);
				{
				setState(246);
				subevent();
				}
				break;
			case EXAMPLE:
				enterOuterAlt(_localctx, 24);
				{
				setState(247);
				example();
				}
				break;
			case DIRECTION:
				enterOuterAlt(_localctx, 25);
				{
				setState(248);
				direction();
				}
				break;
			case FREQUENCY:
				enterOuterAlt(_localctx, 26);
				{
				setState(249);
				frequency();
				}
				break;
			case EXTENT:
				enterOuterAlt(_localctx, 27);
				{
				setState(250);
				extent();
				}
				break;
			case POSS:
				enterOuterAlt(_localctx, 28);
				{
				setState(251);
				poss();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 29);
				{
				setState(252);
				unit();
				}
				break;
			case POLARITY:
				enterOuterAlt(_localctx, 30);
				{
				setState(253);
				polarity();
				}
				break;
			case QUANT:
				enterOuterAlt(_localctx, 31);
				{
				setState(254);
				quant();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 32);
				{
				setState(255);
				time();
				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 33);
				{
				setState(256);
				year();
				}
				break;
			case CONSIST:
				enterOuterAlt(_localctx, 34);
				{
				setState(257);
				consist();
				}
				break;
			case LOCATIONOF:
				enterOuterAlt(_localctx, 35);
				{
				setState(258);
				locationOf();
				}
				break;
			case DEGREEOF:
				enterOuterAlt(_localctx, 36);
				{
				setState(259);
				degreeOf();
				}
				break;
			case SOURCEOF:
				enterOuterAlt(_localctx, 37);
				{
				setState(260);
				sourceOf();
				}
				break;
			case DESTINATIONOF:
				enterOuterAlt(_localctx, 38);
				{
				setState(261);
				destinationOf();
				}
				break;
			case PATHOF:
				enterOuterAlt(_localctx, 39);
				{
				setState(262);
				pathOf();
				}
				break;
			case BENEFICIARYOF:
				enterOuterAlt(_localctx, 40);
				{
				setState(263);
				beneficiaryOf();
				}
				break;
			case ACCOMPANIEROF:
				enterOuterAlt(_localctx, 41);
				{
				setState(264);
				accompanierOf();
				}
				break;
			case TOPICOF:
				enterOuterAlt(_localctx, 42);
				{
				setState(265);
				topicOf();
				}
				break;
			case DURATIONOF:
				enterOuterAlt(_localctx, 43);
				{
				setState(266);
				durationOf();
				}
				break;
			case INSTRUMENTOF:
				enterOuterAlt(_localctx, 44);
				{
				setState(267);
				instrumentOf();
				}
				break;
			case MEDIUMOF:
				enterOuterAlt(_localctx, 45);
				{
				setState(268);
				mediumOf();
				}
				break;
			case MANNEROF:
				enterOuterAlt(_localctx, 46);
				{
				setState(269);
				mannerOf();
				}
				break;
			case PURPOSEOF:
				enterOuterAlt(_localctx, 47);
				{
				setState(270);
				purposeOf();
				}
				break;
			case CAUSEOF:
				enterOuterAlt(_localctx, 48);
				{
				setState(271);
				causeOf();
				}
				break;
			case CONCESSIONOF:
				enterOuterAlt(_localctx, 49);
				{
				setState(272);
				concessionOf();
				}
				break;
			case CONDITIONOF:
				enterOuterAlt(_localctx, 50);
				{
				setState(273);
				conditionOf();
				}
				break;
			case PARTOF:
				enterOuterAlt(_localctx, 51);
				{
				setState(274);
				partOf();
				}
				break;
			case SUBEVENTOF:
				enterOuterAlt(_localctx, 52);
				{
				setState(275);
				subeventOf();
				}
				break;
			case EXAMPLEOF:
				enterOuterAlt(_localctx, 53);
				{
				setState(276);
				exampleOf();
				}
				break;
			case DIRECTIONOF:
				enterOuterAlt(_localctx, 54);
				{
				setState(277);
				directionOf();
				}
				break;
			case FREQUENCYOF:
				enterOuterAlt(_localctx, 55);
				{
				setState(278);
				frequencyOf();
				}
				break;
			case EXTENTOF:
				enterOuterAlt(_localctx, 56);
				{
				setState(279);
				extentOf();
				}
				break;
			case QUANTOF:
				enterOuterAlt(_localctx, 57);
				{
				setState(280);
				quantOf();
				}
				break;
			case NAMEOF:
				enterOuterAlt(_localctx, 58);
				{
				setState(281);
				nameOf();
				}
				break;
			case UNITOF:
				enterOuterAlt(_localctx, 59);
				{
				setState(282);
				unitOf();
				}
				break;
			case CONSISTOF:
				enterOuterAlt(_localctx, 60);
				{
				setState(283);
				consistOf();
				}
				break;
			case DOMAINOF:
				enterOuterAlt(_localctx, 61);
				{
				setState(284);
				domainOf();
				}
				break;
			case MODEOF:
				enterOuterAlt(_localctx, 62);
				{
				setState(285);
				modeOf();
				}
				break;
			case MODOF:
				enterOuterAlt(_localctx, 63);
				{
				setState(286);
				modOf();
				}
				break;
			case POSSOF:
				enterOuterAlt(_localctx, 64);
				{
				setState(287);
				possOf();
				}
				break;
			case OP1:
				enterOuterAlt(_localctx, 65);
				{
				setState(288);
				op1();
				}
				break;
			case OP2:
				enterOuterAlt(_localctx, 66);
				{
				setState(289);
				op2();
				}
				break;
			case OP3:
				enterOuterAlt(_localctx, 67);
				{
				setState(290);
				op3();
				}
				break;
			case OP4:
				enterOuterAlt(_localctx, 68);
				{
				setState(291);
				op4();
				}
				break;
			case OP1OF:
				enterOuterAlt(_localctx, 69);
				{
				setState(292);
				op1Of();
				}
				break;
			case OP2OF:
				enterOuterAlt(_localctx, 70);
				{
				setState(293);
				op2Of();
				}
				break;
			case OP3OF:
				enterOuterAlt(_localctx, 71);
				{
				setState(294);
				op3Of();
				}
				break;
			case OP4OF:
				enterOuterAlt(_localctx, 72);
				{
				setState(295);
				op4Of();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg0Context extends ParserRuleContext {
		public TerminalNode ARG0() { return getToken(AmrdfParser.ARG0, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg0Context arg0() throws RecognitionException {
		Arg0Context _localctx = new Arg0Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_arg0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ARG0);
			setState(299);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg1Context extends ParserRuleContext {
		public TerminalNode ARG1() { return getToken(AmrdfParser.ARG1, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg1Context arg1() throws RecognitionException {
		Arg1Context _localctx = new Arg1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_arg1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ARG1);
			setState(302);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg2Context extends ParserRuleContext {
		public TerminalNode ARG2() { return getToken(AmrdfParser.ARG2, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg2Context arg2() throws RecognitionException {
		Arg2Context _localctx = new Arg2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_arg2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(ARG2);
			setState(305);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg3Context extends ParserRuleContext {
		public TerminalNode ARG3() { return getToken(AmrdfParser.ARG3, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg3Context arg3() throws RecognitionException {
		Arg3Context _localctx = new Arg3Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_arg3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ARG3);
			setState(308);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg4Context extends ParserRuleContext {
		public TerminalNode ARG4() { return getToken(AmrdfParser.ARG4, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg4Context arg4() throws RecognitionException {
		Arg4Context _localctx = new Arg4Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_arg4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ARG4);
			setState(311);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg0OfContext extends ParserRuleContext {
		public TerminalNode ARG0OF() { return getToken(AmrdfParser.ARG0OF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg0OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg0Of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg0Of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg0Of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg0Of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg0OfContext arg0Of() throws RecognitionException {
		Arg0OfContext _localctx = new Arg0OfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arg0Of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ARG0OF);
			setState(314);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg1OfContext extends ParserRuleContext {
		public TerminalNode ARG1OF() { return getToken(AmrdfParser.ARG1OF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg1OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg1Of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg1Of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg1Of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg1Of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg1OfContext arg1Of() throws RecognitionException {
		Arg1OfContext _localctx = new Arg1OfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arg1Of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(ARG1OF);
			setState(317);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg2OfContext extends ParserRuleContext {
		public TerminalNode ARG2OF() { return getToken(AmrdfParser.ARG2OF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg2OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg2Of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg2Of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg2Of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg2Of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg2OfContext arg2Of() throws RecognitionException {
		Arg2OfContext _localctx = new Arg2OfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arg2Of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ARG2OF);
			setState(320);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg3OfContext extends ParserRuleContext {
		public TerminalNode ARG3OF() { return getToken(AmrdfParser.ARG3OF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg3OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg3Of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg3Of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg3Of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg3Of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg3OfContext arg3Of() throws RecognitionException {
		Arg3OfContext _localctx = new Arg3OfContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arg3Of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(ARG3OF);
			setState(323);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg4OfContext extends ParserRuleContext {
		public TerminalNode ARG4OF() { return getToken(AmrdfParser.ARG4OF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Arg4OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg4Of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterArg4Of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitArg4Of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitArg4Of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg4OfContext arg4Of() throws RecognitionException {
		Arg4OfContext _localctx = new Arg4OfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arg4Of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(ARG4OF);
			setState(326);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainContext extends ParserRuleContext {
		public TerminalNode DOMAIN() { return getToken(AmrdfParser.DOMAIN, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(DOMAIN);
			setState(329);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(AmrdfParser.NAME, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(NAME);
			setState(332);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WikiContext extends ParserRuleContext {
		public TerminalNode WIKI() { return getToken(AmrdfParser.WIKI, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public WikiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterWiki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitWiki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitWiki(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WikiContext wiki() throws RecognitionException {
		WikiContext _localctx = new WikiContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_wiki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(WIKI);
			setState(335);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(AmrdfParser.MOD, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(MOD);
			setState(338);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModeRuleContext extends ParserRuleContext {
		public TerminalNode MODE() { return getToken(AmrdfParser.MODE, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ModeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterModeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitModeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitModeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeRuleContext modeRule() throws RecognitionException {
		ModeRuleContext _localctx = new ModeRuleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modeRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(MODE);
			setState(341);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(AmrdfParser.LOCATION, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(LOCATION);
			setState(344);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DegreeContext extends ParserRuleContext {
		public TerminalNode DEGREE() { return getToken(AmrdfParser.DEGREE, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DegreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDegree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDegree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DegreeContext degree() throws RecognitionException {
		DegreeContext _localctx = new DegreeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_degree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(DEGREE);
			setState(347);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(AmrdfParser.SOURCE, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(SOURCE);
			setState(350);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestinationContext extends ParserRuleContext {
		public TerminalNode DESTINATION() { return getToken(AmrdfParser.DESTINATION, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDestination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDestination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDestination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_destination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(DESTINATION);
			setState(353);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(AmrdfParser.PATH, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(PATH);
			setState(356);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeneficiaryContext extends ParserRuleContext {
		public TerminalNode BENEFICIARY() { return getToken(AmrdfParser.BENEFICIARY, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public BeneficiaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beneficiary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterBeneficiary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitBeneficiary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitBeneficiary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeneficiaryContext beneficiary() throws RecognitionException {
		BeneficiaryContext _localctx = new BeneficiaryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_beneficiary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(BENEFICIARY);
			setState(359);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccompanierContext extends ParserRuleContext {
		public TerminalNode ACCOMPANIER() { return getToken(AmrdfParser.ACCOMPANIER, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public AccompanierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accompanier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterAccompanier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitAccompanier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitAccompanier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccompanierContext accompanier() throws RecognitionException {
		AccompanierContext _localctx = new AccompanierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_accompanier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(ACCOMPANIER);
			setState(362);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopicContext extends ParserRuleContext {
		public TerminalNode TOPIC() { return getToken(AmrdfParser.TOPIC, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TopicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterTopic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitTopic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitTopic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopicContext topic() throws RecognitionException {
		TopicContext _localctx = new TopicContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_topic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(TOPIC);
			setState(365);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DurationContext extends ParserRuleContext {
		public TerminalNode DURATION() { return getToken(AmrdfParser.DURATION, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(DURATION);
			setState(368);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrumentContext extends ParserRuleContext {
		public TerminalNode INSTRUMENT() { return getToken(AmrdfParser.INSTRUMENT, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public InstrumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterInstrument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitInstrument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitInstrument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrumentContext instrument() throws RecognitionException {
		InstrumentContext _localctx = new InstrumentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_instrument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(INSTRUMENT);
			setState(371);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MediumContext extends ParserRuleContext {
		public TerminalNode MEDIUM() { return getToken(AmrdfParser.MEDIUM, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public MediumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medium; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterMedium(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitMedium(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitMedium(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediumContext medium() throws RecognitionException {
		MediumContext _localctx = new MediumContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_medium);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(MEDIUM);
			setState(374);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MannerContext extends ParserRuleContext {
		public TerminalNode MANNER() { return getToken(AmrdfParser.MANNER, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public MannerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterManner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitManner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitManner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MannerContext manner() throws RecognitionException {
		MannerContext _localctx = new MannerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_manner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(MANNER);
			setState(377);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PurposeContext extends ParserRuleContext {
		public TerminalNode PURPOSE() { return getToken(AmrdfParser.PURPOSE, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public PurposeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purpose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterPurpose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitPurpose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitPurpose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PurposeContext purpose() throws RecognitionException {
		PurposeContext _localctx = new PurposeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_purpose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(PURPOSE);
			setState(380);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CauseContext extends ParserRuleContext {
		public TerminalNode CAUSE() { return getToken(AmrdfParser.CAUSE, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public CauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterCause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitCause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitCause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CauseContext cause() throws RecognitionException {
		CauseContext _localctx = new CauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(CAUSE);
			setState(383);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcessionContext extends ParserRuleContext {
		public TerminalNode CONCESSION() { return getToken(AmrdfParser.CONCESSION, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ConcessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concession; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterConcession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitConcession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitConcession(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcessionContext concession() throws RecognitionException {
		ConcessionContext _localctx = new ConcessionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_concession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(CONCESSION);
			setState(386);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode CONDITION() { return getToken(AmrdfParser.CONDITION, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(CONDITION);
			setState(389);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartContext extends ParserRuleContext {
		public TerminalNode PART() { return getToken(AmrdfParser.PART, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(PART);
			setState(392);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubeventContext extends ParserRuleContext {
		public TerminalNode SUBEVENT() { return getToken(AmrdfParser.SUBEVENT, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public SubeventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subevent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterSubevent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitSubevent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitSubevent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubeventContext subevent() throws RecognitionException {
		SubeventContext _localctx = new SubeventContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_subevent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(SUBEVENT);
			setState(395);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExampleContext extends ParserRuleContext {
		public TerminalNode EXAMPLE() { return getToken(AmrdfParser.EXAMPLE, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ExampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_example; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterExample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitExample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitExample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExampleContext example() throws RecognitionException {
		ExampleContext _localctx = new ExampleContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_example);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(EXAMPLE);
			setState(398);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode DIRECTION() { return getToken(AmrdfParser.DIRECTION, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_direction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(DIRECTION);
			setState(401);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrequencyContext extends ParserRuleContext {
		public TerminalNode FREQUENCY() { return getToken(AmrdfParser.FREQUENCY, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public FrequencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frequency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterFrequency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitFrequency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitFrequency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrequencyContext frequency() throws RecognitionException {
		FrequencyContext _localctx = new FrequencyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_frequency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(FREQUENCY);
			setState(404);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtentContext extends ParserRuleContext {
		public TerminalNode EXTENT() { return getToken(AmrdfParser.EXTENT, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterExtent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitExtent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitExtent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtentContext extent() throws RecognitionException {
		ExtentContext _localctx = new ExtentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_extent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(EXTENT);
			setState(407);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PossContext extends ParserRuleContext {
		public TerminalNode POSS() { return getToken(AmrdfParser.POSS, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public PossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterPoss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitPoss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitPoss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossContext poss() throws RecognitionException {
		PossContext _localctx = new PossContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_poss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(POSS);
			setState(410);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitContext extends ParserRuleContext {
		public TerminalNode UNIT() { return getToken(AmrdfParser.UNIT, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(UNIT);
			setState(413);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PolarityContext extends ParserRuleContext {
		public TerminalNode POLARITY() { return getToken(AmrdfParser.POLARITY, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public PolarityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polarity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterPolarity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitPolarity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitPolarity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolarityContext polarity() throws RecognitionException {
		PolarityContext _localctx = new PolarityContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_polarity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(POLARITY);
			setState(416);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantContext extends ParserRuleContext {
		public TerminalNode QUANT() { return getToken(AmrdfParser.QUANT, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public QuantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterQuant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitQuant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitQuant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantContext quant() throws RecognitionException {
		QuantContext _localctx = new QuantContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_quant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(QUANT);
			setState(419);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(AmrdfParser.TIME, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(TIME);
			setState(422);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(AmrdfParser.YEAR, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(YEAR);
			setState(425);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsistContext extends ParserRuleContext {
		public TerminalNode CONSIST() { return getToken(AmrdfParser.CONSIST, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ConsistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterConsist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitConsist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitConsist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsistContext consist() throws RecognitionException {
		ConsistContext _localctx = new ConsistContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_consist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(CONSIST);
			setState(428);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsistOfContext extends ParserRuleContext {
		public TerminalNode CONSISTOF() { return getToken(AmrdfParser.CONSISTOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ConsistOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consistOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterConsistOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitConsistOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitConsistOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsistOfContext consistOf() throws RecognitionException {
		ConsistOfContext _localctx = new ConsistOfContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_consistOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(CONSISTOF);
			setState(431);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainOfContext extends ParserRuleContext {
		public TerminalNode DOMAINOF() { return getToken(AmrdfParser.DOMAINOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DomainOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDomainOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDomainOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDomainOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainOfContext domainOf() throws RecognitionException {
		DomainOfContext _localctx = new DomainOfContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_domainOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(DOMAINOF);
			setState(434);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModeOfContext extends ParserRuleContext {
		public TerminalNode MODEOF() { return getToken(AmrdfParser.MODEOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ModeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterModeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitModeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitModeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeOfContext modeOf() throws RecognitionException {
		ModeOfContext _localctx = new ModeOfContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_modeOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(MODEOF);
			setState(437);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModOfContext extends ParserRuleContext {
		public TerminalNode MODOF() { return getToken(AmrdfParser.MODOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ModOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterModOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitModOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitModOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModOfContext modOf() throws RecognitionException {
		ModOfContext _localctx = new ModOfContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_modOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(MODOF);
			setState(440);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationOfContext extends ParserRuleContext {
		public TerminalNode LOCATIONOF() { return getToken(AmrdfParser.LOCATIONOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public LocationOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterLocationOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitLocationOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitLocationOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationOfContext locationOf() throws RecognitionException {
		LocationOfContext _localctx = new LocationOfContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_locationOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(LOCATIONOF);
			setState(443);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DegreeOfContext extends ParserRuleContext {
		public TerminalNode DEGREEOF() { return getToken(AmrdfParser.DEGREEOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DegreeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degreeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDegreeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDegreeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDegreeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DegreeOfContext degreeOf() throws RecognitionException {
		DegreeOfContext _localctx = new DegreeOfContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_degreeOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(DEGREEOF);
			setState(446);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceOfContext extends ParserRuleContext {
		public TerminalNode SOURCEOF() { return getToken(AmrdfParser.SOURCEOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public SourceOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterSourceOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitSourceOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitSourceOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceOfContext sourceOf() throws RecognitionException {
		SourceOfContext _localctx = new SourceOfContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_sourceOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(SOURCEOF);
			setState(449);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestinationOfContext extends ParserRuleContext {
		public TerminalNode DESTINATIONOF() { return getToken(AmrdfParser.DESTINATIONOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DestinationOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDestinationOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDestinationOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDestinationOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationOfContext destinationOf() throws RecognitionException {
		DestinationOfContext _localctx = new DestinationOfContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_destinationOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(DESTINATIONOF);
			setState(452);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathOfContext extends ParserRuleContext {
		public TerminalNode PATHOF() { return getToken(AmrdfParser.PATHOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public PathOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterPathOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitPathOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitPathOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathOfContext pathOf() throws RecognitionException {
		PathOfContext _localctx = new PathOfContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_pathOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(PATHOF);
			setState(455);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeneficiaryOfContext extends ParserRuleContext {
		public TerminalNode BENEFICIARYOF() { return getToken(AmrdfParser.BENEFICIARYOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public BeneficiaryOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beneficiaryOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterBeneficiaryOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitBeneficiaryOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitBeneficiaryOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeneficiaryOfContext beneficiaryOf() throws RecognitionException {
		BeneficiaryOfContext _localctx = new BeneficiaryOfContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_beneficiaryOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(BENEFICIARYOF);
			setState(458);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccompanierOfContext extends ParserRuleContext {
		public TerminalNode ACCOMPANIEROF() { return getToken(AmrdfParser.ACCOMPANIEROF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public AccompanierOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accompanierOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterAccompanierOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitAccompanierOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitAccompanierOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccompanierOfContext accompanierOf() throws RecognitionException {
		AccompanierOfContext _localctx = new AccompanierOfContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_accompanierOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(ACCOMPANIEROF);
			setState(461);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopicOfContext extends ParserRuleContext {
		public TerminalNode TOPICOF() { return getToken(AmrdfParser.TOPICOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TopicOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topicOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterTopicOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitTopicOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitTopicOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopicOfContext topicOf() throws RecognitionException {
		TopicOfContext _localctx = new TopicOfContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_topicOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(TOPICOF);
			setState(464);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DurationOfContext extends ParserRuleContext {
		public TerminalNode DURATIONOF() { return getToken(AmrdfParser.DURATIONOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DurationOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDurationOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDurationOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDurationOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationOfContext durationOf() throws RecognitionException {
		DurationOfContext _localctx = new DurationOfContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_durationOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(DURATIONOF);
			setState(467);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrumentOfContext extends ParserRuleContext {
		public TerminalNode INSTRUMENTOF() { return getToken(AmrdfParser.INSTRUMENTOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public InstrumentOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrumentOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterInstrumentOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitInstrumentOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitInstrumentOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrumentOfContext instrumentOf() throws RecognitionException {
		InstrumentOfContext _localctx = new InstrumentOfContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_instrumentOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(INSTRUMENTOF);
			setState(470);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MediumOfContext extends ParserRuleContext {
		public TerminalNode MEDIUMOF() { return getToken(AmrdfParser.MEDIUMOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public MediumOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediumOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterMediumOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitMediumOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitMediumOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediumOfContext mediumOf() throws RecognitionException {
		MediumOfContext _localctx = new MediumOfContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_mediumOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(MEDIUMOF);
			setState(473);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MannerOfContext extends ParserRuleContext {
		public TerminalNode MANNEROF() { return getToken(AmrdfParser.MANNEROF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public MannerOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mannerOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterMannerOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitMannerOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitMannerOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MannerOfContext mannerOf() throws RecognitionException {
		MannerOfContext _localctx = new MannerOfContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_mannerOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(MANNEROF);
			setState(476);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PurposeOfContext extends ParserRuleContext {
		public TerminalNode PURPOSEOF() { return getToken(AmrdfParser.PURPOSEOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public PurposeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purposeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterPurposeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitPurposeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitPurposeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PurposeOfContext purposeOf() throws RecognitionException {
		PurposeOfContext _localctx = new PurposeOfContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_purposeOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(PURPOSEOF);
			setState(479);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CauseOfContext extends ParserRuleContext {
		public TerminalNode CAUSEOF() { return getToken(AmrdfParser.CAUSEOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public CauseOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_causeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterCauseOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitCauseOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitCauseOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CauseOfContext causeOf() throws RecognitionException {
		CauseOfContext _localctx = new CauseOfContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_causeOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(CAUSEOF);
			setState(482);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcessionOfContext extends ParserRuleContext {
		public TerminalNode CONCESSIONOF() { return getToken(AmrdfParser.CONCESSIONOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ConcessionOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concessionOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterConcessionOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitConcessionOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitConcessionOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcessionOfContext concessionOf() throws RecognitionException {
		ConcessionOfContext _localctx = new ConcessionOfContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_concessionOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(CONCESSIONOF);
			setState(485);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionOfContext extends ParserRuleContext {
		public TerminalNode CONDITIONOF() { return getToken(AmrdfParser.CONDITIONOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ConditionOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterConditionOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitConditionOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitConditionOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionOfContext conditionOf() throws RecognitionException {
		ConditionOfContext _localctx = new ConditionOfContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_conditionOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(CONDITIONOF);
			setState(488);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartOfContext extends ParserRuleContext {
		public TerminalNode PARTOF() { return getToken(AmrdfParser.PARTOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public PartOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterPartOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitPartOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitPartOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartOfContext partOf() throws RecognitionException {
		PartOfContext _localctx = new PartOfContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_partOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(PARTOF);
			setState(491);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubeventOfContext extends ParserRuleContext {
		public TerminalNode SUBEVENTOF() { return getToken(AmrdfParser.SUBEVENTOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public SubeventOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subeventOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterSubeventOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitSubeventOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitSubeventOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubeventOfContext subeventOf() throws RecognitionException {
		SubeventOfContext _localctx = new SubeventOfContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_subeventOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(SUBEVENTOF);
			setState(494);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExampleOfContext extends ParserRuleContext {
		public TerminalNode EXAMPLEOF() { return getToken(AmrdfParser.EXAMPLEOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ExampleOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exampleOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterExampleOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitExampleOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitExampleOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExampleOfContext exampleOf() throws RecognitionException {
		ExampleOfContext _localctx = new ExampleOfContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_exampleOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(EXAMPLEOF);
			setState(497);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionOfContext extends ParserRuleContext {
		public TerminalNode DIRECTIONOF() { return getToken(AmrdfParser.DIRECTIONOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public DirectionOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterDirectionOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitDirectionOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitDirectionOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionOfContext directionOf() throws RecognitionException {
		DirectionOfContext _localctx = new DirectionOfContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_directionOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(DIRECTIONOF);
			setState(500);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrequencyOfContext extends ParserRuleContext {
		public TerminalNode FREQUENCYOF() { return getToken(AmrdfParser.FREQUENCYOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public FrequencyOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frequencyOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterFrequencyOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitFrequencyOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitFrequencyOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrequencyOfContext frequencyOf() throws RecognitionException {
		FrequencyOfContext _localctx = new FrequencyOfContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_frequencyOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(FREQUENCYOF);
			setState(503);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtentOfContext extends ParserRuleContext {
		public TerminalNode EXTENTOF() { return getToken(AmrdfParser.EXTENTOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ExtentOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extentOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterExtentOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitExtentOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitExtentOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtentOfContext extentOf() throws RecognitionException {
		ExtentOfContext _localctx = new ExtentOfContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_extentOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(EXTENTOF);
			setState(506);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PossOfContext extends ParserRuleContext {
		public TerminalNode POSSOF() { return getToken(AmrdfParser.POSSOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public PossOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterPossOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitPossOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitPossOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossOfContext possOf() throws RecognitionException {
		PossOfContext _localctx = new PossOfContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_possOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(POSSOF);
			setState(509);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantOfContext extends ParserRuleContext {
		public TerminalNode QUANTOF() { return getToken(AmrdfParser.QUANTOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public QuantOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterQuantOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitQuantOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitQuantOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantOfContext quantOf() throws RecognitionException {
		QuantOfContext _localctx = new QuantOfContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_quantOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(QUANTOF);
			setState(512);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameOfContext extends ParserRuleContext {
		public TerminalNode NAMEOF() { return getToken(AmrdfParser.NAMEOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public NameOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterNameOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitNameOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitNameOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameOfContext nameOf() throws RecognitionException {
		NameOfContext _localctx = new NameOfContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_nameOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(NAMEOF);
			setState(515);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitOfContext extends ParserRuleContext {
		public TerminalNode UNITOF() { return getToken(AmrdfParser.UNITOF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public UnitOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterUnitOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitUnitOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitUnitOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitOfContext unitOf() throws RecognitionException {
		UnitOfContext _localctx = new UnitOfContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_unitOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(UNITOF);
			setState(518);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode OP1() { return getToken(AmrdfParser.OP1, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_op1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(OP1);
			setState(521);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode OP2() { return getToken(AmrdfParser.OP2, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_op2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(OP2);
			setState(524);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op3Context extends ParserRuleContext {
		public TerminalNode OP3() { return getToken(AmrdfParser.OP3, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(OP3);
			setState(527);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op4Context extends ParserRuleContext {
		public TerminalNode OP4() { return getToken(AmrdfParser.OP4, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterOp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitOp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitOp4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op4Context op4() throws RecognitionException {
		Op4Context _localctx = new Op4Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_op4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(OP4);
			setState(530);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op1OfContext extends ParserRuleContext {
		public TerminalNode OP1OF() { return getToken(AmrdfParser.OP1OF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Op1OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1Of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterOp1Of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitOp1Of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitOp1Of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1OfContext op1Of() throws RecognitionException {
		Op1OfContext _localctx = new Op1OfContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_op1Of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(OP1OF);
			setState(533);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op2OfContext extends ParserRuleContext {
		public TerminalNode OP2OF() { return getToken(AmrdfParser.OP2OF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Op2OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2Of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterOp2Of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitOp2Of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitOp2Of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2OfContext op2Of() throws RecognitionException {
		Op2OfContext _localctx = new Op2OfContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_op2Of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(OP2OF);
			setState(536);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op3OfContext extends ParserRuleContext {
		public TerminalNode OP3OF() { return getToken(AmrdfParser.OP3OF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Op3OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3Of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterOp3Of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitOp3Of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitOp3Of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3OfContext op3Of() throws RecognitionException {
		Op3OfContext _localctx = new Op3OfContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_op3Of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(OP3OF);
			setState(539);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op4OfContext extends ParserRuleContext {
		public TerminalNode OP4OF() { return getToken(AmrdfParser.OP4OF, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public Op4OfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op4Of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).enterOp4Of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmrdfListener ) ((AmrdfListener)listener).exitOp4Of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmrdfVisitor ) return ((AmrdfVisitor<? extends T>)visitor).visitOp4Of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op4OfContext op4Of() throws RecognitionException {
		Op4OfContext _localctx = new Op4OfContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_op4Of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(OP4OF);
			setState(542);
			terminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u0223\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\6\2\u00b8\n\2\r\2\16\2"+
		"\u00b9\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00c2\n\3\f\3\16\3\u00c5\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00d1\n\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e1\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u012b\n\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*"+
		"\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<"+
		"\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C"+
		"\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K"+
		"\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S"+
		"\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z"+
		"\3[\3[\3[\3[\2\2\\\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\2\4"+
		"\4\2\b\b\\\\\4\2\b\b[\\\2\u021e\2\u00b7\3\2\2\2\4\u00bb\3\2\2\2\6\u00c8"+
		"\3\2\2\2\b\u00d0\3\2\2\2\n\u00d2\3\2\2\2\f\u00d4\3\2\2\2\16\u00e0\3\2"+
		"\2\2\20\u012a\3\2\2\2\22\u012c\3\2\2\2\24\u012f\3\2\2\2\26\u0132\3\2\2"+
		"\2\30\u0135\3\2\2\2\32\u0138\3\2\2\2\34\u013b\3\2\2\2\36\u013e\3\2\2\2"+
		" \u0141\3\2\2\2\"\u0144\3\2\2\2$\u0147\3\2\2\2&\u014a\3\2\2\2(\u014d\3"+
		"\2\2\2*\u0150\3\2\2\2,\u0153\3\2\2\2.\u0156\3\2\2\2\60\u0159\3\2\2\2\62"+
		"\u015c\3\2\2\2\64\u015f\3\2\2\2\66\u0162\3\2\2\28\u0165\3\2\2\2:\u0168"+
		"\3\2\2\2<\u016b\3\2\2\2>\u016e\3\2\2\2@\u0171\3\2\2\2B\u0174\3\2\2\2D"+
		"\u0177\3\2\2\2F\u017a\3\2\2\2H\u017d\3\2\2\2J\u0180\3\2\2\2L\u0183\3\2"+
		"\2\2N\u0186\3\2\2\2P\u0189\3\2\2\2R\u018c\3\2\2\2T\u018f\3\2\2\2V\u0192"+
		"\3\2\2\2X\u0195\3\2\2\2Z\u0198\3\2\2\2\\\u019b\3\2\2\2^\u019e\3\2\2\2"+
		"`\u01a1\3\2\2\2b\u01a4\3\2\2\2d\u01a7\3\2\2\2f\u01aa\3\2\2\2h\u01ad\3"+
		"\2\2\2j\u01b0\3\2\2\2l\u01b3\3\2\2\2n\u01b6\3\2\2\2p\u01b9\3\2\2\2r\u01bc"+
		"\3\2\2\2t\u01bf\3\2\2\2v\u01c2\3\2\2\2x\u01c5\3\2\2\2z\u01c8\3\2\2\2|"+
		"\u01cb\3\2\2\2~\u01ce\3\2\2\2\u0080\u01d1\3\2\2\2\u0082\u01d4\3\2\2\2"+
		"\u0084\u01d7\3\2\2\2\u0086\u01da\3\2\2\2\u0088\u01dd\3\2\2\2\u008a\u01e0"+
		"\3\2\2\2\u008c\u01e3\3\2\2\2\u008e\u01e6\3\2\2\2\u0090\u01e9\3\2\2\2\u0092"+
		"\u01ec\3\2\2\2\u0094\u01ef\3\2\2\2\u0096\u01f2\3\2\2\2\u0098\u01f5\3\2"+
		"\2\2\u009a\u01f8\3\2\2\2\u009c\u01fb\3\2\2\2\u009e\u01fe\3\2\2\2\u00a0"+
		"\u0201\3\2\2\2\u00a2\u0204\3\2\2\2\u00a4\u0207\3\2\2\2\u00a6\u020a\3\2"+
		"\2\2\u00a8\u020d\3\2\2\2\u00aa\u0210\3\2\2\2\u00ac\u0213\3\2\2\2\u00ae"+
		"\u0216\3\2\2\2\u00b0\u0219\3\2\2\2\u00b2\u021c\3\2\2\2\u00b4\u021f\3\2"+
		"\2\2\u00b6\u00b8\5\4\3\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\3\3\2\2\2\u00bb\u00bc\7\4\2\2"+
		"\u00bc\u00bd\5\n\6\2\u00bd\u00be\7\6\2\2\u00be\u00c3\5\f\7\2\u00bf\u00c2"+
		"\5\16\b\2\u00c0\u00c2\5\20\t\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2"+
		"\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\5\2\2\u00c7\5\3\2\2\2\u00c8"+
		"\u00c9\7\3\2\2\u00c9\u00ca\7\\\2\2\u00ca\u00cb\7\3\2\2\u00cb\7\3\2\2\2"+
		"\u00cc\u00d1\5\4\3\2\u00cd\u00d1\5\6\4\2\u00ce\u00d1\7\\\2\2\u00cf\u00d1"+
		"\7\b\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\t\3\2\2\2\u00d2\u00d3\t\2\2\2\u00d3\13\3\2\2\2\u00d4"+
		"\u00d5\t\3\2\2\u00d5\r\3\2\2\2\u00d6\u00e1\5\22\n\2\u00d7\u00e1\5\24\13"+
		"\2\u00d8\u00e1\5\26\f\2\u00d9\u00e1\5\30\r\2\u00da\u00e1\5\32\16\2\u00db"+
		"\u00e1\5\34\17\2\u00dc\u00e1\5\36\20\2\u00dd\u00e1\5 \21\2\u00de\u00e1"+
		"\5\"\22\2\u00df\u00e1\5$\23\2\u00e0\u00d6\3\2\2\2\u00e0\u00d7\3\2\2\2"+
		"\u00e0\u00d8\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00db"+
		"\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\17\3\2\2\2\u00e2\u012b\5&\24\2\u00e3\u012b\5(\25"+
		"\2\u00e4\u012b\5*\26\2\u00e5\u012b\5,\27\2\u00e6\u012b\5.\30\2\u00e7\u012b"+
		"\5\60\31\2\u00e8\u012b\5\62\32\2\u00e9\u012b\5\64\33\2\u00ea\u012b\5\66"+
		"\34\2\u00eb\u012b\58\35\2\u00ec\u012b\5:\36\2\u00ed\u012b\5<\37\2\u00ee"+
		"\u012b\5> \2\u00ef\u012b\5@!\2\u00f0\u012b\5B\"\2\u00f1\u012b\5D#\2\u00f2"+
		"\u012b\5F$\2\u00f3\u012b\5H%\2\u00f4\u012b\5J&\2\u00f5\u012b\5L\'\2\u00f6"+
		"\u012b\5N(\2\u00f7\u012b\5P)\2\u00f8\u012b\5R*\2\u00f9\u012b\5T+\2\u00fa"+
		"\u012b\5V,\2\u00fb\u012b\5X-\2\u00fc\u012b\5Z.\2\u00fd\u012b\5\\/\2\u00fe"+
		"\u012b\5^\60\2\u00ff\u012b\5`\61\2\u0100\u012b\5b\62\2\u0101\u012b\5d"+
		"\63\2\u0102\u012b\5f\64\2\u0103\u012b\5h\65\2\u0104\u012b\5r:\2\u0105"+
		"\u012b\5t;\2\u0106\u012b\5v<\2\u0107\u012b\5x=\2\u0108\u012b\5z>\2\u0109"+
		"\u012b\5|?\2\u010a\u012b\5~@\2\u010b\u012b\5\u0080A\2\u010c\u012b\5\u0082"+
		"B\2\u010d\u012b\5\u0084C\2\u010e\u012b\5\u0086D\2\u010f\u012b\5\u0088"+
		"E\2\u0110\u012b\5\u008aF\2\u0111\u012b\5\u008cG\2\u0112\u012b\5\u008e"+
		"H\2\u0113\u012b\5\u0090I\2\u0114\u012b\5\u0092J\2\u0115\u012b\5\u0094"+
		"K\2\u0116\u012b\5\u0096L\2\u0117\u012b\5\u0098M\2\u0118\u012b\5\u009a"+
		"N\2\u0119\u012b\5\u009cO\2\u011a\u012b\5\u00a0Q\2\u011b\u012b\5\u00a2"+
		"R\2\u011c\u012b\5\u00a4S\2\u011d\u012b\5j\66\2\u011e\u012b\5l\67\2\u011f"+
		"\u012b\5n8\2\u0120\u012b\5p9\2\u0121\u012b\5\u009eP\2\u0122\u012b\5\u00a6"+
		"T\2\u0123\u012b\5\u00a8U\2\u0124\u012b\5\u00aaV\2\u0125\u012b\5\u00ac"+
		"W\2\u0126\u012b\5\u00aeX\2\u0127\u012b\5\u00b0Y\2\u0128\u012b\5\u00b2"+
		"Z\2\u0129\u012b\5\u00b4[\2\u012a\u00e2\3\2\2\2\u012a\u00e3\3\2\2\2\u012a"+
		"\u00e4\3\2\2\2\u012a\u00e5\3\2\2\2\u012a\u00e6\3\2\2\2\u012a\u00e7\3\2"+
		"\2\2\u012a\u00e8\3\2\2\2\u012a\u00e9\3\2\2\2\u012a\u00ea\3\2\2\2\u012a"+
		"\u00eb\3\2\2\2\u012a\u00ec\3\2\2\2\u012a\u00ed\3\2\2\2\u012a\u00ee\3\2"+
		"\2\2\u012a\u00ef\3\2\2\2\u012a\u00f0\3\2\2\2\u012a\u00f1\3\2\2\2\u012a"+
		"\u00f2\3\2\2\2\u012a\u00f3\3\2\2\2\u012a\u00f4\3\2\2\2\u012a\u00f5\3\2"+
		"\2\2\u012a\u00f6\3\2\2\2\u012a\u00f7\3\2\2\2\u012a\u00f8\3\2\2\2\u012a"+
		"\u00f9\3\2\2\2\u012a\u00fa\3\2\2\2\u012a\u00fb\3\2\2\2\u012a\u00fc\3\2"+
		"\2\2\u012a\u00fd\3\2\2\2\u012a\u00fe\3\2\2\2\u012a\u00ff\3\2\2\2\u012a"+
		"\u0100\3\2\2\2\u012a\u0101\3\2\2\2\u012a\u0102\3\2\2\2\u012a\u0103\3\2"+
		"\2\2\u012a\u0104\3\2\2\2\u012a\u0105\3\2\2\2\u012a\u0106\3\2\2\2\u012a"+
		"\u0107\3\2\2\2\u012a\u0108\3\2\2\2\u012a\u0109\3\2\2\2\u012a\u010a\3\2"+
		"\2\2\u012a\u010b\3\2\2\2\u012a\u010c\3\2\2\2\u012a\u010d\3\2\2\2\u012a"+
		"\u010e\3\2\2\2\u012a\u010f\3\2\2\2\u012a\u0110\3\2\2\2\u012a\u0111\3\2"+
		"\2\2\u012a\u0112\3\2\2\2\u012a\u0113\3\2\2\2\u012a\u0114\3\2\2\2\u012a"+
		"\u0115\3\2\2\2\u012a\u0116\3\2\2\2\u012a\u0117\3\2\2\2\u012a\u0118\3\2"+
		"\2\2\u012a\u0119\3\2\2\2\u012a\u011a\3\2\2\2\u012a\u011b\3\2\2\2\u012a"+
		"\u011c\3\2\2\2\u012a\u011d\3\2\2\2\u012a\u011e\3\2\2\2\u012a\u011f\3\2"+
		"\2\2\u012a\u0120\3\2\2\2\u012a\u0121\3\2\2\2\u012a\u0122\3\2\2\2\u012a"+
		"\u0123\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2"+
		"\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\21\3\2\2\2\u012c\u012d\7\t\2\2\u012d\u012e\5\b\5\2\u012e\23\3\2\2\2\u012f"+
		"\u0130\7\13\2\2\u0130\u0131\5\b\5\2\u0131\25\3\2\2\2\u0132\u0133\7\r\2"+
		"\2\u0133\u0134\5\b\5\2\u0134\27\3\2\2\2\u0135\u0136\7\17\2\2\u0136\u0137"+
		"\5\b\5\2\u0137\31\3\2\2\2\u0138\u0139\7\21\2\2\u0139\u013a\5\b\5\2\u013a"+
		"\33\3\2\2\2\u013b\u013c\7\n\2\2\u013c\u013d\5\b\5\2\u013d\35\3\2\2\2\u013e"+
		"\u013f\7\f\2\2\u013f\u0140\5\b\5\2\u0140\37\3\2\2\2\u0141\u0142\7\16\2"+
		"\2\u0142\u0143\5\b\5\2\u0143!\3\2\2\2\u0144\u0145\7\20\2\2\u0145\u0146"+
		"\5\b\5\2\u0146#\3\2\2\2\u0147\u0148\7\22\2\2\u0148\u0149\5\b\5\2\u0149"+
		"%\3\2\2\2\u014a\u014b\7\23\2\2\u014b\u014c\5\b\5\2\u014c\'\3\2\2\2\u014d"+
		"\u014e\7\25\2\2\u014e\u014f\5\b\5\2\u014f)\3\2\2\2\u0150\u0151\7\27\2"+
		"\2\u0151\u0152\5\b\5\2\u0152+\3\2\2\2\u0153\u0154\7\32\2\2\u0154\u0155"+
		"\5\b\5\2\u0155-\3\2\2\2\u0156\u0157\7\33\2\2\u0157\u0158\5\b\5\2\u0158"+
		"/\3\2\2\2\u0159\u015a\7\34\2\2\u015a\u015b\5\b\5\2\u015b\61\3\2\2\2\u015c"+
		"\u015d\7\35\2\2\u015d\u015e\5\b\5\2\u015e\63\3\2\2\2\u015f\u0160\7\36"+
		"\2\2\u0160\u0161\5\b\5\2\u0161\65\3\2\2\2\u0162\u0163\7\37\2\2\u0163\u0164"+
		"\5\b\5\2\u0164\67\3\2\2\2\u0165\u0166\7 \2\2\u0166\u0167\5\b\5\2\u0167"+
		"9\3\2\2\2\u0168\u0169\7!\2\2\u0169\u016a\5\b\5\2\u016a;\3\2\2\2\u016b"+
		"\u016c\7\"\2\2\u016c\u016d\5\b\5\2\u016d=\3\2\2\2\u016e\u016f\7#\2\2\u016f"+
		"\u0170\5\b\5\2\u0170?\3\2\2\2\u0171\u0172\7$\2\2\u0172\u0173\5\b\5\2\u0173"+
		"A\3\2\2\2\u0174\u0175\7%\2\2\u0175\u0176\5\b\5\2\u0176C\3\2\2\2\u0177"+
		"\u0178\7&\2\2\u0178\u0179\5\b\5\2\u0179E\3\2\2\2\u017a\u017b\7\'\2\2\u017b"+
		"\u017c\5\b\5\2\u017cG\3\2\2\2\u017d\u017e\7(\2\2\u017e\u017f\5\b\5\2\u017f"+
		"I\3\2\2\2\u0180\u0181\7)\2\2\u0181\u0182\5\b\5\2\u0182K\3\2\2\2\u0183"+
		"\u0184\7*\2\2\u0184\u0185\5\b\5\2\u0185M\3\2\2\2\u0186\u0187\7+\2\2\u0187"+
		"\u0188\5\b\5\2\u0188O\3\2\2\2\u0189\u018a\7,\2\2\u018a\u018b\5\b\5\2\u018b"+
		"Q\3\2\2\2\u018c\u018d\7-\2\2\u018d\u018e\5\b\5\2\u018eS\3\2\2\2\u018f"+
		"\u0190\7.\2\2\u0190\u0191\5\b\5\2\u0191U\3\2\2\2\u0192\u0193\7/\2\2\u0193"+
		"\u0194\5\b\5\2\u0194W\3\2\2\2\u0195\u0196\7\60\2\2\u0196\u0197\5\b\5\2"+
		"\u0197Y\3\2\2\2\u0198\u0199\7\61\2\2\u0199\u019a\5\b\5\2\u019a[\3\2\2"+
		"\2\u019b\u019c\7\62\2\2\u019c\u019d\5\b\5\2\u019d]\3\2\2\2\u019e\u019f"+
		"\7\63\2\2\u019f\u01a0\5\b\5\2\u01a0_\3\2\2\2\u01a1\u01a2\7\64\2\2\u01a2"+
		"\u01a3\5\b\5\2\u01a3a\3\2\2\2\u01a4\u01a5\7\65\2\2\u01a5\u01a6\5\b\5\2"+
		"\u01a6c\3\2\2\2\u01a7\u01a8\7\66\2\2\u01a8\u01a9\5\b\5\2\u01a9e\3\2\2"+
		"\2\u01aa\u01ab\7\67\2\2\u01ab\u01ac\5\b\5\2\u01acg\3\2\2\2\u01ad\u01ae"+
		"\78\2\2\u01ae\u01af\5\b\5\2\u01afi\3\2\2\2\u01b0\u01b1\7\26\2\2\u01b1"+
		"\u01b2\5\b\5\2\u01b2k\3\2\2\2\u01b3\u01b4\7\24\2\2\u01b4\u01b5\5\b\5\2"+
		"\u01b5m\3\2\2\2\u01b6\u01b7\7\30\2\2\u01b7\u01b8\5\b\5\2\u01b8o\3\2\2"+
		"\2\u01b9\u01ba\7\31\2\2\u01ba\u01bb\5\b\5\2\u01bbq\3\2\2\2\u01bc\u01bd"+
		"\79\2\2\u01bd\u01be\5\b\5\2\u01bes\3\2\2\2\u01bf\u01c0\7:\2\2\u01c0\u01c1"+
		"\5\b\5\2\u01c1u\3\2\2\2\u01c2\u01c3\7;\2\2\u01c3\u01c4\5\b\5\2\u01c4w"+
		"\3\2\2\2\u01c5\u01c6\7<\2\2\u01c6\u01c7\5\b\5\2\u01c7y\3\2\2\2\u01c8\u01c9"+
		"\7=\2\2\u01c9\u01ca\5\b\5\2\u01ca{\3\2\2\2\u01cb\u01cc\7>\2\2\u01cc\u01cd"+
		"\5\b\5\2\u01cd}\3\2\2\2\u01ce\u01cf\7?\2\2\u01cf\u01d0\5\b\5\2\u01d0\177"+
		"\3\2\2\2\u01d1\u01d2\7@\2\2\u01d2\u01d3\5\b\5\2\u01d3\u0081\3\2\2\2\u01d4"+
		"\u01d5\7A\2\2\u01d5\u01d6\5\b\5\2\u01d6\u0083\3\2\2\2\u01d7\u01d8\7B\2"+
		"\2\u01d8\u01d9\5\b\5\2\u01d9\u0085\3\2\2\2\u01da\u01db\7C\2\2\u01db\u01dc"+
		"\5\b\5\2\u01dc\u0087\3\2\2\2\u01dd\u01de\7D\2\2\u01de\u01df\5\b\5\2\u01df"+
		"\u0089\3\2\2\2\u01e0\u01e1\7E\2\2\u01e1\u01e2\5\b\5\2\u01e2\u008b\3\2"+
		"\2\2\u01e3\u01e4\7F\2\2\u01e4\u01e5\5\b\5\2\u01e5\u008d\3\2\2\2\u01e6"+
		"\u01e7\7G\2\2\u01e7\u01e8\5\b\5\2\u01e8\u008f\3\2\2\2\u01e9\u01ea\7H\2"+
		"\2\u01ea\u01eb\5\b\5\2\u01eb\u0091\3\2\2\2\u01ec\u01ed\7I\2\2\u01ed\u01ee"+
		"\5\b\5\2\u01ee\u0093\3\2\2\2\u01ef\u01f0\7J\2\2\u01f0\u01f1\5\b\5\2\u01f1"+
		"\u0095\3\2\2\2\u01f2\u01f3\7K\2\2\u01f3\u01f4\5\b\5\2\u01f4\u0097\3\2"+
		"\2\2\u01f5\u01f6\7L\2\2\u01f6\u01f7\5\b\5\2\u01f7\u0099\3\2\2\2\u01f8"+
		"\u01f9\7M\2\2\u01f9\u01fa\5\b\5\2\u01fa\u009b\3\2\2\2\u01fb\u01fc\7N\2"+
		"\2\u01fc\u01fd\5\b\5\2\u01fd\u009d\3\2\2\2\u01fe\u01ff\7O\2\2\u01ff\u0200"+
		"\5\b\5\2\u0200\u009f\3\2\2\2\u0201\u0202\7P\2\2\u0202\u0203\5\b\5\2\u0203"+
		"\u00a1\3\2\2\2\u0204\u0205\7Q\2\2\u0205\u0206\5\b\5\2\u0206\u00a3\3\2"+
		"\2\2\u0207\u0208\7R\2\2\u0208\u0209\5\b\5\2\u0209\u00a5\3\2\2\2\u020a"+
		"\u020b\7S\2\2\u020b\u020c\5\b\5\2\u020c\u00a7\3\2\2\2\u020d\u020e\7T\2"+
		"\2\u020e\u020f\5\b\5\2\u020f\u00a9\3\2\2\2\u0210\u0211\7U\2\2\u0211\u0212"+
		"\5\b\5\2\u0212\u00ab\3\2\2\2\u0213\u0214\7V\2\2\u0214\u0215\5\b\5\2\u0215"+
		"\u00ad\3\2\2\2\u0216\u0217\7W\2\2\u0217\u0218\5\b\5\2\u0218\u00af\3\2"+
		"\2\2\u0219\u021a\7X\2\2\u021a\u021b\5\b\5\2\u021b\u00b1\3\2\2\2\u021c"+
		"\u021d\7Y\2\2\u021d\u021e\5\b\5\2\u021e\u00b3\3\2\2\2\u021f\u0220\7Z\2"+
		"\2\u0220\u0221\5\b\5\2\u0221\u00b5\3\2\2\2\b\u00b9\u00c1\u00c3\u00d0\u00e0"+
		"\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}