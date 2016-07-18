// Generated from WDL.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WDL extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, BOOLEAN=2, PRIMITIVE_TYPE=3, ARRAY_TYPE=4, OBJECT_TYPE=5, MAP_TYPE=6, 
		TASK=7, WORKFLOW=8, AS=9, IMPORT=10, FQNAME=11, IDENTIFIER=12, STRING=13, 
		DOUBLE_QUOTE_STRING=14, SINGLE_QUOTE_STRING=15, STRING_CONTENTS=16, NO_QUOTE_OR_NEWLINE=17, 
		ESCAPED=18, OCTAL_CHAR=19, HEX_CHAR=20, UNICODE_CHAR=21, INTEGER=22, OCTAL=23, 
		HEX=24, DECIMAL=25, FLOAT=26, COMMA=27, DOT=28, COLON=29, LEFT_BRACKET=30, 
		RIGHT_BRACKET=31, LEFT_BRACE=32, RIGHT_BRACE=33, LEFT_PAREN=34, RIGHT_PAREN=35, 
		PLUS=36, MINUS=37, QUESTION=38, TIMES=39, DIVIDE=40, MODULO=41, GTEQ=42, 
		LTEQ=43, GT=44, LT=45, EQUALITY=46, EQUALS=47, NEQ=48, BANG=49, AND=50, 
		OR=51;
	public static final int
		RULE_document = 0, RULE_wdlimport = 1, RULE_import_location = 2, RULE_import_name = 3, 
		RULE_task = 4, RULE_task_name = 5, RULE_task_sections = 6, RULE_workflow = 7, 
		RULE_type = 8, RULE_primitive_type = 9, RULE_array_type = 10, RULE_object_type = 11, 
		RULE_map_type = 12, RULE_type_postfix_quantifier = 13, RULE_fully_qualified_name = 14, 
		RULE_declaration = 15, RULE_expression = 16;
	public static final String[] ruleNames = {
		"document", "wdlimport", "import_location", "import_name", "task", "task_name", 
		"task_sections", "workflow", "type", "primitive_type", "array_type", "object_type", 
		"map_type", "type_postfix_quantifier", "fully_qualified_name", "declaration", 
		"expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'Array'", "'Object'", "'Map'", "'task'", "'workflow'", 
		"'as'", "'import'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "','", "'.'", "':'", "'['", 
		"']'", "'{'", "'}'", "'('", "')'", "'+'", "'-'", "'?'", "'*'", "'/'", 
		"'%'", "'>='", "'<='", "'>'", "'<'", "'=='", "'='", "'!='", "'!'", "'&&'", 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "BOOLEAN", "PRIMITIVE_TYPE", "ARRAY_TYPE", "OBJECT_TYPE", 
		"MAP_TYPE", "TASK", "WORKFLOW", "AS", "IMPORT", "FQNAME", "IDENTIFIER", 
		"STRING", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", "STRING_CONTENTS", 
		"NO_QUOTE_OR_NEWLINE", "ESCAPED", "OCTAL_CHAR", "HEX_CHAR", "UNICODE_CHAR", 
		"INTEGER", "OCTAL", "HEX", "DECIMAL", "FLOAT", "COMMA", "DOT", "COLON", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", 
		"RIGHT_PAREN", "PLUS", "MINUS", "QUESTION", "TIMES", "DIVIDE", "MODULO", 
		"GTEQ", "LTEQ", "GT", "LT", "EQUALITY", "EQUALS", "NEQ", "BANG", "AND", 
		"OR"
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
	public String getGrammarFileName() { return "WDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WDL(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public List<WdlimportContext> wdlimport() {
			return getRuleContexts(WdlimportContext.class);
		}
		public WdlimportContext wdlimport(int i) {
			return getRuleContext(WdlimportContext.class,i);
		}
		public List<TaskContext> task() {
			return getRuleContexts(TaskContext.class);
		}
		public TaskContext task(int i) {
			return getRuleContext(TaskContext.class,i);
		}
		public List<WorkflowContext> workflow() {
			return getRuleContexts(WorkflowContext.class);
		}
		public WorkflowContext workflow(int i) {
			return getRuleContext(WorkflowContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TASK) | (1L << IMPORT) | (1L << STRING))) != 0)) {
				{
				setState(37);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(34);
					wdlimport();
					}
					break;
				case TASK:
					{
					setState(35);
					task();
					}
					break;
				case STRING:
					{
					setState(36);
					workflow();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
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

	public static class WdlimportContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(WDL.IMPORT, 0); }
		public Import_locationContext import_location() {
			return getRuleContext(Import_locationContext.class,0);
		}
		public TerminalNode AS() { return getToken(WDL.AS, 0); }
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public WdlimportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wdlimport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterWdlimport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitWdlimport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitWdlimport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WdlimportContext wdlimport() throws RecognitionException {
		WdlimportContext _localctx = new WdlimportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_wdlimport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(IMPORT);
			setState(43);
			import_location();
			setState(46);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(44);
				match(AS);
				setState(45);
				import_name();
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

	public static class Import_locationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WDL.STRING, 0); }
		public Import_locationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterImport_location(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitImport_location(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitImport_location(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_locationContext import_location() throws RecognitionException {
		Import_locationContext _localctx = new Import_locationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(STRING);
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

	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WDL.IDENTIFIER, 0); }
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IDENTIFIER);
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

	public static class TaskContext extends ParserRuleContext {
		public TerminalNode TASK() { return getToken(WDL.TASK, 0); }
		public Task_nameContext task_name() {
			return getRuleContext(Task_nameContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(WDL.LEFT_BRACE, 0); }
		public Task_sectionsContext task_sections() {
			return getRuleContext(Task_sectionsContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(WDL.RIGHT_BRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitTask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_task);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(TASK);
			setState(53);
			task_name();
			setState(54);
			match(LEFT_BRACE);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIMITIVE_TYPE) | (1L << ARRAY_TYPE) | (1L << OBJECT_TYPE) | (1L << MAP_TYPE))) != 0)) {
				{
				{
				setState(55);
				declaration();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			task_sections();
			setState(62);
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

	public static class Task_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WDL.IDENTIFIER, 0); }
		public Task_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterTask_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitTask_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitTask_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_nameContext task_name() throws RecognitionException {
		Task_nameContext _localctx = new Task_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_task_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IDENTIFIER);
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

	public static class Task_sectionsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WDL.STRING, 0); }
		public Task_sectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterTask_sections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitTask_sections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitTask_sections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_sectionsContext task_sections() throws RecognitionException {
		Task_sectionsContext _localctx = new Task_sectionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_task_sections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(STRING);
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

	public static class WorkflowContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WDL.STRING, 0); }
		public WorkflowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workflow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterWorkflow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitWorkflow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitWorkflow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorkflowContext workflow() throws RecognitionException {
		WorkflowContext _localctx = new WorkflowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_workflow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(STRING);
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
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Map_typeContext map_type() {
			return getRuleContext(Map_typeContext.class,0);
		}
		public Object_typeContext object_type() {
			return getRuleContext(Object_typeContext.class,0);
		}
		public Type_postfix_quantifierContext type_postfix_quantifier() {
			return getRuleContext(Type_postfix_quantifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				{
				setState(70);
				primitive_type();
				}
				break;
			case ARRAY_TYPE:
				{
				setState(71);
				array_type();
				}
				break;
			case MAP_TYPE:
				{
				setState(72);
				map_type();
				}
				break;
			case OBJECT_TYPE:
				{
				setState(73);
				object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77);
			_la = _input.LA(1);
			if (_la==QUESTION || _la==BANG) {
				{
				setState(76);
				type_postfix_quantifier();
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

	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(WDL.PRIMITIVE_TYPE, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitPrimitive_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitPrimitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primitive_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PRIMITIVE_TYPE);
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

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode ARRAY_TYPE() { return getToken(WDL.ARRAY_TYPE, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(WDL.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(WDL.RIGHT_BRACKET, 0); }
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Object_typeContext object_type() {
			return getRuleContext(Object_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ARRAY_TYPE);
			setState(82);
			match(LEFT_BRACKET);
			setState(86);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				{
				setState(83);
				primitive_type();
				}
				break;
			case OBJECT_TYPE:
				{
				setState(84);
				object_type();
				}
				break;
			case ARRAY_TYPE:
				{
				setState(85);
				array_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			match(RIGHT_BRACKET);
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

	public static class Object_typeContext extends ParserRuleContext {
		public TerminalNode OBJECT_TYPE() { return getToken(WDL.OBJECT_TYPE, 0); }
		public Object_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterObject_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitObject_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitObject_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_typeContext object_type() throws RecognitionException {
		Object_typeContext _localctx = new Object_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_object_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(OBJECT_TYPE);
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

	public static class Map_typeContext extends ParserRuleContext {
		public TerminalNode MAP_TYPE() { return getToken(WDL.MAP_TYPE, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(WDL.LEFT_BRACKET, 0); }
		public List<Primitive_typeContext> primitive_type() {
			return getRuleContexts(Primitive_typeContext.class);
		}
		public Primitive_typeContext primitive_type(int i) {
			return getRuleContext(Primitive_typeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(WDL.COMMA, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(WDL.RIGHT_BRACKET, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Map_typeContext map_type() {
			return getRuleContext(Map_typeContext.class,0);
		}
		public Object_typeContext object_type() {
			return getRuleContext(Object_typeContext.class,0);
		}
		public Map_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterMap_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitMap_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitMap_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_typeContext map_type() throws RecognitionException {
		Map_typeContext _localctx = new Map_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_map_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(MAP_TYPE);
			setState(93);
			match(LEFT_BRACKET);
			setState(94);
			primitive_type();
			setState(95);
			match(COMMA);
			setState(100);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				{
				setState(96);
				primitive_type();
				}
				break;
			case ARRAY_TYPE:
				{
				setState(97);
				array_type();
				}
				break;
			case MAP_TYPE:
				{
				setState(98);
				map_type();
				}
				break;
			case OBJECT_TYPE:
				{
				setState(99);
				object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			match(RIGHT_BRACKET);
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

	public static class Type_postfix_quantifierContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(WDL.BANG, 0); }
		public TerminalNode QUESTION() { return getToken(WDL.QUESTION, 0); }
		public Type_postfix_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_postfix_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterType_postfix_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitType_postfix_quantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitType_postfix_quantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_postfix_quantifierContext type_postfix_quantifier() throws RecognitionException {
		Type_postfix_quantifierContext _localctx = new Type_postfix_quantifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type_postfix_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==QUESTION || _la==BANG) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Fully_qualified_nameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(WDL.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WDL.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(WDL.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(WDL.DOT, i);
		}
		public Fully_qualified_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fully_qualified_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterFully_qualified_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitFully_qualified_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitFully_qualified_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fully_qualified_nameContext fully_qualified_name() throws RecognitionException {
		Fully_qualified_nameContext _localctx = new Fully_qualified_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fully_qualified_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENTIFIER);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(107);
				match(DOT);
				setState(108);
				match(IDENTIFIER);
				}
				}
				setState(113);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(WDL.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(WDL.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			type();
			setState(115);
			match(IDENTIFIER);
			setState(118);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(116);
				match(EQUALS);
				setState(117);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(WDL.BANG, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(WDL.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(WDL.MINUS, 0); }
		public TerminalNode STRING() { return getToken(WDL.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(WDL.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(WDL.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(WDL.BOOLEAN, 0); }
		public TerminalNode FQNAME() { return getToken(WDL.FQNAME, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(WDL.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(WDL.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(WDL.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(WDL.RIGHT_BRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(WDL.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(WDL.COLON, i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(WDL.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(WDL.RIGHT_BRACKET, 0); }
		public TerminalNode DOT() { return getToken(WDL.DOT, 0); }
		public TerminalNode TIMES() { return getToken(WDL.TIMES, 0); }
		public TerminalNode MODULO() { return getToken(WDL.MODULO, 0); }
		public TerminalNode DIVIDE() { return getToken(WDL.DIVIDE, 0); }
		public TerminalNode LT() { return getToken(WDL.LT, 0); }
		public TerminalNode LTEQ() { return getToken(WDL.LTEQ, 0); }
		public TerminalNode GT() { return getToken(WDL.GT, 0); }
		public TerminalNode GTEQ() { return getToken(WDL.GTEQ, 0); }
		public TerminalNode EQUALS() { return getToken(WDL.EQUALS, 0); }
		public TerminalNode NEQ() { return getToken(WDL.NEQ, 0); }
		public TerminalNode AND() { return getToken(WDL.AND, 0); }
		public TerminalNode OR() { return getToken(WDL.OR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(WDL.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WDL.COMMA, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			switch (_input.LA(1)) {
			case BANG:
				{
				setState(121);
				match(BANG);
				setState(122);
				expression(18);
				}
				break;
			case PLUS:
				{
				setState(123);
				match(PLUS);
				setState(124);
				expression(17);
				}
				break;
			case MINUS:
				{
				setState(125);
				match(MINUS);
				setState(126);
				expression(16);
				}
				break;
			case STRING:
				{
				setState(127);
				match(STRING);
				}
				break;
			case INTEGER:
				{
				setState(128);
				match(INTEGER);
				}
				break;
			case FLOAT:
				{
				setState(129);
				match(FLOAT);
				}
				break;
			case BOOLEAN:
				{
				setState(130);
				match(BOOLEAN);
				}
				break;
			case FQNAME:
				{
				setState(131);
				match(FQNAME);
				}
				break;
			case LEFT_PAREN:
				{
				setState(132);
				match(LEFT_PAREN);
				setState(133);
				expression(0);
				setState(134);
				match(RIGHT_PAREN);
				}
				break;
			case LEFT_BRACE:
				{
				setState(136);
				match(LEFT_BRACE);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << FQNAME) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << LEFT_PAREN) | (1L << PLUS) | (1L << MINUS) | (1L << BANG))) != 0)) {
					{
					{
					setState(137);
					expression(0);
					setState(138);
					match(COLON);
					setState(139);
					expression(0);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(RIGHT_BRACE);
				}
				break;
			case LEFT_BRACKET:
				{
				setState(147);
				match(LEFT_BRACKET);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << FQNAME) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << LEFT_PAREN) | (1L << PLUS) | (1L << MINUS) | (1L << BANG))) != 0)) {
					{
					{
					setState(148);
					expression(0);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(RIGHT_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(158);
						match(DOT);
						setState(159);
						expression(22);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(161);
						match(TIMES);
						setState(162);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(164);
						match(MODULO);
						setState(165);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(167);
						match(DIVIDE);
						setState(168);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(170);
						match(PLUS);
						setState(171);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(173);
						match(MINUS);
						setState(174);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(176);
						match(LT);
						setState(177);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(179);
						match(LTEQ);
						setState(180);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(182);
						match(GT);
						setState(183);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(185);
						match(GTEQ);
						setState(186);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(188);
						match(EQUALS);
						setState(189);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(191);
						match(NEQ);
						setState(192);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(194);
						match(AND);
						setState(195);
						expression(5);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(197);
						match(OR);
						setState(198);
						expression(4);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(200);
						match(LEFT_BRACKET);
						setState(201);
						expression(0);
						setState(202);
						match(RIGHT_BRACKET);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(205);
						match(LEFT_PAREN);
						setState(214);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << FQNAME) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT) | (1L << LEFT_BRACKET) | (1L << LEFT_BRACE) | (1L << LEFT_PAREN) | (1L << PLUS) | (1L << MINUS) | (1L << BANG))) != 0)) {
							{
							setState(206);
							expression(0);
							setState(211);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(207);
								match(COMMA);
								setState(208);
								expression(0);
								}
								}
								setState(213);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(216);
						match(RIGHT_PAREN);
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u00e1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\nM\n\n\3\n\5\nP\n\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\fY\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16g\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20p\n\20\f"+
		"\20\16\20s\13\20\3\21\3\21\3\21\3\21\5\21y\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u0090\n\22\f\22\16\22\u0093\13\22\3\22\3\22\3\22\7"+
		"\22\u0098\n\22\f\22\16\22\u009b\13\22\3\22\5\22\u009e\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d4\n\22\f\22\16\22\u00d7"+
		"\13\22\5\22\u00d9\n\22\3\22\7\22\u00dc\n\22\f\22\16\22\u00df\13\22\3\22"+
		"\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\4\2((\63\63\u00fd"+
		"\2)\3\2\2\2\4,\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\fB\3\2\2"+
		"\2\16D\3\2\2\2\20F\3\2\2\2\22L\3\2\2\2\24Q\3\2\2\2\26S\3\2\2\2\30\\\3"+
		"\2\2\2\32^\3\2\2\2\34j\3\2\2\2\36l\3\2\2\2 t\3\2\2\2\"\u009d\3\2\2\2$"+
		"(\5\4\3\2%(\5\n\6\2&(\5\20\t\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2"+
		"\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,-\7\f\2\2-\60\5\6\4\2."+
		"/\7\13\2\2/\61\5\b\5\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\63\7"+
		"\17\2\2\63\7\3\2\2\2\64\65\7\16\2\2\65\t\3\2\2\2\66\67\7\t\2\2\678\5\f"+
		"\7\28<\7\"\2\29;\5 \21\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2"+
		"\2\2><\3\2\2\2?@\5\16\b\2@A\7#\2\2A\13\3\2\2\2BC\7\16\2\2C\r\3\2\2\2D"+
		"E\7\17\2\2E\17\3\2\2\2FG\7\17\2\2G\21\3\2\2\2HM\5\24\13\2IM\5\26\f\2J"+
		"M\5\32\16\2KM\5\30\r\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2MO\3\2\2"+
		"\2NP\5\34\17\2ON\3\2\2\2OP\3\2\2\2P\23\3\2\2\2QR\7\5\2\2R\25\3\2\2\2S"+
		"T\7\6\2\2TX\7 \2\2UY\5\24\13\2VY\5\30\r\2WY\5\26\f\2XU\3\2\2\2XV\3\2\2"+
		"\2XW\3\2\2\2YZ\3\2\2\2Z[\7!\2\2[\27\3\2\2\2\\]\7\7\2\2]\31\3\2\2\2^_\7"+
		"\b\2\2_`\7 \2\2`a\5\24\13\2af\7\35\2\2bg\5\24\13\2cg\5\26\f\2dg\5\32\16"+
		"\2eg\5\30\r\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hi\7!\2"+
		"\2i\33\3\2\2\2jk\t\2\2\2k\35\3\2\2\2lq\7\16\2\2mn\7\36\2\2np\7\16\2\2"+
		"om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\37\3\2\2\2sq\3\2\2\2tu\5\22"+
		"\n\2ux\7\16\2\2vw\7\61\2\2wy\5\"\22\2xv\3\2\2\2xy\3\2\2\2y!\3\2\2\2z{"+
		"\b\22\1\2{|\7\63\2\2|\u009e\5\"\22\24}~\7&\2\2~\u009e\5\"\22\23\177\u0080"+
		"\7\'\2\2\u0080\u009e\5\"\22\22\u0081\u009e\7\17\2\2\u0082\u009e\7\30\2"+
		"\2\u0083\u009e\7\34\2\2\u0084\u009e\7\4\2\2\u0085\u009e\7\r\2\2\u0086"+
		"\u0087\7$\2\2\u0087\u0088\5\"\22\2\u0088\u0089\7%\2\2\u0089\u009e\3\2"+
		"\2\2\u008a\u0091\7\"\2\2\u008b\u008c\5\"\22\2\u008c\u008d\7\37\2\2\u008d"+
		"\u008e\5\"\22\2\u008e\u0090\3\2\2\2\u008f\u008b\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u009e\7#\2\2\u0095\u0099\7 \2\2\u0096\u0098\5\"\22"+
		"\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7!\2\2\u009d"+
		"z\3\2\2\2\u009d}\3\2\2\2\u009d\177\3\2\2\2\u009d\u0081\3\2\2\2\u009d\u0082"+
		"\3\2\2\2\u009d\u0083\3\2\2\2\u009d\u0084\3\2\2\2\u009d\u0085\3\2\2\2\u009d"+
		"\u0086\3\2\2\2\u009d\u008a\3\2\2\2\u009d\u0095\3\2\2\2\u009e\u00dd\3\2"+
		"\2\2\u009f\u00a0\f\27\2\2\u00a0\u00a1\7\36\2\2\u00a1\u00dc\5\"\22\30\u00a2"+
		"\u00a3\f\21\2\2\u00a3\u00a4\7)\2\2\u00a4\u00dc\5\"\22\22\u00a5\u00a6\f"+
		"\20\2\2\u00a6\u00a7\7+\2\2\u00a7\u00dc\5\"\22\21\u00a8\u00a9\f\17\2\2"+
		"\u00a9\u00aa\7*\2\2\u00aa\u00dc\5\"\22\20\u00ab\u00ac\f\16\2\2\u00ac\u00ad"+
		"\7&\2\2\u00ad\u00dc\5\"\22\17\u00ae\u00af\f\r\2\2\u00af\u00b0\7\'\2\2"+
		"\u00b0\u00dc\5\"\22\16\u00b1\u00b2\f\f\2\2\u00b2\u00b3\7/\2\2\u00b3\u00dc"+
		"\5\"\22\r\u00b4\u00b5\f\13\2\2\u00b5\u00b6\7-\2\2\u00b6\u00dc\5\"\22\f"+
		"\u00b7\u00b8\f\n\2\2\u00b8\u00b9\7.\2\2\u00b9\u00dc\5\"\22\13\u00ba\u00bb"+
		"\f\t\2\2\u00bb\u00bc\7,\2\2\u00bc\u00dc\5\"\22\n\u00bd\u00be\f\b\2\2\u00be"+
		"\u00bf\7\61\2\2\u00bf\u00dc\5\"\22\t\u00c0\u00c1\f\7\2\2\u00c1\u00c2\7"+
		"\62\2\2\u00c2\u00dc\5\"\22\b\u00c3\u00c4\f\6\2\2\u00c4\u00c5\7\64\2\2"+
		"\u00c5\u00dc\5\"\22\7\u00c6\u00c7\f\5\2\2\u00c7\u00c8\7\65\2\2\u00c8\u00dc"+
		"\5\"\22\6\u00c9\u00ca\f\26\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\5\"\22\2"+
		"\u00cc\u00cd\7!\2\2\u00cd\u00dc\3\2\2\2\u00ce\u00cf\f\25\2\2\u00cf\u00d8"+
		"\7$\2\2\u00d0\u00d5\5\"\22\2\u00d1\u00d2\7\35\2\2\u00d2\u00d4\5\"\22\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7%\2\2\u00db\u009f\3\2"+
		"\2\2\u00db\u00a2\3\2\2\2\u00db\u00a5\3\2\2\2\u00db\u00a8\3\2\2\2\u00db"+
		"\u00ab\3\2\2\2\u00db\u00ae\3\2\2\2\u00db\u00b1\3\2\2\2\u00db\u00b4\3\2"+
		"\2\2\u00db\u00b7\3\2\2\2\u00db\u00ba\3\2\2\2\u00db\u00bd\3\2\2\2\u00db"+
		"\u00c0\3\2\2\2\u00db\u00c3\3\2\2\2\u00db\u00c6\3\2\2\2\u00db\u00c9\3\2"+
		"\2\2\u00db\u00ce\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de#\3\2\2\2\u00df\u00dd\3\2\2\2\23\')\60<LOXfqx\u0091"+
		"\u0099\u009d\u00d5\u00d8\u00db\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}