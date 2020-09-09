// Generated from C:/dev/VBAObfuscator/src/VBAObfuscator/parser\vba.g4 by ANTLR 4.8
package VBAObfuscator.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vbaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ACCESS=9, 
		ADDRESSOF=10, ALIAS=11, AND=12, ATTRIBUTE=13, APPACTIVATE=14, APPEND=15, 
		AS=16, BEGIN=17, BEEP=18, BINARY=19, BOOLEAN=20, BYVAL=21, BYREF=22, BYTE=23, 
		CALL=24, CASE=25, CHDIR=26, CHDRIVE=27, CLASS=28, CLOSE=29, COLLECTION=30, 
		CONST=31, DATABASE=32, DATE=33, DECLARE=34, DEFBOOL=35, DEFBYTE=36, DEFDATE=37, 
		DEFDBL=38, DEFDEC=39, DEFCUR=40, DEFINT=41, DEFLNG=42, DEFOBJ=43, DEFSNG=44, 
		DEFSTR=45, DEFVAR=46, DELETESETTING=47, DIM=48, DO=49, DOUBLE=50, EACH=51, 
		ELSE=52, ELSEIF=53, END_ENUM=54, END_FUNCTION=55, END_IF=56, END_PROPERTY=57, 
		END_SELECT=58, END_SUB=59, END_TYPE=60, END_WITH=61, END=62, ENUM=63, 
		EQV=64, ERASE=65, ERROR=66, EVENT=67, EXIT_DO=68, EXIT_FOR=69, EXIT_FUNCTION=70, 
		EXIT_PROPERTY=71, EXIT_SUB=72, FALSE=73, FILECOPY=74, FRIEND=75, FOR=76, 
		FUNCTION=77, GET=78, GLOBAL=79, GOSUB=80, GOTO=81, IF=82, IMP=83, IMPLEMENTS=84, 
		IN=85, INPUT=86, IS=87, INTEGER=88, KILL=89, LOAD=90, LOCK=91, LONG=92, 
		LOOP=93, LEN=94, LET=95, LIB=96, LIKE=97, LINE_INPUT=98, LOCK_READ=99, 
		LOCK_WRITE=100, LOCK_READ_WRITE=101, LSET=102, MACRO_CONST=103, MACRO_IF=104, 
		MACRO_ELSEIF=105, MACRO_ELSE=106, MACRO_END_IF=107, ME=108, MID=109, MKDIR=110, 
		MOD=111, NAME=112, NEXT=113, NEW=114, NOT=115, NOTHING=116, NULL=117, 
		ON=118, ON_ERROR=119, ON_LOCAL_ERROR=120, OPEN=121, OPTIONAL=122, OPTION_BASE=123, 
		OPTION_EXPLICIT=124, OPTION_COMPARE=125, OPTION_PRIVATE_MODULE=126, OR=127, 
		OUTPUT=128, PARAMARRAY=129, PRESERVE=130, PRINT=131, PRIVATE=132, PROPERTY_GET=133, 
		PROPERTY_LET=134, PROPERTY_SET=135, PTRSAFE=136, PUBLIC=137, PUT=138, 
		RANDOM=139, RANDOMIZE=140, RAISEEVENT=141, READ=142, READ_WRITE=143, REDIM=144, 
		REM=145, RESET=146, RESUME=147, RETURN=148, RMDIR=149, RSET=150, SAVEPICTURE=151, 
		SAVESETTING=152, SEEK=153, SELECT=154, SENDKEYS=155, SET=156, SETATTR=157, 
		SHARED=158, SINGLE=159, SPC=160, STATIC=161, STEP=162, STOP=163, STRING=164, 
		SUB=165, TAB=166, TEXT=167, THEN=168, TIME=169, TO=170, TRUE=171, TYPE=172, 
		TYPEOF=173, UNLOAD=174, UNLOCK=175, UNTIL=176, VARIANT=177, VERSION=178, 
		WEND=179, WHILE=180, WIDTH=181, WITH=182, WITHEVENTS=183, WRITE=184, XOR=185, 
		AMPERSAND=186, ASSIGN=187, DIV=188, EQ=189, GEQ=190, GT=191, LEQ=192, 
		LPAREN=193, LT=194, MINUS=195, MINUS_EQ=196, MULT=197, NEQ=198, PLUS=199, 
		PLUS_EQ=200, POW=201, RPAREN=202, L_SQUARE_BRACKET=203, R_SQUARE_BRACKET=204, 
		STRINGLITERAL=205, OCTLITERAL=206, HEXLITERAL=207, SHORTLITERAL=208, INTEGERLITERAL=209, 
		DOUBLELITERAL=210, DATELITERAL=211, LINE_CONTINUATION=212, NEWLINE=213, 
		REMCOMMENT=214, COMMENT=215, SINGLEQUOTE=216, COLON=217, UNDERSCORE=218, 
		WS=219, IDENTIFIER=220;
	public static final int
		RULE_startRule = 0, RULE_module = 1, RULE_moduleHeader = 2, RULE_moduleConfig = 3, 
		RULE_moduleConfigElement = 4, RULE_moduleAttributes = 5, RULE_moduleDeclarations = 6, 
		RULE_moduleOption = 7, RULE_moduleDeclarationsElement = 8, RULE_macroStmt = 9, 
		RULE_moduleBody = 10, RULE_moduleBodyElement = 11, RULE_attributeStmt = 12, 
		RULE_block = 13, RULE_blockStmt = 14, RULE_appactivateStmt = 15, RULE_beepStmt = 16, 
		RULE_chdirStmt = 17, RULE_chdriveStmt = 18, RULE_closeStmt = 19, RULE_constStmt = 20, 
		RULE_constSubStmt = 21, RULE_dateStmt = 22, RULE_declareStmt = 23, RULE_deftypeStmt = 24, 
		RULE_deleteSettingStmt = 25, RULE_doLoopStmt = 26, RULE_endStmt = 27, 
		RULE_enumerationStmt = 28, RULE_enumerationStmt_Constant = 29, RULE_eraseStmt = 30, 
		RULE_errorStmt = 31, RULE_eventStmt = 32, RULE_exitStmt = 33, RULE_filecopyStmt = 34, 
		RULE_forEachStmt = 35, RULE_forNextStmt = 36, RULE_functionStmt = 37, 
		RULE_getStmt = 38, RULE_goSubStmt = 39, RULE_goToStmt = 40, RULE_ifThenElseStmt = 41, 
		RULE_ifBlockStmt = 42, RULE_ifConditionStmt = 43, RULE_ifElseIfBlockStmt = 44, 
		RULE_ifElseBlockStmt = 45, RULE_implementsStmt = 46, RULE_inputStmt = 47, 
		RULE_killStmt = 48, RULE_letStmt = 49, RULE_lineInputStmt = 50, RULE_loadStmt = 51, 
		RULE_lockStmt = 52, RULE_lsetStmt = 53, RULE_macroConstStmt = 54, RULE_macroIfThenElseStmt = 55, 
		RULE_macroIfBlockStmt = 56, RULE_macroElseIfBlockStmt = 57, RULE_macroElseBlockStmt = 58, 
		RULE_midStmt = 59, RULE_mkdirStmt = 60, RULE_nameStmt = 61, RULE_onErrorStmt = 62, 
		RULE_onGoToStmt = 63, RULE_onGoSubStmt = 64, RULE_openStmt = 65, RULE_outputList = 66, 
		RULE_outputList_Expression = 67, RULE_printStmt = 68, RULE_propertyGetStmt = 69, 
		RULE_propertySetStmt = 70, RULE_propertyLetStmt = 71, RULE_putStmt = 72, 
		RULE_raiseEventStmt = 73, RULE_randomizeStmt = 74, RULE_redimStmt = 75, 
		RULE_redimSubStmt = 76, RULE_resetStmt = 77, RULE_resumeStmt = 78, RULE_returnStmt = 79, 
		RULE_rmdirStmt = 80, RULE_rsetStmt = 81, RULE_savepictureStmt = 82, RULE_saveSettingStmt = 83, 
		RULE_seekStmt = 84, RULE_selectCaseStmt = 85, RULE_sC_Selection = 86, 
		RULE_sC_Case = 87, RULE_sC_Cond = 88, RULE_sendkeysStmt = 89, RULE_setattrStmt = 90, 
		RULE_setStmt = 91, RULE_stopStmt = 92, RULE_subStmt = 93, RULE_timeStmt = 94, 
		RULE_typeStmt = 95, RULE_typeStmt_Element = 96, RULE_typeOfStmt = 97, 
		RULE_unloadStmt = 98, RULE_unlockStmt = 99, RULE_valueStmt = 100, RULE_variableStmt = 101, 
		RULE_variableListStmt = 102, RULE_variableSubStmt = 103, RULE_whileWendStmt = 104, 
		RULE_widthStmt = 105, RULE_withStmt = 106, RULE_writeStmt = 107, RULE_fileNumber = 108, 
		RULE_explicitCallStmt = 109, RULE_eCS_ProcedureCall = 110, RULE_eCS_MemberProcedureCall = 111, 
		RULE_implicitCallStmt_InBlock = 112, RULE_iCS_B_MemberProcedureCall = 113, 
		RULE_iCS_B_ProcedureCall = 114, RULE_implicitCallStmt_InStmt = 115, RULE_iCS_S_VariableOrProcedureCall = 116, 
		RULE_iCS_S_ProcedureOrArrayCall = 117, RULE_iCS_S_MembersCall = 118, RULE_iCS_S_MemberCall = 119, 
		RULE_iCS_S_DictionaryCall = 120, RULE_argsCall = 121, RULE_argCall = 122, 
		RULE_dictionaryCallStmt = 123, RULE_argList = 124, RULE_arg = 125, RULE_argDefaultValue = 126, 
		RULE_subscripts = 127, RULE_subscript = 128, RULE_ambiguousIdentifier = 129, 
		RULE_asTypeClause = 130, RULE_baseType = 131, RULE_certainIdentifier = 132, 
		RULE_comparisonOperator = 133, RULE_complexType = 134, RULE_fieldLength = 135, 
		RULE_letterrange = 136, RULE_lineLabel = 137, RULE_literal = 138, RULE_type = 139, 
		RULE_typeHint = 140, RULE_visibility = 141, RULE_ambiguousKeyword = 142, 
		RULE_remComment = 143, RULE_comment = 144, RULE_endOfLine = 145, RULE_endOfStatement = 146;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "module", "moduleHeader", "moduleConfig", "moduleConfigElement", 
			"moduleAttributes", "moduleDeclarations", "moduleOption", "moduleDeclarationsElement", 
			"macroStmt", "moduleBody", "moduleBodyElement", "attributeStmt", "block", 
			"blockStmt", "appactivateStmt", "beepStmt", "chdirStmt", "chdriveStmt", 
			"closeStmt", "constStmt", "constSubStmt", "dateStmt", "declareStmt", 
			"deftypeStmt", "deleteSettingStmt", "doLoopStmt", "endStmt", "enumerationStmt", 
			"enumerationStmt_Constant", "eraseStmt", "errorStmt", "eventStmt", "exitStmt", 
			"filecopyStmt", "forEachStmt", "forNextStmt", "functionStmt", "getStmt", 
			"goSubStmt", "goToStmt", "ifThenElseStmt", "ifBlockStmt", "ifConditionStmt", 
			"ifElseIfBlockStmt", "ifElseBlockStmt", "implementsStmt", "inputStmt", 
			"killStmt", "letStmt", "lineInputStmt", "loadStmt", "lockStmt", "lsetStmt", 
			"macroConstStmt", "macroIfThenElseStmt", "macroIfBlockStmt", "macroElseIfBlockStmt", 
			"macroElseBlockStmt", "midStmt", "mkdirStmt", "nameStmt", "onErrorStmt", 
			"onGoToStmt", "onGoSubStmt", "openStmt", "outputList", "outputList_Expression", 
			"printStmt", "propertyGetStmt", "propertySetStmt", "propertyLetStmt", 
			"putStmt", "raiseEventStmt", "randomizeStmt", "redimStmt", "redimSubStmt", 
			"resetStmt", "resumeStmt", "returnStmt", "rmdirStmt", "rsetStmt", "savepictureStmt", 
			"saveSettingStmt", "seekStmt", "selectCaseStmt", "sC_Selection", "sC_Case", 
			"sC_Cond", "sendkeysStmt", "setattrStmt", "setStmt", "stopStmt", "subStmt", 
			"timeStmt", "typeStmt", "typeStmt_Element", "typeOfStmt", "unloadStmt", 
			"unlockStmt", "valueStmt", "variableStmt", "variableListStmt", "variableSubStmt", 
			"whileWendStmt", "widthStmt", "withStmt", "writeStmt", "fileNumber", 
			"explicitCallStmt", "eCS_ProcedureCall", "eCS_MemberProcedureCall", "implicitCallStmt_InBlock", 
			"iCS_B_MemberProcedureCall", "iCS_B_ProcedureCall", "implicitCallStmt_InStmt", 
			"iCS_S_VariableOrProcedureCall", "iCS_S_ProcedureOrArrayCall", "iCS_S_MembersCall", 
			"iCS_S_MemberCall", "iCS_S_DictionaryCall", "argsCall", "argCall", "dictionaryCallStmt", 
			"argList", "arg", "argDefaultValue", "subscripts", "subscript", "ambiguousIdentifier", 
			"asTypeClause", "baseType", "certainIdentifier", "comparisonOperator", 
			"complexType", "fieldLength", "letterrange", "lineLabel", "literal", 
			"type", "typeHint", "visibility", "ambiguousKeyword", "remComment", "comment", 
			"endOfLine", "endOfStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'#'", "'.'", "'!'", "'%'", "'@'", "'$'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'&'", "':='", null, "'='", 
			"'>='", "'>'", "'<='", "'('", "'<'", "'-'", "'-='", "'*'", "'<>'", "'+'", 
			"'+='", "'^'", "')'", "'['", "']'", null, null, null, null, null, null, 
			null, null, null, null, null, "'''", "':'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ACCESS", "ADDRESSOF", 
			"ALIAS", "AND", "ATTRIBUTE", "APPACTIVATE", "APPEND", "AS", "BEGIN", 
			"BEEP", "BINARY", "BOOLEAN", "BYVAL", "BYREF", "BYTE", "CALL", "CASE", 
			"CHDIR", "CHDRIVE", "CLASS", "CLOSE", "COLLECTION", "CONST", "DATABASE", 
			"DATE", "DECLARE", "DEFBOOL", "DEFBYTE", "DEFDATE", "DEFDBL", "DEFDEC", 
			"DEFCUR", "DEFINT", "DEFLNG", "DEFOBJ", "DEFSNG", "DEFSTR", "DEFVAR", 
			"DELETESETTING", "DIM", "DO", "DOUBLE", "EACH", "ELSE", "ELSEIF", "END_ENUM", 
			"END_FUNCTION", "END_IF", "END_PROPERTY", "END_SELECT", "END_SUB", "END_TYPE", 
			"END_WITH", "END", "ENUM", "EQV", "ERASE", "ERROR", "EVENT", "EXIT_DO", 
			"EXIT_FOR", "EXIT_FUNCTION", "EXIT_PROPERTY", "EXIT_SUB", "FALSE", "FILECOPY", 
			"FRIEND", "FOR", "FUNCTION", "GET", "GLOBAL", "GOSUB", "GOTO", "IF", 
			"IMP", "IMPLEMENTS", "IN", "INPUT", "IS", "INTEGER", "KILL", "LOAD", 
			"LOCK", "LONG", "LOOP", "LEN", "LET", "LIB", "LIKE", "LINE_INPUT", "LOCK_READ", 
			"LOCK_WRITE", "LOCK_READ_WRITE", "LSET", "MACRO_CONST", "MACRO_IF", "MACRO_ELSEIF", 
			"MACRO_ELSE", "MACRO_END_IF", "ME", "MID", "MKDIR", "MOD", "NAME", "NEXT", 
			"NEW", "NOT", "NOTHING", "NULL", "ON", "ON_ERROR", "ON_LOCAL_ERROR", 
			"OPEN", "OPTIONAL", "OPTION_BASE", "OPTION_EXPLICIT", "OPTION_COMPARE", 
			"OPTION_PRIVATE_MODULE", "OR", "OUTPUT", "PARAMARRAY", "PRESERVE", "PRINT", 
			"PRIVATE", "PROPERTY_GET", "PROPERTY_LET", "PROPERTY_SET", "PTRSAFE", 
			"PUBLIC", "PUT", "RANDOM", "RANDOMIZE", "RAISEEVENT", "READ", "READ_WRITE", 
			"REDIM", "REM", "RESET", "RESUME", "RETURN", "RMDIR", "RSET", "SAVEPICTURE", 
			"SAVESETTING", "SEEK", "SELECT", "SENDKEYS", "SET", "SETATTR", "SHARED", 
			"SINGLE", "SPC", "STATIC", "STEP", "STOP", "STRING", "SUB", "TAB", "TEXT", 
			"THEN", "TIME", "TO", "TRUE", "TYPE", "TYPEOF", "UNLOAD", "UNLOCK", "UNTIL", 
			"VARIANT", "VERSION", "WEND", "WHILE", "WIDTH", "WITH", "WITHEVENTS", 
			"WRITE", "XOR", "AMPERSAND", "ASSIGN", "DIV", "EQ", "GEQ", "GT", "LEQ", 
			"LPAREN", "LT", "MINUS", "MINUS_EQ", "MULT", "NEQ", "PLUS", "PLUS_EQ", 
			"POW", "RPAREN", "L_SQUARE_BRACKET", "R_SQUARE_BRACKET", "STRINGLITERAL", 
			"OCTLITERAL", "HEXLITERAL", "SHORTLITERAL", "INTEGERLITERAL", "DOUBLELITERAL", 
			"DATELITERAL", "LINE_CONTINUATION", "NEWLINE", "REMCOMMENT", "COMMENT", 
			"SINGLEQUOTE", "COLON", "UNDERSCORE", "WS", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "vba.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public vbaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartRuleContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(vbaParser.EOF, 0); }
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			module();
			setState(295);
			match(EOF);
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

	public static class ModuleContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public ModuleHeaderContext moduleHeader() {
			return getRuleContext(ModuleHeaderContext.class,0);
		}
		public ModuleConfigContext moduleConfig() {
			return getRuleContext(ModuleConfigContext.class,0);
		}
		public ModuleAttributesContext moduleAttributes() {
			return getRuleContext(ModuleAttributesContext.class,0);
		}
		public ModuleDeclarationsContext moduleDeclarations() {
			return getRuleContext(ModuleDeclarationsContext.class,0);
		}
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(297);
				match(WS);
				}
				break;
			}
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					endOfLine();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(306);
				moduleHeader();
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						endOfLine();
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
			}

			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(315);
				moduleConfig();
				}
			}

			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					endOfLine();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(324);
				moduleAttributes();
				}
			}

			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					endOfLine();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(333);
				moduleDeclarations();
				}
				break;
			}
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336);
					endOfLine();
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (FUNCTION - 75)) | (1L << (GLOBAL - 75)) | (1L << (MACRO_CONST - 75)) | (1L << (MACRO_IF - 75)) | (1L << (PRIVATE - 75)) | (1L << (PROPERTY_GET - 75)) | (1L << (PROPERTY_LET - 75)) | (1L << (PROPERTY_SET - 75)) | (1L << (PUBLIC - 75)))) != 0) || _la==STATIC || _la==SUB) {
				{
				setState(342);
				moduleBody();
				}
			}

			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					endOfLine();
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(351);
				match(WS);
				}
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

	public static class ModuleHeaderContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(vbaParser.VERSION, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode DOUBLELITERAL() { return getToken(vbaParser.DOUBLELITERAL, 0); }
		public TerminalNode CLASS() { return getToken(vbaParser.CLASS, 0); }
		public ModuleHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterModuleHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitModuleHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitModuleHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleHeaderContext moduleHeader() throws RecognitionException {
		ModuleHeaderContext _localctx = new ModuleHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(VERSION);
			setState(355);
			match(WS);
			setState(356);
			match(DOUBLELITERAL);
			setState(357);
			match(WS);
			setState(358);
			match(CLASS);
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

	public static class ModuleConfigContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(vbaParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(vbaParser.END, 0); }
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<ModuleConfigElementContext> moduleConfigElement() {
			return getRuleContexts(ModuleConfigElementContext.class);
		}
		public ModuleConfigElementContext moduleConfigElement(int i) {
			return getRuleContext(ModuleConfigElementContext.class,i);
		}
		public ModuleConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterModuleConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitModuleConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitModuleConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleConfigContext moduleConfig() throws RecognitionException {
		ModuleConfigContext _localctx = new ModuleConfigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleConfig);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(BEGIN);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (NEWLINE - 213)) | (1L << (REMCOMMENT - 213)) | (1L << (COMMENT - 213)) | (1L << (WS - 213)))) != 0)) {
				{
				{
				setState(361);
				endOfLine();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(367);
					moduleConfigElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(370); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(372);
			match(END);
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

	public static class ModuleConfigElementContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public ModuleConfigElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfigElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterModuleConfigElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitModuleConfigElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitModuleConfigElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleConfigElementContext moduleConfigElement() throws RecognitionException {
		ModuleConfigElementContext _localctx = new ModuleConfigElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleConfigElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			ambiguousIdentifier();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(375);
				match(WS);
				}
			}

			setState(378);
			match(EQ);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(379);
				match(WS);
				}
			}

			setState(382);
			literal();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (NEWLINE - 213)) | (1L << (REMCOMMENT - 213)) | (1L << (COMMENT - 213)) | (1L << (WS - 213)))) != 0)) {
				{
				{
				setState(383);
				endOfLine();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ModuleAttributesContext extends ParserRuleContext {
		public List<AttributeStmtContext> attributeStmt() {
			return getRuleContexts(AttributeStmtContext.class);
		}
		public AttributeStmtContext attributeStmt(int i) {
			return getRuleContext(AttributeStmtContext.class,i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public ModuleAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterModuleAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitModuleAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitModuleAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleAttributesContext moduleAttributes() throws RecognitionException {
		ModuleAttributesContext _localctx = new ModuleAttributesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moduleAttributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(389);
				attributeStmt();
				setState(391); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(390);
						endOfLine();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(393); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTRIBUTE );
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

	public static class ModuleDeclarationsContext extends ParserRuleContext {
		public List<ModuleDeclarationsElementContext> moduleDeclarationsElement() {
			return getRuleContexts(ModuleDeclarationsElementContext.class);
		}
		public ModuleDeclarationsElementContext moduleDeclarationsElement(int i) {
			return getRuleContext(ModuleDeclarationsElementContext.class,i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public ModuleDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterModuleDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitModuleDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitModuleDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationsContext moduleDeclarations() throws RecognitionException {
		ModuleDeclarationsContext _localctx = new ModuleDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moduleDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			moduleDeclarationsElement();
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(400);
							endOfLine();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(403); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(405);
					moduleDeclarationsElement();
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					endOfLine();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ModuleOptionContext extends ParserRuleContext {
		public ModuleOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleOption; }
	 
		public ModuleOptionContext() { }
		public void copyFrom(ModuleOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptionExplicitStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_EXPLICIT() { return getToken(vbaParser.OPTION_EXPLICIT, 0); }
		public OptionExplicitStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOptionExplicitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOptionExplicitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOptionExplicitStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionBaseStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_BASE() { return getToken(vbaParser.OPTION_BASE, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public TerminalNode SHORTLITERAL() { return getToken(vbaParser.SHORTLITERAL, 0); }
		public OptionBaseStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOptionBaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOptionBaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOptionBaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionPrivateModuleStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_PRIVATE_MODULE() { return getToken(vbaParser.OPTION_PRIVATE_MODULE, 0); }
		public OptionPrivateModuleStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOptionPrivateModuleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOptionPrivateModuleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOptionPrivateModuleStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionCompareStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_COMPARE() { return getToken(vbaParser.OPTION_COMPARE, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public TerminalNode BINARY() { return getToken(vbaParser.BINARY, 0); }
		public TerminalNode TEXT() { return getToken(vbaParser.TEXT, 0); }
		public TerminalNode DATABASE() { return getToken(vbaParser.DATABASE, 0); }
		public OptionCompareStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOptionCompareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOptionCompareStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOptionCompareStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleOptionContext moduleOption() throws RecognitionException {
		ModuleOptionContext _localctx = new ModuleOptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleOption);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTION_BASE:
				_localctx = new OptionBaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(OPTION_BASE);
				setState(419);
				match(WS);
				setState(420);
				match(SHORTLITERAL);
				}
				break;
			case OPTION_COMPARE:
				_localctx = new OptionCompareStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(OPTION_COMPARE);
				setState(422);
				match(WS);
				setState(423);
				_la = _input.LA(1);
				if ( !(_la==BINARY || _la==DATABASE || _la==TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case OPTION_EXPLICIT:
				_localctx = new OptionExplicitStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				match(OPTION_EXPLICIT);
				}
				break;
			case OPTION_PRIVATE_MODULE:
				_localctx = new OptionPrivateModuleStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(OPTION_PRIVATE_MODULE);
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

	public static class ModuleDeclarationsElementContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public EnumerationStmtContext enumerationStmt() {
			return getRuleContext(EnumerationStmtContext.class,0);
		}
		public EventStmtContext eventStmt() {
			return getRuleContext(EventStmtContext.class,0);
		}
		public ConstStmtContext constStmt() {
			return getRuleContext(ConstStmtContext.class,0);
		}
		public ImplementsStmtContext implementsStmt() {
			return getRuleContext(ImplementsStmtContext.class,0);
		}
		public VariableStmtContext variableStmt() {
			return getRuleContext(VariableStmtContext.class,0);
		}
		public ModuleOptionContext moduleOption() {
			return getRuleContext(ModuleOptionContext.class,0);
		}
		public TypeStmtContext typeStmt() {
			return getRuleContext(TypeStmtContext.class,0);
		}
		public MacroStmtContext macroStmt() {
			return getRuleContext(MacroStmtContext.class,0);
		}
		public ModuleDeclarationsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclarationsElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterModuleDeclarationsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitModuleDeclarationsElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitModuleDeclarationsElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationsElementContext moduleDeclarationsElement() throws RecognitionException {
		ModuleDeclarationsElementContext _localctx = new ModuleDeclarationsElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moduleDeclarationsElement);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				comment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				declareStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				enumerationStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				eventStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				constStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				implementsStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(434);
				variableStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(435);
				moduleOption();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(436);
				typeStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(437);
				macroStmt();
				}
				break;
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

	public static class MacroStmtContext extends ParserRuleContext {
		public MacroConstStmtContext macroConstStmt() {
			return getRuleContext(MacroConstStmtContext.class,0);
		}
		public MacroIfThenElseStmtContext macroIfThenElseStmt() {
			return getRuleContext(MacroIfThenElseStmtContext.class,0);
		}
		public MacroStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterMacroStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitMacroStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitMacroStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroStmtContext macroStmt() throws RecognitionException {
		MacroStmtContext _localctx = new MacroStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_macroStmt);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MACRO_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				macroConstStmt();
				}
				break;
			case MACRO_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				macroIfThenElseStmt();
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

	public static class ModuleBodyContext extends ParserRuleContext {
		public List<ModuleBodyElementContext> moduleBodyElement() {
			return getRuleContexts(ModuleBodyElementContext.class);
		}
		public ModuleBodyElementContext moduleBodyElement(int i) {
			return getRuleContext(ModuleBodyElementContext.class,i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterModuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitModuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitModuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_moduleBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			moduleBodyElement();
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(446); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(445);
						endOfLine();
						}
						}
						setState(448); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (NEWLINE - 213)) | (1L << (REMCOMMENT - 213)) | (1L << (COMMENT - 213)) | (1L << (WS - 213)))) != 0) );
					setState(450);
					moduleBodyElement();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(457);
					endOfLine();
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class ModuleBodyElementContext extends ParserRuleContext {
		public FunctionStmtContext functionStmt() {
			return getRuleContext(FunctionStmtContext.class,0);
		}
		public PropertyGetStmtContext propertyGetStmt() {
			return getRuleContext(PropertyGetStmtContext.class,0);
		}
		public PropertySetStmtContext propertySetStmt() {
			return getRuleContext(PropertySetStmtContext.class,0);
		}
		public PropertyLetStmtContext propertyLetStmt() {
			return getRuleContext(PropertyLetStmtContext.class,0);
		}
		public SubStmtContext subStmt() {
			return getRuleContext(SubStmtContext.class,0);
		}
		public MacroStmtContext macroStmt() {
			return getRuleContext(MacroStmtContext.class,0);
		}
		public ModuleBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterModuleBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitModuleBodyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitModuleBodyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBodyElementContext moduleBodyElement() throws RecognitionException {
		ModuleBodyElementContext _localctx = new ModuleBodyElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_moduleBodyElement);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				functionStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				propertyGetStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				propertySetStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				propertyLetStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				subStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				macroStmt();
				}
				break;
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

	public static class AttributeStmtContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(vbaParser.ATTRIBUTE, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public AttributeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterAttributeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitAttributeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitAttributeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeStmtContext attributeStmt() throws RecognitionException {
		AttributeStmtContext _localctx = new AttributeStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(ATTRIBUTE);
			setState(472);
			match(WS);
			setState(473);
			implicitCallStmt_InStmt();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(474);
				match(WS);
				}
			}

			setState(477);
			match(EQ);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(478);
				match(WS);
				}
			}

			setState(481);
			literal();
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(482);
						match(WS);
						}
					}

					setState(485);
					match(T__0);
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(486);
						match(WS);
						}
					}

					setState(489);
					literal();
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			blockStmt();
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(496);
					endOfStatement();
					setState(497);
					blockStmt();
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(504);
			endOfStatement();
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

	public static class BlockStmtContext extends ParserRuleContext {
		public LineLabelContext lineLabel() {
			return getRuleContext(LineLabelContext.class,0);
		}
		public AppactivateStmtContext appactivateStmt() {
			return getRuleContext(AppactivateStmtContext.class,0);
		}
		public AttributeStmtContext attributeStmt() {
			return getRuleContext(AttributeStmtContext.class,0);
		}
		public BeepStmtContext beepStmt() {
			return getRuleContext(BeepStmtContext.class,0);
		}
		public ChdirStmtContext chdirStmt() {
			return getRuleContext(ChdirStmtContext.class,0);
		}
		public ChdriveStmtContext chdriveStmt() {
			return getRuleContext(ChdriveStmtContext.class,0);
		}
		public CloseStmtContext closeStmt() {
			return getRuleContext(CloseStmtContext.class,0);
		}
		public ConstStmtContext constStmt() {
			return getRuleContext(ConstStmtContext.class,0);
		}
		public DateStmtContext dateStmt() {
			return getRuleContext(DateStmtContext.class,0);
		}
		public DeleteSettingStmtContext deleteSettingStmt() {
			return getRuleContext(DeleteSettingStmtContext.class,0);
		}
		public DeftypeStmtContext deftypeStmt() {
			return getRuleContext(DeftypeStmtContext.class,0);
		}
		public DoLoopStmtContext doLoopStmt() {
			return getRuleContext(DoLoopStmtContext.class,0);
		}
		public EndStmtContext endStmt() {
			return getRuleContext(EndStmtContext.class,0);
		}
		public EraseStmtContext eraseStmt() {
			return getRuleContext(EraseStmtContext.class,0);
		}
		public ErrorStmtContext errorStmt() {
			return getRuleContext(ErrorStmtContext.class,0);
		}
		public ExitStmtContext exitStmt() {
			return getRuleContext(ExitStmtContext.class,0);
		}
		public ExplicitCallStmtContext explicitCallStmt() {
			return getRuleContext(ExplicitCallStmtContext.class,0);
		}
		public FilecopyStmtContext filecopyStmt() {
			return getRuleContext(FilecopyStmtContext.class,0);
		}
		public ForEachStmtContext forEachStmt() {
			return getRuleContext(ForEachStmtContext.class,0);
		}
		public ForNextStmtContext forNextStmt() {
			return getRuleContext(ForNextStmtContext.class,0);
		}
		public GetStmtContext getStmt() {
			return getRuleContext(GetStmtContext.class,0);
		}
		public GoSubStmtContext goSubStmt() {
			return getRuleContext(GoSubStmtContext.class,0);
		}
		public GoToStmtContext goToStmt() {
			return getRuleContext(GoToStmtContext.class,0);
		}
		public IfThenElseStmtContext ifThenElseStmt() {
			return getRuleContext(IfThenElseStmtContext.class,0);
		}
		public ImplementsStmtContext implementsStmt() {
			return getRuleContext(ImplementsStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public KillStmtContext killStmt() {
			return getRuleContext(KillStmtContext.class,0);
		}
		public LetStmtContext letStmt() {
			return getRuleContext(LetStmtContext.class,0);
		}
		public LineInputStmtContext lineInputStmt() {
			return getRuleContext(LineInputStmtContext.class,0);
		}
		public LoadStmtContext loadStmt() {
			return getRuleContext(LoadStmtContext.class,0);
		}
		public LockStmtContext lockStmt() {
			return getRuleContext(LockStmtContext.class,0);
		}
		public LsetStmtContext lsetStmt() {
			return getRuleContext(LsetStmtContext.class,0);
		}
		public MacroStmtContext macroStmt() {
			return getRuleContext(MacroStmtContext.class,0);
		}
		public MidStmtContext midStmt() {
			return getRuleContext(MidStmtContext.class,0);
		}
		public MkdirStmtContext mkdirStmt() {
			return getRuleContext(MkdirStmtContext.class,0);
		}
		public NameStmtContext nameStmt() {
			return getRuleContext(NameStmtContext.class,0);
		}
		public OnErrorStmtContext onErrorStmt() {
			return getRuleContext(OnErrorStmtContext.class,0);
		}
		public OnGoToStmtContext onGoToStmt() {
			return getRuleContext(OnGoToStmtContext.class,0);
		}
		public OnGoSubStmtContext onGoSubStmt() {
			return getRuleContext(OnGoSubStmtContext.class,0);
		}
		public OpenStmtContext openStmt() {
			return getRuleContext(OpenStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public PutStmtContext putStmt() {
			return getRuleContext(PutStmtContext.class,0);
		}
		public RaiseEventStmtContext raiseEventStmt() {
			return getRuleContext(RaiseEventStmtContext.class,0);
		}
		public RandomizeStmtContext randomizeStmt() {
			return getRuleContext(RandomizeStmtContext.class,0);
		}
		public RedimStmtContext redimStmt() {
			return getRuleContext(RedimStmtContext.class,0);
		}
		public ResetStmtContext resetStmt() {
			return getRuleContext(ResetStmtContext.class,0);
		}
		public ResumeStmtContext resumeStmt() {
			return getRuleContext(ResumeStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public RmdirStmtContext rmdirStmt() {
			return getRuleContext(RmdirStmtContext.class,0);
		}
		public RsetStmtContext rsetStmt() {
			return getRuleContext(RsetStmtContext.class,0);
		}
		public SavepictureStmtContext savepictureStmt() {
			return getRuleContext(SavepictureStmtContext.class,0);
		}
		public SaveSettingStmtContext saveSettingStmt() {
			return getRuleContext(SaveSettingStmtContext.class,0);
		}
		public SeekStmtContext seekStmt() {
			return getRuleContext(SeekStmtContext.class,0);
		}
		public SelectCaseStmtContext selectCaseStmt() {
			return getRuleContext(SelectCaseStmtContext.class,0);
		}
		public SendkeysStmtContext sendkeysStmt() {
			return getRuleContext(SendkeysStmtContext.class,0);
		}
		public SetattrStmtContext setattrStmt() {
			return getRuleContext(SetattrStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public StopStmtContext stopStmt() {
			return getRuleContext(StopStmtContext.class,0);
		}
		public TimeStmtContext timeStmt() {
			return getRuleContext(TimeStmtContext.class,0);
		}
		public UnloadStmtContext unloadStmt() {
			return getRuleContext(UnloadStmtContext.class,0);
		}
		public UnlockStmtContext unlockStmt() {
			return getRuleContext(UnlockStmtContext.class,0);
		}
		public VariableStmtContext variableStmt() {
			return getRuleContext(VariableStmtContext.class,0);
		}
		public WhileWendStmtContext whileWendStmt() {
			return getRuleContext(WhileWendStmtContext.class,0);
		}
		public WidthStmtContext widthStmt() {
			return getRuleContext(WidthStmtContext.class,0);
		}
		public WithStmtContext withStmt() {
			return getRuleContext(WithStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public ImplicitCallStmt_InBlockContext implicitCallStmt_InBlock() {
			return getRuleContext(ImplicitCallStmt_InBlockContext.class,0);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStmt);
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				lineLabel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				appactivateStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				attributeStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				beepStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(510);
				chdirStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(511);
				chdriveStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(512);
				closeStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(513);
				constStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(514);
				dateStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(515);
				deleteSettingStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(516);
				deftypeStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(517);
				doLoopStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(518);
				endStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(519);
				eraseStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(520);
				errorStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(521);
				exitStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(522);
				explicitCallStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(523);
				filecopyStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(524);
				forEachStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(525);
				forNextStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(526);
				getStmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(527);
				goSubStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(528);
				goToStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(529);
				ifThenElseStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(530);
				implementsStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(531);
				inputStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(532);
				killStmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(533);
				letStmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(534);
				lineInputStmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(535);
				loadStmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(536);
				lockStmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(537);
				lsetStmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(538);
				macroStmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(539);
				midStmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(540);
				mkdirStmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(541);
				nameStmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(542);
				onErrorStmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(543);
				onGoToStmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(544);
				onGoSubStmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(545);
				openStmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(546);
				printStmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(547);
				putStmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(548);
				raiseEventStmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(549);
				randomizeStmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(550);
				redimStmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(551);
				resetStmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(552);
				resumeStmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(553);
				returnStmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(554);
				rmdirStmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(555);
				rsetStmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(556);
				savepictureStmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(557);
				saveSettingStmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(558);
				seekStmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(559);
				selectCaseStmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(560);
				sendkeysStmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(561);
				setattrStmt();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(562);
				setStmt();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(563);
				stopStmt();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(564);
				timeStmt();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(565);
				unloadStmt();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(566);
				unlockStmt();
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(567);
				variableStmt();
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(568);
				whileWendStmt();
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(569);
				widthStmt();
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(570);
				withStmt();
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(571);
				writeStmt();
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(572);
				implicitCallStmt_InBlock();
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(573);
				implicitCallStmt_InStmt();
				}
				break;
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

	public static class AppactivateStmtContext extends ParserRuleContext {
		public TerminalNode APPACTIVATE() { return getToken(vbaParser.APPACTIVATE, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public AppactivateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appactivateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterAppactivateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitAppactivateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitAppactivateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppactivateStmtContext appactivateStmt() throws RecognitionException {
		AppactivateStmtContext _localctx = new AppactivateStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_appactivateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(APPACTIVATE);
			setState(577);
			match(WS);
			setState(578);
			valueStmt(0);
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(579);
					match(WS);
					}
				}

				setState(582);
				match(T__0);
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(583);
					match(WS);
					}
				}

				setState(586);
				valueStmt(0);
				}
				break;
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

	public static class BeepStmtContext extends ParserRuleContext {
		public TerminalNode BEEP() { return getToken(vbaParser.BEEP, 0); }
		public BeepStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beepStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterBeepStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitBeepStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitBeepStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeepStmtContext beepStmt() throws RecognitionException {
		BeepStmtContext _localctx = new BeepStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_beepStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(BEEP);
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

	public static class ChdirStmtContext extends ParserRuleContext {
		public TerminalNode CHDIR() { return getToken(vbaParser.CHDIR, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public ChdirStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chdirStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterChdirStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitChdirStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitChdirStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChdirStmtContext chdirStmt() throws RecognitionException {
		ChdirStmtContext _localctx = new ChdirStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(CHDIR);
			setState(592);
			match(WS);
			setState(593);
			valueStmt(0);
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

	public static class ChdriveStmtContext extends ParserRuleContext {
		public TerminalNode CHDRIVE() { return getToken(vbaParser.CHDRIVE, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public ChdriveStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chdriveStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterChdriveStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitChdriveStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitChdriveStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChdriveStmtContext chdriveStmt() throws RecognitionException {
		ChdriveStmtContext _localctx = new ChdriveStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chdriveStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(CHDRIVE);
			setState(596);
			match(WS);
			setState(597);
			valueStmt(0);
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

	public static class CloseStmtContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(vbaParser.CLOSE, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<FileNumberContext> fileNumber() {
			return getRuleContexts(FileNumberContext.class);
		}
		public FileNumberContext fileNumber(int i) {
			return getRuleContext(FileNumberContext.class,i);
		}
		public CloseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterCloseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitCloseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitCloseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseStmtContext closeStmt() throws RecognitionException {
		CloseStmtContext _localctx = new CloseStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_closeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(CLOSE);
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(600);
				match(WS);
				setState(601);
				fileNumber();
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(603);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(602);
							match(WS);
							}
						}

						setState(605);
						match(T__0);
						setState(607);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(606);
							match(WS);
							}
						}

						setState(609);
						fileNumber();
						}
						} 
					}
					setState(614);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
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

	public static class ConstStmtContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(vbaParser.CONST, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ConstSubStmtContext> constSubStmt() {
			return getRuleContexts(ConstSubStmtContext.class);
		}
		public ConstSubStmtContext constSubStmt(int i) {
			return getRuleContext(ConstSubStmtContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public ConstStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterConstStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitConstStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitConstStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstStmtContext constStmt() throws RecognitionException {
		ConstStmtContext _localctx = new ConstStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(617);
				visibility();
				setState(618);
				match(WS);
				}
			}

			setState(622);
			match(CONST);
			setState(623);
			match(WS);
			setState(624);
			constSubStmt();
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(625);
						match(WS);
						}
					}

					setState(628);
					match(T__0);
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(629);
						match(WS);
						}
					}

					setState(632);
					constSubStmt();
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class ConstSubStmtContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public ConstSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterConstSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitConstSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitConstSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSubStmtContext constSubStmt() throws RecognitionException {
		ConstSubStmtContext _localctx = new ConstSubStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			ambiguousIdentifier();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(639);
				typeHint();
				}
			}

			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(642);
				match(WS);
				setState(643);
				asTypeClause();
				}
				break;
			}
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(646);
				match(WS);
				}
			}

			setState(649);
			match(EQ);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(650);
				match(WS);
				}
			}

			setState(653);
			valueStmt(0);
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

	public static class DateStmtContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(vbaParser.DATE, 0); }
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public DateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterDateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitDateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitDateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateStmtContext dateStmt() throws RecognitionException {
		DateStmtContext _localctx = new DateStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(DATE);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(656);
				match(WS);
				}
			}

			setState(659);
			match(EQ);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(660);
				match(WS);
				}
			}

			setState(663);
			valueStmt(0);
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

	public static class DeclareStmtContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(vbaParser.DECLARE, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode LIB() { return getToken(vbaParser.LIB, 0); }
		public List<TerminalNode> STRINGLITERAL() { return getTokens(vbaParser.STRINGLITERAL); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(vbaParser.STRINGLITERAL, i);
		}
		public TerminalNode SUB() { return getToken(vbaParser.SUB, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode PTRSAFE() { return getToken(vbaParser.PTRSAFE, 0); }
		public List<TypeHintContext> typeHint() {
			return getRuleContexts(TypeHintContext.class);
		}
		public TypeHintContext typeHint(int i) {
			return getRuleContext(TypeHintContext.class,i);
		}
		public TerminalNode ALIAS() { return getToken(vbaParser.ALIAS, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(vbaParser.FUNCTION, 0); }
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterDeclareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitDeclareStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitDeclareStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(665);
				visibility();
				setState(666);
				match(WS);
				}
			}

			setState(670);
			match(DECLARE);
			setState(671);
			match(WS);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTRSAFE) {
				{
				setState(672);
				match(PTRSAFE);
				setState(673);
				match(WS);
				}
			}

			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				{
				setState(676);
				match(FUNCTION);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
					{
					setState(677);
					typeHint();
					}
				}

				}
				}
				break;
			case SUB:
				{
				setState(680);
				match(SUB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(683);
			match(WS);
			setState(684);
			ambiguousIdentifier();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(685);
				typeHint();
				}
			}

			setState(688);
			match(WS);
			setState(689);
			match(LIB);
			setState(690);
			match(WS);
			setState(691);
			match(STRINGLITERAL);
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(692);
				match(WS);
				setState(693);
				match(ALIAS);
				setState(694);
				match(WS);
				setState(695);
				match(STRINGLITERAL);
				}
				break;
			}
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(698);
					match(WS);
					}
				}

				setState(701);
				argList();
				}
				break;
			}
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(704);
				match(WS);
				setState(705);
				asTypeClause();
				}
				break;
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

	public static class DeftypeStmtContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<LetterrangeContext> letterrange() {
			return getRuleContexts(LetterrangeContext.class);
		}
		public LetterrangeContext letterrange(int i) {
			return getRuleContext(LetterrangeContext.class,i);
		}
		public TerminalNode DEFBOOL() { return getToken(vbaParser.DEFBOOL, 0); }
		public TerminalNode DEFBYTE() { return getToken(vbaParser.DEFBYTE, 0); }
		public TerminalNode DEFINT() { return getToken(vbaParser.DEFINT, 0); }
		public TerminalNode DEFLNG() { return getToken(vbaParser.DEFLNG, 0); }
		public TerminalNode DEFCUR() { return getToken(vbaParser.DEFCUR, 0); }
		public TerminalNode DEFSNG() { return getToken(vbaParser.DEFSNG, 0); }
		public TerminalNode DEFDBL() { return getToken(vbaParser.DEFDBL, 0); }
		public TerminalNode DEFDEC() { return getToken(vbaParser.DEFDEC, 0); }
		public TerminalNode DEFDATE() { return getToken(vbaParser.DEFDATE, 0); }
		public TerminalNode DEFSTR() { return getToken(vbaParser.DEFSTR, 0); }
		public TerminalNode DEFOBJ() { return getToken(vbaParser.DEFOBJ, 0); }
		public TerminalNode DEFVAR() { return getToken(vbaParser.DEFVAR, 0); }
		public DeftypeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deftypeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterDeftypeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitDeftypeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitDeftypeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeftypeStmtContext deftypeStmt() throws RecognitionException {
		DeftypeStmtContext _localctx = new DeftypeStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_deftypeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(709);
			match(WS);
			setState(710);
			letterrange();
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(711);
						match(WS);
						}
					}

					setState(714);
					match(T__0);
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(715);
						match(WS);
						}
					}

					setState(718);
					letterrange();
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class DeleteSettingStmtContext extends ParserRuleContext {
		public TerminalNode DELETESETTING() { return getToken(vbaParser.DELETESETTING, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public DeleteSettingStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSettingStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterDeleteSettingStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitDeleteSettingStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitDeleteSettingStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteSettingStmtContext deleteSettingStmt() throws RecognitionException {
		DeleteSettingStmtContext _localctx = new DeleteSettingStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_deleteSettingStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(DELETESETTING);
			setState(725);
			match(WS);
			setState(726);
			valueStmt(0);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(727);
				match(WS);
				}
			}

			setState(730);
			match(T__0);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(731);
				match(WS);
				}
			}

			setState(734);
			valueStmt(0);
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(735);
					match(WS);
					}
				}

				setState(738);
				match(T__0);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(739);
					match(WS);
					}
				}

				setState(742);
				valueStmt(0);
				}
				break;
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

	public static class DoLoopStmtContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(vbaParser.DO, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(vbaParser.LOOP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(vbaParser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(vbaParser.UNTIL, 0); }
		public DoLoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doLoopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterDoLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitDoLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitDoLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoLoopStmtContext doLoopStmt() throws RecognitionException {
		DoLoopStmtContext _localctx = new DoLoopStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_doLoopStmt);
		int _la;
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(DO);
				setState(746);
				endOfStatement();
				setState(748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(747);
					block();
					}
					break;
				}
				setState(750);
				match(LOOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				match(DO);
				setState(753);
				match(WS);
				setState(754);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(755);
				match(WS);
				setState(756);
				valueStmt(0);
				setState(757);
				endOfStatement();
				setState(759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(758);
					block();
					}
					break;
				}
				setState(761);
				match(LOOP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				match(DO);
				setState(764);
				endOfStatement();
				setState(765);
				block();
				setState(766);
				match(LOOP);
				setState(767);
				match(WS);
				setState(768);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(769);
				match(WS);
				setState(770);
				valueStmt(0);
				}
				break;
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

	public static class EndStmtContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(vbaParser.END, 0); }
		public EndStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterEndStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitEndStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitEndStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndStmtContext endStmt() throws RecognitionException {
		EndStmtContext _localctx = new EndStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_endStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(END);
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

	public static class EnumerationStmtContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(vbaParser.ENUM, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_ENUM() { return getToken(vbaParser.END_ENUM, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<EnumerationStmt_ConstantContext> enumerationStmt_Constant() {
			return getRuleContexts(EnumerationStmt_ConstantContext.class);
		}
		public EnumerationStmt_ConstantContext enumerationStmt_Constant(int i) {
			return getRuleContext(EnumerationStmt_ConstantContext.class,i);
		}
		public EnumerationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterEnumerationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitEnumerationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitEnumerationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationStmtContext enumerationStmt() throws RecognitionException {
		EnumerationStmtContext _localctx = new EnumerationStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumerationStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(776);
				visibility();
				setState(777);
				match(WS);
				}
			}

			setState(781);
			match(ENUM);
			setState(782);
			match(WS);
			setState(783);
			ambiguousIdentifier();
			setState(784);
			endOfStatement();
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(785);
				enumerationStmt_Constant();
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			match(END_ENUM);
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

	public static class EnumerationStmt_ConstantContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public EnumerationStmt_ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationStmt_Constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterEnumerationStmt_Constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitEnumerationStmt_Constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitEnumerationStmt_Constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationStmt_ConstantContext enumerationStmt_Constant() throws RecognitionException {
		EnumerationStmt_ConstantContext _localctx = new EnumerationStmt_ConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumerationStmt_Constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			ambiguousIdentifier();
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(794);
					match(WS);
					}
				}

				setState(797);
				match(EQ);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(798);
					match(WS);
					}
				}

				setState(801);
				valueStmt(0);
				}
				break;
			}
			setState(804);
			endOfStatement();
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

	public static class EraseStmtContext extends ParserRuleContext {
		public TerminalNode ERASE() { return getToken(vbaParser.ERASE, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public EraseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eraseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterEraseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitEraseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitEraseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EraseStmtContext eraseStmt() throws RecognitionException {
		EraseStmtContext _localctx = new EraseStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_eraseStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(ERASE);
			setState(807);
			match(WS);
			setState(808);
			valueStmt(0);
			setState(816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(809);
					match(T__0);
					setState(811);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(810);
						match(WS);
						}
					}

					setState(813);
					valueStmt(0);
					}
					} 
				}
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class ErrorStmtContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(vbaParser.ERROR, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public ErrorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterErrorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitErrorStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitErrorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorStmtContext errorStmt() throws RecognitionException {
		ErrorStmtContext _localctx = new ErrorStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_errorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(ERROR);
			setState(820);
			match(WS);
			setState(821);
			valueStmt(0);
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

	public static class EventStmtContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(vbaParser.EVENT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public EventStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterEventStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitEventStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitEventStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventStmtContext eventStmt() throws RecognitionException {
		EventStmtContext _localctx = new EventStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_eventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(823);
				visibility();
				setState(824);
				match(WS);
				}
			}

			setState(828);
			match(EVENT);
			setState(829);
			match(WS);
			setState(830);
			ambiguousIdentifier();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(831);
				match(WS);
				}
			}

			setState(834);
			argList();
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

	public static class ExitStmtContext extends ParserRuleContext {
		public TerminalNode EXIT_DO() { return getToken(vbaParser.EXIT_DO, 0); }
		public TerminalNode EXIT_FOR() { return getToken(vbaParser.EXIT_FOR, 0); }
		public TerminalNode EXIT_FUNCTION() { return getToken(vbaParser.EXIT_FUNCTION, 0); }
		public TerminalNode EXIT_PROPERTY() { return getToken(vbaParser.EXIT_PROPERTY, 0); }
		public TerminalNode EXIT_SUB() { return getToken(vbaParser.EXIT_SUB, 0); }
		public ExitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterExitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitExitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitExitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitStmtContext exitStmt() throws RecognitionException {
		ExitStmtContext _localctx = new ExitStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (EXIT_DO - 68)) | (1L << (EXIT_FOR - 68)) | (1L << (EXIT_FUNCTION - 68)) | (1L << (EXIT_PROPERTY - 68)) | (1L << (EXIT_SUB - 68)))) != 0)) ) {
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

	public static class FilecopyStmtContext extends ParserRuleContext {
		public TerminalNode FILECOPY() { return getToken(vbaParser.FILECOPY, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public FilecopyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filecopyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterFilecopyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitFilecopyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitFilecopyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilecopyStmtContext filecopyStmt() throws RecognitionException {
		FilecopyStmtContext _localctx = new FilecopyStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_filecopyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(FILECOPY);
			setState(839);
			match(WS);
			setState(840);
			valueStmt(0);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(841);
				match(WS);
				}
			}

			setState(844);
			match(T__0);
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(845);
				match(WS);
				}
			}

			setState(848);
			valueStmt(0);
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

	public static class ForEachStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(vbaParser.FOR, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode EACH() { return getToken(vbaParser.EACH, 0); }
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(vbaParser.IN, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(vbaParser.NEXT, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForEachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterForEachStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitForEachStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitForEachStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachStmtContext forEachStmt() throws RecognitionException {
		ForEachStmtContext _localctx = new ForEachStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forEachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(FOR);
			setState(851);
			match(WS);
			setState(852);
			match(EACH);
			setState(853);
			match(WS);
			setState(854);
			ambiguousIdentifier();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(855);
				typeHint();
				}
			}

			setState(858);
			match(WS);
			setState(859);
			match(IN);
			setState(860);
			match(WS);
			setState(861);
			valueStmt(0);
			setState(862);
			endOfStatement();
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(863);
				block();
				}
				break;
			}
			setState(866);
			match(NEXT);
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(867);
				match(WS);
				setState(868);
				ambiguousIdentifier();
				}
				break;
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

	public static class ForNextStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(vbaParser.FOR, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode TO() { return getToken(vbaParser.TO, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(vbaParser.NEXT, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public TerminalNode STEP() { return getToken(vbaParser.STEP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForNextStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forNextStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterForNextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitForNextStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitForNextStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForNextStmtContext forNextStmt() throws RecognitionException {
		ForNextStmtContext _localctx = new ForNextStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forNextStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(FOR);
			setState(872);
			match(WS);
			setState(873);
			ambiguousIdentifier();
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(874);
				typeHint();
				}
			}

			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(877);
				match(WS);
				setState(878);
				asTypeClause();
				}
				break;
			}
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(881);
				match(WS);
				}
			}

			setState(884);
			match(EQ);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(885);
				match(WS);
				}
			}

			setState(888);
			valueStmt(0);
			setState(889);
			match(WS);
			setState(890);
			match(TO);
			setState(891);
			match(WS);
			setState(892);
			valueStmt(0);
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(893);
				match(WS);
				setState(894);
				match(STEP);
				setState(895);
				match(WS);
				setState(896);
				valueStmt(0);
				}
				break;
			}
			setState(899);
			endOfStatement();
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(900);
				block();
				}
				break;
			}
			setState(903);
			match(NEXT);
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(904);
				match(WS);
				setState(905);
				ambiguousIdentifier();
				}
				break;
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

	public static class FunctionStmtContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(vbaParser.FUNCTION, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_FUNCTION() { return getToken(vbaParser.END_FUNCTION, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode STATIC() { return getToken(vbaParser.STATIC, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterFunctionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitFunctionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitFunctionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStmtContext functionStmt() throws RecognitionException {
		FunctionStmtContext _localctx = new FunctionStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(908);
				visibility();
				setState(909);
				match(WS);
				}
			}

			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(913);
				match(STATIC);
				setState(914);
				match(WS);
				}
			}

			setState(917);
			match(FUNCTION);
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(918);
				match(WS);
				}
			}

			setState(921);
			ambiguousIdentifier();
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(922);
				typeHint();
				}
				break;
			}
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(925);
					match(WS);
					}
				}

				setState(928);
				argList();
				}
				break;
			}
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(931);
					match(WS);
					}
				}

				setState(934);
				asTypeClause();
				}
				break;
			}
			setState(937);
			endOfStatement();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==IDENTIFIER) {
				{
				setState(938);
				block();
				}
			}

			setState(941);
			match(END_FUNCTION);
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

	public static class GetStmtContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(vbaParser.GET, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public GetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterGetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitGetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitGetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetStmtContext getStmt() throws RecognitionException {
		GetStmtContext _localctx = new GetStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_getStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(GET);
			setState(944);
			match(WS);
			setState(945);
			fileNumber();
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(946);
				match(WS);
				}
			}

			setState(949);
			match(T__0);
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(950);
				match(WS);
				}
				break;
			}
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (LPAREN - 193)) | (1L << (MINUS - 193)) | (1L << (PLUS - 193)) | (1L << (STRINGLITERAL - 193)) | (1L << (OCTLITERAL - 193)) | (1L << (HEXLITERAL - 193)) | (1L << (SHORTLITERAL - 193)) | (1L << (INTEGERLITERAL - 193)) | (1L << (DOUBLELITERAL - 193)) | (1L << (DATELITERAL - 193)) | (1L << (IDENTIFIER - 193)))) != 0)) {
				{
				setState(953);
				valueStmt(0);
				}
			}

			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(956);
				match(WS);
				}
			}

			setState(959);
			match(T__0);
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(960);
				match(WS);
				}
			}

			setState(963);
			valueStmt(0);
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

	public static class GoSubStmtContext extends ParserRuleContext {
		public TerminalNode GOSUB() { return getToken(vbaParser.GOSUB, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public GoSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterGoSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitGoSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitGoSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoSubStmtContext goSubStmt() throws RecognitionException {
		GoSubStmtContext _localctx = new GoSubStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_goSubStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(GOSUB);
			setState(966);
			match(WS);
			setState(967);
			valueStmt(0);
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

	public static class GoToStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(vbaParser.GOTO, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public GoToStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goToStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterGoToStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitGoToStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitGoToStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoToStmtContext goToStmt() throws RecognitionException {
		GoToStmtContext _localctx = new GoToStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_goToStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(GOTO);
			setState(970);
			match(WS);
			setState(971);
			valueStmt(0);
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

	public static class IfThenElseStmtContext extends ParserRuleContext {
		public IfThenElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStmt; }
	 
		public IfThenElseStmtContext() { }
		public void copyFrom(IfThenElseStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockIfThenElseContext extends IfThenElseStmtContext {
		public IfBlockStmtContext ifBlockStmt() {
			return getRuleContext(IfBlockStmtContext.class,0);
		}
		public TerminalNode END_IF() { return getToken(vbaParser.END_IF, 0); }
		public List<IfElseIfBlockStmtContext> ifElseIfBlockStmt() {
			return getRuleContexts(IfElseIfBlockStmtContext.class);
		}
		public IfElseIfBlockStmtContext ifElseIfBlockStmt(int i) {
			return getRuleContext(IfElseIfBlockStmtContext.class,i);
		}
		public IfElseBlockStmtContext ifElseBlockStmt() {
			return getRuleContext(IfElseBlockStmtContext.class,0);
		}
		public BlockIfThenElseContext(IfThenElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterBlockIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitBlockIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitBlockIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineIfThenElseContext extends IfThenElseStmtContext {
		public TerminalNode IF() { return getToken(vbaParser.IF, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(vbaParser.THEN, 0); }
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(vbaParser.ELSE, 0); }
		public InlineIfThenElseContext(IfThenElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterInlineIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitInlineIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitInlineIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStmtContext ifThenElseStmt() throws RecognitionException {
		IfThenElseStmtContext _localctx = new IfThenElseStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifThenElseStmt);
		int _la;
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				_localctx = new InlineIfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				match(IF);
				setState(974);
				match(WS);
				setState(975);
				ifConditionStmt();
				setState(976);
				match(WS);
				setState(977);
				match(THEN);
				setState(978);
				match(WS);
				setState(979);
				blockStmt();
				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(980);
					match(WS);
					setState(981);
					match(ELSE);
					setState(982);
					match(WS);
					setState(983);
					blockStmt();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new BlockIfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				ifBlockStmt();
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(987);
					ifElseIfBlockStmt();
					}
					}
					setState(992);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(993);
					ifElseBlockStmt();
					}
				}

				setState(996);
				match(END_IF);
				}
				break;
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

	public static class IfBlockStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(vbaParser.IF, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(vbaParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterIfBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitIfBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitIfBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockStmtContext ifBlockStmt() throws RecognitionException {
		IfBlockStmtContext _localctx = new IfBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ifBlockStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(IF);
			setState(1001);
			match(WS);
			setState(1002);
			ifConditionStmt();
			setState(1003);
			match(WS);
			setState(1004);
			match(THEN);
			setState(1005);
			endOfStatement();
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1006);
				block();
				}
				break;
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

	public static class IfConditionStmtContext extends ParserRuleContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public IfConditionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifConditionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterIfConditionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitIfConditionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitIfConditionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionStmtContext ifConditionStmt() throws RecognitionException {
		IfConditionStmtContext _localctx = new IfConditionStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ifConditionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			valueStmt(0);
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

	public static class IfElseIfBlockStmtContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(vbaParser.ELSEIF, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(vbaParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfElseIfBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseIfBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterIfElseIfBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitIfElseIfBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitIfElseIfBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseIfBlockStmtContext ifElseIfBlockStmt() throws RecognitionException {
		IfElseIfBlockStmtContext _localctx = new IfElseIfBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ifElseIfBlockStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(ELSEIF);
			setState(1012);
			match(WS);
			setState(1013);
			ifConditionStmt();
			setState(1014);
			match(WS);
			setState(1015);
			match(THEN);
			setState(1016);
			endOfStatement();
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1017);
				block();
				}
				break;
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

	public static class IfElseBlockStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(vbaParser.ELSE, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfElseBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterIfElseBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitIfElseBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitIfElseBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseBlockStmtContext ifElseBlockStmt() throws RecognitionException {
		IfElseBlockStmtContext _localctx = new IfElseBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ifElseBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(ELSE);
			setState(1021);
			endOfStatement();
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1022);
				block();
				}
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

	public static class ImplementsStmtContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(vbaParser.IMPLEMENTS, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public ImplementsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterImplementsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitImplementsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitImplementsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsStmtContext implementsStmt() throws RecognitionException {
		ImplementsStmtContext _localctx = new ImplementsStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_implementsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(IMPLEMENTS);
			setState(1026);
			match(WS);
			setState(1027);
			ambiguousIdentifier();
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

	public static class InputStmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(vbaParser.INPUT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_inputStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(INPUT);
			setState(1030);
			match(WS);
			setState(1031);
			fileNumber();
			setState(1040); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1033);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1032);
						match(WS);
						}
					}

					setState(1035);
					match(T__0);
					setState(1037);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1036);
						match(WS);
						}
					}

					setState(1039);
					valueStmt(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1042); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class KillStmtContext extends ParserRuleContext {
		public TerminalNode KILL() { return getToken(vbaParser.KILL, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public KillStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterKillStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitKillStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitKillStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KillStmtContext killStmt() throws RecognitionException {
		KillStmtContext _localctx = new KillStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_killStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(KILL);
			setState(1045);
			match(WS);
			setState(1046);
			valueStmt(0);
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

	public static class LetStmtContext extends ParserRuleContext {
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public TerminalNode PLUS_EQ() { return getToken(vbaParser.PLUS_EQ, 0); }
		public TerminalNode MINUS_EQ() { return getToken(vbaParser.MINUS_EQ, 0); }
		public TerminalNode LET() { return getToken(vbaParser.LET, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public LetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitLetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitLetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStmtContext letStmt() throws RecognitionException {
		LetStmtContext _localctx = new LetStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_letStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1048);
				match(LET);
				setState(1049);
				match(WS);
				}
				break;
			}
			setState(1052);
			implicitCallStmt_InStmt();
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1053);
				match(WS);
				}
			}

			setState(1056);
			_la = _input.LA(1);
			if ( !(((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (EQ - 189)) | (1L << (MINUS_EQ - 189)) | (1L << (PLUS_EQ - 189)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1057);
				match(WS);
				}
			}

			setState(1060);
			valueStmt(0);
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

	public static class LineInputStmtContext extends ParserRuleContext {
		public TerminalNode LINE_INPUT() { return getToken(vbaParser.LINE_INPUT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public LineInputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineInputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterLineInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitLineInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitLineInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineInputStmtContext lineInputStmt() throws RecognitionException {
		LineInputStmtContext _localctx = new LineInputStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lineInputStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(LINE_INPUT);
			setState(1063);
			match(WS);
			setState(1064);
			fileNumber();
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1065);
				match(WS);
				}
			}

			setState(1068);
			match(T__0);
			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1069);
				match(WS);
				}
			}

			setState(1072);
			valueStmt(0);
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

	public static class LoadStmtContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(vbaParser.LOAD, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public LoadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterLoadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitLoadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitLoadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadStmtContext loadStmt() throws RecognitionException {
		LoadStmtContext _localctx = new LoadStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_loadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(LOAD);
			setState(1075);
			match(WS);
			setState(1076);
			valueStmt(0);
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

	public static class LockStmtContext extends ParserRuleContext {
		public TerminalNode LOCK() { return getToken(vbaParser.LOCK, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode TO() { return getToken(vbaParser.TO, 0); }
		public LockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterLockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitLockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitLockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockStmtContext lockStmt() throws RecognitionException {
		LockStmtContext _localctx = new LockStmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_lockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(LOCK);
			setState(1079);
			match(WS);
			setState(1080);
			valueStmt(0);
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1081);
					match(WS);
					}
				}

				setState(1084);
				match(T__0);
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1085);
					match(WS);
					}
				}

				setState(1088);
				valueStmt(0);
				setState(1093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1089);
					match(WS);
					setState(1090);
					match(TO);
					setState(1091);
					match(WS);
					setState(1092);
					valueStmt(0);
					}
					break;
				}
				}
				break;
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

	public static class LsetStmtContext extends ParserRuleContext {
		public TerminalNode LSET() { return getToken(vbaParser.LSET, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public LsetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lsetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterLsetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitLsetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitLsetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LsetStmtContext lsetStmt() throws RecognitionException {
		LsetStmtContext _localctx = new LsetStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_lsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(LSET);
			setState(1098);
			match(WS);
			setState(1099);
			implicitCallStmt_InStmt();
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1100);
				match(WS);
				}
			}

			setState(1103);
			match(EQ);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1104);
				match(WS);
				}
			}

			setState(1107);
			valueStmt(0);
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

	public static class MacroConstStmtContext extends ParserRuleContext {
		public TerminalNode MACRO_CONST() { return getToken(vbaParser.MACRO_CONST, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public MacroConstStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroConstStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterMacroConstStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitMacroConstStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitMacroConstStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroConstStmtContext macroConstStmt() throws RecognitionException {
		MacroConstStmtContext _localctx = new MacroConstStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_macroConstStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(MACRO_CONST);
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1110);
				match(WS);
				}
			}

			setState(1113);
			ambiguousIdentifier();
			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1114);
				match(WS);
				}
			}

			setState(1117);
			match(EQ);
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1118);
				match(WS);
				}
			}

			setState(1121);
			valueStmt(0);
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

	public static class MacroIfThenElseStmtContext extends ParserRuleContext {
		public MacroIfBlockStmtContext macroIfBlockStmt() {
			return getRuleContext(MacroIfBlockStmtContext.class,0);
		}
		public TerminalNode MACRO_END_IF() { return getToken(vbaParser.MACRO_END_IF, 0); }
		public List<MacroElseIfBlockStmtContext> macroElseIfBlockStmt() {
			return getRuleContexts(MacroElseIfBlockStmtContext.class);
		}
		public MacroElseIfBlockStmtContext macroElseIfBlockStmt(int i) {
			return getRuleContext(MacroElseIfBlockStmtContext.class,i);
		}
		public MacroElseBlockStmtContext macroElseBlockStmt() {
			return getRuleContext(MacroElseBlockStmtContext.class,0);
		}
		public MacroIfThenElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroIfThenElseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterMacroIfThenElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitMacroIfThenElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitMacroIfThenElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroIfThenElseStmtContext macroIfThenElseStmt() throws RecognitionException {
		MacroIfThenElseStmtContext _localctx = new MacroIfThenElseStmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_macroIfThenElseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			macroIfBlockStmt();
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACRO_ELSEIF) {
				{
				{
				setState(1124);
				macroElseIfBlockStmt();
				}
				}
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MACRO_ELSE) {
				{
				setState(1130);
				macroElseBlockStmt();
				}
			}

			setState(1133);
			match(MACRO_END_IF);
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

	public static class MacroIfBlockStmtContext extends ParserRuleContext {
		public TerminalNode MACRO_IF() { return getToken(vbaParser.MACRO_IF, 0); }
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode THEN() { return getToken(vbaParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public List<ModuleDeclarationsContext> moduleDeclarations() {
			return getRuleContexts(ModuleDeclarationsContext.class);
		}
		public ModuleDeclarationsContext moduleDeclarations(int i) {
			return getRuleContext(ModuleDeclarationsContext.class,i);
		}
		public List<ModuleBodyContext> moduleBody() {
			return getRuleContexts(ModuleBodyContext.class);
		}
		public ModuleBodyContext moduleBody(int i) {
			return getRuleContext(ModuleBodyContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public MacroIfBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroIfBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterMacroIfBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitMacroIfBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitMacroIfBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroIfBlockStmtContext macroIfBlockStmt() throws RecognitionException {
		MacroIfBlockStmtContext _localctx = new MacroIfBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_macroIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(MACRO_IF);
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1136);
				match(WS);
				}
			}

			setState(1139);
			ifConditionStmt();
			setState(1140);
			match(WS);
			setState(1141);
			match(THEN);
			setState(1142);
			endOfStatement();
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OPTION_BASE - 64)) | (1L << (OPTION_EXPLICIT - 64)) | (1L << (OPTION_COMPARE - 64)) | (1L << (OPTION_PRIVATE_MODULE - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==COMMENT || _la==IDENTIFIER) {
				{
				setState(1146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1143);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1144);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1145);
					block();
					}
					break;
				}
				}
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MacroElseIfBlockStmtContext extends ParserRuleContext {
		public TerminalNode MACRO_ELSEIF() { return getToken(vbaParser.MACRO_ELSEIF, 0); }
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode THEN() { return getToken(vbaParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public List<ModuleDeclarationsContext> moduleDeclarations() {
			return getRuleContexts(ModuleDeclarationsContext.class);
		}
		public ModuleDeclarationsContext moduleDeclarations(int i) {
			return getRuleContext(ModuleDeclarationsContext.class,i);
		}
		public List<ModuleBodyContext> moduleBody() {
			return getRuleContexts(ModuleBodyContext.class);
		}
		public ModuleBodyContext moduleBody(int i) {
			return getRuleContext(ModuleBodyContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public MacroElseIfBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroElseIfBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterMacroElseIfBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitMacroElseIfBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitMacroElseIfBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroElseIfBlockStmtContext macroElseIfBlockStmt() throws RecognitionException {
		MacroElseIfBlockStmtContext _localctx = new MacroElseIfBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_macroElseIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(MACRO_ELSEIF);
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1152);
				match(WS);
				}
			}

			setState(1155);
			ifConditionStmt();
			setState(1156);
			match(WS);
			setState(1157);
			match(THEN);
			setState(1158);
			endOfStatement();
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OPTION_BASE - 64)) | (1L << (OPTION_EXPLICIT - 64)) | (1L << (OPTION_COMPARE - 64)) | (1L << (OPTION_PRIVATE_MODULE - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==COMMENT || _la==IDENTIFIER) {
				{
				setState(1162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1159);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1160);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1161);
					block();
					}
					break;
				}
				}
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MacroElseBlockStmtContext extends ParserRuleContext {
		public TerminalNode MACRO_ELSE() { return getToken(vbaParser.MACRO_ELSE, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public List<ModuleDeclarationsContext> moduleDeclarations() {
			return getRuleContexts(ModuleDeclarationsContext.class);
		}
		public ModuleDeclarationsContext moduleDeclarations(int i) {
			return getRuleContext(ModuleDeclarationsContext.class,i);
		}
		public List<ModuleBodyContext> moduleBody() {
			return getRuleContexts(ModuleBodyContext.class);
		}
		public ModuleBodyContext moduleBody(int i) {
			return getRuleContext(ModuleBodyContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public MacroElseBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroElseBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterMacroElseBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitMacroElseBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitMacroElseBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroElseBlockStmtContext macroElseBlockStmt() throws RecognitionException {
		MacroElseBlockStmtContext _localctx = new MacroElseBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_macroElseBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			match(MACRO_ELSE);
			setState(1168);
			endOfStatement();
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OPTION_BASE - 64)) | (1L << (OPTION_EXPLICIT - 64)) | (1L << (OPTION_COMPARE - 64)) | (1L << (OPTION_PRIVATE_MODULE - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==COMMENT || _la==IDENTIFIER) {
				{
				setState(1172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1169);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1170);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1171);
					block();
					}
					break;
				}
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MidStmtContext extends ParserRuleContext {
		public TerminalNode MID() { return getToken(vbaParser.MID, 0); }
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public MidStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterMidStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitMidStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitMidStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidStmtContext midStmt() throws RecognitionException {
		MidStmtContext _localctx = new MidStmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_midStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(MID);
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1178);
				match(WS);
				}
			}

			setState(1181);
			match(LPAREN);
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1182);
				match(WS);
				}
				break;
			}
			setState(1185);
			argsCall();
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1186);
				match(WS);
				}
			}

			setState(1189);
			match(RPAREN);
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

	public static class MkdirStmtContext extends ParserRuleContext {
		public TerminalNode MKDIR() { return getToken(vbaParser.MKDIR, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public MkdirStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mkdirStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterMkdirStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitMkdirStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitMkdirStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MkdirStmtContext mkdirStmt() throws RecognitionException {
		MkdirStmtContext _localctx = new MkdirStmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_mkdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(MKDIR);
			setState(1192);
			match(WS);
			setState(1193);
			valueStmt(0);
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

	public static class NameStmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(vbaParser.NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode AS() { return getToken(vbaParser.AS, 0); }
		public NameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterNameStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitNameStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitNameStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameStmtContext nameStmt() throws RecognitionException {
		NameStmtContext _localctx = new NameStmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_nameStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(NAME);
			setState(1196);
			match(WS);
			setState(1197);
			valueStmt(0);
			setState(1198);
			match(WS);
			setState(1199);
			match(AS);
			setState(1200);
			match(WS);
			setState(1201);
			valueStmt(0);
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

	public static class OnErrorStmtContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode ON_ERROR() { return getToken(vbaParser.ON_ERROR, 0); }
		public TerminalNode ON_LOCAL_ERROR() { return getToken(vbaParser.ON_LOCAL_ERROR, 0); }
		public TerminalNode GOTO() { return getToken(vbaParser.GOTO, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode RESUME() { return getToken(vbaParser.RESUME, 0); }
		public TerminalNode NEXT() { return getToken(vbaParser.NEXT, 0); }
		public OnErrorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onErrorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOnErrorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOnErrorStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOnErrorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnErrorStmtContext onErrorStmt() throws RecognitionException {
		OnErrorStmtContext _localctx = new OnErrorStmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_onErrorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_la = _input.LA(1);
			if ( !(_la==ON_ERROR || _la==ON_LOCAL_ERROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1204);
			match(WS);
			setState(1211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				{
				setState(1205);
				match(GOTO);
				setState(1206);
				match(WS);
				setState(1207);
				valueStmt(0);
				}
				break;
			case RESUME:
				{
				setState(1208);
				match(RESUME);
				setState(1209);
				match(WS);
				setState(1210);
				match(NEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OnGoToStmtContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(vbaParser.ON, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode GOTO() { return getToken(vbaParser.GOTO, 0); }
		public OnGoToStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onGoToStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOnGoToStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOnGoToStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOnGoToStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnGoToStmtContext onGoToStmt() throws RecognitionException {
		OnGoToStmtContext _localctx = new OnGoToStmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_onGoToStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(ON);
			setState(1214);
			match(WS);
			setState(1215);
			valueStmt(0);
			setState(1216);
			match(WS);
			setState(1217);
			match(GOTO);
			setState(1218);
			match(WS);
			setState(1219);
			valueStmt(0);
			setState(1230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1220);
						match(WS);
						}
					}

					setState(1223);
					match(T__0);
					setState(1225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1224);
						match(WS);
						}
					}

					setState(1227);
					valueStmt(0);
					}
					} 
				}
				setState(1232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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

	public static class OnGoSubStmtContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(vbaParser.ON, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode GOSUB() { return getToken(vbaParser.GOSUB, 0); }
		public OnGoSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onGoSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOnGoSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOnGoSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOnGoSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnGoSubStmtContext onGoSubStmt() throws RecognitionException {
		OnGoSubStmtContext _localctx = new OnGoSubStmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_onGoSubStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(ON);
			setState(1234);
			match(WS);
			setState(1235);
			valueStmt(0);
			setState(1236);
			match(WS);
			setState(1237);
			match(GOSUB);
			setState(1238);
			match(WS);
			setState(1239);
			valueStmt(0);
			setState(1250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1240);
						match(WS);
						}
					}

					setState(1243);
					match(T__0);
					setState(1245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1244);
						match(WS);
						}
					}

					setState(1247);
					valueStmt(0);
					}
					} 
				}
				setState(1252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
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

	public static class OpenStmtContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(vbaParser.OPEN, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode FOR() { return getToken(vbaParser.FOR, 0); }
		public TerminalNode AS() { return getToken(vbaParser.AS, 0); }
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public TerminalNode APPEND() { return getToken(vbaParser.APPEND, 0); }
		public TerminalNode BINARY() { return getToken(vbaParser.BINARY, 0); }
		public TerminalNode INPUT() { return getToken(vbaParser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(vbaParser.OUTPUT, 0); }
		public TerminalNode RANDOM() { return getToken(vbaParser.RANDOM, 0); }
		public TerminalNode ACCESS() { return getToken(vbaParser.ACCESS, 0); }
		public TerminalNode LEN() { return getToken(vbaParser.LEN, 0); }
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public TerminalNode READ() { return getToken(vbaParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(vbaParser.WRITE, 0); }
		public TerminalNode READ_WRITE() { return getToken(vbaParser.READ_WRITE, 0); }
		public TerminalNode SHARED() { return getToken(vbaParser.SHARED, 0); }
		public TerminalNode LOCK_READ() { return getToken(vbaParser.LOCK_READ, 0); }
		public TerminalNode LOCK_WRITE() { return getToken(vbaParser.LOCK_WRITE, 0); }
		public TerminalNode LOCK_READ_WRITE() { return getToken(vbaParser.LOCK_READ_WRITE, 0); }
		public OpenStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOpenStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOpenStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOpenStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenStmtContext openStmt() throws RecognitionException {
		OpenStmtContext _localctx = new OpenStmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_openStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			match(OPEN);
			setState(1254);
			match(WS);
			setState(1255);
			valueStmt(0);
			setState(1256);
			match(WS);
			setState(1257);
			match(FOR);
			setState(1258);
			match(WS);
			setState(1259);
			_la = _input.LA(1);
			if ( !(_la==APPEND || _la==BINARY || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (INPUT - 86)) | (1L << (OUTPUT - 86)) | (1L << (RANDOM - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1260);
				match(WS);
				setState(1261);
				match(ACCESS);
				setState(1262);
				match(WS);
				setState(1263);
				_la = _input.LA(1);
				if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (READ - 142)) | (1L << (READ_WRITE - 142)) | (1L << (WRITE - 142)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1266);
				match(WS);
				setState(1267);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (LOCK_READ - 99)) | (1L << (LOCK_WRITE - 99)) | (1L << (LOCK_READ_WRITE - 99)) | (1L << (SHARED - 99)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1270);
			match(WS);
			setState(1271);
			match(AS);
			setState(1272);
			match(WS);
			setState(1273);
			fileNumber();
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1274);
				match(WS);
				setState(1275);
				match(LEN);
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1276);
					match(WS);
					}
				}

				setState(1279);
				match(EQ);
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1280);
					match(WS);
					}
				}

				setState(1283);
				valueStmt(0);
				}
				break;
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

	public static class OutputListContext extends ParserRuleContext {
		public List<OutputList_ExpressionContext> outputList_Expression() {
			return getRuleContexts(OutputList_ExpressionContext.class);
		}
		public OutputList_ExpressionContext outputList_Expression(int i) {
			return getRuleContext(OutputList_ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public OutputListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOutputList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOutputList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOutputList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputListContext outputList() throws RecognitionException {
		OutputListContext _localctx = new OutputListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_outputList);
		int _la;
		try {
			int _alt;
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				outputList_Expression();
				setState(1299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1288);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1287);
							match(WS);
							}
						}

						setState(1290);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1292);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
						case 1:
							{
							setState(1291);
							match(WS);
							}
							break;
						}
						setState(1295);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							setState(1294);
							outputList_Expression();
							}
							break;
						}
						}
						} 
					}
					setState(1301);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (LPAREN - 193)) | (1L << (MINUS - 193)) | (1L << (PLUS - 193)) | (1L << (STRINGLITERAL - 193)) | (1L << (OCTLITERAL - 193)) | (1L << (HEXLITERAL - 193)) | (1L << (SHORTLITERAL - 193)) | (1L << (INTEGERLITERAL - 193)) | (1L << (DOUBLELITERAL - 193)) | (1L << (DATELITERAL - 193)) | (1L << (IDENTIFIER - 193)))) != 0)) {
					{
					setState(1302);
					outputList_Expression();
					}
				}

				setState(1315); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1306);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1305);
							match(WS);
							}
						}

						setState(1308);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1310);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
						case 1:
							{
							setState(1309);
							match(WS);
							}
							break;
						}
						setState(1313);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
						case 1:
							{
							setState(1312);
							outputList_Expression();
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1317); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class OutputList_ExpressionContext extends ParserRuleContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode SPC() { return getToken(vbaParser.SPC, 0); }
		public TerminalNode TAB() { return getToken(vbaParser.TAB, 0); }
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public OutputList_ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputList_Expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterOutputList_Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitOutputList_Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitOutputList_Expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputList_ExpressionContext outputList_Expression() throws RecognitionException {
		OutputList_ExpressionContext _localctx = new OutputList_ExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_outputList_Expression);
		int _la;
		try {
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				valueStmt(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322);
				_la = _input.LA(1);
				if ( !(_la==SPC || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1323);
						match(WS);
						}
					}

					setState(1326);
					match(LPAREN);
					setState(1328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						setState(1327);
						match(WS);
						}
						break;
					}
					setState(1330);
					argsCall();
					setState(1332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1331);
						match(WS);
						}
					}

					setState(1334);
					match(RPAREN);
					}
					break;
				}
				}
				break;
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

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(vbaParser.PRINT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public OutputListContext outputList() {
			return getRuleContext(OutputListContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			match(PRINT);
			setState(1341);
			match(WS);
			setState(1342);
			fileNumber();
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1343);
				match(WS);
				}
			}

			setState(1346);
			match(T__0);
			setState(1351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1347);
					match(WS);
					}
					break;
				}
				setState(1350);
				outputList();
				}
				break;
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

	public static class PropertyGetStmtContext extends ParserRuleContext {
		public TerminalNode PROPERTY_GET() { return getToken(vbaParser.PROPERTY_GET, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_PROPERTY() { return getToken(vbaParser.END_PROPERTY, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(vbaParser.STATIC, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PropertyGetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyGetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterPropertyGetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitPropertyGetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitPropertyGetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyGetStmtContext propertyGetStmt() throws RecognitionException {
		PropertyGetStmtContext _localctx = new PropertyGetStmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_propertyGetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(1353);
				visibility();
				setState(1354);
				match(WS);
				}
			}

			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1358);
				match(STATIC);
				setState(1359);
				match(WS);
				}
			}

			setState(1362);
			match(PROPERTY_GET);
			setState(1363);
			match(WS);
			setState(1364);
			ambiguousIdentifier();
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1365);
				typeHint();
				}
				break;
			}
			setState(1372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1368);
					match(WS);
					}
				}

				setState(1371);
				argList();
				}
				break;
			}
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1374);
				match(WS);
				setState(1375);
				asTypeClause();
				}
				break;
			}
			setState(1378);
			endOfStatement();
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1379);
				block();
				}
			}

			setState(1382);
			match(END_PROPERTY);
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

	public static class PropertySetStmtContext extends ParserRuleContext {
		public TerminalNode PROPERTY_SET() { return getToken(vbaParser.PROPERTY_SET, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_PROPERTY() { return getToken(vbaParser.END_PROPERTY, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(vbaParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PropertySetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterPropertySetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitPropertySetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitPropertySetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySetStmtContext propertySetStmt() throws RecognitionException {
		PropertySetStmtContext _localctx = new PropertySetStmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_propertySetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(1384);
				visibility();
				setState(1385);
				match(WS);
				}
			}

			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1389);
				match(STATIC);
				setState(1390);
				match(WS);
				}
			}

			setState(1393);
			match(PROPERTY_SET);
			setState(1394);
			match(WS);
			setState(1395);
			ambiguousIdentifier();
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1396);
					match(WS);
					}
				}

				setState(1399);
				argList();
				}
				break;
			}
			setState(1402);
			endOfStatement();
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1403);
				block();
				}
			}

			setState(1406);
			match(END_PROPERTY);
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

	public static class PropertyLetStmtContext extends ParserRuleContext {
		public TerminalNode PROPERTY_LET() { return getToken(vbaParser.PROPERTY_LET, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_PROPERTY() { return getToken(vbaParser.END_PROPERTY, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(vbaParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PropertyLetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyLetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterPropertyLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitPropertyLetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitPropertyLetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyLetStmtContext propertyLetStmt() throws RecognitionException {
		PropertyLetStmtContext _localctx = new PropertyLetStmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_propertyLetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(1408);
				visibility();
				setState(1409);
				match(WS);
				}
			}

			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1413);
				match(STATIC);
				setState(1414);
				match(WS);
				}
			}

			setState(1417);
			match(PROPERTY_LET);
			setState(1418);
			match(WS);
			setState(1419);
			ambiguousIdentifier();
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1420);
					match(WS);
					}
				}

				setState(1423);
				argList();
				}
				break;
			}
			setState(1426);
			endOfStatement();
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1427);
				block();
				}
			}

			setState(1430);
			match(END_PROPERTY);
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

	public static class PutStmtContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(vbaParser.PUT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public PutStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterPutStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitPutStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitPutStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutStmtContext putStmt() throws RecognitionException {
		PutStmtContext _localctx = new PutStmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_putStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(PUT);
			setState(1433);
			match(WS);
			setState(1434);
			fileNumber();
			setState(1436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1435);
				match(WS);
				}
			}

			setState(1438);
			match(T__0);
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1439);
				match(WS);
				}
				break;
			}
			setState(1443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (LPAREN - 193)) | (1L << (MINUS - 193)) | (1L << (PLUS - 193)) | (1L << (STRINGLITERAL - 193)) | (1L << (OCTLITERAL - 193)) | (1L << (HEXLITERAL - 193)) | (1L << (SHORTLITERAL - 193)) | (1L << (INTEGERLITERAL - 193)) | (1L << (DOUBLELITERAL - 193)) | (1L << (DATELITERAL - 193)) | (1L << (IDENTIFIER - 193)))) != 0)) {
				{
				setState(1442);
				valueStmt(0);
				}
			}

			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1445);
				match(WS);
				}
			}

			setState(1448);
			match(T__0);
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1449);
				match(WS);
				}
			}

			setState(1452);
			valueStmt(0);
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

	public static class RaiseEventStmtContext extends ParserRuleContext {
		public TerminalNode RAISEEVENT() { return getToken(vbaParser.RAISEEVENT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public RaiseEventStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseEventStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterRaiseEventStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitRaiseEventStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitRaiseEventStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseEventStmtContext raiseEventStmt() throws RecognitionException {
		RaiseEventStmtContext _localctx = new RaiseEventStmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_raiseEventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(RAISEEVENT);
			setState(1455);
			match(WS);
			setState(1456);
			ambiguousIdentifier();
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1457);
					match(WS);
					}
				}

				setState(1460);
				match(LPAREN);
				setState(1462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1461);
					match(WS);
					}
					break;
				}
				setState(1468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1464);
					argsCall();
					setState(1466);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1465);
						match(WS);
						}
					}

					}
					break;
				}
				setState(1470);
				match(RPAREN);
				}
				break;
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

	public static class RandomizeStmtContext extends ParserRuleContext {
		public TerminalNode RANDOMIZE() { return getToken(vbaParser.RANDOMIZE, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public RandomizeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomizeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterRandomizeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitRandomizeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitRandomizeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandomizeStmtContext randomizeStmt() throws RecognitionException {
		RandomizeStmtContext _localctx = new RandomizeStmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_randomizeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			match(RANDOMIZE);
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1474);
				match(WS);
				setState(1475);
				valueStmt(0);
				}
				break;
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

	public static class RedimStmtContext extends ParserRuleContext {
		public TerminalNode REDIM() { return getToken(vbaParser.REDIM, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<RedimSubStmtContext> redimSubStmt() {
			return getRuleContexts(RedimSubStmtContext.class);
		}
		public RedimSubStmtContext redimSubStmt(int i) {
			return getRuleContext(RedimSubStmtContext.class,i);
		}
		public TerminalNode PRESERVE() { return getToken(vbaParser.PRESERVE, 0); }
		public RedimStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redimStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterRedimStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitRedimStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitRedimStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedimStmtContext redimStmt() throws RecognitionException {
		RedimStmtContext _localctx = new RedimStmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_redimStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(REDIM);
			setState(1479);
			match(WS);
			setState(1482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1480);
				match(PRESERVE);
				setState(1481);
				match(WS);
				}
				break;
			}
			setState(1484);
			redimSubStmt();
			setState(1495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1485);
						match(WS);
						}
					}

					setState(1488);
					match(T__0);
					setState(1490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1489);
						match(WS);
						}
					}

					setState(1492);
					redimSubStmt();
					}
					} 
				}
				setState(1497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
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

	public static class RedimSubStmtContext extends ParserRuleContext {
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public RedimSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redimSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterRedimSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitRedimSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitRedimSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedimSubStmtContext redimSubStmt() throws RecognitionException {
		RedimSubStmtContext _localctx = new RedimSubStmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_redimSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			implicitCallStmt_InStmt();
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1499);
				match(WS);
				}
			}

			setState(1502);
			match(LPAREN);
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1503);
				match(WS);
				}
			}

			setState(1506);
			subscripts();
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1507);
				match(WS);
				}
			}

			setState(1510);
			match(RPAREN);
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1511);
				match(WS);
				setState(1512);
				asTypeClause();
				}
				break;
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

	public static class ResetStmtContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(vbaParser.RESET, 0); }
		public ResetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterResetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitResetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitResetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResetStmtContext resetStmt() throws RecognitionException {
		ResetStmtContext _localctx = new ResetStmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_resetStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			match(RESET);
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

	public static class ResumeStmtContext extends ParserRuleContext {
		public TerminalNode RESUME() { return getToken(vbaParser.RESUME, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public TerminalNode NEXT() { return getToken(vbaParser.NEXT, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public ResumeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resumeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterResumeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitResumeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitResumeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResumeStmtContext resumeStmt() throws RecognitionException {
		ResumeStmtContext _localctx = new ResumeStmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_resumeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			match(RESUME);
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1518);
				match(WS);
				setState(1521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1519);
					match(NEXT);
					}
					break;
				case 2:
					{
					setState(1520);
					ambiguousIdentifier();
					}
					break;
				}
				}
				break;
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(vbaParser.RETURN, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(RETURN);
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

	public static class RmdirStmtContext extends ParserRuleContext {
		public TerminalNode RMDIR() { return getToken(vbaParser.RMDIR, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public RmdirStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rmdirStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterRmdirStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitRmdirStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitRmdirStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RmdirStmtContext rmdirStmt() throws RecognitionException {
		RmdirStmtContext _localctx = new RmdirStmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_rmdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(RMDIR);
			setState(1528);
			match(WS);
			setState(1529);
			valueStmt(0);
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

	public static class RsetStmtContext extends ParserRuleContext {
		public TerminalNode RSET() { return getToken(vbaParser.RSET, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public RsetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterRsetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitRsetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitRsetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RsetStmtContext rsetStmt() throws RecognitionException {
		RsetStmtContext _localctx = new RsetStmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			match(RSET);
			setState(1532);
			match(WS);
			setState(1533);
			implicitCallStmt_InStmt();
			setState(1535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1534);
				match(WS);
				}
			}

			setState(1537);
			match(EQ);
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1538);
				match(WS);
				}
			}

			setState(1541);
			valueStmt(0);
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

	public static class SavepictureStmtContext extends ParserRuleContext {
		public TerminalNode SAVEPICTURE() { return getToken(vbaParser.SAVEPICTURE, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public SavepictureStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepictureStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSavepictureStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSavepictureStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSavepictureStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavepictureStmtContext savepictureStmt() throws RecognitionException {
		SavepictureStmtContext _localctx = new SavepictureStmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_savepictureStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(SAVEPICTURE);
			setState(1544);
			match(WS);
			setState(1545);
			valueStmt(0);
			setState(1547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1546);
				match(WS);
				}
			}

			setState(1549);
			match(T__0);
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1550);
				match(WS);
				}
			}

			setState(1553);
			valueStmt(0);
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

	public static class SaveSettingStmtContext extends ParserRuleContext {
		public TerminalNode SAVESETTING() { return getToken(vbaParser.SAVESETTING, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public SaveSettingStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveSettingStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSaveSettingStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSaveSettingStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSaveSettingStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaveSettingStmtContext saveSettingStmt() throws RecognitionException {
		SaveSettingStmtContext _localctx = new SaveSettingStmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_saveSettingStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(SAVESETTING);
			setState(1556);
			match(WS);
			setState(1557);
			valueStmt(0);
			setState(1559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1558);
				match(WS);
				}
			}

			setState(1561);
			match(T__0);
			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1562);
				match(WS);
				}
			}

			setState(1565);
			valueStmt(0);
			setState(1567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1566);
				match(WS);
				}
			}

			setState(1569);
			match(T__0);
			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1570);
				match(WS);
				}
			}

			setState(1573);
			valueStmt(0);
			setState(1575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1574);
				match(WS);
				}
			}

			setState(1577);
			match(T__0);
			setState(1579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1578);
				match(WS);
				}
			}

			setState(1581);
			valueStmt(0);
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

	public static class SeekStmtContext extends ParserRuleContext {
		public TerminalNode SEEK() { return getToken(vbaParser.SEEK, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public SeekStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seekStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSeekStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSeekStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSeekStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeekStmtContext seekStmt() throws RecognitionException {
		SeekStmtContext _localctx = new SeekStmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_seekStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(SEEK);
			setState(1584);
			match(WS);
			setState(1585);
			fileNumber();
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1586);
				match(WS);
				}
			}

			setState(1589);
			match(T__0);
			setState(1591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1590);
				match(WS);
				}
			}

			setState(1593);
			valueStmt(0);
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

	public static class SelectCaseStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(vbaParser.SELECT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode CASE() { return getToken(vbaParser.CASE, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_SELECT() { return getToken(vbaParser.END_SELECT, 0); }
		public List<SC_CaseContext> sC_Case() {
			return getRuleContexts(SC_CaseContext.class);
		}
		public SC_CaseContext sC_Case(int i) {
			return getRuleContext(SC_CaseContext.class,i);
		}
		public SelectCaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCaseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSelectCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSelectCaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSelectCaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectCaseStmtContext selectCaseStmt() throws RecognitionException {
		SelectCaseStmtContext _localctx = new SelectCaseStmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_selectCaseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			match(SELECT);
			setState(1596);
			match(WS);
			setState(1597);
			match(CASE);
			setState(1598);
			match(WS);
			setState(1599);
			valueStmt(0);
			setState(1600);
			endOfStatement();
			setState(1604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(1601);
				sC_Case();
				}
				}
				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1607);
			match(END_SELECT);
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

	public static class SC_SelectionContext extends ParserRuleContext {
		public SC_SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sC_Selection; }
	 
		public SC_SelectionContext() { }
		public void copyFrom(SC_SelectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseCondValueContext extends SC_SelectionContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public CaseCondValueContext(SC_SelectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterCaseCondValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitCaseCondValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitCaseCondValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseCondToContext extends SC_SelectionContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode TO() { return getToken(vbaParser.TO, 0); }
		public CaseCondToContext(SC_SelectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterCaseCondTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitCaseCondTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitCaseCondTo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseCondIsContext extends SC_SelectionContext {
		public TerminalNode IS() { return getToken(vbaParser.IS, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public CaseCondIsContext(SC_SelectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterCaseCondIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitCaseCondIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitCaseCondIs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SC_SelectionContext sC_Selection() throws RecognitionException {
		SC_SelectionContext _localctx = new SC_SelectionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_sC_Selection);
		int _la;
		try {
			setState(1626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				_localctx = new CaseCondIsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				match(IS);
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1610);
					match(WS);
					}
				}

				setState(1613);
				comparisonOperator();
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1614);
					match(WS);
					}
				}

				setState(1617);
				valueStmt(0);
				}
				break;
			case 2:
				_localctx = new CaseCondToContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1619);
				valueStmt(0);
				setState(1620);
				match(WS);
				setState(1621);
				match(TO);
				setState(1622);
				match(WS);
				setState(1623);
				valueStmt(0);
				}
				break;
			case 3:
				_localctx = new CaseCondValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1625);
				valueStmt(0);
				}
				break;
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

	public static class SC_CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(vbaParser.CASE, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public SC_CondContext sC_Cond() {
			return getRuleContext(SC_CondContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SC_CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sC_Case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSC_Case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSC_Case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSC_Case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SC_CaseContext sC_Case() throws RecognitionException {
		SC_CaseContext _localctx = new SC_CaseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_sC_Case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(CASE);
			setState(1629);
			match(WS);
			setState(1630);
			sC_Cond();
			setState(1631);
			endOfStatement();
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1632);
				block();
				}
				break;
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

	public static class SC_CondContext extends ParserRuleContext {
		public SC_CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sC_Cond; }
	 
		public SC_CondContext() { }
		public void copyFrom(SC_CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseCondSelectionContext extends SC_CondContext {
		public List<SC_SelectionContext> sC_Selection() {
			return getRuleContexts(SC_SelectionContext.class);
		}
		public SC_SelectionContext sC_Selection(int i) {
			return getRuleContext(SC_SelectionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public CaseCondSelectionContext(SC_CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterCaseCondSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitCaseCondSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitCaseCondSelection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseCondElseContext extends SC_CondContext {
		public TerminalNode ELSE() { return getToken(vbaParser.ELSE, 0); }
		public CaseCondElseContext(SC_CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterCaseCondElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitCaseCondElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitCaseCondElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SC_CondContext sC_Cond() throws RecognitionException {
		SC_CondContext _localctx = new SC_CondContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_sC_Cond);
		int _la;
		try {
			int _alt;
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				_localctx = new CaseCondElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1635);
				match(ELSE);
				}
				break;
			case 2:
				_localctx = new CaseCondSelectionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				sC_Selection();
				setState(1647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1638);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1637);
							match(WS);
							}
						}

						setState(1640);
						match(T__0);
						setState(1642);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1641);
							match(WS);
							}
						}

						setState(1644);
						sC_Selection();
						}
						} 
					}
					setState(1649);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				}
				}
				break;
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

	public static class SendkeysStmtContext extends ParserRuleContext {
		public TerminalNode SENDKEYS() { return getToken(vbaParser.SENDKEYS, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public SendkeysStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendkeysStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSendkeysStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSendkeysStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSendkeysStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SendkeysStmtContext sendkeysStmt() throws RecognitionException {
		SendkeysStmtContext _localctx = new SendkeysStmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_sendkeysStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			match(SENDKEYS);
			setState(1653);
			match(WS);
			setState(1654);
			valueStmt(0);
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1655);
					match(WS);
					}
				}

				setState(1658);
				match(T__0);
				setState(1660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1659);
					match(WS);
					}
				}

				setState(1662);
				valueStmt(0);
				}
				break;
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

	public static class SetattrStmtContext extends ParserRuleContext {
		public TerminalNode SETATTR() { return getToken(vbaParser.SETATTR, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public SetattrStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setattrStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSetattrStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSetattrStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSetattrStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetattrStmtContext setattrStmt() throws RecognitionException {
		SetattrStmtContext _localctx = new SetattrStmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_setattrStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			match(SETATTR);
			setState(1666);
			match(WS);
			setState(1667);
			valueStmt(0);
			setState(1669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1668);
				match(WS);
				}
			}

			setState(1671);
			match(T__0);
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1672);
				match(WS);
				}
			}

			setState(1675);
			valueStmt(0);
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

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(vbaParser.SET, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_setStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			match(SET);
			setState(1678);
			match(WS);
			setState(1679);
			implicitCallStmt_InStmt();
			setState(1681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1680);
				match(WS);
				}
			}

			setState(1683);
			match(EQ);
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1684);
				match(WS);
				}
			}

			setState(1687);
			valueStmt(0);
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

	public static class StopStmtContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(vbaParser.STOP, 0); }
		public StopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterStopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitStopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitStopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopStmtContext stopStmt() throws RecognitionException {
		StopStmtContext _localctx = new StopStmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_stopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			match(STOP);
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

	public static class SubStmtContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(vbaParser.SUB, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_SUB() { return getToken(vbaParser.END_SUB, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode STATIC() { return getToken(vbaParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubStmtContext subStmt() throws RecognitionException {
		SubStmtContext _localctx = new SubStmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_subStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(1691);
				visibility();
				setState(1692);
				match(WS);
				}
			}

			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1696);
				match(STATIC);
				setState(1697);
				match(WS);
				}
			}

			setState(1700);
			match(SUB);
			setState(1702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1701);
				match(WS);
				}
			}

			setState(1704);
			ambiguousIdentifier();
			setState(1709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1705);
					match(WS);
					}
				}

				setState(1708);
				argList();
				}
				break;
			}
			setState(1711);
			endOfStatement();
			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==IDENTIFIER) {
				{
				setState(1712);
				block();
				}
			}

			setState(1715);
			match(END_SUB);
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

	public static class TimeStmtContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(vbaParser.TIME, 0); }
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TimeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterTimeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitTimeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitTimeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeStmtContext timeStmt() throws RecognitionException {
		TimeStmtContext _localctx = new TimeStmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_timeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			match(TIME);
			setState(1719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1718);
				match(WS);
				}
			}

			setState(1721);
			match(EQ);
			setState(1723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1722);
				match(WS);
				}
			}

			setState(1725);
			valueStmt(0);
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

	public static class TypeStmtContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(vbaParser.TYPE, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_TYPE() { return getToken(vbaParser.END_TYPE, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TypeStmt_ElementContext> typeStmt_Element() {
			return getRuleContexts(TypeStmt_ElementContext.class);
		}
		public TypeStmt_ElementContext typeStmt_Element(int i) {
			return getRuleContext(TypeStmt_ElementContext.class,i);
		}
		public TypeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterTypeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitTypeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitTypeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStmtContext typeStmt() throws RecognitionException {
		TypeStmtContext _localctx = new TypeStmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) {
				{
				setState(1727);
				visibility();
				setState(1728);
				match(WS);
				}
			}

			setState(1732);
			match(TYPE);
			setState(1733);
			match(WS);
			setState(1734);
			ambiguousIdentifier();
			setState(1735);
			endOfStatement();
			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1736);
				typeStmt_Element();
				}
				}
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1742);
			match(END_TYPE);
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

	public static class TypeStmt_ElementContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public TypeStmt_ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStmt_Element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterTypeStmt_Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitTypeStmt_Element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitTypeStmt_Element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStmt_ElementContext typeStmt_Element() throws RecognitionException {
		TypeStmt_ElementContext _localctx = new TypeStmt_ElementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typeStmt_Element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			ambiguousIdentifier();
			setState(1759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1745);
					match(WS);
					}
				}

				setState(1748);
				match(LPAREN);
				setState(1753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1750);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1749);
						match(WS);
						}
					}

					setState(1752);
					subscripts();
					}
					break;
				}
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1755);
					match(WS);
					}
				}

				setState(1758);
				match(RPAREN);
				}
				break;
			}
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1761);
				match(WS);
				setState(1762);
				asTypeClause();
				}
				break;
			}
			setState(1765);
			endOfStatement();
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

	public static class TypeOfStmtContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(vbaParser.TYPEOF, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode IS() { return getToken(vbaParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeOfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOfStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterTypeOfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitTypeOfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitTypeOfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOfStmtContext typeOfStmt() throws RecognitionException {
		TypeOfStmtContext _localctx = new TypeOfStmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_typeOfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			match(TYPEOF);
			setState(1768);
			match(WS);
			setState(1769);
			valueStmt(0);
			setState(1774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(1770);
				match(WS);
				setState(1771);
				match(IS);
				setState(1772);
				match(WS);
				setState(1773);
				type();
				}
				break;
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

	public static class UnloadStmtContext extends ParserRuleContext {
		public TerminalNode UNLOAD() { return getToken(vbaParser.UNLOAD, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public UnloadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unloadStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterUnloadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitUnloadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitUnloadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnloadStmtContext unloadStmt() throws RecognitionException {
		UnloadStmtContext _localctx = new UnloadStmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_unloadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			match(UNLOAD);
			setState(1777);
			match(WS);
			setState(1778);
			valueStmt(0);
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

	public static class UnlockStmtContext extends ParserRuleContext {
		public TerminalNode UNLOCK() { return getToken(vbaParser.UNLOCK, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode TO() { return getToken(vbaParser.TO, 0); }
		public UnlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterUnlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitUnlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitUnlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlockStmtContext unlockStmt() throws RecognitionException {
		UnlockStmtContext _localctx = new UnlockStmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_unlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			match(UNLOCK);
			setState(1781);
			match(WS);
			setState(1782);
			fileNumber();
			setState(1797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(1784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1783);
					match(WS);
					}
				}

				setState(1786);
				match(T__0);
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1787);
					match(WS);
					}
				}

				setState(1790);
				valueStmt(0);
				setState(1795);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(1791);
					match(WS);
					setState(1792);
					match(TO);
					setState(1793);
					match(WS);
					setState(1794);
					valueStmt(0);
					}
					break;
				}
				}
				break;
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

	public static class ValueStmtContext extends ParserRuleContext {
		public ValueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueStmt; }
	 
		public ValueStmtContext() { }
		public void copyFrom(ValueStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VsStructContext extends ValueStmtContext {
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsStructContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsAddContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(vbaParser.PLUS, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsAddContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsLtContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode LT() { return getToken(vbaParser.LT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsLtContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsLt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsAddressOfContext extends ValueStmtContext {
		public TerminalNode ADDRESSOF() { return getToken(vbaParser.ADDRESSOF, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public VsAddressOfContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsAddressOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsAddressOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsAddressOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsNewContext extends ValueStmtContext {
		public TerminalNode NEW() { return getToken(vbaParser.NEW, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public VsNewContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsMultContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode MULT() { return getToken(vbaParser.MULT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsMultContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsNegationContext extends ValueStmtContext {
		public TerminalNode MINUS() { return getToken(vbaParser.MINUS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public VsNegationContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsAssignContext extends ValueStmtContext {
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(vbaParser.ASSIGN, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsAssignContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsLikeContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(vbaParser.LIKE, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsLikeContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsDivContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode DIV() { return getToken(vbaParser.DIV, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsDivContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsPlusContext extends ValueStmtContext {
		public TerminalNode PLUS() { return getToken(vbaParser.PLUS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public VsPlusContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsNotContext extends ValueStmtContext {
		public TerminalNode NOT() { return getToken(vbaParser.NOT, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public VsNotContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsGeqContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode GEQ() { return getToken(vbaParser.GEQ, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsGeqContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsGeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsGeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsGeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsTypeOfContext extends ValueStmtContext {
		public TypeOfStmtContext typeOfStmt() {
			return getRuleContext(TypeOfStmtContext.class,0);
		}
		public VsTypeOfContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsTypeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsTypeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsTypeOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsICSContext extends ValueStmtContext {
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public VsICSContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsICS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsICS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsICS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsNeqContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(vbaParser.NEQ, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsNeqContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsNeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsNeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsXorContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode XOR() { return getToken(vbaParser.XOR, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsXorContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsXor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsAndContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode AND() { return getToken(vbaParser.AND, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsAndContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsLeqContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode LEQ() { return getToken(vbaParser.LEQ, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsLeqContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsLeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsLeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsLeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsPowContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode POW() { return getToken(vbaParser.POW, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsPowContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsIsContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode IS() { return getToken(vbaParser.IS, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsIsContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsModContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode MOD() { return getToken(vbaParser.MOD, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsModContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsAmpContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode AMPERSAND() { return getToken(vbaParser.AMPERSAND, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsAmpContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsAmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsAmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsAmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsOrContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode OR() { return getToken(vbaParser.OR, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsOrContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsMinusContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(vbaParser.MINUS, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsMinusContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsLiteralContext extends ValueStmtContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VsLiteralContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsEqvContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode EQV() { return getToken(vbaParser.EQV, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsEqvContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsEqv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsEqv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsEqv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsImpContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode IMP() { return getToken(vbaParser.IMP, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsImpContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsImp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsImp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsGtContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode GT() { return getToken(vbaParser.GT, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsGtContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsGt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsEqContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VsEqContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VsMidContext extends ValueStmtContext {
		public MidStmtContext midStmt() {
			return getRuleContext(MidStmtContext.class,0);
		}
		public VsMidContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVsMid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVsMid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVsMid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueStmtContext valueStmt() throws RecognitionException {
		return valueStmt(0);
	}

	private ValueStmtContext valueStmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueStmtContext _localctx = new ValueStmtContext(_ctx, _parentState);
		ValueStmtContext _prevctx = _localctx;
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_valueStmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				_localctx = new VsLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1800);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new VsICSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1801);
				implicitCallStmt_InStmt();
				}
				break;
			case 3:
				{
				_localctx = new VsStructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1802);
				match(LPAREN);
				setState(1804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1803);
					match(WS);
					}
				}

				setState(1806);
				valueStmt(0);
				setState(1817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==WS) {
					{
					{
					setState(1808);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1807);
						match(WS);
						}
					}

					setState(1810);
					match(T__0);
					setState(1812);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1811);
						match(WS);
						}
					}

					setState(1814);
					valueStmt(0);
					}
					}
					setState(1819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1820);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new VsNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1822);
				match(NEW);
				setState(1824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1823);
					match(WS);
					}
				}

				setState(1826);
				valueStmt(28);
				}
				break;
			case 5:
				{
				_localctx = new VsTypeOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1827);
				typeOfStmt();
				}
				break;
			case 6:
				{
				_localctx = new VsMidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1828);
				midStmt();
				}
				break;
			case 7:
				{
				_localctx = new VsAddressOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1829);
				match(ADDRESSOF);
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1830);
					match(WS);
					}
				}

				setState(1833);
				valueStmt(25);
				}
				break;
			case 8:
				{
				_localctx = new VsAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1834);
				implicitCallStmt_InStmt();
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1835);
					match(WS);
					}
				}

				setState(1838);
				match(ASSIGN);
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1839);
					match(WS);
					}
				}

				setState(1842);
				valueStmt(24);
				}
				break;
			case 9:
				{
				_localctx = new VsNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1844);
				match(MINUS);
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1845);
					match(WS);
					}
				}

				setState(1848);
				valueStmt(14);
				}
				break;
			case 10:
				{
				_localctx = new VsPlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1849);
				match(PLUS);
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1850);
					match(WS);
					}
				}

				setState(1853);
				valueStmt(13);
				}
				break;
			case 11:
				{
				_localctx = new VsNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1854);
				match(NOT);
				setState(1856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1855);
					match(WS);
					}
				}

				setState(1858);
				valueStmt(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2041);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
					case 1:
						{
						_localctx = new VsIsContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1861);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1863);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1862);
							match(WS);
							}
						}

						setState(1865);
						match(IS);
						setState(1867);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1866);
							match(WS);
							}
						}

						setState(1869);
						valueStmt(24);
						}
						break;
					case 2:
						{
						_localctx = new VsLikeContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1870);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1872);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1871);
							match(WS);
							}
						}

						setState(1874);
						match(LIKE);
						setState(1876);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1875);
							match(WS);
							}
						}

						setState(1878);
						valueStmt(23);
						}
						break;
					case 3:
						{
						_localctx = new VsGeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1879);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1881);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1880);
							match(WS);
							}
						}

						setState(1883);
						match(GEQ);
						setState(1885);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1884);
							match(WS);
							}
						}

						setState(1887);
						valueStmt(22);
						}
						break;
					case 4:
						{
						_localctx = new VsLeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1888);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1890);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1889);
							match(WS);
							}
						}

						setState(1892);
						match(LEQ);
						setState(1894);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1893);
							match(WS);
							}
						}

						setState(1896);
						valueStmt(21);
						}
						break;
					case 5:
						{
						_localctx = new VsGtContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1897);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1899);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1898);
							match(WS);
							}
						}

						setState(1901);
						match(GT);
						setState(1903);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1902);
							match(WS);
							}
						}

						setState(1905);
						valueStmt(20);
						}
						break;
					case 6:
						{
						_localctx = new VsLtContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1906);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1908);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1907);
							match(WS);
							}
						}

						setState(1910);
						match(LT);
						setState(1912);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1911);
							match(WS);
							}
						}

						setState(1914);
						valueStmt(19);
						}
						break;
					case 7:
						{
						_localctx = new VsNeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1915);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1917);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1916);
							match(WS);
							}
						}

						setState(1919);
						match(NEQ);
						setState(1921);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1920);
							match(WS);
							}
						}

						setState(1923);
						valueStmt(18);
						}
						break;
					case 8:
						{
						_localctx = new VsEqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1924);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1926);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1925);
							match(WS);
							}
						}

						setState(1928);
						match(EQ);
						setState(1930);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1929);
							match(WS);
							}
						}

						setState(1932);
						valueStmt(17);
						}
						break;
					case 9:
						{
						_localctx = new VsPowContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1933);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1935);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1934);
							match(WS);
							}
						}

						setState(1937);
						match(POW);
						setState(1939);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1938);
							match(WS);
							}
						}

						setState(1941);
						valueStmt(16);
						}
						break;
					case 10:
						{
						_localctx = new VsDivContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1942);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1944);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1943);
							match(WS);
							}
						}

						setState(1946);
						match(DIV);
						setState(1948);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1947);
							match(WS);
							}
						}

						setState(1950);
						valueStmt(13);
						}
						break;
					case 11:
						{
						_localctx = new VsMultContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1951);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1953);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1952);
							match(WS);
							}
						}

						setState(1955);
						match(MULT);
						setState(1957);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1956);
							match(WS);
							}
						}

						setState(1959);
						valueStmt(12);
						}
						break;
					case 12:
						{
						_localctx = new VsModContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1960);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1962);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1961);
							match(WS);
							}
						}

						setState(1964);
						match(MOD);
						setState(1966);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1965);
							match(WS);
							}
						}

						setState(1968);
						valueStmt(11);
						}
						break;
					case 13:
						{
						_localctx = new VsAddContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1969);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1971);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1970);
							match(WS);
							}
						}

						setState(1973);
						match(PLUS);
						setState(1975);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1974);
							match(WS);
							}
						}

						setState(1977);
						valueStmt(10);
						}
						break;
					case 14:
						{
						_localctx = new VsMinusContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1978);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1980);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1979);
							match(WS);
							}
						}

						setState(1982);
						match(MINUS);
						setState(1984);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1983);
							match(WS);
							}
						}

						setState(1986);
						valueStmt(9);
						}
						break;
					case 15:
						{
						_localctx = new VsAmpContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1987);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1989);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1988);
							match(WS);
							}
						}

						setState(1991);
						match(AMPERSAND);
						setState(1993);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1992);
							match(WS);
							}
						}

						setState(1995);
						valueStmt(8);
						}
						break;
					case 16:
						{
						_localctx = new VsImpContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(1996);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1998);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1997);
							match(WS);
							}
						}

						setState(2000);
						match(IMP);
						setState(2002);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2001);
							match(WS);
							}
						}

						setState(2004);
						valueStmt(7);
						}
						break;
					case 17:
						{
						_localctx = new VsEqvContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2005);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2007);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2006);
							match(WS);
							}
						}

						setState(2009);
						match(EQV);
						setState(2011);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2010);
							match(WS);
							}
						}

						setState(2013);
						valueStmt(6);
						}
						break;
					case 18:
						{
						_localctx = new VsXorContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2014);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2016);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2015);
							match(WS);
							}
						}

						setState(2018);
						match(XOR);
						setState(2020);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2019);
							match(WS);
							}
						}

						setState(2022);
						valueStmt(5);
						}
						break;
					case 19:
						{
						_localctx = new VsOrContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2023);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2025);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2024);
							match(WS);
							}
						}

						setState(2027);
						match(OR);
						setState(2029);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2028);
							match(WS);
							}
						}

						setState(2031);
						valueStmt(4);
						}
						break;
					case 20:
						{
						_localctx = new VsAndContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2032);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2034);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2033);
							match(WS);
							}
						}

						setState(2036);
						match(AND);
						setState(2038);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2037);
							match(WS);
							}
						}

						setState(2040);
						valueStmt(3);
						}
						break;
					}
					} 
				}
				setState(2045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableStmtContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VariableListStmtContext variableListStmt() {
			return getRuleContext(VariableListStmtContext.class,0);
		}
		public TerminalNode DIM() { return getToken(vbaParser.DIM, 0); }
		public TerminalNode STATIC() { return getToken(vbaParser.STATIC, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode WITHEVENTS() { return getToken(vbaParser.WITHEVENTS, 0); }
		public VariableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVariableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVariableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVariableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStmtContext variableStmt() throws RecognitionException {
		VariableStmtContext _localctx = new VariableStmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_variableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIM:
				{
				setState(2046);
				match(DIM);
				}
				break;
			case STATIC:
				{
				setState(2047);
				match(STATIC);
				}
				break;
			case FRIEND:
			case GLOBAL:
			case PRIVATE:
			case PUBLIC:
				{
				setState(2048);
				visibility();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2051);
			match(WS);
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2052);
				match(WITHEVENTS);
				setState(2053);
				match(WS);
				}
				break;
			}
			setState(2056);
			variableListStmt();
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

	public static class VariableListStmtContext extends ParserRuleContext {
		public List<VariableSubStmtContext> variableSubStmt() {
			return getRuleContexts(VariableSubStmtContext.class);
		}
		public VariableSubStmtContext variableSubStmt(int i) {
			return getRuleContext(VariableSubStmtContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public VariableListStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableListStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVariableListStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVariableListStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVariableListStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableListStmtContext variableListStmt() throws RecognitionException {
		VariableListStmtContext _localctx = new VariableListStmtContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_variableListStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
			variableSubStmt();
			setState(2069);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2060);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2059);
						match(WS);
						}
					}

					setState(2062);
					match(T__0);
					setState(2064);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2063);
						match(WS);
						}
					}

					setState(2066);
					variableSubStmt();
					}
					} 
				}
				setState(2071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
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

	public static class VariableSubStmtContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public VariableSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVariableSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVariableSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVariableSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableSubStmtContext variableSubStmt() throws RecognitionException {
		VariableSubStmtContext _localctx = new VariableSubStmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_variableSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2072);
			ambiguousIdentifier();
			setState(2090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2073);
					match(WS);
					}
				}

				setState(2076);
				match(LPAREN);
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2077);
					match(WS);
					}
				}

				setState(2084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (LPAREN - 193)) | (1L << (MINUS - 193)) | (1L << (PLUS - 193)) | (1L << (STRINGLITERAL - 193)) | (1L << (OCTLITERAL - 193)) | (1L << (HEXLITERAL - 193)) | (1L << (SHORTLITERAL - 193)) | (1L << (INTEGERLITERAL - 193)) | (1L << (DOUBLELITERAL - 193)) | (1L << (DATELITERAL - 193)) | (1L << (IDENTIFIER - 193)))) != 0)) {
					{
					setState(2080);
					subscripts();
					setState(2082);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2081);
						match(WS);
						}
					}

					}
				}

				setState(2086);
				match(RPAREN);
				setState(2088);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2087);
					match(WS);
					}
					break;
				}
				}
				break;
			}
			setState(2093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2092);
				typeHint();
				}
				break;
			}
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2095);
				match(WS);
				setState(2096);
				asTypeClause();
				}
				break;
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

	public static class WhileWendStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(vbaParser.WHILE, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode WEND() { return getToken(vbaParser.WEND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileWendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileWendStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterWhileWendStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitWhileWendStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitWhileWendStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileWendStmtContext whileWendStmt() throws RecognitionException {
		WhileWendStmtContext _localctx = new WhileWendStmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_whileWendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			match(WHILE);
			setState(2100);
			match(WS);
			setState(2101);
			valueStmt(0);
			setState(2102);
			endOfStatement();
			setState(2104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2103);
				block();
				}
				break;
			}
			setState(2106);
			match(WEND);
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

	public static class WidthStmtContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(vbaParser.WIDTH, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public WidthStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterWidthStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitWidthStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitWidthStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthStmtContext widthStmt() throws RecognitionException {
		WidthStmtContext _localctx = new WidthStmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_widthStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
			match(WIDTH);
			setState(2109);
			match(WS);
			setState(2110);
			fileNumber();
			setState(2112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2111);
				match(WS);
				}
			}

			setState(2114);
			match(T__0);
			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2115);
				match(WS);
				}
			}

			setState(2118);
			valueStmt(0);
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

	public static class WithStmtContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(vbaParser.WITH, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_WITH() { return getToken(vbaParser.END_WITH, 0); }
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEW() { return getToken(vbaParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public WithStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterWithStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitWithStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitWithStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStmtContext withStmt() throws RecognitionException {
		WithStmtContext _localctx = new WithStmtContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_withStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			match(WITH);
			setState(2121);
			match(WS);
			setState(2126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(2122);
				implicitCallStmt_InStmt();
				}
				break;
			case 2:
				{
				{
				setState(2123);
				match(NEW);
				setState(2124);
				match(WS);
				setState(2125);
				type();
				}
				}
				break;
			}
			setState(2128);
			endOfStatement();
			setState(2130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (MACRO_CONST - 64)) | (1L << (MACRO_IF - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || _la==IDENTIFIER) {
				{
				setState(2129);
				block();
				}
			}

			setState(2132);
			match(END_WITH);
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

	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(vbaParser.WRITE, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public OutputListContext outputList() {
			return getRuleContext(OutputListContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_writeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2134);
			match(WRITE);
			setState(2135);
			match(WS);
			setState(2136);
			fileNumber();
			setState(2138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2137);
				match(WS);
				}
			}

			setState(2140);
			match(T__0);
			setState(2145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2141);
					match(WS);
					}
					break;
				}
				setState(2144);
				outputList();
				}
				break;
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

	public static class FileNumberContext extends ParserRuleContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public FileNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterFileNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitFileNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitFileNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNumberContext fileNumber() throws RecognitionException {
		FileNumberContext _localctx = new FileNumberContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_fileNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(2147);
				match(T__2);
				}
			}

			setState(2150);
			valueStmt(0);
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

	public static class ExplicitCallStmtContext extends ParserRuleContext {
		public ECS_ProcedureCallContext eCS_ProcedureCall() {
			return getRuleContext(ECS_ProcedureCallContext.class,0);
		}
		public ECS_MemberProcedureCallContext eCS_MemberProcedureCall() {
			return getRuleContext(ECS_MemberProcedureCallContext.class,0);
		}
		public ExplicitCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterExplicitCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitExplicitCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitExplicitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitCallStmtContext explicitCallStmt() throws RecognitionException {
		ExplicitCallStmtContext _localctx = new ExplicitCallStmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_explicitCallStmt);
		try {
			setState(2154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2152);
				eCS_ProcedureCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2153);
				eCS_MemberProcedureCall();
				}
				break;
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

	public static class ECS_ProcedureCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(vbaParser.CALL, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(vbaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(vbaParser.LPAREN, i);
		}
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(vbaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(vbaParser.RPAREN, i);
		}
		public List<SubscriptsContext> subscripts() {
			return getRuleContexts(SubscriptsContext.class);
		}
		public SubscriptsContext subscripts(int i) {
			return getRuleContext(SubscriptsContext.class,i);
		}
		public ECS_ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eCS_ProcedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterECS_ProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitECS_ProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitECS_ProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ECS_ProcedureCallContext eCS_ProcedureCall() throws RecognitionException {
		ECS_ProcedureCallContext _localctx = new ECS_ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_eCS_ProcedureCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2156);
			match(CALL);
			setState(2157);
			match(WS);
			setState(2158);
			ambiguousIdentifier();
			setState(2160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
			case 1:
				{
				setState(2159);
				typeHint();
				}
				break;
			}
			setState(2175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(2163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2162);
					match(WS);
					}
				}

				setState(2165);
				match(LPAREN);
				setState(2167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2166);
					match(WS);
					}
					break;
				}
				setState(2169);
				argsCall();
				setState(2171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2170);
					match(WS);
					}
				}

				setState(2173);
				match(RPAREN);
				}
				break;
			}
			setState(2186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2177);
						match(WS);
						}
					}

					setState(2180);
					match(LPAREN);
					setState(2181);
					subscripts();
					setState(2182);
					match(RPAREN);
					}
					} 
				}
				setState(2188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
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

	public static class ECS_MemberProcedureCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(vbaParser.CALL, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(vbaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(vbaParser.LPAREN, i);
		}
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(vbaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(vbaParser.RPAREN, i);
		}
		public List<SubscriptsContext> subscripts() {
			return getRuleContexts(SubscriptsContext.class);
		}
		public SubscriptsContext subscripts(int i) {
			return getRuleContext(SubscriptsContext.class,i);
		}
		public ECS_MemberProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eCS_MemberProcedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterECS_MemberProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitECS_MemberProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitECS_MemberProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ECS_MemberProcedureCallContext eCS_MemberProcedureCall() throws RecognitionException {
		ECS_MemberProcedureCallContext _localctx = new ECS_MemberProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_eCS_MemberProcedureCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
			match(CALL);
			setState(2190);
			match(WS);
			setState(2192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2191);
				implicitCallStmt_InStmt();
				}
				break;
			}
			setState(2194);
			match(T__3);
			setState(2195);
			ambiguousIdentifier();
			setState(2197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				setState(2196);
				typeHint();
				}
				break;
			}
			setState(2212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				{
				setState(2200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2199);
					match(WS);
					}
				}

				setState(2202);
				match(LPAREN);
				setState(2204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2203);
					match(WS);
					}
					break;
				}
				setState(2206);
				argsCall();
				setState(2208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2207);
					match(WS);
					}
				}

				setState(2210);
				match(RPAREN);
				}
				break;
			}
			setState(2223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2214);
						match(WS);
						}
					}

					setState(2217);
					match(LPAREN);
					setState(2218);
					subscripts();
					setState(2219);
					match(RPAREN);
					}
					} 
				}
				setState(2225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
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

	public static class ImplicitCallStmt_InBlockContext extends ParserRuleContext {
		public ICS_B_MemberProcedureCallContext iCS_B_MemberProcedureCall() {
			return getRuleContext(ICS_B_MemberProcedureCallContext.class,0);
		}
		public ICS_B_ProcedureCallContext iCS_B_ProcedureCall() {
			return getRuleContext(ICS_B_ProcedureCallContext.class,0);
		}
		public ImplicitCallStmt_InBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitCallStmt_InBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterImplicitCallStmt_InBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitImplicitCallStmt_InBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitImplicitCallStmt_InBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicitCallStmt_InBlockContext implicitCallStmt_InBlock() throws RecognitionException {
		ImplicitCallStmt_InBlockContext _localctx = new ImplicitCallStmt_InBlockContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_implicitCallStmt_InBlock);
		try {
			setState(2228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2226);
				iCS_B_MemberProcedureCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2227);
				iCS_B_ProcedureCall();
				}
				break;
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

	public static class ICS_B_MemberProcedureCallContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public DictionaryCallStmtContext dictionaryCallStmt() {
			return getRuleContext(DictionaryCallStmtContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(vbaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(vbaParser.LPAREN, i);
		}
		public List<SubscriptsContext> subscripts() {
			return getRuleContexts(SubscriptsContext.class);
		}
		public SubscriptsContext subscripts(int i) {
			return getRuleContext(SubscriptsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(vbaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(vbaParser.RPAREN, i);
		}
		public ICS_B_MemberProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCS_B_MemberProcedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterICS_B_MemberProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitICS_B_MemberProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitICS_B_MemberProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ICS_B_MemberProcedureCallContext iCS_B_MemberProcedureCall() throws RecognitionException {
		ICS_B_MemberProcedureCallContext _localctx = new ICS_B_MemberProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_iCS_B_MemberProcedureCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				setState(2230);
				implicitCallStmt_InStmt();
				}
				break;
			}
			setState(2233);
			match(T__3);
			setState(2234);
			ambiguousIdentifier();
			setState(2236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
			case 1:
				{
				setState(2235);
				typeHint();
				}
				break;
			}
			setState(2240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2238);
				match(WS);
				setState(2239);
				argsCall();
				}
				break;
			}
			setState(2243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				{
				setState(2242);
				dictionaryCallStmt();
				}
				break;
			}
			setState(2254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2245);
						match(WS);
						}
					}

					setState(2248);
					match(LPAREN);
					setState(2249);
					subscripts();
					setState(2250);
					match(RPAREN);
					}
					} 
				}
				setState(2256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
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

	public static class ICS_B_ProcedureCallContext extends ParserRuleContext {
		public CertainIdentifierContext certainIdentifier() {
			return getRuleContext(CertainIdentifierContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(vbaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(vbaParser.LPAREN, i);
		}
		public List<SubscriptsContext> subscripts() {
			return getRuleContexts(SubscriptsContext.class);
		}
		public SubscriptsContext subscripts(int i) {
			return getRuleContext(SubscriptsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(vbaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(vbaParser.RPAREN, i);
		}
		public ICS_B_ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCS_B_ProcedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterICS_B_ProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitICS_B_ProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitICS_B_ProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ICS_B_ProcedureCallContext iCS_B_ProcedureCall() throws RecognitionException {
		ICS_B_ProcedureCallContext _localctx = new ICS_B_ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_iCS_B_ProcedureCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			certainIdentifier();
			setState(2260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2258);
				match(WS);
				setState(2259);
				argsCall();
				}
				break;
			}
			setState(2271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2262);
						match(WS);
						}
					}

					setState(2265);
					match(LPAREN);
					setState(2266);
					subscripts();
					setState(2267);
					match(RPAREN);
					}
					} 
				}
				setState(2273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
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

	public static class ImplicitCallStmt_InStmtContext extends ParserRuleContext {
		public ICS_S_MembersCallContext iCS_S_MembersCall() {
			return getRuleContext(ICS_S_MembersCallContext.class,0);
		}
		public ICS_S_VariableOrProcedureCallContext iCS_S_VariableOrProcedureCall() {
			return getRuleContext(ICS_S_VariableOrProcedureCallContext.class,0);
		}
		public ICS_S_ProcedureOrArrayCallContext iCS_S_ProcedureOrArrayCall() {
			return getRuleContext(ICS_S_ProcedureOrArrayCallContext.class,0);
		}
		public ICS_S_DictionaryCallContext iCS_S_DictionaryCall() {
			return getRuleContext(ICS_S_DictionaryCallContext.class,0);
		}
		public ImplicitCallStmt_InStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitCallStmt_InStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterImplicitCallStmt_InStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitImplicitCallStmt_InStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitImplicitCallStmt_InStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() throws RecognitionException {
		ImplicitCallStmt_InStmtContext _localctx = new ImplicitCallStmt_InStmtContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_implicitCallStmt_InStmt);
		try {
			setState(2278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2274);
				iCS_S_MembersCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2275);
				iCS_S_VariableOrProcedureCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2276);
				iCS_S_ProcedureOrArrayCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2277);
				iCS_S_DictionaryCall();
				}
				break;
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

	public static class ICS_S_VariableOrProcedureCallContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public DictionaryCallStmtContext dictionaryCallStmt() {
			return getRuleContext(DictionaryCallStmtContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(vbaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(vbaParser.LPAREN, i);
		}
		public List<SubscriptsContext> subscripts() {
			return getRuleContexts(SubscriptsContext.class);
		}
		public SubscriptsContext subscripts(int i) {
			return getRuleContext(SubscriptsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(vbaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(vbaParser.RPAREN, i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ICS_S_VariableOrProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCS_S_VariableOrProcedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterICS_S_VariableOrProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitICS_S_VariableOrProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitICS_S_VariableOrProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ICS_S_VariableOrProcedureCallContext iCS_S_VariableOrProcedureCall() throws RecognitionException {
		ICS_S_VariableOrProcedureCallContext _localctx = new ICS_S_VariableOrProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_iCS_S_VariableOrProcedureCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			ambiguousIdentifier();
			setState(2282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				{
				setState(2281);
				typeHint();
				}
				break;
			}
			setState(2285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
			case 1:
				{
				setState(2284);
				dictionaryCallStmt();
				}
				break;
			}
			setState(2296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2287);
						match(WS);
						}
					}

					setState(2290);
					match(LPAREN);
					setState(2291);
					subscripts();
					setState(2292);
					match(RPAREN);
					}
					} 
				}
				setState(2298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
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

	public static class ICS_S_ProcedureOrArrayCallContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(vbaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(vbaParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(vbaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(vbaParser.RPAREN, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public DictionaryCallStmtContext dictionaryCallStmt() {
			return getRuleContext(DictionaryCallStmtContext.class,0);
		}
		public List<SubscriptsContext> subscripts() {
			return getRuleContexts(SubscriptsContext.class);
		}
		public SubscriptsContext subscripts(int i) {
			return getRuleContext(SubscriptsContext.class,i);
		}
		public ICS_S_ProcedureOrArrayCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCS_S_ProcedureOrArrayCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterICS_S_ProcedureOrArrayCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitICS_S_ProcedureOrArrayCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitICS_S_ProcedureOrArrayCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ICS_S_ProcedureOrArrayCallContext iCS_S_ProcedureOrArrayCall() throws RecognitionException {
		ICS_S_ProcedureOrArrayCallContext _localctx = new ICS_S_ProcedureOrArrayCallContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_iCS_S_ProcedureOrArrayCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				{
				setState(2299);
				ambiguousIdentifier();
				}
				break;
			case 2:
				{
				setState(2300);
				baseType();
				}
				break;
			}
			setState(2304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(2303);
				typeHint();
				}
			}

			setState(2307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2306);
				match(WS);
				}
			}

			setState(2309);
			match(LPAREN);
			setState(2311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				{
				setState(2310);
				match(WS);
				}
				break;
			}
			setState(2317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				{
				setState(2313);
				argsCall();
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2314);
					match(WS);
					}
				}

				}
				break;
			}
			setState(2319);
			match(RPAREN);
			setState(2321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
			case 1:
				{
				setState(2320);
				dictionaryCallStmt();
				}
				break;
			}
			setState(2332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,378,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2323);
						match(WS);
						}
					}

					setState(2326);
					match(LPAREN);
					setState(2327);
					subscripts();
					setState(2328);
					match(RPAREN);
					}
					} 
				}
				setState(2334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,378,_ctx);
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

	public static class ICS_S_MembersCallContext extends ParserRuleContext {
		public ICS_S_VariableOrProcedureCallContext iCS_S_VariableOrProcedureCall() {
			return getRuleContext(ICS_S_VariableOrProcedureCallContext.class,0);
		}
		public ICS_S_ProcedureOrArrayCallContext iCS_S_ProcedureOrArrayCall() {
			return getRuleContext(ICS_S_ProcedureOrArrayCallContext.class,0);
		}
		public List<ICS_S_MemberCallContext> iCS_S_MemberCall() {
			return getRuleContexts(ICS_S_MemberCallContext.class);
		}
		public ICS_S_MemberCallContext iCS_S_MemberCall(int i) {
			return getRuleContext(ICS_S_MemberCallContext.class,i);
		}
		public DictionaryCallStmtContext dictionaryCallStmt() {
			return getRuleContext(DictionaryCallStmtContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(vbaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(vbaParser.LPAREN, i);
		}
		public List<SubscriptsContext> subscripts() {
			return getRuleContexts(SubscriptsContext.class);
		}
		public SubscriptsContext subscripts(int i) {
			return getRuleContext(SubscriptsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(vbaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(vbaParser.RPAREN, i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ICS_S_MembersCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCS_S_MembersCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterICS_S_MembersCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitICS_S_MembersCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitICS_S_MembersCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ICS_S_MembersCallContext iCS_S_MembersCall() throws RecognitionException {
		ICS_S_MembersCallContext _localctx = new ICS_S_MembersCallContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_iCS_S_MembersCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				{
				setState(2335);
				iCS_S_VariableOrProcedureCall();
				}
				break;
			case 2:
				{
				setState(2336);
				iCS_S_ProcedureOrArrayCall();
				}
				break;
			}
			setState(2340); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2339);
					iCS_S_MemberCall();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2342); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
			case 1:
				{
				setState(2344);
				dictionaryCallStmt();
				}
				break;
			}
			setState(2356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2348);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2347);
						match(WS);
						}
					}

					setState(2350);
					match(LPAREN);
					setState(2351);
					subscripts();
					setState(2352);
					match(RPAREN);
					}
					} 
				}
				setState(2358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
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

	public static class ICS_S_MemberCallContext extends ParserRuleContext {
		public ICS_S_VariableOrProcedureCallContext iCS_S_VariableOrProcedureCall() {
			return getRuleContext(ICS_S_VariableOrProcedureCallContext.class,0);
		}
		public ICS_S_ProcedureOrArrayCallContext iCS_S_ProcedureOrArrayCall() {
			return getRuleContext(ICS_S_ProcedureOrArrayCallContext.class,0);
		}
		public ICS_S_MemberCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCS_S_MemberCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterICS_S_MemberCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitICS_S_MemberCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitICS_S_MemberCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ICS_S_MemberCallContext iCS_S_MemberCall() throws RecognitionException {
		ICS_S_MemberCallContext _localctx = new ICS_S_MemberCallContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_iCS_S_MemberCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				{
				setState(2360);
				iCS_S_VariableOrProcedureCall();
				}
				break;
			case 2:
				{
				setState(2361);
				iCS_S_ProcedureOrArrayCall();
				}
				break;
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

	public static class ICS_S_DictionaryCallContext extends ParserRuleContext {
		public DictionaryCallStmtContext dictionaryCallStmt() {
			return getRuleContext(DictionaryCallStmtContext.class,0);
		}
		public ICS_S_DictionaryCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCS_S_DictionaryCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterICS_S_DictionaryCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitICS_S_DictionaryCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitICS_S_DictionaryCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ICS_S_DictionaryCallContext iCS_S_DictionaryCall() throws RecognitionException {
		ICS_S_DictionaryCallContext _localctx = new ICS_S_DictionaryCallContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_iCS_S_DictionaryCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2364);
			dictionaryCallStmt();
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

	public static class ArgsCallContext extends ParserRuleContext {
		public List<ArgCallContext> argCall() {
			return getRuleContexts(ArgCallContext.class);
		}
		public ArgCallContext argCall(int i) {
			return getRuleContext(ArgCallContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ArgsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterArgsCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitArgsCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitArgsCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsCallContext argsCall() throws RecognitionException {
		ArgsCallContext _localctx = new ArgsCallContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_argsCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (LPAREN - 193)) | (1L << (MINUS - 193)) | (1L << (PLUS - 193)) | (1L << (RPAREN - 193)) | (1L << (STRINGLITERAL - 193)) | (1L << (OCTLITERAL - 193)) | (1L << (HEXLITERAL - 193)) | (1L << (SHORTLITERAL - 193)) | (1L << (INTEGERLITERAL - 193)) | (1L << (DOUBLELITERAL - 193)) | (1L << (DATELITERAL - 193)) | (1L << (IDENTIFIER - 193)))) != 0)) {
						{
						setState(2366);
						argCall();
						}
					}

					setState(2370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2369);
						match(WS);
						}
					}

					setState(2372);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2374);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
					case 1:
						{
						setState(2373);
						match(WS);
						}
						break;
					}
					}
					} 
				}
				setState(2380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			}
			setState(2381);
			argCall();
			setState(2394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2383);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2382);
						match(WS);
						}
					}

					setState(2385);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2387);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
					case 1:
						{
						setState(2386);
						match(WS);
						}
						break;
					}
					setState(2390);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
					case 1:
						{
						setState(2389);
						argCall();
						}
						break;
					}
					}
					} 
				}
				setState(2396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
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

	public static class ArgCallContext extends ParserRuleContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public TerminalNode BYVAL() { return getToken(vbaParser.BYVAL, 0); }
		public TerminalNode BYREF() { return getToken(vbaParser.BYREF, 0); }
		public TerminalNode PARAMARRAY() { return getToken(vbaParser.PARAMARRAY, 0); }
		public ArgCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterArgCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitArgCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitArgCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgCallContext argCall() throws RecognitionException {
		ArgCallContext _localctx = new ArgCallContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_argCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
			case 1:
				{
				setState(2397);
				match(LPAREN);
				}
				break;
			}
			setState(2402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
			case 1:
				{
				setState(2400);
				_la = _input.LA(1);
				if ( !(_la==BYVAL || _la==BYREF || _la==PARAMARRAY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2401);
				match(WS);
				}
				break;
			}
			setState(2405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(2404);
				match(RPAREN);
				}
			}

			setState(2407);
			valueStmt(0);
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

	public static class DictionaryCallStmtContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public DictionaryCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterDictionaryCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitDictionaryCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitDictionaryCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryCallStmtContext dictionaryCallStmt() throws RecognitionException {
		DictionaryCallStmtContext _localctx = new DictionaryCallStmtContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_dictionaryCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			match(T__4);
			setState(2410);
			ambiguousIdentifier();
			setState(2412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				{
				setState(2411);
				typeHint();
				}
				break;
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

	public static class ArgListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_argList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			match(LPAREN);
			setState(2432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
			case 1:
				{
				setState(2416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2415);
					match(WS);
					}
				}

				setState(2418);
				arg();
				setState(2429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2420);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2419);
							match(WS);
							}
						}

						setState(2422);
						match(T__0);
						setState(2424);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2423);
							match(WS);
							}
						}

						setState(2426);
						arg();
						}
						} 
					}
					setState(2431);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
				}
				}
				break;
			}
			setState(2435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2434);
				match(WS);
				}
			}

			setState(2437);
			match(RPAREN);
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

	public static class ArgContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(vbaParser.OPTIONAL, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode PARAMARRAY() { return getToken(vbaParser.PARAMARRAY, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public ArgDefaultValueContext argDefaultValue() {
			return getRuleContext(ArgDefaultValueContext.class,0);
		}
		public TerminalNode BYVAL() { return getToken(vbaParser.BYVAL, 0); }
		public TerminalNode BYREF() { return getToken(vbaParser.BYREF, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
			case 1:
				{
				setState(2439);
				match(OPTIONAL);
				setState(2440);
				match(WS);
				}
				break;
			}
			setState(2445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				{
				setState(2443);
				_la = _input.LA(1);
				if ( !(_la==BYVAL || _la==BYREF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2444);
				match(WS);
				}
				break;
			}
			setState(2449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
			case 1:
				{
				setState(2447);
				match(PARAMARRAY);
				setState(2448);
				match(WS);
				}
				break;
			}
			setState(2451);
			ambiguousIdentifier();
			setState(2453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(2452);
				typeHint();
				}
			}

			setState(2463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
			case 1:
				{
				setState(2456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2455);
					match(WS);
					}
				}

				setState(2458);
				match(LPAREN);
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2459);
					match(WS);
					}
				}

				setState(2462);
				match(RPAREN);
				}
				break;
			}
			setState(2469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
			case 1:
				{
				setState(2466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2465);
					match(WS);
					}
				}

				setState(2468);
				asTypeClause();
				}
				break;
			}
			setState(2475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
			case 1:
				{
				setState(2472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2471);
					match(WS);
					}
				}

				setState(2474);
				argDefaultValue();
				}
				break;
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

	public static class ArgDefaultValueContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public ArgDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterArgDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitArgDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitArgDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDefaultValueContext argDefaultValue() throws RecognitionException {
		ArgDefaultValueContext _localctx = new ArgDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_argDefaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			match(EQ);
			setState(2479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2478);
				match(WS);
				}
			}

			setState(2481);
			valueStmt(0);
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

	public static class SubscriptsContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public SubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSubscripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSubscripts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSubscripts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptsContext subscripts() throws RecognitionException {
		SubscriptsContext _localctx = new SubscriptsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_subscripts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			subscript();
			setState(2494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,417,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2484);
						match(WS);
						}
					}

					setState(2487);
					match(T__0);
					setState(2489);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2488);
						match(WS);
						}
					}

					setState(2491);
					subscript();
					}
					} 
				}
				setState(2496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,417,_ctx);
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

	public static class SubscriptContext extends ParserRuleContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode TO() { return getToken(vbaParser.TO, 0); }
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
			case 1:
				{
				setState(2497);
				valueStmt(0);
				setState(2498);
				match(WS);
				setState(2499);
				match(TO);
				setState(2500);
				match(WS);
				}
				break;
			}
			setState(2504);
			valueStmt(0);
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

	public static class AmbiguousIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(vbaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vbaParser.IDENTIFIER, i);
		}
		public List<AmbiguousKeywordContext> ambiguousKeyword() {
			return getRuleContexts(AmbiguousKeywordContext.class);
		}
		public AmbiguousKeywordContext ambiguousKeyword(int i) {
			return getRuleContext(AmbiguousKeywordContext.class,i);
		}
		public AmbiguousIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterAmbiguousIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitAmbiguousIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitAmbiguousIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousIdentifierContext ambiguousIdentifier() throws RecognitionException {
		AmbiguousIdentifierContext _localctx = new AmbiguousIdentifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_ambiguousIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2508); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2508);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(2506);
						match(IDENTIFIER);
						}
						break;
					case ACCESS:
					case ADDRESSOF:
					case ALIAS:
					case AND:
					case ATTRIBUTE:
					case APPACTIVATE:
					case APPEND:
					case AS:
					case BEGIN:
					case BEEP:
					case BINARY:
					case BOOLEAN:
					case BYVAL:
					case BYREF:
					case BYTE:
					case CALL:
					case CASE:
					case CHDIR:
					case CHDRIVE:
					case CLASS:
					case CLOSE:
					case COLLECTION:
					case CONST:
					case DATABASE:
					case DATE:
					case DECLARE:
					case DEFBOOL:
					case DEFBYTE:
					case DEFDATE:
					case DEFDBL:
					case DEFDEC:
					case DEFCUR:
					case DEFINT:
					case DEFLNG:
					case DEFOBJ:
					case DEFSNG:
					case DEFSTR:
					case DEFVAR:
					case DELETESETTING:
					case DIM:
					case DO:
					case DOUBLE:
					case EACH:
					case ELSE:
					case ELSEIF:
					case END:
					case ENUM:
					case EQV:
					case ERASE:
					case ERROR:
					case EVENT:
					case FALSE:
					case FILECOPY:
					case FRIEND:
					case FOR:
					case FUNCTION:
					case GET:
					case GLOBAL:
					case GOSUB:
					case GOTO:
					case IF:
					case IMP:
					case IMPLEMENTS:
					case IN:
					case INPUT:
					case IS:
					case INTEGER:
					case KILL:
					case LOAD:
					case LOCK:
					case LONG:
					case LOOP:
					case LEN:
					case LET:
					case LIB:
					case LIKE:
					case LSET:
					case ME:
					case MID:
					case MKDIR:
					case MOD:
					case NAME:
					case NEXT:
					case NEW:
					case NOT:
					case NOTHING:
					case NULL:
					case ON:
					case OPEN:
					case OPTIONAL:
					case OR:
					case OUTPUT:
					case PARAMARRAY:
					case PRESERVE:
					case PRINT:
					case PRIVATE:
					case PUBLIC:
					case PUT:
					case RANDOM:
					case RANDOMIZE:
					case RAISEEVENT:
					case READ:
					case REDIM:
					case REM:
					case RESET:
					case RESUME:
					case RETURN:
					case RMDIR:
					case RSET:
					case SAVEPICTURE:
					case SAVESETTING:
					case SEEK:
					case SELECT:
					case SENDKEYS:
					case SET:
					case SETATTR:
					case SHARED:
					case SINGLE:
					case SPC:
					case STATIC:
					case STEP:
					case STOP:
					case STRING:
					case SUB:
					case TAB:
					case TEXT:
					case THEN:
					case TIME:
					case TO:
					case TRUE:
					case TYPE:
					case TYPEOF:
					case UNLOAD:
					case UNLOCK:
					case UNTIL:
					case VARIANT:
					case VERSION:
					case WEND:
					case WHILE:
					case WIDTH:
					case WITH:
					case WITHEVENTS:
					case WRITE:
					case XOR:
						{
						setState(2507);
						ambiguousKeyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2510); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AsTypeClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(vbaParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode NEW() { return getToken(vbaParser.NEW, 0); }
		public FieldLengthContext fieldLength() {
			return getRuleContext(FieldLengthContext.class,0);
		}
		public AsTypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asTypeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterAsTypeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitAsTypeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitAsTypeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsTypeClauseContext asTypeClause() throws RecognitionException {
		AsTypeClauseContext _localctx = new AsTypeClauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_asTypeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			match(AS);
			setState(2514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2513);
				match(WS);
				}
			}

			setState(2518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,422,_ctx) ) {
			case 1:
				{
				setState(2516);
				match(NEW);
				setState(2517);
				match(WS);
				}
				break;
			}
			setState(2520);
			type();
			setState(2525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				{
				setState(2522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2521);
					match(WS);
					}
				}

				setState(2524);
				fieldLength();
				}
				break;
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(vbaParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(vbaParser.BYTE, 0); }
		public TerminalNode COLLECTION() { return getToken(vbaParser.COLLECTION, 0); }
		public TerminalNode DATE() { return getToken(vbaParser.DATE, 0); }
		public TerminalNode DOUBLE() { return getToken(vbaParser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(vbaParser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(vbaParser.LONG, 0); }
		public TerminalNode SINGLE() { return getToken(vbaParser.SINGLE, 0); }
		public TerminalNode STRING() { return getToken(vbaParser.STRING, 0); }
		public TerminalNode MULT() { return getToken(vbaParser.MULT, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TerminalNode VARIANT() { return getToken(vbaParser.VARIANT, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_baseType);
		int _la;
		try {
			setState(2547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2527);
				match(BOOLEAN);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2528);
				match(BYTE);
				}
				break;
			case COLLECTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(2529);
				match(COLLECTION);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2530);
				match(DATE);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2531);
				match(DOUBLE);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 6);
				{
				setState(2532);
				match(INTEGER);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2533);
				match(LONG);
				}
				break;
			case SINGLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2534);
				match(SINGLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 9);
				{
				setState(2535);
				match(STRING);
				setState(2544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,427,_ctx) ) {
				case 1:
					{
					setState(2537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2536);
						match(WS);
						}
					}

					setState(2539);
					match(MULT);
					setState(2541);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2540);
						match(WS);
						}
					}

					setState(2543);
					valueStmt(0);
					}
					break;
				}
				}
				break;
			case VARIANT:
				enterOuterAlt(_localctx, 10);
				{
				setState(2546);
				match(VARIANT);
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

	public static class CertainIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(vbaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vbaParser.IDENTIFIER, i);
		}
		public List<AmbiguousKeywordContext> ambiguousKeyword() {
			return getRuleContexts(AmbiguousKeywordContext.class);
		}
		public AmbiguousKeywordContext ambiguousKeyword(int i) {
			return getRuleContext(AmbiguousKeywordContext.class,i);
		}
		public CertainIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certainIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterCertainIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitCertainIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitCertainIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CertainIdentifierContext certainIdentifier() throws RecognitionException {
		CertainIdentifierContext _localctx = new CertainIdentifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_certainIdentifier);
		try {
			int _alt;
			setState(2564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2549);
				match(IDENTIFIER);
				setState(2554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,430,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(2552);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ACCESS:
						case ADDRESSOF:
						case ALIAS:
						case AND:
						case ATTRIBUTE:
						case APPACTIVATE:
						case APPEND:
						case AS:
						case BEGIN:
						case BEEP:
						case BINARY:
						case BOOLEAN:
						case BYVAL:
						case BYREF:
						case BYTE:
						case CALL:
						case CASE:
						case CHDIR:
						case CHDRIVE:
						case CLASS:
						case CLOSE:
						case COLLECTION:
						case CONST:
						case DATABASE:
						case DATE:
						case DECLARE:
						case DEFBOOL:
						case DEFBYTE:
						case DEFDATE:
						case DEFDBL:
						case DEFDEC:
						case DEFCUR:
						case DEFINT:
						case DEFLNG:
						case DEFOBJ:
						case DEFSNG:
						case DEFSTR:
						case DEFVAR:
						case DELETESETTING:
						case DIM:
						case DO:
						case DOUBLE:
						case EACH:
						case ELSE:
						case ELSEIF:
						case END:
						case ENUM:
						case EQV:
						case ERASE:
						case ERROR:
						case EVENT:
						case FALSE:
						case FILECOPY:
						case FRIEND:
						case FOR:
						case FUNCTION:
						case GET:
						case GLOBAL:
						case GOSUB:
						case GOTO:
						case IF:
						case IMP:
						case IMPLEMENTS:
						case IN:
						case INPUT:
						case IS:
						case INTEGER:
						case KILL:
						case LOAD:
						case LOCK:
						case LONG:
						case LOOP:
						case LEN:
						case LET:
						case LIB:
						case LIKE:
						case LSET:
						case ME:
						case MID:
						case MKDIR:
						case MOD:
						case NAME:
						case NEXT:
						case NEW:
						case NOT:
						case NOTHING:
						case NULL:
						case ON:
						case OPEN:
						case OPTIONAL:
						case OR:
						case OUTPUT:
						case PARAMARRAY:
						case PRESERVE:
						case PRINT:
						case PRIVATE:
						case PUBLIC:
						case PUT:
						case RANDOM:
						case RANDOMIZE:
						case RAISEEVENT:
						case READ:
						case REDIM:
						case REM:
						case RESET:
						case RESUME:
						case RETURN:
						case RMDIR:
						case RSET:
						case SAVEPICTURE:
						case SAVESETTING:
						case SEEK:
						case SELECT:
						case SENDKEYS:
						case SET:
						case SETATTR:
						case SHARED:
						case SINGLE:
						case SPC:
						case STATIC:
						case STEP:
						case STOP:
						case STRING:
						case SUB:
						case TAB:
						case TEXT:
						case THEN:
						case TIME:
						case TO:
						case TRUE:
						case TYPE:
						case TYPEOF:
						case UNLOAD:
						case UNLOCK:
						case UNTIL:
						case VARIANT:
						case VERSION:
						case WEND:
						case WHILE:
						case WIDTH:
						case WITH:
						case WITHEVENTS:
						case WRITE:
						case XOR:
							{
							setState(2550);
							ambiguousKeyword();
							}
							break;
						case IDENTIFIER:
							{
							setState(2551);
							match(IDENTIFIER);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(2556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,430,_ctx);
				}
				}
				break;
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPACTIVATE:
			case APPEND:
			case AS:
			case BEGIN:
			case BEEP:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CALL:
			case CASE:
			case CHDIR:
			case CHDRIVE:
			case CLASS:
			case CLOSE:
			case COLLECTION:
			case CONST:
			case DATABASE:
			case DATE:
			case DECLARE:
			case DEFBOOL:
			case DEFBYTE:
			case DEFDATE:
			case DEFDBL:
			case DEFDEC:
			case DEFCUR:
			case DEFINT:
			case DEFLNG:
			case DEFOBJ:
			case DEFSNG:
			case DEFSTR:
			case DEFVAR:
			case DELETESETTING:
			case DIM:
			case DO:
			case DOUBLE:
			case EACH:
			case ELSE:
			case ELSEIF:
			case END:
			case ENUM:
			case EQV:
			case ERASE:
			case ERROR:
			case EVENT:
			case FALSE:
			case FILECOPY:
			case FRIEND:
			case FOR:
			case FUNCTION:
			case GET:
			case GLOBAL:
			case GOSUB:
			case GOTO:
			case IF:
			case IMP:
			case IMPLEMENTS:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case KILL:
			case LOAD:
			case LOCK:
			case LONG:
			case LOOP:
			case LEN:
			case LET:
			case LIB:
			case LIKE:
			case LSET:
			case ME:
			case MID:
			case MKDIR:
			case MOD:
			case NAME:
			case NEXT:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PRIVATE:
			case PUBLIC:
			case PUT:
			case RANDOM:
			case RANDOMIZE:
			case RAISEEVENT:
			case READ:
			case REDIM:
			case REM:
			case RESET:
			case RESUME:
			case RETURN:
			case RMDIR:
			case RSET:
			case SAVEPICTURE:
			case SAVESETTING:
			case SEEK:
			case SELECT:
			case SENDKEYS:
			case SET:
			case SETATTR:
			case SHARED:
			case SINGLE:
			case SPC:
			case STATIC:
			case STEP:
			case STOP:
			case STRING:
			case SUB:
			case TAB:
			case TEXT:
			case THEN:
			case TIME:
			case TO:
			case TRUE:
			case TYPE:
			case TYPEOF:
			case UNLOAD:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WEND:
			case WHILE:
			case WIDTH:
			case WITH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2557);
				ambiguousKeyword();
				setState(2560); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(2560);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ACCESS:
						case ADDRESSOF:
						case ALIAS:
						case AND:
						case ATTRIBUTE:
						case APPACTIVATE:
						case APPEND:
						case AS:
						case BEGIN:
						case BEEP:
						case BINARY:
						case BOOLEAN:
						case BYVAL:
						case BYREF:
						case BYTE:
						case CALL:
						case CASE:
						case CHDIR:
						case CHDRIVE:
						case CLASS:
						case CLOSE:
						case COLLECTION:
						case CONST:
						case DATABASE:
						case DATE:
						case DECLARE:
						case DEFBOOL:
						case DEFBYTE:
						case DEFDATE:
						case DEFDBL:
						case DEFDEC:
						case DEFCUR:
						case DEFINT:
						case DEFLNG:
						case DEFOBJ:
						case DEFSNG:
						case DEFSTR:
						case DEFVAR:
						case DELETESETTING:
						case DIM:
						case DO:
						case DOUBLE:
						case EACH:
						case ELSE:
						case ELSEIF:
						case END:
						case ENUM:
						case EQV:
						case ERASE:
						case ERROR:
						case EVENT:
						case FALSE:
						case FILECOPY:
						case FRIEND:
						case FOR:
						case FUNCTION:
						case GET:
						case GLOBAL:
						case GOSUB:
						case GOTO:
						case IF:
						case IMP:
						case IMPLEMENTS:
						case IN:
						case INPUT:
						case IS:
						case INTEGER:
						case KILL:
						case LOAD:
						case LOCK:
						case LONG:
						case LOOP:
						case LEN:
						case LET:
						case LIB:
						case LIKE:
						case LSET:
						case ME:
						case MID:
						case MKDIR:
						case MOD:
						case NAME:
						case NEXT:
						case NEW:
						case NOT:
						case NOTHING:
						case NULL:
						case ON:
						case OPEN:
						case OPTIONAL:
						case OR:
						case OUTPUT:
						case PARAMARRAY:
						case PRESERVE:
						case PRINT:
						case PRIVATE:
						case PUBLIC:
						case PUT:
						case RANDOM:
						case RANDOMIZE:
						case RAISEEVENT:
						case READ:
						case REDIM:
						case REM:
						case RESET:
						case RESUME:
						case RETURN:
						case RMDIR:
						case RSET:
						case SAVEPICTURE:
						case SAVESETTING:
						case SEEK:
						case SELECT:
						case SENDKEYS:
						case SET:
						case SETATTR:
						case SHARED:
						case SINGLE:
						case SPC:
						case STATIC:
						case STEP:
						case STOP:
						case STRING:
						case SUB:
						case TAB:
						case TEXT:
						case THEN:
						case TIME:
						case TO:
						case TRUE:
						case TYPE:
						case TYPEOF:
						case UNLOAD:
						case UNLOCK:
						case UNTIL:
						case VARIANT:
						case VERSION:
						case WEND:
						case WHILE:
						case WIDTH:
						case WITH:
						case WITHEVENTS:
						case WRITE:
						case XOR:
							{
							setState(2558);
							ambiguousKeyword();
							}
							break;
						case IDENTIFIER:
							{
							setState(2559);
							match(IDENTIFIER);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2562); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,432,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(vbaParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(vbaParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(vbaParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(vbaParser.GEQ, 0); }
		public TerminalNode EQ() { return getToken(vbaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(vbaParser.NEQ, 0); }
		public TerminalNode IS() { return getToken(vbaParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(vbaParser.LIKE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==LIKE || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (EQ - 189)) | (1L << (GEQ - 189)) | (1L << (GT - 189)) | (1L << (LEQ - 189)) | (1L << (LT - 189)) | (1L << (NEQ - 189)))) != 0)) ) {
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

	public static class ComplexTypeContext extends ParserRuleContext {
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_complexType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			ambiguousIdentifier();
			setState(2573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,434,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2569);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==T__4) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2570);
					ambiguousIdentifier();
					}
					} 
				}
				setState(2575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,434,_ctx);
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

	public static class FieldLengthContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(vbaParser.MULT, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(vbaParser.INTEGERLITERAL, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode WS() { return getToken(vbaParser.WS, 0); }
		public FieldLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterFieldLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitFieldLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitFieldLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldLengthContext fieldLength() throws RecognitionException {
		FieldLengthContext _localctx = new FieldLengthContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_fieldLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2576);
			match(MULT);
			setState(2578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2577);
				match(WS);
				}
			}

			setState(2582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGERLITERAL:
				{
				setState(2580);
				match(INTEGERLITERAL);
				}
				break;
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPACTIVATE:
			case APPEND:
			case AS:
			case BEGIN:
			case BEEP:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CALL:
			case CASE:
			case CHDIR:
			case CHDRIVE:
			case CLASS:
			case CLOSE:
			case COLLECTION:
			case CONST:
			case DATABASE:
			case DATE:
			case DECLARE:
			case DEFBOOL:
			case DEFBYTE:
			case DEFDATE:
			case DEFDBL:
			case DEFDEC:
			case DEFCUR:
			case DEFINT:
			case DEFLNG:
			case DEFOBJ:
			case DEFSNG:
			case DEFSTR:
			case DEFVAR:
			case DELETESETTING:
			case DIM:
			case DO:
			case DOUBLE:
			case EACH:
			case ELSE:
			case ELSEIF:
			case END:
			case ENUM:
			case EQV:
			case ERASE:
			case ERROR:
			case EVENT:
			case FALSE:
			case FILECOPY:
			case FRIEND:
			case FOR:
			case FUNCTION:
			case GET:
			case GLOBAL:
			case GOSUB:
			case GOTO:
			case IF:
			case IMP:
			case IMPLEMENTS:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case KILL:
			case LOAD:
			case LOCK:
			case LONG:
			case LOOP:
			case LEN:
			case LET:
			case LIB:
			case LIKE:
			case LSET:
			case ME:
			case MID:
			case MKDIR:
			case MOD:
			case NAME:
			case NEXT:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PRIVATE:
			case PUBLIC:
			case PUT:
			case RANDOM:
			case RANDOMIZE:
			case RAISEEVENT:
			case READ:
			case REDIM:
			case REM:
			case RESET:
			case RESUME:
			case RETURN:
			case RMDIR:
			case RSET:
			case SAVEPICTURE:
			case SAVESETTING:
			case SEEK:
			case SELECT:
			case SENDKEYS:
			case SET:
			case SETATTR:
			case SHARED:
			case SINGLE:
			case SPC:
			case STATIC:
			case STEP:
			case STOP:
			case STRING:
			case SUB:
			case TAB:
			case TEXT:
			case THEN:
			case TIME:
			case TO:
			case TRUE:
			case TYPE:
			case TYPEOF:
			case UNLOAD:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WEND:
			case WHILE:
			case WIDTH:
			case WITH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
			case IDENTIFIER:
				{
				setState(2581);
				ambiguousIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LetterrangeContext extends ParserRuleContext {
		public List<CertainIdentifierContext> certainIdentifier() {
			return getRuleContexts(CertainIdentifierContext.class);
		}
		public CertainIdentifierContext certainIdentifier(int i) {
			return getRuleContext(CertainIdentifierContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(vbaParser.MINUS, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public LetterrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letterrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterLetterrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitLetterrange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitLetterrange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterrangeContext letterrange() throws RecognitionException {
		LetterrangeContext _localctx = new LetterrangeContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_letterrange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			certainIdentifier();
			setState(2593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,439,_ctx) ) {
			case 1:
				{
				setState(2586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2585);
					match(WS);
					}
				}

				setState(2588);
				match(MINUS);
				setState(2590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2589);
					match(WS);
					}
				}

				setState(2592);
				certainIdentifier();
				}
				break;
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

	public static class LineLabelContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vbaParser.COLON, 0); }
		public LineLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterLineLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitLineLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitLineLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineLabelContext lineLabel() throws RecognitionException {
		LineLabelContext _localctx = new LineLabelContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_lineLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2595);
			ambiguousIdentifier();
			setState(2596);
			match(COLON);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode HEXLITERAL() { return getToken(vbaParser.HEXLITERAL, 0); }
		public TerminalNode OCTLITERAL() { return getToken(vbaParser.OCTLITERAL, 0); }
		public TerminalNode DATELITERAL() { return getToken(vbaParser.DATELITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(vbaParser.DOUBLELITERAL, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(vbaParser.INTEGERLITERAL, 0); }
		public TerminalNode SHORTLITERAL() { return getToken(vbaParser.SHORTLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(vbaParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(vbaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(vbaParser.FALSE, 0); }
		public TerminalNode NOTHING() { return getToken(vbaParser.NOTHING, 0); }
		public TerminalNode NULL() { return getToken(vbaParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (FALSE - 73)) | (1L << (NOTHING - 73)) | (1L << (NULL - 73)))) != 0) || ((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (TRUE - 171)) | (1L << (STRINGLITERAL - 171)) | (1L << (OCTLITERAL - 171)) | (1L << (HEXLITERAL - 171)) | (1L << (SHORTLITERAL - 171)) | (1L << (INTEGERLITERAL - 171)) | (1L << (DOUBLELITERAL - 171)) | (1L << (DATELITERAL - 171)))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(vbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,440,_ctx) ) {
			case 1:
				{
				setState(2600);
				baseType();
				}
				break;
			case 2:
				{
				setState(2601);
				complexType();
				}
				break;
			}
			setState(2612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,443,_ctx) ) {
			case 1:
				{
				setState(2605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2604);
					match(WS);
					}
				}

				setState(2607);
				match(LPAREN);
				setState(2609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2608);
					match(WS);
					}
				}

				setState(2611);
				match(RPAREN);
				}
				break;
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

	public static class TypeHintContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(vbaParser.AMPERSAND, 0); }
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitTypeHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_typeHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2614);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) ) {
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

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(vbaParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(vbaParser.PUBLIC, 0); }
		public TerminalNode FRIEND() { return getToken(vbaParser.FRIEND, 0); }
		public TerminalNode GLOBAL() { return getToken(vbaParser.GLOBAL, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitVisibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2616);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FRIEND - 75)) | (1L << (GLOBAL - 75)) | (1L << (PRIVATE - 75)) | (1L << (PUBLIC - 75)))) != 0)) ) {
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

	public static class AmbiguousKeywordContext extends ParserRuleContext {
		public TerminalNode ACCESS() { return getToken(vbaParser.ACCESS, 0); }
		public TerminalNode ADDRESSOF() { return getToken(vbaParser.ADDRESSOF, 0); }
		public TerminalNode ALIAS() { return getToken(vbaParser.ALIAS, 0); }
		public TerminalNode AND() { return getToken(vbaParser.AND, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(vbaParser.ATTRIBUTE, 0); }
		public TerminalNode APPACTIVATE() { return getToken(vbaParser.APPACTIVATE, 0); }
		public TerminalNode APPEND() { return getToken(vbaParser.APPEND, 0); }
		public TerminalNode AS() { return getToken(vbaParser.AS, 0); }
		public TerminalNode BEEP() { return getToken(vbaParser.BEEP, 0); }
		public TerminalNode BEGIN() { return getToken(vbaParser.BEGIN, 0); }
		public TerminalNode BINARY() { return getToken(vbaParser.BINARY, 0); }
		public TerminalNode BOOLEAN() { return getToken(vbaParser.BOOLEAN, 0); }
		public TerminalNode BYVAL() { return getToken(vbaParser.BYVAL, 0); }
		public TerminalNode BYREF() { return getToken(vbaParser.BYREF, 0); }
		public TerminalNode BYTE() { return getToken(vbaParser.BYTE, 0); }
		public TerminalNode CALL() { return getToken(vbaParser.CALL, 0); }
		public TerminalNode CASE() { return getToken(vbaParser.CASE, 0); }
		public TerminalNode CLASS() { return getToken(vbaParser.CLASS, 0); }
		public TerminalNode CLOSE() { return getToken(vbaParser.CLOSE, 0); }
		public TerminalNode CHDIR() { return getToken(vbaParser.CHDIR, 0); }
		public TerminalNode CHDRIVE() { return getToken(vbaParser.CHDRIVE, 0); }
		public TerminalNode COLLECTION() { return getToken(vbaParser.COLLECTION, 0); }
		public TerminalNode CONST() { return getToken(vbaParser.CONST, 0); }
		public TerminalNode DATABASE() { return getToken(vbaParser.DATABASE, 0); }
		public TerminalNode DATE() { return getToken(vbaParser.DATE, 0); }
		public TerminalNode DECLARE() { return getToken(vbaParser.DECLARE, 0); }
		public TerminalNode DEFBOOL() { return getToken(vbaParser.DEFBOOL, 0); }
		public TerminalNode DEFBYTE() { return getToken(vbaParser.DEFBYTE, 0); }
		public TerminalNode DEFCUR() { return getToken(vbaParser.DEFCUR, 0); }
		public TerminalNode DEFDBL() { return getToken(vbaParser.DEFDBL, 0); }
		public TerminalNode DEFDATE() { return getToken(vbaParser.DEFDATE, 0); }
		public TerminalNode DEFDEC() { return getToken(vbaParser.DEFDEC, 0); }
		public TerminalNode DEFINT() { return getToken(vbaParser.DEFINT, 0); }
		public TerminalNode DEFLNG() { return getToken(vbaParser.DEFLNG, 0); }
		public TerminalNode DEFOBJ() { return getToken(vbaParser.DEFOBJ, 0); }
		public TerminalNode DEFSNG() { return getToken(vbaParser.DEFSNG, 0); }
		public TerminalNode DEFSTR() { return getToken(vbaParser.DEFSTR, 0); }
		public TerminalNode DEFVAR() { return getToken(vbaParser.DEFVAR, 0); }
		public TerminalNode DELETESETTING() { return getToken(vbaParser.DELETESETTING, 0); }
		public TerminalNode DIM() { return getToken(vbaParser.DIM, 0); }
		public TerminalNode DO() { return getToken(vbaParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(vbaParser.DOUBLE, 0); }
		public TerminalNode EACH() { return getToken(vbaParser.EACH, 0); }
		public TerminalNode ELSE() { return getToken(vbaParser.ELSE, 0); }
		public TerminalNode ELSEIF() { return getToken(vbaParser.ELSEIF, 0); }
		public TerminalNode END() { return getToken(vbaParser.END, 0); }
		public TerminalNode ENUM() { return getToken(vbaParser.ENUM, 0); }
		public TerminalNode EQV() { return getToken(vbaParser.EQV, 0); }
		public TerminalNode ERASE() { return getToken(vbaParser.ERASE, 0); }
		public TerminalNode ERROR() { return getToken(vbaParser.ERROR, 0); }
		public TerminalNode EVENT() { return getToken(vbaParser.EVENT, 0); }
		public TerminalNode FALSE() { return getToken(vbaParser.FALSE, 0); }
		public TerminalNode FILECOPY() { return getToken(vbaParser.FILECOPY, 0); }
		public TerminalNode FRIEND() { return getToken(vbaParser.FRIEND, 0); }
		public TerminalNode FOR() { return getToken(vbaParser.FOR, 0); }
		public TerminalNode FUNCTION() { return getToken(vbaParser.FUNCTION, 0); }
		public TerminalNode GET() { return getToken(vbaParser.GET, 0); }
		public TerminalNode GLOBAL() { return getToken(vbaParser.GLOBAL, 0); }
		public TerminalNode GOSUB() { return getToken(vbaParser.GOSUB, 0); }
		public TerminalNode GOTO() { return getToken(vbaParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(vbaParser.IF, 0); }
		public TerminalNode IMP() { return getToken(vbaParser.IMP, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(vbaParser.IMPLEMENTS, 0); }
		public TerminalNode IN() { return getToken(vbaParser.IN, 0); }
		public TerminalNode INPUT() { return getToken(vbaParser.INPUT, 0); }
		public TerminalNode IS() { return getToken(vbaParser.IS, 0); }
		public TerminalNode INTEGER() { return getToken(vbaParser.INTEGER, 0); }
		public TerminalNode KILL() { return getToken(vbaParser.KILL, 0); }
		public TerminalNode LOAD() { return getToken(vbaParser.LOAD, 0); }
		public TerminalNode LOCK() { return getToken(vbaParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(vbaParser.LONG, 0); }
		public TerminalNode LOOP() { return getToken(vbaParser.LOOP, 0); }
		public TerminalNode LEN() { return getToken(vbaParser.LEN, 0); }
		public TerminalNode LET() { return getToken(vbaParser.LET, 0); }
		public TerminalNode LIB() { return getToken(vbaParser.LIB, 0); }
		public TerminalNode LIKE() { return getToken(vbaParser.LIKE, 0); }
		public TerminalNode LSET() { return getToken(vbaParser.LSET, 0); }
		public TerminalNode ME() { return getToken(vbaParser.ME, 0); }
		public TerminalNode MID() { return getToken(vbaParser.MID, 0); }
		public TerminalNode MKDIR() { return getToken(vbaParser.MKDIR, 0); }
		public TerminalNode MOD() { return getToken(vbaParser.MOD, 0); }
		public TerminalNode NAME() { return getToken(vbaParser.NAME, 0); }
		public TerminalNode NEXT() { return getToken(vbaParser.NEXT, 0); }
		public TerminalNode NEW() { return getToken(vbaParser.NEW, 0); }
		public TerminalNode NOT() { return getToken(vbaParser.NOT, 0); }
		public TerminalNode NOTHING() { return getToken(vbaParser.NOTHING, 0); }
		public TerminalNode NULL() { return getToken(vbaParser.NULL, 0); }
		public TerminalNode ON() { return getToken(vbaParser.ON, 0); }
		public TerminalNode OPEN() { return getToken(vbaParser.OPEN, 0); }
		public TerminalNode OPTIONAL() { return getToken(vbaParser.OPTIONAL, 0); }
		public TerminalNode OR() { return getToken(vbaParser.OR, 0); }
		public TerminalNode OUTPUT() { return getToken(vbaParser.OUTPUT, 0); }
		public TerminalNode PARAMARRAY() { return getToken(vbaParser.PARAMARRAY, 0); }
		public TerminalNode PRESERVE() { return getToken(vbaParser.PRESERVE, 0); }
		public TerminalNode PRINT() { return getToken(vbaParser.PRINT, 0); }
		public TerminalNode PRIVATE() { return getToken(vbaParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(vbaParser.PUBLIC, 0); }
		public TerminalNode PUT() { return getToken(vbaParser.PUT, 0); }
		public TerminalNode RANDOM() { return getToken(vbaParser.RANDOM, 0); }
		public TerminalNode RANDOMIZE() { return getToken(vbaParser.RANDOMIZE, 0); }
		public TerminalNode RAISEEVENT() { return getToken(vbaParser.RAISEEVENT, 0); }
		public TerminalNode READ() { return getToken(vbaParser.READ, 0); }
		public TerminalNode REDIM() { return getToken(vbaParser.REDIM, 0); }
		public TerminalNode REM() { return getToken(vbaParser.REM, 0); }
		public TerminalNode RESET() { return getToken(vbaParser.RESET, 0); }
		public TerminalNode RESUME() { return getToken(vbaParser.RESUME, 0); }
		public TerminalNode RETURN() { return getToken(vbaParser.RETURN, 0); }
		public TerminalNode RMDIR() { return getToken(vbaParser.RMDIR, 0); }
		public TerminalNode RSET() { return getToken(vbaParser.RSET, 0); }
		public TerminalNode SAVEPICTURE() { return getToken(vbaParser.SAVEPICTURE, 0); }
		public TerminalNode SAVESETTING() { return getToken(vbaParser.SAVESETTING, 0); }
		public TerminalNode SEEK() { return getToken(vbaParser.SEEK, 0); }
		public TerminalNode SELECT() { return getToken(vbaParser.SELECT, 0); }
		public TerminalNode SENDKEYS() { return getToken(vbaParser.SENDKEYS, 0); }
		public TerminalNode SET() { return getToken(vbaParser.SET, 0); }
		public TerminalNode SETATTR() { return getToken(vbaParser.SETATTR, 0); }
		public TerminalNode SHARED() { return getToken(vbaParser.SHARED, 0); }
		public TerminalNode SINGLE() { return getToken(vbaParser.SINGLE, 0); }
		public TerminalNode SPC() { return getToken(vbaParser.SPC, 0); }
		public TerminalNode STATIC() { return getToken(vbaParser.STATIC, 0); }
		public TerminalNode STEP() { return getToken(vbaParser.STEP, 0); }
		public TerminalNode STOP() { return getToken(vbaParser.STOP, 0); }
		public TerminalNode STRING() { return getToken(vbaParser.STRING, 0); }
		public TerminalNode SUB() { return getToken(vbaParser.SUB, 0); }
		public TerminalNode TAB() { return getToken(vbaParser.TAB, 0); }
		public TerminalNode TEXT() { return getToken(vbaParser.TEXT, 0); }
		public TerminalNode THEN() { return getToken(vbaParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(vbaParser.TIME, 0); }
		public TerminalNode TO() { return getToken(vbaParser.TO, 0); }
		public TerminalNode TRUE() { return getToken(vbaParser.TRUE, 0); }
		public TerminalNode TYPE() { return getToken(vbaParser.TYPE, 0); }
		public TerminalNode TYPEOF() { return getToken(vbaParser.TYPEOF, 0); }
		public TerminalNode UNLOAD() { return getToken(vbaParser.UNLOAD, 0); }
		public TerminalNode UNLOCK() { return getToken(vbaParser.UNLOCK, 0); }
		public TerminalNode UNTIL() { return getToken(vbaParser.UNTIL, 0); }
		public TerminalNode VARIANT() { return getToken(vbaParser.VARIANT, 0); }
		public TerminalNode VERSION() { return getToken(vbaParser.VERSION, 0); }
		public TerminalNode WEND() { return getToken(vbaParser.WEND, 0); }
		public TerminalNode WHILE() { return getToken(vbaParser.WHILE, 0); }
		public TerminalNode WIDTH() { return getToken(vbaParser.WIDTH, 0); }
		public TerminalNode WITH() { return getToken(vbaParser.WITH, 0); }
		public TerminalNode WITHEVENTS() { return getToken(vbaParser.WITHEVENTS, 0); }
		public TerminalNode WRITE() { return getToken(vbaParser.WRITE, 0); }
		public TerminalNode XOR() { return getToken(vbaParser.XOR, 0); }
		public AmbiguousKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterAmbiguousKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitAmbiguousKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitAmbiguousKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousKeywordContext ambiguousKeyword() throws RecognitionException {
		AmbiguousKeywordContext _localctx = new AmbiguousKeywordContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_ambiguousKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2618);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << AS) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << ELSE) | (1L << ELSEIF) | (1L << END) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)) | (1L << (WITHEVENTS - 128)) | (1L << (WRITE - 128)) | (1L << (XOR - 128)))) != 0)) ) {
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

	public static class RemCommentContext extends ParserRuleContext {
		public TerminalNode REMCOMMENT() { return getToken(vbaParser.REMCOMMENT, 0); }
		public RemCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterRemComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitRemComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitRemComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemCommentContext remComment() throws RecognitionException {
		RemCommentContext _localctx = new RemCommentContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_remComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2620);
			match(REMCOMMENT);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(vbaParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			match(COMMENT);
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

	public static class EndOfLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(vbaParser.NEWLINE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public RemCommentContext remComment() {
			return getRuleContext(RemCommentContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public EndOfLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterEndOfLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitEndOfLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitEndOfLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfLineContext endOfLine() throws RecognitionException {
		EndOfLineContext _localctx = new EndOfLineContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_endOfLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2624);
				match(WS);
				}
			}

			setState(2630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(2627);
				match(NEWLINE);
				}
				break;
			case COMMENT:
				{
				setState(2628);
				comment();
				}
				break;
			case REMCOMMENT:
				{
				setState(2629);
				remComment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,446,_ctx) ) {
			case 1:
				{
				setState(2632);
				match(WS);
				}
				break;
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

	public static class EndOfStatementContext extends ParserRuleContext {
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(vbaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(vbaParser.COLON, i);
		}
		public List<TerminalNode> WS() { return getTokens(vbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(vbaParser.WS, i);
		}
		public EndOfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).enterEndOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vbaListener ) ((vbaListener)listener).exitEndOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vbaVisitor ) return ((vbaVisitor<? extends T>)visitor).visitEndOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfStatementContext endOfStatement() throws RecognitionException {
		EndOfStatementContext _localctx = new EndOfStatementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_endOfStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,450,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2643);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,449,_ctx) ) {
					case 1:
						{
						setState(2635);
						endOfLine();
						}
						break;
					case 2:
						{
						setState(2637);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2636);
							match(WS);
							}
						}

						setState(2639);
						match(COLON);
						setState(2641);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,448,_ctx) ) {
						case 1:
							{
							setState(2640);
							match(WS);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,450,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 100:
			return valueStmt_sempred((ValueStmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean valueStmt_sempred(ValueStmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00de\u0a5b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\3\2\3\2\3\2\3\3\5\3\u012d\n\3\3\3\7\3"+
		"\u0130\n\3\f\3\16\3\u0133\13\3\3\3\3\3\7\3\u0137\n\3\f\3\16\3\u013a\13"+
		"\3\5\3\u013c\n\3\3\3\5\3\u013f\n\3\3\3\7\3\u0142\n\3\f\3\16\3\u0145\13"+
		"\3\3\3\5\3\u0148\n\3\3\3\7\3\u014b\n\3\f\3\16\3\u014e\13\3\3\3\5\3\u0151"+
		"\n\3\3\3\7\3\u0154\n\3\f\3\16\3\u0157\13\3\3\3\5\3\u015a\n\3\3\3\7\3\u015d"+
		"\n\3\f\3\16\3\u0160\13\3\3\3\5\3\u0163\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\7\5\u016d\n\5\f\5\16\5\u0170\13\5\3\5\6\5\u0173\n\5\r\5\16\5\u0174"+
		"\3\5\3\5\3\6\3\6\5\6\u017b\n\6\3\6\3\6\5\6\u017f\n\6\3\6\3\6\7\6\u0183"+
		"\n\6\f\6\16\6\u0186\13\6\3\7\3\7\6\7\u018a\n\7\r\7\16\7\u018b\6\7\u018e"+
		"\n\7\r\7\16\7\u018f\3\b\3\b\6\b\u0194\n\b\r\b\16\b\u0195\3\b\3\b\7\b\u019a"+
		"\n\b\f\b\16\b\u019d\13\b\3\b\7\b\u01a0\n\b\f\b\16\b\u01a3\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01ad\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u01b9\n\n\3\13\3\13\5\13\u01bd\n\13\3\f\3\f\6\f\u01c1\n\f"+
		"\r\f\16\f\u01c2\3\f\3\f\7\f\u01c7\n\f\f\f\16\f\u01ca\13\f\3\f\7\f\u01cd"+
		"\n\f\f\f\16\f\u01d0\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01d8\n\r\3\16\3"+
		"\16\3\16\3\16\5\16\u01de\n\16\3\16\3\16\5\16\u01e2\n\16\3\16\3\16\5\16"+
		"\u01e6\n\16\3\16\3\16\5\16\u01ea\n\16\3\16\7\16\u01ed\n\16\f\16\16\16"+
		"\u01f0\13\16\3\17\3\17\3\17\3\17\7\17\u01f6\n\17\f\17\16\17\u01f9\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0241\n\20\3\21\3\21\3\21\3\21\5\21\u0247\n\21\3\21\3\21\5\21\u024b"+
		"\n\21\3\21\5\21\u024e\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u025e\n\25\3\25\3\25\5\25\u0262\n\25\3"+
		"\25\7\25\u0265\n\25\f\25\16\25\u0268\13\25\5\25\u026a\n\25\3\26\3\26\3"+
		"\26\5\26\u026f\n\26\3\26\3\26\3\26\3\26\5\26\u0275\n\26\3\26\3\26\5\26"+
		"\u0279\n\26\3\26\7\26\u027c\n\26\f\26\16\26\u027f\13\26\3\27\3\27\5\27"+
		"\u0283\n\27\3\27\3\27\5\27\u0287\n\27\3\27\5\27\u028a\n\27\3\27\3\27\5"+
		"\27\u028e\n\27\3\27\3\27\3\30\3\30\5\30\u0294\n\30\3\30\3\30\5\30\u0298"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\5\31\u029f\n\31\3\31\3\31\3\31\3\31\5\31"+
		"\u02a5\n\31\3\31\3\31\5\31\u02a9\n\31\3\31\5\31\u02ac\n\31\3\31\3\31\3"+
		"\31\5\31\u02b1\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02bb"+
		"\n\31\3\31\5\31\u02be\n\31\3\31\5\31\u02c1\n\31\3\31\3\31\5\31\u02c5\n"+
		"\31\3\32\3\32\3\32\3\32\5\32\u02cb\n\32\3\32\3\32\5\32\u02cf\n\32\3\32"+
		"\7\32\u02d2\n\32\f\32\16\32\u02d5\13\32\3\33\3\33\3\33\3\33\5\33\u02db"+
		"\n\33\3\33\3\33\5\33\u02df\n\33\3\33\3\33\5\33\u02e3\n\33\3\33\3\33\5"+
		"\33\u02e7\n\33\3\33\5\33\u02ea\n\33\3\34\3\34\3\34\5\34\u02ef\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u02fa\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0307\n\34\3\35\3\35\3\36"+
		"\3\36\3\36\5\36\u030e\n\36\3\36\3\36\3\36\3\36\3\36\7\36\u0315\n\36\f"+
		"\36\16\36\u0318\13\36\3\36\3\36\3\37\3\37\5\37\u031e\n\37\3\37\3\37\5"+
		"\37\u0322\n\37\3\37\5\37\u0325\n\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u032e"+
		"\n \3 \7 \u0331\n \f \16 \u0334\13 \3!\3!\3!\3!\3\"\3\"\3\"\5\"\u033d"+
		"\n\"\3\"\3\"\3\"\3\"\5\"\u0343\n\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u034d"+
		"\n$\3$\3$\5$\u0351\n$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u035b\n%\3%\3%\3%\3%"+
		"\3%\3%\5%\u0363\n%\3%\3%\3%\5%\u0368\n%\3&\3&\3&\3&\5&\u036e\n&\3&\3&"+
		"\5&\u0372\n&\3&\5&\u0375\n&\3&\3&\5&\u0379\n&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\5&\u0384\n&\3&\3&\5&\u0388\n&\3&\3&\3&\5&\u038d\n&\3\'\3\'\3\'\5\'"+
		"\u0392\n\'\3\'\3\'\5\'\u0396\n\'\3\'\3\'\5\'\u039a\n\'\3\'\3\'\5\'\u039e"+
		"\n\'\3\'\5\'\u03a1\n\'\3\'\5\'\u03a4\n\'\3\'\5\'\u03a7\n\'\3\'\5\'\u03aa"+
		"\n\'\3\'\3\'\5\'\u03ae\n\'\3\'\3\'\3(\3(\3(\3(\5(\u03b6\n(\3(\3(\5(\u03ba"+
		"\n(\3(\5(\u03bd\n(\3(\5(\u03c0\n(\3(\3(\5(\u03c4\n(\3(\3(\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u03db\n+\3+\3+\7+\u03df"+
		"\n+\f+\16+\u03e2\13+\3+\5+\u03e5\n+\3+\3+\5+\u03e9\n+\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u03f2\n,\3-\3-\3.\3.\3.\3.\3.\3.\3.\5.\u03fd\n.\3/\3/\3/\5/\u0402"+
		"\n/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u040c\n\61\3\61\3\61"+
		"\5\61\u0410\n\61\3\61\6\61\u0413\n\61\r\61\16\61\u0414\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\5\63\u041d\n\63\3\63\3\63\5\63\u0421\n\63\3\63\3\63\5"+
		"\63\u0425\n\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u042d\n\64\3\64\3\64"+
		"\5\64\u0431\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66"+
		"\u043d\n\66\3\66\3\66\5\66\u0441\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u0448"+
		"\n\66\5\66\u044a\n\66\3\67\3\67\3\67\3\67\5\67\u0450\n\67\3\67\3\67\5"+
		"\67\u0454\n\67\3\67\3\67\38\38\58\u045a\n8\38\38\58\u045e\n8\38\38\58"+
		"\u0462\n8\38\38\39\39\79\u0468\n9\f9\169\u046b\139\39\59\u046e\n9\39\3"+
		"9\3:\3:\5:\u0474\n:\3:\3:\3:\3:\3:\3:\3:\7:\u047d\n:\f:\16:\u0480\13:"+
		"\3;\3;\5;\u0484\n;\3;\3;\3;\3;\3;\3;\3;\7;\u048d\n;\f;\16;\u0490\13;\3"+
		"<\3<\3<\3<\3<\7<\u0497\n<\f<\16<\u049a\13<\3=\3=\5=\u049e\n=\3=\3=\5="+
		"\u04a2\n=\3=\3=\5=\u04a6\n=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04be\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u04c8"+
		"\nA\3A\3A\5A\u04cc\nA\3A\7A\u04cf\nA\fA\16A\u04d2\13A\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\5B\u04dc\nB\3B\3B\5B\u04e0\nB\3B\7B\u04e3\nB\fB\16B\u04e6\13B"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u04f3\nC\3C\3C\5C\u04f7\nC\3C\3C"+
		"\3C\3C\3C\3C\3C\5C\u0500\nC\3C\3C\5C\u0504\nC\3C\5C\u0507\nC\3D\3D\5D"+
		"\u050b\nD\3D\3D\5D\u050f\nD\3D\5D\u0512\nD\7D\u0514\nD\fD\16D\u0517\13"+
		"D\3D\5D\u051a\nD\3D\5D\u051d\nD\3D\3D\5D\u0521\nD\3D\5D\u0524\nD\6D\u0526"+
		"\nD\rD\16D\u0527\5D\u052a\nD\3E\3E\3E\5E\u052f\nE\3E\3E\5E\u0533\nE\3"+
		"E\3E\5E\u0537\nE\3E\3E\5E\u053b\nE\5E\u053d\nE\3F\3F\3F\3F\5F\u0543\n"+
		"F\3F\3F\5F\u0547\nF\3F\5F\u054a\nF\3G\3G\3G\5G\u054f\nG\3G\3G\5G\u0553"+
		"\nG\3G\3G\3G\3G\5G\u0559\nG\3G\5G\u055c\nG\3G\5G\u055f\nG\3G\3G\5G\u0563"+
		"\nG\3G\3G\5G\u0567\nG\3G\3G\3H\3H\3H\5H\u056e\nH\3H\3H\5H\u0572\nH\3H"+
		"\3H\3H\3H\5H\u0578\nH\3H\5H\u057b\nH\3H\3H\5H\u057f\nH\3H\3H\3I\3I\3I"+
		"\5I\u0586\nI\3I\3I\5I\u058a\nI\3I\3I\3I\3I\5I\u0590\nI\3I\5I\u0593\nI"+
		"\3I\3I\5I\u0597\nI\3I\3I\3J\3J\3J\3J\5J\u059f\nJ\3J\3J\5J\u05a3\nJ\3J"+
		"\5J\u05a6\nJ\3J\5J\u05a9\nJ\3J\3J\5J\u05ad\nJ\3J\3J\3K\3K\3K\3K\5K\u05b5"+
		"\nK\3K\3K\5K\u05b9\nK\3K\3K\5K\u05bd\nK\5K\u05bf\nK\3K\5K\u05c2\nK\3L"+
		"\3L\3L\5L\u05c7\nL\3M\3M\3M\3M\5M\u05cd\nM\3M\3M\5M\u05d1\nM\3M\3M\5M"+
		"\u05d5\nM\3M\7M\u05d8\nM\fM\16M\u05db\13M\3N\3N\5N\u05df\nN\3N\3N\5N\u05e3"+
		"\nN\3N\3N\5N\u05e7\nN\3N\3N\3N\5N\u05ec\nN\3O\3O\3P\3P\3P\3P\5P\u05f4"+
		"\nP\5P\u05f6\nP\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\5S\u0602\nS\3S\3S\5S\u0606"+
		"\nS\3S\3S\3T\3T\3T\3T\5T\u060e\nT\3T\3T\5T\u0612\nT\3T\3T\3U\3U\3U\3U"+
		"\5U\u061a\nU\3U\3U\5U\u061e\nU\3U\3U\5U\u0622\nU\3U\3U\5U\u0626\nU\3U"+
		"\3U\5U\u062a\nU\3U\3U\5U\u062e\nU\3U\3U\3V\3V\3V\3V\5V\u0636\nV\3V\3V"+
		"\5V\u063a\nV\3V\3V\3W\3W\3W\3W\3W\3W\3W\7W\u0645\nW\fW\16W\u0648\13W\3"+
		"W\3W\3X\3X\5X\u064e\nX\3X\3X\5X\u0652\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\5"+
		"X\u065d\nX\3Y\3Y\3Y\3Y\3Y\5Y\u0664\nY\3Z\3Z\3Z\5Z\u0669\nZ\3Z\3Z\5Z\u066d"+
		"\nZ\3Z\7Z\u0670\nZ\fZ\16Z\u0673\13Z\5Z\u0675\nZ\3[\3[\3[\3[\5[\u067b\n"+
		"[\3[\3[\5[\u067f\n[\3[\5[\u0682\n[\3\\\3\\\3\\\3\\\5\\\u0688\n\\\3\\\3"+
		"\\\5\\\u068c\n\\\3\\\3\\\3]\3]\3]\3]\5]\u0694\n]\3]\3]\5]\u0698\n]\3]"+
		"\3]\3^\3^\3_\3_\3_\5_\u06a1\n_\3_\3_\5_\u06a5\n_\3_\3_\5_\u06a9\n_\3_"+
		"\3_\5_\u06ad\n_\3_\5_\u06b0\n_\3_\3_\5_\u06b4\n_\3_\3_\3`\3`\5`\u06ba"+
		"\n`\3`\3`\5`\u06be\n`\3`\3`\3a\3a\3a\5a\u06c5\na\3a\3a\3a\3a\3a\7a\u06cc"+
		"\na\fa\16a\u06cf\13a\3a\3a\3b\3b\5b\u06d5\nb\3b\3b\5b\u06d9\nb\3b\5b\u06dc"+
		"\nb\3b\5b\u06df\nb\3b\5b\u06e2\nb\3b\3b\5b\u06e6\nb\3b\3b\3c\3c\3c\3c"+
		"\3c\3c\3c\5c\u06f1\nc\3d\3d\3d\3d\3e\3e\3e\3e\5e\u06fb\ne\3e\3e\5e\u06ff"+
		"\ne\3e\3e\3e\3e\3e\5e\u0706\ne\5e\u0708\ne\3f\3f\3f\3f\3f\5f\u070f\nf"+
		"\3f\3f\5f\u0713\nf\3f\3f\5f\u0717\nf\3f\7f\u071a\nf\ff\16f\u071d\13f\3"+
		"f\3f\3f\3f\5f\u0723\nf\3f\3f\3f\3f\3f\5f\u072a\nf\3f\3f\3f\5f\u072f\n"+
		"f\3f\3f\5f\u0733\nf\3f\3f\3f\3f\5f\u0739\nf\3f\3f\3f\5f\u073e\nf\3f\3"+
		"f\3f\5f\u0743\nf\3f\5f\u0746\nf\3f\3f\5f\u074a\nf\3f\3f\5f\u074e\nf\3"+
		"f\3f\3f\5f\u0753\nf\3f\3f\5f\u0757\nf\3f\3f\3f\5f\u075c\nf\3f\3f\5f\u0760"+
		"\nf\3f\3f\3f\5f\u0765\nf\3f\3f\5f\u0769\nf\3f\3f\3f\5f\u076e\nf\3f\3f"+
		"\5f\u0772\nf\3f\3f\3f\5f\u0777\nf\3f\3f\5f\u077b\nf\3f\3f\3f\5f\u0780"+
		"\nf\3f\3f\5f\u0784\nf\3f\3f\3f\5f\u0789\nf\3f\3f\5f\u078d\nf\3f\3f\3f"+
		"\5f\u0792\nf\3f\3f\5f\u0796\nf\3f\3f\3f\5f\u079b\nf\3f\3f\5f\u079f\nf"+
		"\3f\3f\3f\5f\u07a4\nf\3f\3f\5f\u07a8\nf\3f\3f\3f\5f\u07ad\nf\3f\3f\5f"+
		"\u07b1\nf\3f\3f\3f\5f\u07b6\nf\3f\3f\5f\u07ba\nf\3f\3f\3f\5f\u07bf\nf"+
		"\3f\3f\5f\u07c3\nf\3f\3f\3f\5f\u07c8\nf\3f\3f\5f\u07cc\nf\3f\3f\3f\5f"+
		"\u07d1\nf\3f\3f\5f\u07d5\nf\3f\3f\3f\5f\u07da\nf\3f\3f\5f\u07de\nf\3f"+
		"\3f\3f\5f\u07e3\nf\3f\3f\5f\u07e7\nf\3f\3f\3f\5f\u07ec\nf\3f\3f\5f\u07f0"+
		"\nf\3f\3f\3f\5f\u07f5\nf\3f\3f\5f\u07f9\nf\3f\7f\u07fc\nf\ff\16f\u07ff"+
		"\13f\3g\3g\3g\5g\u0804\ng\3g\3g\3g\5g\u0809\ng\3g\3g\3h\3h\5h\u080f\n"+
		"h\3h\3h\5h\u0813\nh\3h\7h\u0816\nh\fh\16h\u0819\13h\3i\3i\5i\u081d\ni"+
		"\3i\3i\5i\u0821\ni\3i\3i\5i\u0825\ni\5i\u0827\ni\3i\3i\5i\u082b\ni\5i"+
		"\u082d\ni\3i\5i\u0830\ni\3i\3i\5i\u0834\ni\3j\3j\3j\3j\3j\5j\u083b\nj"+
		"\3j\3j\3k\3k\3k\3k\5k\u0843\nk\3k\3k\5k\u0847\nk\3k\3k\3l\3l\3l\3l\3l"+
		"\3l\5l\u0851\nl\3l\3l\5l\u0855\nl\3l\3l\3m\3m\3m\3m\5m\u085d\nm\3m\3m"+
		"\5m\u0861\nm\3m\5m\u0864\nm\3n\5n\u0867\nn\3n\3n\3o\3o\5o\u086d\no\3p"+
		"\3p\3p\3p\5p\u0873\np\3p\5p\u0876\np\3p\3p\5p\u087a\np\3p\3p\5p\u087e"+
		"\np\3p\3p\5p\u0882\np\3p\5p\u0885\np\3p\3p\3p\3p\7p\u088b\np\fp\16p\u088e"+
		"\13p\3q\3q\3q\5q\u0893\nq\3q\3q\3q\5q\u0898\nq\3q\5q\u089b\nq\3q\3q\5"+
		"q\u089f\nq\3q\3q\5q\u08a3\nq\3q\3q\5q\u08a7\nq\3q\5q\u08aa\nq\3q\3q\3"+
		"q\3q\7q\u08b0\nq\fq\16q\u08b3\13q\3r\3r\5r\u08b7\nr\3s\5s\u08ba\ns\3s"+
		"\3s\3s\5s\u08bf\ns\3s\3s\5s\u08c3\ns\3s\5s\u08c6\ns\3s\5s\u08c9\ns\3s"+
		"\3s\3s\3s\7s\u08cf\ns\fs\16s\u08d2\13s\3t\3t\3t\5t\u08d7\nt\3t\5t\u08da"+
		"\nt\3t\3t\3t\3t\7t\u08e0\nt\ft\16t\u08e3\13t\3u\3u\3u\3u\5u\u08e9\nu\3"+
		"v\3v\5v\u08ed\nv\3v\5v\u08f0\nv\3v\5v\u08f3\nv\3v\3v\3v\3v\7v\u08f9\n"+
		"v\fv\16v\u08fc\13v\3w\3w\5w\u0900\nw\3w\5w\u0903\nw\3w\5w\u0906\nw\3w"+
		"\3w\5w\u090a\nw\3w\3w\5w\u090e\nw\5w\u0910\nw\3w\3w\5w\u0914\nw\3w\5w"+
		"\u0917\nw\3w\3w\3w\3w\7w\u091d\nw\fw\16w\u0920\13w\3x\3x\5x\u0924\nx\3"+
		"x\6x\u0927\nx\rx\16x\u0928\3x\5x\u092c\nx\3x\5x\u092f\nx\3x\3x\3x\3x\7"+
		"x\u0935\nx\fx\16x\u0938\13x\3y\3y\3y\5y\u093d\ny\3z\3z\3{\5{\u0942\n{"+
		"\3{\5{\u0945\n{\3{\3{\5{\u0949\n{\7{\u094b\n{\f{\16{\u094e\13{\3{\3{\5"+
		"{\u0952\n{\3{\3{\5{\u0956\n{\3{\5{\u0959\n{\7{\u095b\n{\f{\16{\u095e\13"+
		"{\3|\5|\u0961\n|\3|\3|\5|\u0965\n|\3|\5|\u0968\n|\3|\3|\3}\3}\3}\5}\u096f"+
		"\n}\3~\3~\5~\u0973\n~\3~\3~\5~\u0977\n~\3~\3~\5~\u097b\n~\3~\7~\u097e"+
		"\n~\f~\16~\u0981\13~\5~\u0983\n~\3~\5~\u0986\n~\3~\3~\3\177\3\177\5\177"+
		"\u098c\n\177\3\177\3\177\5\177\u0990\n\177\3\177\3\177\5\177\u0994\n\177"+
		"\3\177\3\177\5\177\u0998\n\177\3\177\5\177\u099b\n\177\3\177\3\177\5\177"+
		"\u099f\n\177\3\177\5\177\u09a2\n\177\3\177\5\177\u09a5\n\177\3\177\5\177"+
		"\u09a8\n\177\3\177\5\177\u09ab\n\177\3\177\5\177\u09ae\n\177\3\u0080\3"+
		"\u0080\5\u0080\u09b2\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\5\u0081\u09b8"+
		"\n\u0081\3\u0081\3\u0081\5\u0081\u09bc\n\u0081\3\u0081\7\u0081\u09bf\n"+
		"\u0081\f\u0081\16\u0081\u09c2\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u09c9\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083\6\u0083"+
		"\u09cf\n\u0083\r\u0083\16\u0083\u09d0\3\u0084\3\u0084\5\u0084\u09d5\n"+
		"\u0084\3\u0084\3\u0084\5\u0084\u09d9\n\u0084\3\u0084\3\u0084\5\u0084\u09dd"+
		"\n\u0084\3\u0084\5\u0084\u09e0\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u09ec\n\u0085"+
		"\3\u0085\3\u0085\5\u0085\u09f0\n\u0085\3\u0085\5\u0085\u09f3\n\u0085\3"+
		"\u0085\5\u0085\u09f6\n\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u09fb\n\u0086"+
		"\f\u0086\16\u0086\u09fe\13\u0086\3\u0086\3\u0086\3\u0086\6\u0086\u0a03"+
		"\n\u0086\r\u0086\16\u0086\u0a04\5\u0086\u0a07\n\u0086\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0088\7\u0088\u0a0e\n\u0088\f\u0088\16\u0088\u0a11"+
		"\13\u0088\3\u0089\3\u0089\5\u0089\u0a15\n\u0089\3\u0089\3\u0089\5\u0089"+
		"\u0a19\n\u0089\3\u008a\3\u008a\5\u008a\u0a1d\n\u008a\3\u008a\3\u008a\5"+
		"\u008a\u0a21\n\u008a\3\u008a\5\u008a\u0a24\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\5\u008d\u0a2d\n\u008d\3\u008d\5\u008d"+
		"\u0a30\n\u008d\3\u008d\3\u008d\5\u008d\u0a34\n\u008d\3\u008d\5\u008d\u0a37"+
		"\n\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0092\3\u0092\3\u0093\5\u0093\u0a44\n\u0093\3\u0093\3\u0093\3\u0093"+
		"\5\u0093\u0a49\n\u0093\3\u0093\5\u0093\u0a4c\n\u0093\3\u0094\3\u0094\5"+
		"\u0094\u0a50\n\u0094\3\u0094\3\u0094\5\u0094\u0a54\n\u0094\7\u0094\u0a56"+
		"\n\u0094\f\u0094\16\u0094\u0a59\13\u0094\3\u0094\3\u0332\3\u00ca\u0095"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\2\25\5\2\25\25\"\"\u00a9\u00a9\3\2%\60"+
		"\4\2\u00b2\u00b2\u00b6\u00b6\3\2FJ\5\2\u00bf\u00bf\u00c6\u00c6\u00ca\u00ca"+
		"\3\2yz\7\2\21\21\25\25XX\u0082\u0082\u008d\u008d\4\2\u0090\u0091\u00ba"+
		"\u00ba\4\2eg\u00a0\u00a0\3\2\3\4\4\2\u00a2\u00a2\u00a8\u00a8\3\2\6\7\4"+
		"\2\27\30\u0083\u0083\3\2\27\30\7\2YYcc\u00bf\u00c2\u00c4\u00c4\u00c8\u00c8"+
		"\6\2KKvw\u00ad\u00ad\u00cf\u00d5\5\2\5\5\7\n\u00bc\u00bc\6\2MMQQ\u0086"+
		"\u0086\u008b\u008b\13\2\13\67@EKchhnx{|\u0081\u0086\u008b\u0090\u0092"+
		"\u00bb\2\u0c07\2\u0128\3\2\2\2\4\u012c\3\2\2\2\6\u0164\3\2\2\2\b\u016a"+
		"\3\2\2\2\n\u0178\3\2\2\2\f\u018d\3\2\2\2\16\u0191\3\2\2\2\20\u01ac\3\2"+
		"\2\2\22\u01b8\3\2\2\2\24\u01bc\3\2\2\2\26\u01be\3\2\2\2\30\u01d7\3\2\2"+
		"\2\32\u01d9\3\2\2\2\34\u01f1\3\2\2\2\36\u0240\3\2\2\2 \u0242\3\2\2\2\""+
		"\u024f\3\2\2\2$\u0251\3\2\2\2&\u0255\3\2\2\2(\u0259\3\2\2\2*\u026e\3\2"+
		"\2\2,\u0280\3\2\2\2.\u0291\3\2\2\2\60\u029e\3\2\2\2\62\u02c6\3\2\2\2\64"+
		"\u02d6\3\2\2\2\66\u0306\3\2\2\28\u0308\3\2\2\2:\u030d\3\2\2\2<\u031b\3"+
		"\2\2\2>\u0328\3\2\2\2@\u0335\3\2\2\2B\u033c\3\2\2\2D\u0346\3\2\2\2F\u0348"+
		"\3\2\2\2H\u0354\3\2\2\2J\u0369\3\2\2\2L\u0391\3\2\2\2N\u03b1\3\2\2\2P"+
		"\u03c7\3\2\2\2R\u03cb\3\2\2\2T\u03e8\3\2\2\2V\u03ea\3\2\2\2X\u03f3\3\2"+
		"\2\2Z\u03f5\3\2\2\2\\\u03fe\3\2\2\2^\u0403\3\2\2\2`\u0407\3\2\2\2b\u0416"+
		"\3\2\2\2d\u041c\3\2\2\2f\u0428\3\2\2\2h\u0434\3\2\2\2j\u0438\3\2\2\2l"+
		"\u044b\3\2\2\2n\u0457\3\2\2\2p\u0465\3\2\2\2r\u0471\3\2\2\2t\u0481\3\2"+
		"\2\2v\u0491\3\2\2\2x\u049b\3\2\2\2z\u04a9\3\2\2\2|\u04ad\3\2\2\2~\u04b5"+
		"\3\2\2\2\u0080\u04bf\3\2\2\2\u0082\u04d3\3\2\2\2\u0084\u04e7\3\2\2\2\u0086"+
		"\u0529\3\2\2\2\u0088\u053c\3\2\2\2\u008a\u053e\3\2\2\2\u008c\u054e\3\2"+
		"\2\2\u008e\u056d\3\2\2\2\u0090\u0585\3\2\2\2\u0092\u059a\3\2\2\2\u0094"+
		"\u05b0\3\2\2\2\u0096\u05c3\3\2\2\2\u0098\u05c8\3\2\2\2\u009a\u05dc\3\2"+
		"\2\2\u009c\u05ed\3\2\2\2\u009e\u05ef\3\2\2\2\u00a0\u05f7\3\2\2\2\u00a2"+
		"\u05f9\3\2\2\2\u00a4\u05fd\3\2\2\2\u00a6\u0609\3\2\2\2\u00a8\u0615\3\2"+
		"\2\2\u00aa\u0631\3\2\2\2\u00ac\u063d\3\2\2\2\u00ae\u065c\3\2\2\2\u00b0"+
		"\u065e\3\2\2\2\u00b2\u0674\3\2\2\2\u00b4\u0676\3\2\2\2\u00b6\u0683\3\2"+
		"\2\2\u00b8\u068f\3\2\2\2\u00ba\u069b\3\2\2\2\u00bc\u06a0\3\2\2\2\u00be"+
		"\u06b7\3\2\2\2\u00c0\u06c4\3\2\2\2\u00c2\u06d2\3\2\2\2\u00c4\u06e9\3\2"+
		"\2\2\u00c6\u06f2\3\2\2\2\u00c8\u06f6\3\2\2\2\u00ca\u0745\3\2\2\2\u00cc"+
		"\u0803\3\2\2\2\u00ce\u080c\3\2\2\2\u00d0\u081a\3\2\2\2\u00d2\u0835\3\2"+
		"\2\2\u00d4\u083e\3\2\2\2\u00d6\u084a\3\2\2\2\u00d8\u0858\3\2\2\2\u00da"+
		"\u0866\3\2\2\2\u00dc\u086c\3\2\2\2\u00de\u086e\3\2\2\2\u00e0\u088f\3\2"+
		"\2\2\u00e2\u08b6\3\2\2\2\u00e4\u08b9\3\2\2\2\u00e6\u08d3\3\2\2\2\u00e8"+
		"\u08e8\3\2\2\2\u00ea\u08ea\3\2\2\2\u00ec\u08ff\3\2\2\2\u00ee\u0923\3\2"+
		"\2\2\u00f0\u0939\3\2\2\2\u00f2\u093e\3\2\2\2\u00f4\u094c\3\2\2\2\u00f6"+
		"\u0960\3\2\2\2\u00f8\u096b\3\2\2\2\u00fa\u0970\3\2\2\2\u00fc\u098b\3\2"+
		"\2\2\u00fe\u09af\3\2\2\2\u0100\u09b5\3\2\2\2\u0102\u09c8\3\2\2\2\u0104"+
		"\u09ce\3\2\2\2\u0106\u09d2\3\2\2\2\u0108\u09f5\3\2\2\2\u010a\u0a06\3\2"+
		"\2\2\u010c\u0a08\3\2\2\2\u010e\u0a0a\3\2\2\2\u0110\u0a12\3\2\2\2\u0112"+
		"\u0a1a\3\2\2\2\u0114\u0a25\3\2\2\2\u0116\u0a28\3\2\2\2\u0118\u0a2c\3\2"+
		"\2\2\u011a\u0a38\3\2\2\2\u011c\u0a3a\3\2\2\2\u011e\u0a3c\3\2\2\2\u0120"+
		"\u0a3e\3\2\2\2\u0122\u0a40\3\2\2\2\u0124\u0a43\3\2\2\2\u0126\u0a57\3\2"+
		"\2\2\u0128\u0129\5\4\3\2\u0129\u012a\7\2\2\3\u012a\3\3\2\2\2\u012b\u012d"+
		"\7\u00dd\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0131\3\2\2"+
		"\2\u012e\u0130\5\u0124\u0093\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013b\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0138\5\6\4\2\u0135\u0137\5\u0124\u0093\2\u0136\u0135\3"+
		"\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0134\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013f\5\b\5\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0143\3\2\2\2\u0140\u0142\5\u0124\u0093\2\u0141\u0140"+
		"\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\5\f\7\2\u0147\u0146\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014c\3\2\2\2\u0149\u014b\5\u0124\u0093"+
		"\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\5\16\b\2"+
		"\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0155\3\2\2\2\u0152\u0154"+
		"\5\u0124\u0093\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015a\5\26\f\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015e\3"+
		"\2\2\2\u015b\u015d\5\u0124\u0093\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0163\7\u00dd\2\2\u0162\u0161\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\5\3\2\2\2\u0164\u0165\7\u00b4\2\2\u0165\u0166\7\u00dd\2"+
		"\2\u0166\u0167\7\u00d4\2\2\u0167\u0168\7\u00dd\2\2\u0168\u0169\7\36\2"+
		"\2\u0169\7\3\2\2\2\u016a\u016e\7\23\2\2\u016b\u016d\5\u0124\u0093\2\u016c"+
		"\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\5\n\6\2\u0172"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7@\2\2\u0177\t\3\2\2\2\u0178\u017a"+
		"\5\u0104\u0083\2\u0179\u017b\7\u00dd\2\2\u017a\u0179\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\7\u00bf\2\2\u017d\u017f\7\u00dd"+
		"\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0184\5\u0116\u008c\2\u0181\u0183\5\u0124\u0093\2\u0182\u0181\3\2\2\2"+
		"\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\13"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\5\32\16\2\u0188\u018a\5\u0124"+
		"\u0093\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u0187\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\r\3\2\2\2\u0191\u019b"+
		"\5\22\n\2\u0192\u0194\5\u0124\u0093\2\u0193\u0192\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\5\22\n\2\u0198\u019a\3\2\2\2\u0199\u0193\3\2\2\2\u019a\u019d\3"+
		"\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a1\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u01a0\5\u0124\u0093\2\u019f\u019e\3\2\2\2\u01a0\u01a3"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\17\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a5\7}\2\2\u01a5\u01a6\7\u00dd\2\2\u01a6\u01ad"+
		"\7\u00d2\2\2\u01a7\u01a8\7\177\2\2\u01a8\u01a9\7\u00dd\2\2\u01a9\u01ad"+
		"\t\2\2\2\u01aa\u01ad\7~\2\2\u01ab\u01ad\7\u0080\2\2\u01ac\u01a4\3\2\2"+
		"\2\u01ac\u01a7\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\21"+
		"\3\2\2\2\u01ae\u01b9\5\u0122\u0092\2\u01af\u01b9\5\60\31\2\u01b0\u01b9"+
		"\5:\36\2\u01b1\u01b9\5B\"\2\u01b2\u01b9\5*\26\2\u01b3\u01b9\5^\60\2\u01b4"+
		"\u01b9\5\u00ccg\2\u01b5\u01b9\5\20\t\2\u01b6\u01b9\5\u00c0a\2\u01b7\u01b9"+
		"\5\24\13\2\u01b8\u01ae\3\2\2\2\u01b8\u01af\3\2\2\2\u01b8\u01b0\3\2\2\2"+
		"\u01b8\u01b1\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b8\u01b4"+
		"\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\23\3\2\2\2\u01ba\u01bd\5n8\2\u01bb\u01bd\5p9\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\25\3\2\2\2\u01be\u01c8\5\30\r\2\u01bf\u01c1\5\u0124"+
		"\u0093\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5\30\r\2\u01c5\u01c7\3"+
		"\2\2\2\u01c6\u01c0\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ce\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cd\5\u0124"+
		"\u0093\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\27\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d8\5L\'\2"+
		"\u01d2\u01d8\5\u008cG\2\u01d3\u01d8\5\u008eH\2\u01d4\u01d8\5\u0090I\2"+
		"\u01d5\u01d8\5\u00bc_\2\u01d6\u01d8\5\24\13\2\u01d7\u01d1\3\2\2\2\u01d7"+
		"\u01d2\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d8\31\3\2\2\2\u01d9\u01da\7\17\2\2\u01da\u01db"+
		"\7\u00dd\2\2\u01db\u01dd\5\u00e8u\2\u01dc\u01de\7\u00dd\2\2\u01dd\u01dc"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\7\u00bf\2"+
		"\2\u01e0\u01e2\7\u00dd\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01ee\5\u0116\u008c\2\u01e4\u01e6\7\u00dd\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\7\3"+
		"\2\2\u01e8\u01ea\7\u00dd\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ed\5\u0116\u008c\2\u01ec\u01e5\3\2\2\2\u01ed\u01f0"+
		"\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\33\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f7\5\36\20\2\u01f2\u01f3\5\u0126\u0094\2\u01f3"+
		"\u01f4\5\36\20\2\u01f4\u01f6\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f6\u01f9\3"+
		"\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fb\5\u0126\u0094\2\u01fb\35\3\2\2\2\u01fc\u0241"+
		"\5\u0114\u008b\2\u01fd\u0241\5 \21\2\u01fe\u0241\5\32\16\2\u01ff\u0241"+
		"\5\"\22\2\u0200\u0241\5$\23\2\u0201\u0241\5&\24\2\u0202\u0241\5(\25\2"+
		"\u0203\u0241\5*\26\2\u0204\u0241\5.\30\2\u0205\u0241\5\64\33\2\u0206\u0241"+
		"\5\62\32\2\u0207\u0241\5\66\34\2\u0208\u0241\58\35\2\u0209\u0241\5> \2"+
		"\u020a\u0241\5@!\2\u020b\u0241\5D#\2\u020c\u0241\5\u00dco\2\u020d\u0241"+
		"\5F$\2\u020e\u0241\5H%\2\u020f\u0241\5J&\2\u0210\u0241\5N(\2\u0211\u0241"+
		"\5P)\2\u0212\u0241\5R*\2\u0213\u0241\5T+\2\u0214\u0241\5^\60\2\u0215\u0241"+
		"\5`\61\2\u0216\u0241\5b\62\2\u0217\u0241\5d\63\2\u0218\u0241\5f\64\2\u0219"+
		"\u0241\5h\65\2\u021a\u0241\5j\66\2\u021b\u0241\5l\67\2\u021c\u0241\5\24"+
		"\13\2\u021d\u0241\5x=\2\u021e\u0241\5z>\2\u021f\u0241\5|?\2\u0220\u0241"+
		"\5~@\2\u0221\u0241\5\u0080A\2\u0222\u0241\5\u0082B\2\u0223\u0241\5\u0084"+
		"C\2\u0224\u0241\5\u008aF\2\u0225\u0241\5\u0092J\2\u0226\u0241\5\u0094"+
		"K\2\u0227\u0241\5\u0096L\2\u0228\u0241\5\u0098M\2\u0229\u0241\5\u009c"+
		"O\2\u022a\u0241\5\u009eP\2\u022b\u0241\5\u00a0Q\2\u022c\u0241\5\u00a2"+
		"R\2\u022d\u0241\5\u00a4S\2\u022e\u0241\5\u00a6T\2\u022f\u0241\5\u00a8"+
		"U\2\u0230\u0241\5\u00aaV\2\u0231\u0241\5\u00acW\2\u0232\u0241\5\u00b4"+
		"[\2\u0233\u0241\5\u00b6\\\2\u0234\u0241\5\u00b8]\2\u0235\u0241\5\u00ba"+
		"^\2\u0236\u0241\5\u00be`\2\u0237\u0241\5\u00c6d\2\u0238\u0241\5\u00c8"+
		"e\2\u0239\u0241\5\u00ccg\2\u023a\u0241\5\u00d2j\2\u023b\u0241\5\u00d4"+
		"k\2\u023c\u0241\5\u00d6l\2\u023d\u0241\5\u00d8m\2\u023e\u0241\5\u00e2"+
		"r\2\u023f\u0241\5\u00e8u\2\u0240\u01fc\3\2\2\2\u0240\u01fd\3\2\2\2\u0240"+
		"\u01fe\3\2\2\2\u0240\u01ff\3\2\2\2\u0240\u0200\3\2\2\2\u0240\u0201\3\2"+
		"\2\2\u0240\u0202\3\2\2\2\u0240\u0203\3\2\2\2\u0240\u0204\3\2\2\2\u0240"+
		"\u0205\3\2\2\2\u0240\u0206\3\2\2\2\u0240\u0207\3\2\2\2\u0240\u0208\3\2"+
		"\2\2\u0240\u0209\3\2\2\2\u0240\u020a\3\2\2\2\u0240\u020b\3\2\2\2\u0240"+
		"\u020c\3\2\2\2\u0240\u020d\3\2\2\2\u0240\u020e\3\2\2\2\u0240\u020f\3\2"+
		"\2\2\u0240\u0210\3\2\2\2\u0240\u0211\3\2\2\2\u0240\u0212\3\2\2\2\u0240"+
		"\u0213\3\2\2\2\u0240\u0214\3\2\2\2\u0240\u0215\3\2\2\2\u0240\u0216\3\2"+
		"\2\2\u0240\u0217\3\2\2\2\u0240\u0218\3\2\2\2\u0240\u0219\3\2\2\2\u0240"+
		"\u021a\3\2\2\2\u0240\u021b\3\2\2\2\u0240\u021c\3\2\2\2\u0240\u021d\3\2"+
		"\2\2\u0240\u021e\3\2\2\2\u0240\u021f\3\2\2\2\u0240\u0220\3\2\2\2\u0240"+
		"\u0221\3\2\2\2\u0240\u0222\3\2\2\2\u0240\u0223\3\2\2\2\u0240\u0224\3\2"+
		"\2\2\u0240\u0225\3\2\2\2\u0240\u0226\3\2\2\2\u0240\u0227\3\2\2\2\u0240"+
		"\u0228\3\2\2\2\u0240\u0229\3\2\2\2\u0240\u022a\3\2\2\2\u0240\u022b\3\2"+
		"\2\2\u0240\u022c\3\2\2\2\u0240\u022d\3\2\2\2\u0240\u022e\3\2\2\2\u0240"+
		"\u022f\3\2\2\2\u0240\u0230\3\2\2\2\u0240\u0231\3\2\2\2\u0240\u0232\3\2"+
		"\2\2\u0240\u0233\3\2\2\2\u0240\u0234\3\2\2\2\u0240\u0235\3\2\2\2\u0240"+
		"\u0236\3\2\2\2\u0240\u0237\3\2\2\2\u0240\u0238\3\2\2\2\u0240\u0239\3\2"+
		"\2\2\u0240\u023a\3\2\2\2\u0240\u023b\3\2\2\2\u0240\u023c\3\2\2\2\u0240"+
		"\u023d\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241\37\3\2\2"+
		"\2\u0242\u0243\7\20\2\2\u0243\u0244\7\u00dd\2\2\u0244\u024d\5\u00caf\2"+
		"\u0245\u0247\7\u00dd\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024a\7\3\2\2\u0249\u024b\7\u00dd\2\2\u024a\u0249"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\5\u00caf"+
		"\2\u024d\u0246\3\2\2\2\u024d\u024e\3\2\2\2\u024e!\3\2\2\2\u024f\u0250"+
		"\7\24\2\2\u0250#\3\2\2\2\u0251\u0252\7\34\2\2\u0252\u0253\7\u00dd\2\2"+
		"\u0253\u0254\5\u00caf\2\u0254%\3\2\2\2\u0255\u0256\7\35\2\2\u0256\u0257"+
		"\7\u00dd\2\2\u0257\u0258\5\u00caf\2\u0258\'\3\2\2\2\u0259\u0269\7\37\2"+
		"\2\u025a\u025b\7\u00dd\2\2\u025b\u0266\5\u00dan\2\u025c\u025e\7\u00dd"+
		"\2\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0261\7\3\2\2\u0260\u0262\7\u00dd\2\2\u0261\u0260\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\5\u00dan\2\u0264\u025d\3\2\2"+
		"\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026a"+
		"\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u025a\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		")\3\2\2\2\u026b\u026c\5\u011c\u008f\2\u026c\u026d\7\u00dd\2\2\u026d\u026f"+
		"\3\2\2\2\u026e\u026b\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0271\7!\2\2\u0271\u0272\7\u00dd\2\2\u0272\u027d\5,\27\2\u0273\u0275"+
		"\7\u00dd\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2"+
		"\2\u0276\u0278\7\3\2\2\u0277\u0279\7\u00dd\2\2\u0278\u0277\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\5,\27\2\u027b\u0274\3\2"+
		"\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"+\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0282\5\u0104\u0083\2\u0281\u0283"+
		"\5\u011a\u008e\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0286\3"+
		"\2\2\2\u0284\u0285\7\u00dd\2\2\u0285\u0287\5\u0106\u0084\2\u0286\u0284"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u028a\7\u00dd\2"+
		"\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d"+
		"\7\u00bf\2\2\u028c\u028e\7\u00dd\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3"+
		"\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\5\u00caf\2\u0290-\3\2\2\2\u0291"+
		"\u0293\7#\2\2\u0292\u0294\7\u00dd\2\2\u0293\u0292\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\7\u00bf\2\2\u0296\u0298\7\u00dd"+
		"\2\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029a\5\u00caf\2\u029a/\3\2\2\2\u029b\u029c\5\u011c\u008f\2\u029c\u029d"+
		"\7\u00dd\2\2\u029d\u029f\3\2\2\2\u029e\u029b\3\2\2\2\u029e\u029f\3\2\2"+
		"\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7$\2\2\u02a1\u02a4\7\u00dd\2\2\u02a2"+
		"\u02a3\7\u008a\2\2\u02a3\u02a5\7\u00dd\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5"+
		"\3\2\2\2\u02a5\u02ab\3\2\2\2\u02a6\u02a8\7O\2\2\u02a7\u02a9\5\u011a\u008e"+
		"\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02ac"+
		"\7\u00a7\2\2\u02ab\u02a6\3\2\2\2\u02ab\u02aa\3\2\2\2\u02ac\u02ad\3\2\2"+
		"\2\u02ad\u02ae\7\u00dd\2\2\u02ae\u02b0\5\u0104\u0083\2\u02af\u02b1\5\u011a"+
		"\u008e\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b3\7\u00dd\2\2\u02b3\u02b4\7b\2\2\u02b4\u02b5\7\u00dd\2\2\u02b5\u02ba"+
		"\7\u00cf\2\2\u02b6\u02b7\7\u00dd\2\2\u02b7\u02b8\7\r\2\2\u02b8\u02b9\7"+
		"\u00dd\2\2\u02b9\u02bb\7\u00cf\2\2\u02ba\u02b6\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02c0\3\2\2\2\u02bc\u02be\7\u00dd\2\2\u02bd\u02bc\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\5\u00fa~\2\u02c0\u02bd"+
		"\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c3\7\u00dd\2"+
		"\2\u02c3\u02c5\5\u0106\u0084\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2"+
		"\u02c5\61\3\2\2\2\u02c6\u02c7\t\3\2\2\u02c7\u02c8\7\u00dd\2\2\u02c8\u02d3"+
		"\5\u0112\u008a\2\u02c9\u02cb\7\u00dd\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\7\3\2\2\u02cd\u02cf\7\u00dd\2"+
		"\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2"+
		"\5\u0112\u008a\2\u02d1\u02ca\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3"+
		"\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\63\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6"+
		"\u02d7\7\61\2\2\u02d7\u02d8\7\u00dd\2\2\u02d8\u02da\5\u00caf\2\u02d9\u02db"+
		"\7\u00dd\2\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2"+
		"\2\u02dc\u02de\7\3\2\2\u02dd\u02df\7\u00dd\2\2\u02de\u02dd\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e9\5\u00caf\2\u02e1\u02e3"+
		"\7\u00dd\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2"+
		"\2\u02e4\u02e6\7\3\2\2\u02e5\u02e7\7\u00dd\2\2\u02e6\u02e5\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\5\u00caf\2\u02e9\u02e2"+
		"\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\65\3\2\2\2\u02eb\u02ec\7\63\2\2\u02ec"+
		"\u02ee\5\u0126\u0094\2\u02ed\u02ef\5\34\17\2\u02ee\u02ed\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\7_\2\2\u02f1\u0307\3\2"+
		"\2\2\u02f2\u02f3\7\63\2\2\u02f3\u02f4\7\u00dd\2\2\u02f4\u02f5\t\4\2\2"+
		"\u02f5\u02f6\7\u00dd\2\2\u02f6\u02f7\5\u00caf\2\u02f7\u02f9\5\u0126\u0094"+
		"\2\u02f8\u02fa\5\34\17\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\7_\2\2\u02fc\u0307\3\2\2\2\u02fd\u02fe\7\63"+
		"\2\2\u02fe\u02ff\5\u0126\u0094\2\u02ff\u0300\5\34\17\2\u0300\u0301\7_"+
		"\2\2\u0301\u0302\7\u00dd\2\2\u0302\u0303\t\4\2\2\u0303\u0304\7\u00dd\2"+
		"\2\u0304\u0305\5\u00caf\2\u0305\u0307\3\2\2\2\u0306\u02eb\3\2\2\2\u0306"+
		"\u02f2\3\2\2\2\u0306\u02fd\3\2\2\2\u0307\67\3\2\2\2\u0308\u0309\7@\2\2"+
		"\u03099\3\2\2\2\u030a\u030b\5\u011c\u008f\2\u030b\u030c\7\u00dd\2\2\u030c"+
		"\u030e\3\2\2\2\u030d\u030a\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2"+
		"\2\2\u030f\u0310\7A\2\2\u0310\u0311\7\u00dd\2\2\u0311\u0312\5\u0104\u0083"+
		"\2\u0312\u0316\5\u0126\u0094\2\u0313\u0315\5<\37\2\u0314\u0313\3\2\2\2"+
		"\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319"+
		"\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031a\78\2\2\u031a;\3\2\2\2\u031b\u0324"+
		"\5\u0104\u0083\2\u031c\u031e\7\u00dd\2\2\u031d\u031c\3\2\2\2\u031d\u031e"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\7\u00bf\2\2\u0320\u0322\7\u00dd"+
		"\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"\u0325\5\u00caf\2\u0324\u031d\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u0327\5\u0126\u0094\2\u0327=\3\2\2\2\u0328\u0329\7C\2\2"+
		"\u0329\u032a\7\u00dd\2\2\u032a\u0332\5\u00caf\2\u032b\u032d\7\3\2\2\u032c"+
		"\u032e\7\u00dd\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0331\5\u00caf\2\u0330\u032b\3\2\2\2\u0331\u0334\3\2\2"+
		"\2\u0332\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333?\3\2\2\2\u0334\u0332"+
		"\3\2\2\2\u0335\u0336\7D\2\2\u0336\u0337\7\u00dd\2\2\u0337\u0338\5\u00ca"+
		"f\2\u0338A\3\2\2\2\u0339\u033a\5\u011c\u008f\2\u033a\u033b\7\u00dd\2\2"+
		"\u033b\u033d\3\2\2\2\u033c\u0339\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e"+
		"\3\2\2\2\u033e\u033f\7E\2\2\u033f\u0340\7\u00dd\2\2\u0340\u0342\5\u0104"+
		"\u0083\2\u0341\u0343\7\u00dd\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2"+
		"\2\u0343\u0344\3\2\2\2\u0344\u0345\5\u00fa~\2\u0345C\3\2\2\2\u0346\u0347"+
		"\t\5\2\2\u0347E\3\2\2\2\u0348\u0349\7L\2\2\u0349\u034a\7\u00dd\2\2\u034a"+
		"\u034c\5\u00caf\2\u034b\u034d\7\u00dd\2\2\u034c\u034b\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0350\7\3\2\2\u034f\u0351\7\u00dd\2"+
		"\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353"+
		"\5\u00caf\2\u0353G\3\2\2\2\u0354\u0355\7N\2\2\u0355\u0356\7\u00dd\2\2"+
		"\u0356\u0357\7\65\2\2\u0357\u0358\7\u00dd\2\2\u0358\u035a\5\u0104\u0083"+
		"\2\u0359\u035b\5\u011a\u008e\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2\2"+
		"\u035b\u035c\3\2\2\2\u035c\u035d\7\u00dd\2\2\u035d\u035e\7W\2\2\u035e"+
		"\u035f\7\u00dd\2\2\u035f\u0360\5\u00caf\2\u0360\u0362\5\u0126\u0094\2"+
		"\u0361\u0363\5\34\17\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364"+
		"\3\2\2\2\u0364\u0367\7s\2\2\u0365\u0366\7\u00dd\2\2\u0366\u0368\5\u0104"+
		"\u0083\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368I\3\2\2\2\u0369"+
		"\u036a\7N\2\2\u036a\u036b\7\u00dd\2\2\u036b\u036d\5\u0104\u0083\2\u036c"+
		"\u036e\5\u011a\u008e\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0371"+
		"\3\2\2\2\u036f\u0370\7\u00dd\2\2\u0370\u0372\5\u0106\u0084\2\u0371\u036f"+
		"\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3\2\2\2\u0373\u0375\7\u00dd\2"+
		"\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378"+
		"\7\u00bf\2\2\u0377\u0379\7\u00dd\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3"+
		"\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\5\u00caf\2\u037b\u037c\7\u00dd"+
		"\2\2\u037c\u037d\7\u00ac\2\2\u037d\u037e\7\u00dd\2\2\u037e\u0383\5\u00ca"+
		"f\2\u037f\u0380\7\u00dd\2\2\u0380\u0381\7\u00a4\2\2\u0381\u0382\7\u00dd"+
		"\2\2\u0382\u0384\5\u00caf\2\u0383\u037f\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0387\5\u0126\u0094\2\u0386\u0388\5\34\17\2\u0387"+
		"\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038c\7s"+
		"\2\2\u038a\u038b\7\u00dd\2\2\u038b\u038d\5\u0104\u0083\2\u038c\u038a\3"+
		"\2\2\2\u038c\u038d\3\2\2\2\u038dK\3\2\2\2\u038e\u038f\5\u011c\u008f\2"+
		"\u038f\u0390\7\u00dd\2\2\u0390\u0392\3\2\2\2\u0391\u038e\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0394\7\u00a3\2\2\u0394\u0396"+
		"\7\u00dd\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2"+
		"\2\u0397\u0399\7O\2\2\u0398\u039a\7\u00dd\2\2\u0399\u0398\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039d\5\u0104\u0083\2\u039c\u039e"+
		"\5\u011a\u008e\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a3\3"+
		"\2\2\2\u039f\u03a1\7\u00dd\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2"+
		"\u03a1\u03a2\3\2\2\2\u03a2\u03a4\5\u00fa~\2\u03a3\u03a0\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4\u03a9\3\2\2\2\u03a5\u03a7\7\u00dd\2\2\u03a6\u03a5"+
		"\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\5\u0106\u0084"+
		"\2\u03a9\u03a6\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad"+
		"\5\u0126\u0094\2\u03ac\u03ae\5\34\17\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\79\2\2\u03b0M\3\2\2\2\u03b1\u03b2"+
		"\7P\2\2\u03b2\u03b3\7\u00dd\2\2\u03b3\u03b5\5\u00dan\2\u03b4\u03b6\7\u00dd"+
		"\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"\u03b9\7\3\2\2\u03b8\u03ba\7\u00dd\2\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03bd\5\u00caf\2\u03bc\u03bb\3\2\2"+
		"\2\u03bc\u03bd\3\2\2\2\u03bd\u03bf\3\2\2\2\u03be\u03c0\7\u00dd\2\2\u03bf"+
		"\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\7\3"+
		"\2\2\u03c2\u03c4\7\u00dd\2\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4"+
		"\u03c5\3\2\2\2\u03c5\u03c6\5\u00caf\2\u03c6O\3\2\2\2\u03c7\u03c8\7R\2"+
		"\2\u03c8\u03c9\7\u00dd\2\2\u03c9\u03ca\5\u00caf\2\u03caQ\3\2\2\2\u03cb"+
		"\u03cc\7S\2\2\u03cc\u03cd\7\u00dd\2\2\u03cd\u03ce\5\u00caf\2\u03ceS\3"+
		"\2\2\2\u03cf\u03d0\7T\2\2\u03d0\u03d1\7\u00dd\2\2\u03d1\u03d2\5X-\2\u03d2"+
		"\u03d3\7\u00dd\2\2\u03d3\u03d4\7\u00aa\2\2\u03d4\u03d5\7\u00dd\2\2\u03d5"+
		"\u03da\5\36\20\2\u03d6\u03d7\7\u00dd\2\2\u03d7\u03d8\7\66\2\2\u03d8\u03d9"+
		"\7\u00dd\2\2\u03d9\u03db\5\36\20\2\u03da\u03d6\3\2\2\2\u03da\u03db\3\2"+
		"\2\2\u03db\u03e9\3\2\2\2\u03dc\u03e0\5V,\2\u03dd\u03df\5Z.\2\u03de\u03dd"+
		"\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e4\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e5\5\\/\2\u03e4\u03e3\3\2"+
		"\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\7:\2\2\u03e7"+
		"\u03e9\3\2\2\2\u03e8\u03cf\3\2\2\2\u03e8\u03dc\3\2\2\2\u03e9U\3\2\2\2"+
		"\u03ea\u03eb\7T\2\2\u03eb\u03ec\7\u00dd\2\2\u03ec\u03ed\5X-\2\u03ed\u03ee"+
		"\7\u00dd\2\2\u03ee\u03ef\7\u00aa\2\2\u03ef\u03f1\5\u0126\u0094\2\u03f0"+
		"\u03f2\5\34\17\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2W\3\2\2"+
		"\2\u03f3\u03f4\5\u00caf\2\u03f4Y\3\2\2\2\u03f5\u03f6\7\67\2\2\u03f6\u03f7"+
		"\7\u00dd\2\2\u03f7\u03f8\5X-\2\u03f8\u03f9\7\u00dd\2\2\u03f9\u03fa\7\u00aa"+
		"\2\2\u03fa\u03fc\5\u0126\u0094\2\u03fb\u03fd\5\34\17\2\u03fc\u03fb\3\2"+
		"\2\2\u03fc\u03fd\3\2\2\2\u03fd[\3\2\2\2\u03fe\u03ff\7\66\2\2\u03ff\u0401"+
		"\5\u0126\u0094\2\u0400\u0402\5\34\17\2\u0401\u0400\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402]\3\2\2\2\u0403\u0404\7V\2\2\u0404\u0405\7\u00dd\2\2\u0405"+
		"\u0406\5\u0104\u0083\2\u0406_\3\2\2\2\u0407\u0408\7X\2\2\u0408\u0409\7"+
		"\u00dd\2\2\u0409\u0412\5\u00dan\2\u040a\u040c\7\u00dd\2\2\u040b\u040a"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\7\3\2\2\u040e"+
		"\u0410\7\u00dd\2\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411"+
		"\3\2\2\2\u0411\u0413\5\u00caf\2\u0412\u040b\3\2\2\2\u0413\u0414\3\2\2"+
		"\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415a\3\2\2\2\u0416\u0417"+
		"\7[\2\2\u0417\u0418\7\u00dd\2\2\u0418\u0419\5\u00caf\2\u0419c\3\2\2\2"+
		"\u041a\u041b\7a\2\2\u041b\u041d\7\u00dd\2\2\u041c\u041a\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\5\u00e8u\2\u041f\u0421"+
		"\7\u00dd\2\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2"+
		"\2\u0422\u0424\t\6\2\2\u0423\u0425\7\u00dd\2\2\u0424\u0423\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\5\u00caf\2\u0427e\3\2\2"+
		"\2\u0428\u0429\7d\2\2\u0429\u042a\7\u00dd\2\2\u042a\u042c\5\u00dan\2\u042b"+
		"\u042d\7\u00dd\2\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e"+
		"\3\2\2\2\u042e\u0430\7\3\2\2\u042f\u0431\7\u00dd\2\2\u0430\u042f\3\2\2"+
		"\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\5\u00caf\2\u0433"+
		"g\3\2\2\2\u0434\u0435\7\\\2\2\u0435\u0436\7\u00dd\2\2\u0436\u0437\5\u00ca"+
		"f\2\u0437i\3\2\2\2\u0438\u0439\7]\2\2\u0439\u043a\7\u00dd\2\2\u043a\u0449"+
		"\5\u00caf\2\u043b\u043d\7\u00dd\2\2\u043c\u043b\3\2\2\2\u043c\u043d\3"+
		"\2\2\2\u043d\u043e\3\2\2\2\u043e\u0440\7\3\2\2\u043f\u0441\7\u00dd\2\2"+
		"\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0447"+
		"\5\u00caf\2\u0443\u0444\7\u00dd\2\2\u0444\u0445\7\u00ac\2\2\u0445\u0446"+
		"\7\u00dd\2\2\u0446\u0448\5\u00caf\2\u0447\u0443\3\2\2\2\u0447\u0448\3"+
		"\2\2\2\u0448\u044a\3\2\2\2\u0449\u043c\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"k\3\2\2\2\u044b\u044c\7h\2\2\u044c\u044d\7\u00dd\2\2\u044d\u044f\5\u00e8"+
		"u\2\u044e\u0450\7\u00dd\2\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451\u0453\7\u00bf\2\2\u0452\u0454\7\u00dd\2\2\u0453\u0452"+
		"\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\5\u00caf"+
		"\2\u0456m\3\2\2\2\u0457\u0459\7i\2\2\u0458\u045a\7\u00dd\2\2\u0459\u0458"+
		"\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045d\5\u0104\u0083"+
		"\2\u045c\u045e\7\u00dd\2\2\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e"+
		"\u045f\3\2\2\2\u045f\u0461\7\u00bf\2\2\u0460\u0462\7\u00dd\2\2\u0461\u0460"+
		"\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\5\u00caf"+
		"\2\u0464o\3\2\2\2\u0465\u0469\5r:\2\u0466\u0468\5t;\2\u0467\u0466\3\2"+
		"\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u046d\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u046e\5v<\2\u046d\u046c\3\2\2"+
		"\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\7m\2\2\u0470q\3"+
		"\2\2\2\u0471\u0473\7j\2\2\u0472\u0474\7\u00dd\2\2\u0473\u0472\3\2\2\2"+
		"\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\5X-\2\u0476\u0477"+
		"\7\u00dd\2\2\u0477\u0478\7\u00aa\2\2\u0478\u047e\5\u0126\u0094\2\u0479"+
		"\u047d\5\16\b\2\u047a\u047d\5\26\f\2\u047b\u047d\5\34\17\2\u047c\u0479"+
		"\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047b\3\2\2\2\u047d\u0480\3\2\2\2\u047e"+
		"\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047fs\3\2\2\2\u0480\u047e\3\2\2\2"+
		"\u0481\u0483\7k\2\2\u0482\u0484\7\u00dd\2\2\u0483\u0482\3\2\2\2\u0483"+
		"\u0484\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\5X-\2\u0486\u0487\7\u00dd"+
		"\2\2\u0487\u0488\7\u00aa\2\2\u0488\u048e\5\u0126\u0094\2\u0489\u048d\5"+
		"\16\b\2\u048a\u048d\5\26\f\2\u048b\u048d\5\34\17\2\u048c\u0489\3\2\2\2"+
		"\u048c\u048a\3\2\2\2\u048c\u048b\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c"+
		"\3\2\2\2\u048e\u048f\3\2\2\2\u048fu\3\2\2\2\u0490\u048e\3\2\2\2\u0491"+
		"\u0492\7l\2\2\u0492\u0498\5\u0126\u0094\2\u0493\u0497\5\16\b\2\u0494\u0497"+
		"\5\26\f\2\u0495\u0497\5\34\17\2\u0496\u0493\3\2\2\2\u0496\u0494\3\2\2"+
		"\2\u0496\u0495\3\2\2\2\u0497\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499"+
		"\3\2\2\2\u0499w\3\2\2\2\u049a\u0498\3\2\2\2\u049b\u049d\7o\2\2\u049c\u049e"+
		"\7\u00dd\2\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\3\2\2"+
		"\2\u049f\u04a1\7\u00c3\2\2\u04a0\u04a2\7\u00dd\2\2\u04a1\u04a0\3\2\2\2"+
		"\u04a1\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\5\u00f4{\2\u04a4"+
		"\u04a6\7\u00dd\2\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7"+
		"\3\2\2\2\u04a7\u04a8\7\u00cc\2\2\u04a8y\3\2\2\2\u04a9\u04aa\7p\2\2\u04aa"+
		"\u04ab\7\u00dd\2\2\u04ab\u04ac\5\u00caf\2\u04ac{\3\2\2\2\u04ad\u04ae\7"+
		"r\2\2\u04ae\u04af\7\u00dd\2\2\u04af\u04b0\5\u00caf\2\u04b0\u04b1\7\u00dd"+
		"\2\2\u04b1\u04b2\7\22\2\2\u04b2\u04b3\7\u00dd\2\2\u04b3\u04b4\5\u00ca"+
		"f\2\u04b4}\3\2\2\2\u04b5\u04b6\t\7\2\2\u04b6\u04bd\7\u00dd\2\2\u04b7\u04b8"+
		"\7S\2\2\u04b8\u04b9\7\u00dd\2\2\u04b9\u04be\5\u00caf\2\u04ba\u04bb\7\u0095"+
		"\2\2\u04bb\u04bc\7\u00dd\2\2\u04bc\u04be\7s\2\2\u04bd\u04b7\3\2\2\2\u04bd"+
		"\u04ba\3\2\2\2\u04be\177\3\2\2\2\u04bf\u04c0\7x\2\2\u04c0\u04c1\7\u00dd"+
		"\2\2\u04c1\u04c2\5\u00caf\2\u04c2\u04c3\7\u00dd\2\2\u04c3\u04c4\7S\2\2"+
		"\u04c4\u04c5\7\u00dd\2\2\u04c5\u04d0\5\u00caf\2\u04c6\u04c8\7\u00dd\2"+
		"\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cb"+
		"\7\3\2\2\u04ca\u04cc\7\u00dd\2\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2"+
		"\2\u04cc\u04cd\3\2\2\2\u04cd\u04cf\5\u00caf\2\u04ce\u04c7\3\2\2\2\u04cf"+
		"\u04d2\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u0081\3\2"+
		"\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04d4\7x\2\2\u04d4\u04d5\7\u00dd\2\2\u04d5"+
		"\u04d6\5\u00caf\2\u04d6\u04d7\7\u00dd\2\2\u04d7\u04d8\7R\2\2\u04d8\u04d9"+
		"\7\u00dd\2\2\u04d9\u04e4\5\u00caf\2\u04da\u04dc\7\u00dd\2\2\u04db\u04da"+
		"\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04df\7\3\2\2\u04de"+
		"\u04e0\7\u00dd\2\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1"+
		"\3\2\2\2\u04e1\u04e3\5\u00caf\2\u04e2\u04db\3\2\2\2\u04e3\u04e6\3\2\2"+
		"\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u0083\3\2\2\2\u04e6\u04e4"+
		"\3\2\2\2\u04e7\u04e8\7{\2\2\u04e8\u04e9\7\u00dd\2\2\u04e9\u04ea\5\u00ca"+
		"f\2\u04ea\u04eb\7\u00dd\2\2\u04eb\u04ec\7N\2\2\u04ec\u04ed\7\u00dd\2\2"+
		"\u04ed\u04f2\t\b\2\2\u04ee\u04ef\7\u00dd\2\2\u04ef\u04f0\7\13\2\2\u04f0"+
		"\u04f1\7\u00dd\2\2\u04f1\u04f3\t\t\2\2\u04f2\u04ee\3\2\2\2\u04f2\u04f3"+
		"\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f5\7\u00dd\2\2\u04f5\u04f7\t\n\2"+
		"\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9"+
		"\7\u00dd\2\2\u04f9\u04fa\7\22\2\2\u04fa\u04fb\7\u00dd\2\2\u04fb\u0506"+
		"\5\u00dan\2\u04fc\u04fd\7\u00dd\2\2\u04fd\u04ff\7`\2\2\u04fe\u0500\7\u00dd"+
		"\2\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501"+
		"\u0503\7\u00bf\2\2\u0502\u0504\7\u00dd\2\2\u0503\u0502\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\5\u00caf\2\u0506\u04fc\3\2\2"+
		"\2\u0506\u0507\3\2\2\2\u0507\u0085\3\2\2\2\u0508\u0515\5\u0088E\2\u0509"+
		"\u050b\7\u00dd\2\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c"+
		"\3\2\2\2\u050c\u050e\t\13\2\2\u050d\u050f\7\u00dd\2\2\u050e\u050d\3\2"+
		"\2\2\u050e\u050f\3\2\2\2\u050f\u0511\3\2\2\2\u0510\u0512\5\u0088E\2\u0511"+
		"\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\3\2\2\2\u0513\u050a\3\2"+
		"\2\2\u0514\u0517\3\2\2\2\u0515\u0513\3\2\2\2\u0515\u0516\3\2\2\2\u0516"+
		"\u052a\3\2\2\2\u0517\u0515\3\2\2\2\u0518\u051a\5\u0088E\2\u0519\u0518"+
		"\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u0525\3\2\2\2\u051b\u051d\7\u00dd\2"+
		"\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0520"+
		"\t\13\2\2\u051f\u0521\7\u00dd\2\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2"+
		"\2\2\u0521\u0523\3\2\2\2\u0522\u0524\5\u0088E\2\u0523\u0522\3\2\2\2\u0523"+
		"\u0524\3\2\2\2\u0524\u0526\3\2\2\2\u0525\u051c\3\2\2\2\u0526\u0527\3\2"+
		"\2\2\u0527\u0525\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u052a\3\2\2\2\u0529"+
		"\u0508\3\2\2\2\u0529\u0519\3\2\2\2\u052a\u0087\3\2\2\2\u052b\u053d\5\u00ca"+
		"f\2\u052c\u053a\t\f\2\2\u052d\u052f\7\u00dd\2\2\u052e\u052d\3\2\2\2\u052e"+
		"\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\7\u00c3\2\2\u0531\u0533"+
		"\7\u00dd\2\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2\2"+
		"\2\u0534\u0536\5\u00f4{\2\u0535\u0537\7\u00dd\2\2\u0536\u0535\3\2\2\2"+
		"\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\7\u00cc\2\2\u0539"+
		"\u053b\3\2\2\2\u053a\u052e\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2"+
		"\2\2\u053c\u052b\3\2\2\2\u053c\u052c\3\2\2\2\u053d\u0089\3\2\2\2\u053e"+
		"\u053f\7\u0085\2\2\u053f\u0540\7\u00dd\2\2\u0540\u0542\5\u00dan\2\u0541"+
		"\u0543\7\u00dd\2\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544"+
		"\3\2\2\2\u0544\u0549\7\3\2\2\u0545\u0547\7\u00dd\2\2\u0546\u0545\3\2\2"+
		"\2\u0546\u0547\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054a\5\u0086D\2\u0549"+
		"\u0546\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u008b\3\2\2\2\u054b\u054c\5\u011c"+
		"\u008f\2\u054c\u054d\7\u00dd\2\2\u054d\u054f\3\2\2\2\u054e\u054b\3\2\2"+
		"\2\u054e\u054f\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u0551\7\u00a3\2\2\u0551"+
		"\u0553\7\u00dd\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554"+
		"\3\2\2\2\u0554\u0555\7\u0087\2\2\u0555\u0556\7\u00dd\2\2\u0556\u0558\5"+
		"\u0104\u0083\2\u0557\u0559\5\u011a\u008e\2\u0558\u0557\3\2\2\2\u0558\u0559"+
		"\3\2\2\2\u0559\u055e\3\2\2\2\u055a\u055c\7\u00dd\2\2\u055b\u055a\3\2\2"+
		"\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055f\5\u00fa~\2\u055e"+
		"\u055b\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0562\3\2\2\2\u0560\u0561\7\u00dd"+
		"\2\2\u0561\u0563\5\u0106\u0084\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2\2"+
		"\2\u0563\u0564\3\2\2\2\u0564\u0566\5\u0126\u0094\2\u0565\u0567\5\34\17"+
		"\2\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0569"+
		"\7;\2\2\u0569\u008d\3\2\2\2\u056a\u056b\5\u011c\u008f\2\u056b\u056c\7"+
		"\u00dd\2\2\u056c\u056e\3\2\2\2\u056d\u056a\3\2\2\2\u056d\u056e\3\2\2\2"+
		"\u056e\u0571\3\2\2\2\u056f\u0570\7\u00a3\2\2\u0570\u0572\7\u00dd\2\2\u0571"+
		"\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\7\u0089"+
		"\2\2\u0574\u0575\7\u00dd\2\2\u0575\u057a\5\u0104\u0083\2\u0576\u0578\7"+
		"\u00dd\2\2\u0577\u0576\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2"+
		"\u0579\u057b\5\u00fa~\2\u057a\u0577\3\2\2\2\u057a\u057b\3\2\2\2\u057b"+
		"\u057c\3\2\2\2\u057c\u057e\5\u0126\u0094\2\u057d\u057f\5\34\17\2\u057e"+
		"\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\7;"+
		"\2\2\u0581\u008f\3\2\2\2\u0582\u0583\5\u011c\u008f\2\u0583\u0584\7\u00dd"+
		"\2\2\u0584\u0586\3\2\2\2\u0585\u0582\3\2\2\2\u0585\u0586\3\2\2\2\u0586"+
		"\u0589\3\2\2\2\u0587\u0588\7\u00a3\2\2\u0588\u058a\7\u00dd\2\2\u0589\u0587"+
		"\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\7\u0088\2"+
		"\2\u058c\u058d\7\u00dd\2\2\u058d\u0592\5\u0104\u0083\2\u058e\u0590\7\u00dd"+
		"\2\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2\u0591"+
		"\u0593\5\u00fa~\2\u0592\u058f\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594"+
		"\3\2\2\2\u0594\u0596\5\u0126\u0094\2\u0595\u0597\5\34\17\2\u0596\u0595"+
		"\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\7;\2\2\u0599"+
		"\u0091\3\2\2\2\u059a\u059b\7\u008c\2\2\u059b\u059c\7\u00dd\2\2\u059c\u059e"+
		"\5\u00dan\2\u059d\u059f\7\u00dd\2\2\u059e\u059d\3\2\2\2\u059e\u059f\3"+
		"\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\7\3\2\2\u05a1\u05a3\7\u00dd\2\2"+
		"\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a5\3\2\2\2\u05a4\u05a6"+
		"\5\u00caf\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2\2"+
		"\2\u05a7\u05a9\7\u00dd\2\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u05aa\3\2\2\2\u05aa\u05ac\7\3\2\2\u05ab\u05ad\7\u00dd\2\2\u05ac\u05ab"+
		"\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\5\u00caf"+
		"\2\u05af\u0093\3\2\2\2\u05b0\u05b1\7\u008f\2\2\u05b1\u05b2\7\u00dd\2\2"+
		"\u05b2\u05c1\5\u0104\u0083\2\u05b3\u05b5\7\u00dd\2\2\u05b4\u05b3\3\2\2"+
		"\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\7\u00c3\2\2\u05b7"+
		"\u05b9\7\u00dd\2\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05be"+
		"\3\2\2\2\u05ba\u05bc\5\u00f4{\2\u05bb\u05bd\7\u00dd\2\2\u05bc\u05bb\3"+
		"\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be\u05ba\3\2\2\2\u05be"+
		"\u05bf\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2\7\u00cc\2\2\u05c1\u05b4"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u0095\3\2\2\2\u05c3\u05c6\7\u008e\2"+
		"\2\u05c4\u05c5\7\u00dd\2\2\u05c5\u05c7\5\u00caf\2\u05c6\u05c4\3\2\2\2"+
		"\u05c6\u05c7\3\2\2\2\u05c7\u0097\3\2\2\2\u05c8\u05c9\7\u0092\2\2\u05c9"+
		"\u05cc\7\u00dd\2\2\u05ca\u05cb\7\u0084\2\2\u05cb\u05cd\7\u00dd\2\2\u05cc"+
		"\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d9\5\u009a"+
		"N\2\u05cf\u05d1\7\u00dd\2\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"+
		"\u05d2\3\2\2\2\u05d2\u05d4\7\3\2\2\u05d3\u05d5\7\u00dd\2\2\u05d4\u05d3"+
		"\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d8\5\u009aN"+
		"\2\u05d7\u05d0\3\2\2\2\u05d8\u05db\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05da"+
		"\3\2\2\2\u05da\u0099\3\2\2\2\u05db\u05d9\3\2\2\2\u05dc\u05de\5\u00e8u"+
		"\2\u05dd\u05df\7\u00dd\2\2\u05de\u05dd\3\2\2\2\u05de\u05df\3\2\2\2\u05df"+
		"\u05e0\3\2\2\2\u05e0\u05e2\7\u00c3\2\2\u05e1\u05e3\7\u00dd\2\2\u05e2\u05e1"+
		"\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e6\5\u0100\u0081"+
		"\2\u05e5\u05e7\7\u00dd\2\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7"+
		"\u05e8\3\2\2\2\u05e8\u05eb\7\u00cc\2\2\u05e9\u05ea\7\u00dd\2\2\u05ea\u05ec"+
		"\5\u0106\u0084\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u009b\3"+
		"\2\2\2\u05ed\u05ee\7\u0094\2\2\u05ee\u009d\3\2\2\2\u05ef\u05f5\7\u0095"+
		"\2\2\u05f0\u05f3\7\u00dd\2\2\u05f1\u05f4\7s\2\2\u05f2\u05f4\5\u0104\u0083"+
		"\2\u05f3\u05f1\3\2\2\2\u05f3\u05f2\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05f0"+
		"\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u009f\3\2\2\2\u05f7\u05f8\7\u0096\2"+
		"\2\u05f8\u00a1\3\2\2\2\u05f9\u05fa\7\u0097\2\2\u05fa\u05fb\7\u00dd\2\2"+
		"\u05fb\u05fc\5\u00caf\2\u05fc\u00a3\3\2\2\2\u05fd\u05fe\7\u0098\2\2\u05fe"+
		"\u05ff\7\u00dd\2\2\u05ff\u0601\5\u00e8u\2\u0600\u0602\7\u00dd\2\2\u0601"+
		"\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0605\7\u00bf"+
		"\2\2\u0604\u0606\7\u00dd\2\2\u0605\u0604\3\2\2\2\u0605\u0606\3\2\2\2\u0606"+
		"\u0607\3\2\2\2\u0607\u0608\5\u00caf\2\u0608\u00a5\3\2\2\2\u0609\u060a"+
		"\7\u0099\2\2\u060a\u060b\7\u00dd\2\2\u060b\u060d\5\u00caf\2\u060c\u060e"+
		"\7\u00dd\2\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2\2"+
		"\2\u060f\u0611\7\3\2\2\u0610\u0612\7\u00dd\2\2\u0611\u0610\3\2\2\2\u0611"+
		"\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614\5\u00caf\2\u0614\u00a7"+
		"\3\2\2\2\u0615\u0616\7\u009a\2\2\u0616\u0617\7\u00dd\2\2\u0617\u0619\5"+
		"\u00caf\2\u0618\u061a\7\u00dd\2\2\u0619\u0618\3\2\2\2\u0619\u061a\3\2"+
		"\2\2\u061a\u061b\3\2\2\2\u061b\u061d\7\3\2\2\u061c\u061e\7\u00dd\2\2\u061d"+
		"\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621\5\u00ca"+
		"f\2\u0620\u0622\7\u00dd\2\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2\2\u0622"+
		"\u0623\3\2\2\2\u0623\u0625\7\3\2\2\u0624\u0626\7\u00dd\2\2\u0625\u0624"+
		"\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0629\5\u00caf"+
		"\2\u0628\u062a\7\u00dd\2\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2\2\2\u062a"+
		"\u062b\3\2\2\2\u062b\u062d\7\3\2\2\u062c\u062e\7\u00dd\2\2\u062d\u062c"+
		"\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630\5\u00caf"+
		"\2\u0630\u00a9\3\2\2\2\u0631\u0632\7\u009b\2\2\u0632\u0633\7\u00dd\2\2"+
		"\u0633\u0635\5\u00dan\2\u0634\u0636\7\u00dd\2\2\u0635\u0634\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639\7\3\2\2\u0638\u063a\7\u00dd"+
		"\2\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u063c\5\u00caf\2\u063c\u00ab\3\2\2\2\u063d\u063e\7\u009c\2\2\u063e\u063f"+
		"\7\u00dd\2\2\u063f\u0640\7\33\2\2\u0640\u0641\7\u00dd\2\2\u0641\u0642"+
		"\5\u00caf\2\u0642\u0646\5\u0126\u0094\2\u0643\u0645\5\u00b0Y\2\u0644\u0643"+
		"\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647"+
		"\u0649\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u064a\7<\2\2\u064a\u00ad\3\2"+
		"\2\2\u064b\u064d\7Y\2\2\u064c\u064e\7\u00dd\2\2\u064d\u064c\3\2\2\2\u064d"+
		"\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0651\5\u010c\u0087\2\u0650\u0652"+
		"\7\u00dd\2\2\u0651\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\3\2\2"+
		"\2\u0653\u0654\5\u00caf\2\u0654\u065d\3\2\2\2\u0655\u0656\5\u00caf\2\u0656"+
		"\u0657\7\u00dd\2\2\u0657\u0658\7\u00ac\2\2\u0658\u0659\7\u00dd\2\2\u0659"+
		"\u065a\5\u00caf\2\u065a\u065d\3\2\2\2\u065b\u065d\5\u00caf\2\u065c\u064b"+
		"\3\2\2\2\u065c\u0655\3\2\2\2\u065c\u065b\3\2\2\2\u065d\u00af\3\2\2\2\u065e"+
		"\u065f\7\33\2\2\u065f\u0660\7\u00dd\2\2\u0660\u0661\5\u00b2Z\2\u0661\u0663"+
		"\5\u0126\u0094\2\u0662\u0664\5\34\17\2\u0663\u0662\3\2\2\2\u0663\u0664"+
		"\3\2\2\2\u0664\u00b1\3\2\2\2\u0665\u0675\7\66\2\2\u0666\u0671\5\u00ae"+
		"X\2\u0667\u0669\7\u00dd\2\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669"+
		"\u066a\3\2\2\2\u066a\u066c\7\3\2\2\u066b\u066d\7\u00dd\2\2\u066c\u066b"+
		"\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0670\5\u00aeX"+
		"\2\u066f\u0668\3\2\2\2\u0670\u0673\3\2\2\2\u0671\u066f\3\2\2\2\u0671\u0672"+
		"\3\2\2\2\u0672\u0675\3\2\2\2\u0673\u0671\3\2\2\2\u0674\u0665\3\2\2\2\u0674"+
		"\u0666\3\2\2\2\u0675\u00b3\3\2\2\2\u0676\u0677\7\u009d\2\2\u0677\u0678"+
		"\7\u00dd\2\2\u0678\u0681\5\u00caf\2\u0679\u067b\7\u00dd\2\2\u067a\u0679"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\7\3\2\2\u067d"+
		"\u067f\7\u00dd\2\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680"+
		"\3\2\2\2\u0680\u0682\5\u00caf\2\u0681\u067a\3\2\2\2\u0681\u0682\3\2\2"+
		"\2\u0682\u00b5\3\2\2\2\u0683\u0684\7\u009f\2\2\u0684\u0685\7\u00dd\2\2"+
		"\u0685\u0687\5\u00caf\2\u0686\u0688\7\u00dd\2\2\u0687\u0686\3\2\2\2\u0687"+
		"\u0688\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b\7\3\2\2\u068a\u068c\7\u00dd"+
		"\2\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068d\3\2\2\2\u068d"+
		"\u068e\5\u00caf\2\u068e\u00b7\3\2\2\2\u068f\u0690\7\u009e\2\2\u0690\u0691"+
		"\7\u00dd\2\2\u0691\u0693\5\u00e8u\2\u0692\u0694\7\u00dd\2\2\u0693\u0692"+
		"\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0697\7\u00bf\2"+
		"\2\u0696\u0698\7\u00dd\2\2\u0697\u0696\3\2\2\2\u0697\u0698\3\2\2\2\u0698"+
		"\u0699\3\2\2\2\u0699\u069a\5\u00caf\2\u069a\u00b9\3\2\2\2\u069b\u069c"+
		"\7\u00a5\2\2\u069c\u00bb\3\2\2\2\u069d\u069e\5\u011c\u008f\2\u069e\u069f"+
		"\7\u00dd\2\2\u069f\u06a1\3\2\2\2\u06a0\u069d\3\2\2\2\u06a0\u06a1\3\2\2"+
		"\2\u06a1\u06a4\3\2\2\2\u06a2\u06a3\7\u00a3\2\2\u06a3\u06a5\7\u00dd\2\2"+
		"\u06a4\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8"+
		"\7\u00a7\2\2\u06a7\u06a9\7\u00dd\2\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9\3"+
		"\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06af\5\u0104\u0083\2\u06ab\u06ad\7\u00dd"+
		"\2\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae"+
		"\u06b0\5\u00fa~\2\u06af\u06ac\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1"+
		"\3\2\2\2\u06b1\u06b3\5\u0126\u0094\2\u06b2\u06b4\5\34\17\2\u06b3\u06b2"+
		"\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\7=\2\2\u06b6"+
		"\u00bd\3\2\2\2\u06b7\u06b9\7\u00ab\2\2\u06b8\u06ba\7\u00dd\2\2\u06b9\u06b8"+
		"\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bd\7\u00bf\2"+
		"\2\u06bc\u06be\7\u00dd\2\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be"+
		"\u06bf\3\2\2\2\u06bf\u06c0\5\u00caf\2\u06c0\u00bf\3\2\2\2\u06c1\u06c2"+
		"\5\u011c\u008f\2\u06c2\u06c3\7\u00dd\2\2\u06c3\u06c5\3\2\2\2\u06c4\u06c1"+
		"\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7\7\u00ae\2"+
		"\2\u06c7\u06c8\7\u00dd\2\2\u06c8\u06c9\5\u0104\u0083\2\u06c9\u06cd\5\u0126"+
		"\u0094\2\u06ca\u06cc\5\u00c2b\2\u06cb\u06ca\3\2\2\2\u06cc\u06cf\3\2\2"+
		"\2\u06cd\u06cb\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d0\3\2\2\2\u06cf\u06cd"+
		"\3\2\2\2\u06d0\u06d1\7>\2\2\u06d1\u00c1\3\2\2\2\u06d2\u06e1\5\u0104\u0083"+
		"\2\u06d3\u06d5\7\u00dd\2\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5"+
		"\u06d6\3\2\2\2\u06d6\u06db\7\u00c3\2\2\u06d7\u06d9\7\u00dd\2\2\u06d8\u06d7"+
		"\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\5\u0100\u0081"+
		"\2\u06db\u06d8\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06de\3\2\2\2\u06dd\u06df"+
		"\7\u00dd\2\2\u06de\u06dd\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e0\3\2\2"+
		"\2\u06e0\u06e2\7\u00cc\2\2\u06e1\u06d4\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2"+
		"\u06e5\3\2\2\2\u06e3\u06e4\7\u00dd\2\2\u06e4\u06e6\5\u0106\u0084\2\u06e5"+
		"\u06e3\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8\5\u0126"+
		"\u0094\2\u06e8\u00c3\3\2\2\2\u06e9\u06ea\7\u00af\2\2\u06ea\u06eb\7\u00dd"+
		"\2\2\u06eb\u06f0\5\u00caf\2\u06ec\u06ed\7\u00dd\2\2\u06ed\u06ee\7Y\2\2"+
		"\u06ee\u06ef\7\u00dd\2\2\u06ef\u06f1\5\u0118\u008d\2\u06f0\u06ec\3\2\2"+
		"\2\u06f0\u06f1\3\2\2\2\u06f1\u00c5\3\2\2\2\u06f2\u06f3\7\u00b0\2\2\u06f3"+
		"\u06f4\7\u00dd\2\2\u06f4\u06f5\5\u00caf\2\u06f5\u00c7\3\2\2\2\u06f6\u06f7"+
		"\7\u00b1\2\2\u06f7\u06f8\7\u00dd\2\2\u06f8\u0707\5\u00dan\2\u06f9\u06fb"+
		"\7\u00dd\2\2\u06fa\u06f9\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\3\2\2"+
		"\2\u06fc\u06fe\7\3\2\2\u06fd\u06ff\7\u00dd\2\2\u06fe\u06fd\3\2\2\2\u06fe"+
		"\u06ff\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0705\5\u00caf\2\u0701\u0702"+
		"\7\u00dd\2\2\u0702\u0703\7\u00ac\2\2\u0703\u0704\7\u00dd\2\2\u0704\u0706"+
		"\5\u00caf\2\u0705\u0701\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0708\3\2\2"+
		"\2\u0707\u06fa\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u00c9\3\2\2\2\u0709\u070a"+
		"\bf\1\2\u070a\u0746\5\u0116\u008c\2\u070b\u0746\5\u00e8u\2\u070c\u070e"+
		"\7\u00c3\2\2\u070d\u070f\7\u00dd\2\2\u070e\u070d\3\2\2\2\u070e\u070f\3"+
		"\2\2\2\u070f\u0710\3\2\2\2\u0710\u071b\5\u00caf\2\u0711\u0713\7\u00dd"+
		"\2\2\u0712\u0711\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714\3\2\2\2\u0714"+
		"\u0716\7\3\2\2\u0715\u0717\7\u00dd\2\2\u0716\u0715\3\2\2\2\u0716\u0717"+
		"\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u071a\5\u00caf\2\u0719\u0712\3\2\2"+
		"\2\u071a\u071d\3\2\2\2\u071b\u0719\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e"+
		"\3\2\2\2\u071d\u071b\3\2\2\2\u071e\u071f\7\u00cc\2\2\u071f\u0746\3\2\2"+
		"\2\u0720\u0722\7t\2\2\u0721\u0723\7\u00dd\2\2\u0722\u0721\3\2\2\2\u0722"+
		"\u0723\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0746\5\u00caf\36\u0725\u0746"+
		"\5\u00c4c\2\u0726\u0746\5x=\2\u0727\u0729\7\f\2\2\u0728\u072a\7\u00dd"+
		"\2\2\u0729\u0728\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072b\3\2\2\2\u072b"+
		"\u0746\5\u00caf\33\u072c\u072e\5\u00e8u\2\u072d\u072f\7\u00dd\2\2\u072e"+
		"\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0732\7\u00bd"+
		"\2\2\u0731\u0733\7\u00dd\2\2\u0732\u0731\3\2\2\2\u0732\u0733\3\2\2\2\u0733"+
		"\u0734\3\2\2\2\u0734\u0735\5\u00caf\32\u0735\u0746\3\2\2\2\u0736\u0738"+
		"\7\u00c5\2\2\u0737\u0739\7\u00dd\2\2\u0738\u0737\3\2\2\2\u0738\u0739\3"+
		"\2\2\2\u0739\u073a\3\2\2\2\u073a\u0746\5\u00caf\20\u073b\u073d\7\u00c9"+
		"\2\2\u073c\u073e\7\u00dd\2\2\u073d\u073c\3\2\2\2\u073d\u073e\3\2\2\2\u073e"+
		"\u073f\3\2\2\2\u073f\u0746\5\u00caf\17\u0740\u0742\7u\2\2\u0741\u0743"+
		"\7\u00dd\2\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\3\2\2"+
		"\2\u0744\u0746\5\u00caf\3\u0745\u0709\3\2\2\2\u0745\u070b\3\2\2\2\u0745"+
		"\u070c\3\2\2\2\u0745\u0720\3\2\2\2\u0745\u0725\3\2\2\2\u0745\u0726\3\2"+
		"\2\2\u0745\u0727\3\2\2\2\u0745\u072c\3\2\2\2\u0745\u0736\3\2\2\2\u0745"+
		"\u073b\3\2\2\2\u0745\u0740\3\2\2\2\u0746\u07fd\3\2\2\2\u0747\u0749\f\31"+
		"\2\2\u0748\u074a\7\u00dd\2\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a"+
		"\u074b\3\2\2\2\u074b\u074d\7Y\2\2\u074c\u074e\7\u00dd\2\2\u074d\u074c"+
		"\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u07fc\5\u00caf"+
		"\32\u0750\u0752\f\30\2\2\u0751\u0753\7\u00dd\2\2\u0752\u0751\3\2\2\2\u0752"+
		"\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0756\7c\2\2\u0755\u0757\7\u00dd"+
		"\2\2\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0758\3\2\2\2\u0758"+
		"\u07fc\5\u00caf\31\u0759\u075b\f\27\2\2\u075a\u075c\7\u00dd\2\2\u075b"+
		"\u075a\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075f\7\u00c0"+
		"\2\2\u075e\u0760\7\u00dd\2\2\u075f\u075e\3\2\2\2\u075f\u0760\3\2\2\2\u0760"+
		"\u0761\3\2\2\2\u0761\u07fc\5\u00caf\30\u0762\u0764\f\26\2\2\u0763\u0765"+
		"\7\u00dd\2\2\u0764\u0763\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0766\3\2\2"+
		"\2\u0766\u0768\7\u00c2\2\2\u0767\u0769\7\u00dd\2\2\u0768\u0767\3\2\2\2"+
		"\u0768\u0769\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u07fc\5\u00caf\27\u076b"+
		"\u076d\f\25\2\2\u076c\u076e\7\u00dd\2\2\u076d\u076c\3\2\2\2\u076d\u076e"+
		"\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0771\7\u00c1\2\2\u0770\u0772\7\u00dd"+
		"\2\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0773\3\2\2\2\u0773"+
		"\u07fc\5\u00caf\26\u0774\u0776\f\24\2\2\u0775\u0777\7\u00dd\2\2\u0776"+
		"\u0775\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u077a\7\u00c4"+
		"\2\2\u0779\u077b\7\u00dd\2\2\u077a\u0779\3\2\2\2\u077a\u077b\3\2\2\2\u077b"+
		"\u077c\3\2\2\2\u077c\u07fc\5\u00caf\25\u077d\u077f\f\23\2\2\u077e\u0780"+
		"\7\u00dd\2\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0781\3\2\2"+
		"\2\u0781\u0783\7\u00c8\2\2\u0782\u0784\7\u00dd\2\2\u0783\u0782\3\2\2\2"+
		"\u0783\u0784\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u07fc\5\u00caf\24\u0786"+
		"\u0788\f\22\2\2\u0787\u0789\7\u00dd\2\2\u0788\u0787\3\2\2\2\u0788\u0789"+
		"\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078c\7\u00bf\2\2\u078b\u078d\7\u00dd"+
		"\2\2\u078c\u078b\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078e\3\2\2\2\u078e"+
		"\u07fc\5\u00caf\23\u078f\u0791\f\21\2\2\u0790\u0792\7\u00dd\2\2\u0791"+
		"\u0790\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0795\7\u00cb"+
		"\2\2\u0794\u0796\7\u00dd\2\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796"+
		"\u0797\3\2\2\2\u0797\u07fc\5\u00caf\22\u0798\u079a\f\16\2\2\u0799\u079b"+
		"\7\u00dd\2\2\u079a\u0799\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079c\3\2\2"+
		"\2\u079c\u079e\7\u00be\2\2\u079d\u079f\7\u00dd\2\2\u079e\u079d\3\2\2\2"+
		"\u079e\u079f\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07fc\5\u00caf\17\u07a1"+
		"\u07a3\f\r\2\2\u07a2\u07a4\7\u00dd\2\2\u07a3\u07a2\3\2\2\2\u07a3\u07a4"+
		"\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a7\7\u00c7\2\2\u07a6\u07a8\7\u00dd"+
		"\2\2\u07a7\u07a6\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9"+
		"\u07fc\5\u00caf\16\u07aa\u07ac\f\f\2\2\u07ab\u07ad\7\u00dd\2\2\u07ac\u07ab"+
		"\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b0\7q\2\2\u07af"+
		"\u07b1\7\u00dd\2\2\u07b0\u07af\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b2"+
		"\3\2\2\2\u07b2\u07fc\5\u00caf\r\u07b3\u07b5\f\13\2\2\u07b4\u07b6\7\u00dd"+
		"\2\2\u07b5\u07b4\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7"+
		"\u07b9\7\u00c9\2\2\u07b8\u07ba\7\u00dd\2\2\u07b9\u07b8\3\2\2\2\u07b9\u07ba"+
		"\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07fc\5\u00caf\f\u07bc\u07be\f\n\2"+
		"\2\u07bd\u07bf\7\u00dd\2\2\u07be\u07bd\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf"+
		"\u07c0\3\2\2\2\u07c0\u07c2\7\u00c5\2\2\u07c1\u07c3\7\u00dd\2\2\u07c2\u07c1"+
		"\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07fc\5\u00caf"+
		"\13\u07c5\u07c7\f\t\2\2\u07c6\u07c8\7\u00dd\2\2\u07c7\u07c6\3\2\2\2\u07c7"+
		"\u07c8\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\7\u00bc\2\2\u07ca\u07cc"+
		"\7\u00dd\2\2\u07cb\u07ca\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cd\3\2\2"+
		"\2\u07cd\u07fc\5\u00caf\n\u07ce\u07d0\f\b\2\2\u07cf\u07d1\7\u00dd\2\2"+
		"\u07d0\u07cf\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d4"+
		"\7U\2\2\u07d3\u07d5\7\u00dd\2\2\u07d4\u07d3\3\2\2\2\u07d4\u07d5\3\2\2"+
		"\2\u07d5\u07d6\3\2\2\2\u07d6\u07fc\5\u00caf\t\u07d7\u07d9\f\7\2\2\u07d8"+
		"\u07da\7\u00dd\2\2\u07d9\u07d8\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07db"+
		"\3\2\2\2\u07db\u07dd\7B\2\2\u07dc\u07de\7\u00dd\2\2\u07dd\u07dc\3\2\2"+
		"\2\u07dd\u07de\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07fc\5\u00caf\b\u07e0"+
		"\u07e2\f\6\2\2\u07e1\u07e3\7\u00dd\2\2\u07e2\u07e1\3\2\2\2\u07e2\u07e3"+
		"\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e6\7\u00bb\2\2\u07e5\u07e7\7\u00dd"+
		"\2\2\u07e6\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8"+
		"\u07fc\5\u00caf\7\u07e9\u07eb\f\5\2\2\u07ea\u07ec\7\u00dd\2\2\u07eb\u07ea"+
		"\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ef\7\u0081\2"+
		"\2\u07ee\u07f0\7\u00dd\2\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0"+
		"\u07f1\3\2\2\2\u07f1\u07fc\5\u00caf\6\u07f2\u07f4\f\4\2\2\u07f3\u07f5"+
		"\7\u00dd\2\2\u07f4\u07f3\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f6\3\2\2"+
		"\2\u07f6\u07f8\7\16\2\2\u07f7\u07f9\7\u00dd\2\2\u07f8\u07f7\3\2\2\2\u07f8"+
		"\u07f9\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fc\5\u00caf\5\u07fb\u0747"+
		"\3\2\2\2\u07fb\u0750\3\2\2\2\u07fb\u0759\3\2\2\2\u07fb\u0762\3\2\2\2\u07fb"+
		"\u076b\3\2\2\2\u07fb\u0774\3\2\2\2\u07fb\u077d\3\2\2\2\u07fb\u0786\3\2"+
		"\2\2\u07fb\u078f\3\2\2\2\u07fb\u0798\3\2\2\2\u07fb\u07a1\3\2\2\2\u07fb"+
		"\u07aa\3\2\2\2\u07fb\u07b3\3\2\2\2\u07fb\u07bc\3\2\2\2\u07fb\u07c5\3\2"+
		"\2\2\u07fb\u07ce\3\2\2\2\u07fb\u07d7\3\2\2\2\u07fb\u07e0\3\2\2\2\u07fb"+
		"\u07e9\3\2\2\2\u07fb\u07f2\3\2\2\2\u07fc\u07ff\3\2\2\2\u07fd\u07fb\3\2"+
		"\2\2\u07fd\u07fe\3\2\2\2\u07fe\u00cb\3\2\2\2\u07ff\u07fd\3\2\2\2\u0800"+
		"\u0804\7\62\2\2\u0801\u0804\7\u00a3\2\2\u0802\u0804\5\u011c\u008f\2\u0803"+
		"\u0800\3\2\2\2\u0803\u0801\3\2\2\2\u0803\u0802\3\2\2\2\u0804\u0805\3\2"+
		"\2\2\u0805\u0808\7\u00dd\2\2\u0806\u0807\7\u00b9\2\2\u0807\u0809\7\u00dd"+
		"\2\2\u0808\u0806\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080a\3\2\2\2\u080a"+
		"\u080b\5\u00ceh\2\u080b\u00cd\3\2\2\2\u080c\u0817\5\u00d0i\2\u080d\u080f"+
		"\7\u00dd\2\2\u080e\u080d\3\2\2\2\u080e\u080f\3\2\2\2\u080f\u0810\3\2\2"+
		"\2\u0810\u0812\7\3\2\2\u0811\u0813\7\u00dd\2\2\u0812\u0811\3\2\2\2\u0812"+
		"\u0813\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0816\5\u00d0i\2\u0815\u080e"+
		"\3\2\2\2\u0816\u0819\3\2\2\2\u0817\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818"+
		"\u00cf\3\2\2\2\u0819\u0817\3\2\2\2\u081a\u082c\5\u0104\u0083\2\u081b\u081d"+
		"\7\u00dd\2\2\u081c\u081b\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081e\3\2\2"+
		"\2\u081e\u0820\7\u00c3\2\2\u081f\u0821\7\u00dd\2\2\u0820\u081f\3\2\2\2"+
		"\u0820\u0821\3\2\2\2\u0821\u0826\3\2\2\2\u0822\u0824\5\u0100\u0081\2\u0823"+
		"\u0825\7\u00dd\2\2\u0824\u0823\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0827"+
		"\3\2\2\2\u0826\u0822\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\3\2\2\2\u0828"+
		"\u082a\7\u00cc\2\2\u0829\u082b\7\u00dd\2\2\u082a\u0829\3\2\2\2\u082a\u082b"+
		"\3\2\2\2\u082b\u082d\3\2\2\2\u082c\u081c\3\2\2\2\u082c\u082d\3\2\2\2\u082d"+
		"\u082f\3\2\2\2\u082e\u0830\5\u011a\u008e\2\u082f\u082e\3\2\2\2\u082f\u0830"+
		"\3\2\2\2\u0830\u0833\3\2\2\2\u0831\u0832\7\u00dd\2\2\u0832\u0834\5\u0106"+
		"\u0084\2\u0833\u0831\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u00d1\3\2\2\2\u0835"+
		"\u0836\7\u00b6\2\2\u0836\u0837\7\u00dd\2\2\u0837\u0838\5\u00caf\2\u0838"+
		"\u083a\5\u0126\u0094\2\u0839\u083b\5\34\17\2\u083a\u0839\3\2\2\2\u083a"+
		"\u083b\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083d\7\u00b5\2\2\u083d\u00d3"+
		"\3\2\2\2\u083e\u083f\7\u00b7\2\2\u083f\u0840\7\u00dd\2\2\u0840\u0842\5"+
		"\u00dan\2\u0841\u0843\7\u00dd\2\2\u0842\u0841\3\2\2\2\u0842\u0843\3\2"+
		"\2\2\u0843\u0844\3\2\2\2\u0844\u0846\7\3\2\2\u0845\u0847\7\u00dd\2\2\u0846"+
		"\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\5\u00ca"+
		"f\2\u0849\u00d5\3\2\2\2\u084a\u084b\7\u00b8\2\2\u084b\u0850\7\u00dd\2"+
		"\2\u084c\u0851\5\u00e8u\2\u084d\u084e\7t\2\2\u084e\u084f\7\u00dd\2\2\u084f"+
		"\u0851\5\u0118\u008d\2\u0850\u084c\3\2\2\2\u0850\u084d\3\2\2\2\u0851\u0852"+
		"\3\2\2\2\u0852\u0854\5\u0126\u0094\2\u0853\u0855\5\34\17\2\u0854\u0853"+
		"\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0857\7?\2\2\u0857"+
		"\u00d7\3\2\2\2\u0858\u0859\7\u00ba\2\2\u0859\u085a\7\u00dd\2\2\u085a\u085c"+
		"\5\u00dan\2\u085b\u085d\7\u00dd\2\2\u085c\u085b\3\2\2\2\u085c\u085d\3"+
		"\2\2\2\u085d\u085e\3\2\2\2\u085e\u0863\7\3\2\2\u085f\u0861\7\u00dd\2\2"+
		"\u0860\u085f\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0864"+
		"\5\u0086D\2\u0863\u0860\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u00d9\3\2\2"+
		"\2\u0865\u0867\7\5\2\2\u0866\u0865\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868"+
		"\3\2\2\2\u0868\u0869\5\u00caf\2\u0869\u00db\3\2\2\2\u086a\u086d\5\u00de"+
		"p\2\u086b\u086d\5\u00e0q\2\u086c\u086a\3\2\2\2\u086c\u086b\3\2\2\2\u086d"+
		"\u00dd\3\2\2\2\u086e\u086f\7\32\2\2\u086f\u0870\7\u00dd\2\2\u0870\u0872"+
		"\5\u0104\u0083\2\u0871\u0873\5\u011a\u008e\2\u0872\u0871\3\2\2\2\u0872"+
		"\u0873\3\2\2\2\u0873\u0881\3\2\2\2\u0874\u0876\7\u00dd\2\2\u0875\u0874"+
		"\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0879\7\u00c3\2"+
		"\2\u0878\u087a\7\u00dd\2\2\u0879\u0878\3\2\2\2\u0879\u087a\3\2\2\2\u087a"+
		"\u087b\3\2\2\2\u087b\u087d\5\u00f4{\2\u087c\u087e\7\u00dd\2\2\u087d\u087c"+
		"\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\7\u00cc\2"+
		"\2\u0880\u0882\3\2\2\2\u0881\u0875\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u088c"+
		"\3\2\2\2\u0883\u0885\7\u00dd\2\2\u0884\u0883\3\2\2\2\u0884\u0885\3\2\2"+
		"\2\u0885\u0886\3\2\2\2\u0886\u0887\7\u00c3\2\2\u0887\u0888\5\u0100\u0081"+
		"\2\u0888\u0889\7\u00cc\2\2\u0889\u088b\3\2\2\2\u088a\u0884\3\2\2\2\u088b"+
		"\u088e\3\2\2\2\u088c\u088a\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u00df\3\2"+
		"\2\2\u088e\u088c\3\2\2\2\u088f\u0890\7\32\2\2\u0890\u0892\7\u00dd\2\2"+
		"\u0891\u0893\5\u00e8u\2\u0892\u0891\3\2\2\2\u0892\u0893\3\2\2\2\u0893"+
		"\u0894\3\2\2\2\u0894\u0895\7\6\2\2\u0895\u0897\5\u0104\u0083\2\u0896\u0898"+
		"\5\u011a\u008e\2\u0897\u0896\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u08a6\3"+
		"\2\2\2\u0899\u089b\7\u00dd\2\2\u089a\u0899\3\2\2\2\u089a\u089b\3\2\2\2"+
		"\u089b\u089c\3\2\2\2\u089c\u089e\7\u00c3\2\2\u089d\u089f\7\u00dd\2\2\u089e"+
		"\u089d\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a2\5\u00f4"+
		"{\2\u08a1\u08a3\7\u00dd\2\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3"+
		"\u08a4\3\2\2\2\u08a4\u08a5\7\u00cc\2\2\u08a5\u08a7\3\2\2\2\u08a6\u089a"+
		"\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08b1\3\2\2\2\u08a8\u08aa\7\u00dd\2"+
		"\2\u08a9\u08a8\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ac"+
		"\7\u00c3\2\2\u08ac\u08ad\5\u0100\u0081\2\u08ad\u08ae\7\u00cc\2\2\u08ae"+
		"\u08b0\3\2\2\2\u08af\u08a9\3\2\2\2\u08b0\u08b3\3\2\2\2\u08b1\u08af\3\2"+
		"\2\2\u08b1\u08b2\3\2\2\2\u08b2\u00e1\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b4"+
		"\u08b7\5\u00e4s\2\u08b5\u08b7\5\u00e6t\2\u08b6\u08b4\3\2\2\2\u08b6\u08b5"+
		"\3\2\2\2\u08b7\u00e3\3\2\2\2\u08b8\u08ba\5\u00e8u\2\u08b9\u08b8\3\2\2"+
		"\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08bc\7\6\2\2\u08bc\u08be"+
		"\5\u0104\u0083\2\u08bd\u08bf\5\u011a\u008e\2\u08be\u08bd\3\2\2\2\u08be"+
		"\u08bf\3\2\2\2\u08bf\u08c2\3\2\2\2\u08c0\u08c1\7\u00dd\2\2\u08c1\u08c3"+
		"\5\u00f4{\2\u08c2\u08c0\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c5\3\2\2"+
		"\2\u08c4\u08c6\5\u00f8}\2\u08c5\u08c4\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6"+
		"\u08d0\3\2\2\2\u08c7\u08c9\7\u00dd\2\2\u08c8\u08c7\3\2\2\2\u08c8\u08c9"+
		"\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb\7\u00c3\2\2\u08cb\u08cc\5\u0100"+
		"\u0081\2\u08cc\u08cd\7\u00cc\2\2\u08cd\u08cf\3\2\2\2\u08ce\u08c8\3\2\2"+
		"\2\u08cf\u08d2\3\2\2\2\u08d0\u08ce\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u00e5"+
		"\3\2\2\2\u08d2\u08d0\3\2\2\2\u08d3\u08d6\5\u010a\u0086\2\u08d4\u08d5\7"+
		"\u00dd\2\2\u08d5\u08d7\5\u00f4{\2\u08d6\u08d4\3\2\2\2\u08d6\u08d7\3\2"+
		"\2\2\u08d7\u08e1\3\2\2\2\u08d8\u08da\7\u00dd\2\2\u08d9\u08d8\3\2\2\2\u08d9"+
		"\u08da\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u08dc\7\u00c3\2\2\u08dc\u08dd"+
		"\5\u0100\u0081\2\u08dd\u08de\7\u00cc\2\2\u08de\u08e0\3\2\2\2\u08df\u08d9"+
		"\3\2\2\2\u08e0\u08e3\3\2\2\2\u08e1\u08df\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2"+
		"\u00e7\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e4\u08e9\5\u00eex\2\u08e5\u08e9"+
		"\5\u00eav\2\u08e6\u08e9\5\u00ecw\2\u08e7\u08e9\5\u00f2z\2\u08e8\u08e4"+
		"\3\2\2\2\u08e8\u08e5\3\2\2\2\u08e8\u08e6\3\2\2\2\u08e8\u08e7\3\2\2\2\u08e9"+
		"\u00e9\3\2\2\2\u08ea\u08ec\5\u0104\u0083\2\u08eb\u08ed\5\u011a\u008e\2"+
		"\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ef\3\2\2\2\u08ee\u08f0"+
		"\5\u00f8}\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08fa\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u08f1\u08f3\7\u00dd\2\2\u08f2\u08f1\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3"+
		"\u08f4\3\2\2\2\u08f4\u08f5\7\u00c3\2\2\u08f5\u08f6\5\u0100\u0081\2\u08f6"+
		"\u08f7\7\u00cc\2\2\u08f7\u08f9\3\2\2\2\u08f8\u08f2\3\2\2\2\u08f9\u08fc"+
		"\3\2\2\2\u08fa\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u00eb\3\2\2\2\u08fc"+
		"\u08fa\3\2\2\2\u08fd\u0900\5\u0104\u0083\2\u08fe\u0900\5\u0108\u0085\2"+
		"\u08ff\u08fd\3\2\2\2\u08ff\u08fe\3\2\2\2\u0900\u0902\3\2\2\2\u0901\u0903"+
		"\5\u011a\u008e\2\u0902\u0901\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0905\3"+
		"\2\2\2\u0904\u0906\7\u00dd\2\2\u0905\u0904\3\2\2\2\u0905\u0906\3\2\2\2"+
		"\u0906\u0907\3\2\2\2\u0907\u0909\7\u00c3\2\2\u0908\u090a\7\u00dd\2\2\u0909"+
		"\u0908\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090f\3\2\2\2\u090b\u090d\5\u00f4"+
		"{\2\u090c\u090e\7\u00dd\2\2\u090d\u090c\3\2\2\2\u090d\u090e\3\2\2\2\u090e"+
		"\u0910\3\2\2\2\u090f\u090b\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0911\3\2"+
		"\2\2\u0911\u0913\7\u00cc\2\2\u0912\u0914\5\u00f8}\2\u0913\u0912\3\2\2"+
		"\2\u0913\u0914\3\2\2\2\u0914\u091e\3\2\2\2\u0915\u0917\7\u00dd\2\2\u0916"+
		"\u0915\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u0919\7\u00c3"+
		"\2\2\u0919\u091a\5\u0100\u0081\2\u091a\u091b\7\u00cc\2\2\u091b\u091d\3"+
		"\2\2\2\u091c\u0916\3\2\2\2\u091d\u0920\3\2\2\2\u091e\u091c\3\2\2\2\u091e"+
		"\u091f\3\2\2\2\u091f\u00ed\3\2\2\2\u0920\u091e\3\2\2\2\u0921\u0924\5\u00ea"+
		"v\2\u0922\u0924\5\u00ecw\2\u0923\u0921\3\2\2\2\u0923\u0922\3\2\2\2\u0923"+
		"\u0924\3\2\2\2\u0924\u0926\3\2\2\2\u0925\u0927\5\u00f0y\2\u0926\u0925"+
		"\3\2\2\2\u0927\u0928\3\2\2\2\u0928\u0926\3\2\2\2\u0928\u0929\3\2\2\2\u0929"+
		"\u092b\3\2\2\2\u092a\u092c\5\u00f8}\2\u092b\u092a\3\2\2\2\u092b\u092c"+
		"\3\2\2\2\u092c\u0936\3\2\2\2\u092d\u092f\7\u00dd\2\2\u092e\u092d\3\2\2"+
		"\2\u092e\u092f\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0931\7\u00c3\2\2\u0931"+
		"\u0932\5\u0100\u0081\2\u0932\u0933\7\u00cc\2\2\u0933\u0935\3\2\2\2\u0934"+
		"\u092e\3\2\2\2\u0935\u0938\3\2\2\2\u0936\u0934\3\2\2\2\u0936\u0937\3\2"+
		"\2\2\u0937\u00ef\3\2\2\2\u0938\u0936\3\2\2\2\u0939\u093c\t\r\2\2\u093a"+
		"\u093d\5\u00eav\2\u093b\u093d\5\u00ecw\2\u093c\u093a\3\2\2\2\u093c\u093b"+
		"\3\2\2\2\u093d\u00f1\3\2\2\2\u093e\u093f\5\u00f8}\2\u093f\u00f3\3\2\2"+
		"\2\u0940\u0942\5\u00f6|\2\u0941\u0940\3\2\2\2\u0941\u0942\3\2\2\2\u0942"+
		"\u0944\3\2\2\2\u0943\u0945\7\u00dd\2\2\u0944\u0943\3\2\2\2\u0944\u0945"+
		"\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u0948\t\13\2\2\u0947\u0949\7\u00dd"+
		"\2\2\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094b\3\2\2\2\u094a"+
		"\u0941\3\2\2\2\u094b\u094e\3\2\2\2\u094c\u094a\3\2\2\2\u094c\u094d\3\2"+
		"\2\2\u094d\u094f\3\2\2\2\u094e\u094c\3\2\2\2\u094f\u095c\5\u00f6|\2\u0950"+
		"\u0952\7\u00dd\2\2\u0951\u0950\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0953"+
		"\3\2\2\2\u0953\u0955\t\13\2\2\u0954\u0956\7\u00dd\2\2\u0955\u0954\3\2"+
		"\2\2\u0955\u0956\3\2\2\2\u0956\u0958\3\2\2\2\u0957\u0959\5\u00f6|\2\u0958"+
		"\u0957\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u095b\3\2\2\2\u095a\u0951\3\2"+
		"\2\2\u095b\u095e\3\2\2\2\u095c\u095a\3\2\2\2\u095c\u095d\3\2\2\2\u095d"+
		"\u00f5\3\2\2\2\u095e\u095c\3\2\2\2\u095f\u0961\7\u00c3\2\2\u0960\u095f"+
		"\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0964\3\2\2\2\u0962\u0963\t\16\2\2"+
		"\u0963\u0965\7\u00dd\2\2\u0964\u0962\3\2\2\2\u0964\u0965\3\2\2\2\u0965"+
		"\u0967\3\2\2\2\u0966\u0968\7\u00cc\2\2\u0967\u0966\3\2\2\2\u0967\u0968"+
		"\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u096a\5\u00caf\2\u096a\u00f7\3\2\2"+
		"\2\u096b\u096c\7\7\2\2\u096c\u096e\5\u0104\u0083\2\u096d\u096f\5\u011a"+
		"\u008e\2\u096e\u096d\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u00f9\3\2\2\2\u0970"+
		"\u0982\7\u00c3\2\2\u0971\u0973\7\u00dd\2\2\u0972\u0971\3\2\2\2\u0972\u0973"+
		"\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u097f\5\u00fc\177\2\u0975\u0977\7\u00dd"+
		"\2\2\u0976\u0975\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\3\2\2\2\u0978"+
		"\u097a\7\3\2\2\u0979\u097b\7\u00dd\2\2\u097a\u0979\3\2\2\2\u097a\u097b"+
		"\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097e\5\u00fc\177\2\u097d\u0976\3\2"+
		"\2\2\u097e\u0981\3\2\2\2\u097f\u097d\3\2\2\2\u097f\u0980\3\2\2\2\u0980"+
		"\u0983\3\2\2\2\u0981\u097f\3\2\2\2\u0982\u0972\3\2\2\2\u0982\u0983\3\2"+
		"\2\2\u0983\u0985\3\2\2\2\u0984\u0986\7\u00dd\2\2\u0985\u0984\3\2\2\2\u0985"+
		"\u0986\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0988\7\u00cc\2\2\u0988\u00fb"+
		"\3\2\2\2\u0989\u098a\7|\2\2\u098a\u098c\7\u00dd\2\2\u098b\u0989\3\2\2"+
		"\2\u098b\u098c\3\2\2\2\u098c\u098f\3\2\2\2\u098d\u098e\t\17\2\2\u098e"+
		"\u0990\7\u00dd\2\2\u098f\u098d\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0993"+
		"\3\2\2\2\u0991\u0992\7\u0083\2\2\u0992\u0994\7\u00dd\2\2\u0993\u0991\3"+
		"\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0997\5\u0104\u0083"+
		"\2\u0996\u0998\5\u011a\u008e\2\u0997\u0996\3\2\2\2\u0997\u0998\3\2\2\2"+
		"\u0998\u09a1\3\2\2\2\u0999\u099b\7\u00dd\2\2\u099a\u0999\3\2\2\2\u099a"+
		"\u099b\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099e\7\u00c3\2\2\u099d\u099f"+
		"\7\u00dd\2\2\u099e\u099d\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a0\3\2\2"+
		"\2\u09a0\u09a2\7\u00cc\2\2\u09a1\u099a\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2"+
		"\u09a7\3\2\2\2\u09a3\u09a5\7\u00dd\2\2\u09a4\u09a3\3\2\2\2\u09a4\u09a5"+
		"\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a8\5\u0106\u0084\2\u09a7\u09a4\3"+
		"\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09ad\3\2\2\2\u09a9\u09ab\7\u00dd\2\2"+
		"\u09aa\u09a9\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ae"+
		"\5\u00fe\u0080\2\u09ad\u09aa\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u00fd\3"+
		"\2\2\2\u09af\u09b1\7\u00bf\2\2\u09b0\u09b2\7\u00dd\2\2\u09b1\u09b0\3\2"+
		"\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09b4\5\u00caf\2\u09b4"+
		"\u00ff\3\2\2\2\u09b5\u09c0\5\u0102\u0082\2\u09b6\u09b8\7\u00dd\2\2\u09b7"+
		"\u09b6\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09bb\7\3"+
		"\2\2\u09ba\u09bc\7\u00dd\2\2\u09bb\u09ba\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc"+
		"\u09bd\3\2\2\2\u09bd\u09bf\5\u0102\u0082\2\u09be\u09b7\3\2\2\2\u09bf\u09c2"+
		"\3\2\2\2\u09c0\u09be\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u0101\3\2\2\2\u09c2"+
		"\u09c0\3\2\2\2\u09c3\u09c4\5\u00caf\2\u09c4\u09c5\7\u00dd\2\2\u09c5\u09c6"+
		"\7\u00ac\2\2\u09c6\u09c7\7\u00dd\2\2\u09c7\u09c9\3\2\2\2\u09c8\u09c3\3"+
		"\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\5\u00caf\2"+
		"\u09cb\u0103\3\2\2\2\u09cc\u09cf\7\u00de\2\2\u09cd\u09cf\5\u011e\u0090"+
		"\2\u09ce\u09cc\3\2\2\2\u09ce\u09cd\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09ce"+
		"\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u0105\3\2\2\2\u09d2\u09d4\7\22\2\2"+
		"\u09d3\u09d5\7\u00dd\2\2\u09d4\u09d3\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5"+
		"\u09d8\3\2\2\2\u09d6\u09d7\7t\2\2\u09d7\u09d9\7\u00dd\2\2\u09d8\u09d6"+
		"\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09df\5\u0118\u008d"+
		"\2\u09db\u09dd\7\u00dd\2\2\u09dc\u09db\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd"+
		"\u09de\3\2\2\2\u09de\u09e0\5\u0110\u0089\2\u09df\u09dc\3\2\2\2\u09df\u09e0"+
		"\3\2\2\2\u09e0\u0107\3\2\2\2\u09e1\u09f6\7\26\2\2\u09e2\u09f6\7\31\2\2"+
		"\u09e3\u09f6\7 \2\2\u09e4\u09f6\7#\2\2\u09e5\u09f6\7\64\2\2\u09e6\u09f6"+
		"\7Z\2\2\u09e7\u09f6\7^\2\2\u09e8\u09f6\7\u00a1\2\2\u09e9\u09f2\7\u00a6"+
		"\2\2\u09ea\u09ec\7\u00dd\2\2\u09eb\u09ea\3\2\2\2\u09eb\u09ec\3\2\2\2\u09ec"+
		"\u09ed\3\2\2\2\u09ed\u09ef\7\u00c7\2\2\u09ee\u09f0\7\u00dd\2\2\u09ef\u09ee"+
		"\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u09f3\5\u00caf"+
		"\2\u09f2\u09eb\3\2\2\2\u09f2\u09f3\3\2\2\2\u09f3\u09f6\3\2\2\2\u09f4\u09f6"+
		"\7\u00b3\2\2\u09f5\u09e1\3\2\2\2\u09f5\u09e2\3\2\2\2\u09f5\u09e3\3\2\2"+
		"\2\u09f5\u09e4\3\2\2\2\u09f5\u09e5\3\2\2\2\u09f5\u09e6\3\2\2\2\u09f5\u09e7"+
		"\3\2\2\2\u09f5\u09e8\3\2\2\2\u09f5\u09e9\3\2\2\2\u09f5\u09f4\3\2\2\2\u09f6"+
		"\u0109\3\2\2\2\u09f7\u09fc\7\u00de\2\2\u09f8\u09fb\5\u011e\u0090\2\u09f9"+
		"\u09fb\7\u00de\2\2\u09fa\u09f8\3\2\2\2\u09fa\u09f9\3\2\2\2\u09fb\u09fe"+
		"\3\2\2\2\u09fc\u09fa\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u0a07\3\2\2\2\u09fe"+
		"\u09fc\3\2\2\2\u09ff\u0a02\5\u011e\u0090\2\u0a00\u0a03\5\u011e\u0090\2"+
		"\u0a01\u0a03\7\u00de\2\2\u0a02\u0a00\3\2\2\2\u0a02\u0a01\3\2\2\2\u0a03"+
		"\u0a04\3\2\2\2\u0a04\u0a02\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a07\3\2"+
		"\2\2\u0a06\u09f7\3\2\2\2\u0a06\u09ff\3\2\2\2\u0a07\u010b\3\2\2\2\u0a08"+
		"\u0a09\t\20\2\2\u0a09\u010d\3\2\2\2\u0a0a\u0a0f\5\u0104\u0083\2\u0a0b"+
		"\u0a0c\t\r\2\2\u0a0c\u0a0e\5\u0104\u0083\2\u0a0d\u0a0b\3\2\2\2\u0a0e\u0a11"+
		"\3\2\2\2\u0a0f\u0a0d\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u010f\3\2\2\2\u0a11"+
		"\u0a0f\3\2\2\2\u0a12\u0a14\7\u00c7\2\2\u0a13\u0a15\7\u00dd\2\2\u0a14\u0a13"+
		"\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a18\3\2\2\2\u0a16\u0a19\7\u00d3\2"+
		"\2\u0a17\u0a19\5\u0104\u0083\2\u0a18\u0a16\3\2\2\2\u0a18\u0a17\3\2\2\2"+
		"\u0a19\u0111\3\2\2\2\u0a1a\u0a23\5\u010a\u0086\2\u0a1b\u0a1d\7\u00dd\2"+
		"\2\u0a1c\u0a1b\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u0a20"+
		"\7\u00c5\2\2\u0a1f\u0a21\7\u00dd\2\2\u0a20\u0a1f\3\2\2\2\u0a20\u0a21\3"+
		"\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a24\5\u010a\u0086\2\u0a23\u0a1c\3\2"+
		"\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0113\3\2\2\2\u0a25\u0a26\5\u0104\u0083"+
		"\2\u0a26\u0a27\7\u00db\2\2\u0a27\u0115\3\2\2\2\u0a28\u0a29\t\21\2\2\u0a29"+
		"\u0117\3\2\2\2\u0a2a\u0a2d\5\u0108\u0085\2\u0a2b\u0a2d\5\u010e\u0088\2"+
		"\u0a2c\u0a2a\3\2\2\2\u0a2c\u0a2b\3\2\2\2\u0a2d\u0a36\3\2\2\2\u0a2e\u0a30"+
		"\7\u00dd\2\2\u0a2f\u0a2e\3\2\2\2\u0a2f\u0a30\3\2\2\2\u0a30\u0a31\3\2\2"+
		"\2\u0a31\u0a33\7\u00c3\2\2\u0a32\u0a34\7\u00dd\2\2\u0a33\u0a32\3\2\2\2"+
		"\u0a33\u0a34\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a37\7\u00cc\2\2\u0a36"+
		"\u0a2f\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37\u0119\3\2\2\2\u0a38\u0a39\t\22"+
		"\2\2\u0a39\u011b\3\2\2\2\u0a3a\u0a3b\t\23\2\2\u0a3b\u011d\3\2\2\2\u0a3c"+
		"\u0a3d\t\24\2\2\u0a3d\u011f\3\2\2\2\u0a3e\u0a3f\7\u00d8\2\2\u0a3f\u0121"+
		"\3\2\2\2\u0a40\u0a41\7\u00d9\2\2\u0a41\u0123\3\2\2\2\u0a42\u0a44\7\u00dd"+
		"\2\2\u0a43\u0a42\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a48\3\2\2\2\u0a45"+
		"\u0a49\7\u00d7\2\2\u0a46\u0a49\5\u0122\u0092\2\u0a47\u0a49\5\u0120\u0091"+
		"\2\u0a48\u0a45\3\2\2\2\u0a48\u0a46\3\2\2\2\u0a48\u0a47\3\2\2\2\u0a49\u0a4b"+
		"\3\2\2\2\u0a4a\u0a4c\7\u00dd\2\2\u0a4b\u0a4a\3\2\2\2\u0a4b\u0a4c\3\2\2"+
		"\2\u0a4c\u0125\3\2\2\2\u0a4d\u0a56\5\u0124\u0093\2\u0a4e\u0a50\7\u00dd"+
		"\2\2\u0a4f\u0a4e\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51"+
		"\u0a53\7\u00db\2\2\u0a52\u0a54\7\u00dd\2\2\u0a53\u0a52\3\2\2\2\u0a53\u0a54"+
		"\3\2\2\2\u0a54\u0a56\3\2\2\2\u0a55\u0a4d\3\2\2\2\u0a55\u0a4f\3\2\2\2\u0a56"+
		"\u0a59\3\2\2\2\u0a57\u0a55\3\2\2\2\u0a57\u0a58\3\2\2\2\u0a58\u0127\3\2"+
		"\2\2\u0a59\u0a57\3\2\2\2\u01c5\u012c\u0131\u0138\u013b\u013e\u0143\u0147"+
		"\u014c\u0150\u0155\u0159\u015e\u0162\u016e\u0174\u017a\u017e\u0184\u018b"+
		"\u018f\u0195\u019b\u01a1\u01ac\u01b8\u01bc\u01c2\u01c8\u01ce\u01d7\u01dd"+
		"\u01e1\u01e5\u01e9\u01ee\u01f7\u0240\u0246\u024a\u024d\u025d\u0261\u0266"+
		"\u0269\u026e\u0274\u0278\u027d\u0282\u0286\u0289\u028d\u0293\u0297\u029e"+
		"\u02a4\u02a8\u02ab\u02b0\u02ba\u02bd\u02c0\u02c4\u02ca\u02ce\u02d3\u02da"+
		"\u02de\u02e2\u02e6\u02e9\u02ee\u02f9\u0306\u030d\u0316\u031d\u0321\u0324"+
		"\u032d\u0332\u033c\u0342\u034c\u0350\u035a\u0362\u0367\u036d\u0371\u0374"+
		"\u0378\u0383\u0387\u038c\u0391\u0395\u0399\u039d\u03a0\u03a3\u03a6\u03a9"+
		"\u03ad\u03b5\u03b9\u03bc\u03bf\u03c3\u03da\u03e0\u03e4\u03e8\u03f1\u03fc"+
		"\u0401\u040b\u040f\u0414\u041c\u0420\u0424\u042c\u0430\u043c\u0440\u0447"+
		"\u0449\u044f\u0453\u0459\u045d\u0461\u0469\u046d\u0473\u047c\u047e\u0483"+
		"\u048c\u048e\u0496\u0498\u049d\u04a1\u04a5\u04bd\u04c7\u04cb\u04d0\u04db"+
		"\u04df\u04e4\u04f2\u04f6\u04ff\u0503\u0506\u050a\u050e\u0511\u0515\u0519"+
		"\u051c\u0520\u0523\u0527\u0529\u052e\u0532\u0536\u053a\u053c\u0542\u0546"+
		"\u0549\u054e\u0552\u0558\u055b\u055e\u0562\u0566\u056d\u0571\u0577\u057a"+
		"\u057e\u0585\u0589\u058f\u0592\u0596\u059e\u05a2\u05a5\u05a8\u05ac\u05b4"+
		"\u05b8\u05bc\u05be\u05c1\u05c6\u05cc\u05d0\u05d4\u05d9\u05de\u05e2\u05e6"+
		"\u05eb\u05f3\u05f5\u0601\u0605\u060d\u0611\u0619\u061d\u0621\u0625\u0629"+
		"\u062d\u0635\u0639\u0646\u064d\u0651\u065c\u0663\u0668\u066c\u0671\u0674"+
		"\u067a\u067e\u0681\u0687\u068b\u0693\u0697\u06a0\u06a4\u06a8\u06ac\u06af"+
		"\u06b3\u06b9\u06bd\u06c4\u06cd\u06d4\u06d8\u06db\u06de\u06e1\u06e5\u06f0"+
		"\u06fa\u06fe\u0705\u0707\u070e\u0712\u0716\u071b\u0722\u0729\u072e\u0732"+
		"\u0738\u073d\u0742\u0745\u0749\u074d\u0752\u0756\u075b\u075f\u0764\u0768"+
		"\u076d\u0771\u0776\u077a\u077f\u0783\u0788\u078c\u0791\u0795\u079a\u079e"+
		"\u07a3\u07a7\u07ac\u07b0\u07b5\u07b9\u07be\u07c2\u07c7\u07cb\u07d0\u07d4"+
		"\u07d9\u07dd\u07e2\u07e6\u07eb\u07ef\u07f4\u07f8\u07fb\u07fd\u0803\u0808"+
		"\u080e\u0812\u0817\u081c\u0820\u0824\u0826\u082a\u082c\u082f\u0833\u083a"+
		"\u0842\u0846\u0850\u0854\u085c\u0860\u0863\u0866\u086c\u0872\u0875\u0879"+
		"\u087d\u0881\u0884\u088c\u0892\u0897\u089a\u089e\u08a2\u08a6\u08a9\u08b1"+
		"\u08b6\u08b9\u08be\u08c2\u08c5\u08c8\u08d0\u08d6\u08d9\u08e1\u08e8\u08ec"+
		"\u08ef\u08f2\u08fa\u08ff\u0902\u0905\u0909\u090d\u090f\u0913\u0916\u091e"+
		"\u0923\u0928\u092b\u092e\u0936\u093c\u0941\u0944\u0948\u094c\u0951\u0955"+
		"\u0958\u095c\u0960\u0964\u0967\u096e\u0972\u0976\u097a\u097f\u0982\u0985"+
		"\u098b\u098f\u0993\u0997\u099a\u099e\u09a1\u09a4\u09a7\u09aa\u09ad\u09b1"+
		"\u09b7\u09bb\u09c0\u09c8\u09ce\u09d0\u09d4\u09d8\u09dc\u09df\u09eb\u09ef"+
		"\u09f2\u09f5\u09fa\u09fc\u0a02\u0a04\u0a06\u0a0f\u0a14\u0a18\u0a1c\u0a20"+
		"\u0a23\u0a2c\u0a2f\u0a33\u0a36\u0a43\u0a48\u0a4b\u0a4f\u0a53\u0a55\u0a57";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}