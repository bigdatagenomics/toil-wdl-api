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
public class WDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, WS=49, IDENTIFIER=50, STRING=51, INTEGER=52, 
		OCTAL=53, HEX=54, DECIMAL=55, FLOAT=56;
	public static final int
		RULE_document = 0, RULE_wdlimport = 1, RULE_import_location = 2, RULE_import_name = 3, 
		RULE_task = 4, RULE_task_name = 5, RULE_declaration = 6, RULE_task_section = 7, 
		RULE_command = 8, RULE_command_part = 9, RULE_command_part_string = 10, 
		RULE_command_part_var = 11, RULE_var_option = 12, RULE_var_option_key = 13, 
		RULE_var_option_value = 14, RULE_task_output = 15, RULE_output_assignment = 16, 
		RULE_output_name = 17, RULE_output_value = 18, RULE_runtime = 19, RULE_parameter_meta = 20, 
		RULE_meta = 21, RULE_workflow = 22, RULE_type = 23, RULE_primitive_type = 24, 
		RULE_array_type = 25, RULE_object_type = 26, RULE_map_type = 27, RULE_type_postfix_quantifier = 28, 
		RULE_bool = 29, RULE_expression = 30;
	public static final String[] ruleNames = {
		"document", "wdlimport", "import_location", "import_name", "task", "task_name", 
		"declaration", "task_section", "command", "command_part", "command_part_string", 
		"command_part_var", "var_option", "var_option_key", "var_option_value", 
		"task_output", "output_assignment", "output_name", "output_value", "runtime", 
		"parameter_meta", "meta", "workflow", "type", "primitive_type", "array_type", 
		"object_type", "map_type", "type_postfix_quantifier", "bool", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'as'", "'task'", "'{'", "'}'", "'='", "'command'", 
		"'<<<'", "'\n'", "'\r'", "'>>>'", "'${'", "'sep'", "'true'", "'false'", 
		"'default'", "'quote'", "'output'", "'Boolean'", "'Int'", "'Float'", "'File'", 
		"'String'", "'Array'", "'['", "']'", "'Object'", "'Map'", "','", "'!'", 
		"'?'", "'.'", "'('", "')'", "'+'", "'-'", "'*'", "'%'", "'/'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS", "IDENTIFIER", "STRING", "INTEGER", "OCTAL", "HEX", "DECIMAL", 
		"FLOAT"
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

	public WDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public WorkflowContext workflow() {
			return getRuleContext(WorkflowContext.class,0);
		}
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(62);
				wdlimport();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			workflow();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(69);
				task();
				}
				}
				setState(74);
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
		public Import_locationContext import_location() {
			return getRuleContext(Import_locationContext.class,0);
		}
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
			setState(75);
			match(T__0);
			setState(76);
			import_location();
			setState(79);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(77);
				match(T__1);
				setState(78);
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
		public TerminalNode STRING() { return getToken(WDLParser.STRING, 0); }
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
			setState(81);
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
		public TerminalNode IDENTIFIER() { return getToken(WDLParser.IDENTIFIER, 0); }
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
			setState(83);
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
		public Task_nameContext task_name() {
			return getRuleContext(Task_nameContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Task_sectionContext> task_section() {
			return getRuleContexts(Task_sectionContext.class);
		}
		public Task_sectionContext task_section(int i) {
			return getRuleContext(Task_sectionContext.class,i);
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
			setState(85);
			match(T__2);
			setState(86);
			task_name();
			setState(87);
			match(T__3);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				{
				setState(88);
				declaration();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__17) | (1L << STRING))) != 0)) {
				{
				{
				setState(94);
				task_section();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__4);
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
		public TerminalNode IDENTIFIER() { return getToken(WDLParser.IDENTIFIER, 0); }
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
			setState(102);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(WDLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			type();
			setState(105);
			match(IDENTIFIER);
			setState(108);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(106);
				match(T__5);
				setState(107);
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

	public static class Task_sectionContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public RuntimeContext runtime() {
			return getRuleContext(RuntimeContext.class,0);
		}
		public Task_outputContext task_output() {
			return getRuleContext(Task_outputContext.class,0);
		}
		public Parameter_metaContext parameter_meta() {
			return getRuleContext(Parameter_metaContext.class,0);
		}
		public MetaContext meta() {
			return getRuleContext(MetaContext.class,0);
		}
		public Task_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterTask_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitTask_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitTask_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_sectionContext task_section() throws RecognitionException {
		Task_sectionContext _localctx = new Task_sectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_task_section);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				runtime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				task_output();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				parameter_meta();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				meta();
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

	public static class CommandContext extends ParserRuleContext {
		public List<Command_partContext> command_part() {
			return getRuleContexts(Command_partContext.class);
		}
		public Command_partContext command_part(int i) {
			return getRuleContext(Command_partContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_command);
		int _la;
		try {
			int _alt;
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__6);
				setState(118);
				match(T__3);
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(119);
						command_part();
						}
						} 
					}
					setState(124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(125);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__6);
				setState(127);
				match(T__7);
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(134);
						command_part();
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(140);
				match(T__10);
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

	public static class Command_partContext extends ParserRuleContext {
		public Command_part_stringContext command_part_string() {
			return getRuleContext(Command_part_stringContext.class,0);
		}
		public Command_part_varContext command_part_var() {
			return getRuleContext(Command_part_varContext.class,0);
		}
		public Command_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterCommand_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitCommand_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitCommand_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_partContext command_part() throws RecognitionException {
		Command_partContext _localctx = new Command_partContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_command_part);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case WS:
			case IDENTIFIER:
			case STRING:
			case INTEGER:
			case OCTAL:
			case HEX:
			case DECIMAL:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				command_part_string();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				command_part_var();
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

	public static class Command_part_stringContext extends ParserRuleContext {
		public Command_part_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_part_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterCommand_part_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitCommand_part_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitCommand_part_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_part_stringContext command_part_string() throws RecognitionException {
		Command_part_stringContext _localctx = new Command_part_stringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_command_part_string);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(147);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__11) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Command_part_varContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_optionContext var_option() {
			return getRuleContext(Var_optionContext.class,0);
		}
		public Command_part_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_part_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterCommand_part_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitCommand_part_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitCommand_part_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_part_varContext command_part_var() throws RecognitionException {
		Command_part_varContext _localctx = new Command_part_varContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_command_part_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__11);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(153);
				var_option();
				}
				break;
			}
			setState(156);
			expression(0);
			setState(157);
			match(T__4);
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

	public static class Var_optionContext extends ParserRuleContext {
		public Var_option_keyContext var_option_key() {
			return getRuleContext(Var_option_keyContext.class,0);
		}
		public Var_option_valueContext var_option_value() {
			return getRuleContext(Var_option_valueContext.class,0);
		}
		public Var_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterVar_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitVar_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitVar_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_optionContext var_option() throws RecognitionException {
		Var_optionContext _localctx = new Var_optionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			var_option_key();
			setState(160);
			match(T__5);
			setState(161);
			var_option_value();
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

	public static class Var_option_keyContext extends ParserRuleContext {
		public Var_option_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_option_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterVar_option_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitVar_option_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitVar_option_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_option_keyContext var_option_key() throws RecognitionException {
		Var_option_keyContext _localctx = new Var_option_keyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_option_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class Var_option_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_option_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_option_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterVar_option_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitVar_option_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitVar_option_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_option_valueContext var_option_value() throws RecognitionException {
		Var_option_valueContext _localctx = new Var_option_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_option_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			expression(0);
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

	public static class Task_outputContext extends ParserRuleContext {
		public List<Output_assignmentContext> output_assignment() {
			return getRuleContexts(Output_assignmentContext.class);
		}
		public Output_assignmentContext output_assignment(int i) {
			return getRuleContext(Output_assignmentContext.class,i);
		}
		public Task_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterTask_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitTask_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitTask_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_outputContext task_output() throws RecognitionException {
		Task_outputContext _localctx = new Task_outputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_task_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__17);
			setState(168);
			match(T__3);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				{
				setState(169);
				output_assignment();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__4);
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

	public static class Output_assignmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Output_nameContext output_name() {
			return getRuleContext(Output_nameContext.class,0);
		}
		public Output_valueContext output_value() {
			return getRuleContext(Output_valueContext.class,0);
		}
		public Output_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterOutput_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitOutput_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitOutput_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_assignmentContext output_assignment() throws RecognitionException {
		Output_assignmentContext _localctx = new Output_assignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_output_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			type();
			setState(178);
			output_name();
			setState(179);
			match(T__5);
			setState(180);
			output_value();
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

	public static class Output_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WDLParser.IDENTIFIER, 0); }
		public Output_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterOutput_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitOutput_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitOutput_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_nameContext output_name() throws RecognitionException {
		Output_nameContext _localctx = new Output_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_output_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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

	public static class Output_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WDLParser.STRING, 0); }
		public Output_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterOutput_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitOutput_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitOutput_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_valueContext output_value() throws RecognitionException {
		Output_valueContext _localctx = new Output_valueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_output_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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

	public static class RuntimeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WDLParser.STRING, 0); }
		public RuntimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterRuntime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitRuntime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitRuntime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuntimeContext runtime() throws RecognitionException {
		RuntimeContext _localctx = new RuntimeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_runtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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

	public static class Parameter_metaContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WDLParser.STRING, 0); }
		public Parameter_metaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_meta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterParameter_meta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitParameter_meta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitParameter_meta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_metaContext parameter_meta() throws RecognitionException {
		Parameter_metaContext _localctx = new Parameter_metaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter_meta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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

	public static class MetaContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WDLParser.STRING, 0); }
		public MetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterMeta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitMeta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitMeta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaContext meta() throws RecognitionException {
		MetaContext _localctx = new MetaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_meta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		public TerminalNode STRING() { return getToken(WDLParser.STRING, 0); }
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
		enterRule(_localctx, 44, RULE_workflow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		public Type_postfix_quantifierContext type_postfix_quantifier() {
			return getRuleContext(Type_postfix_quantifierContext.class,0);
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
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			setState(210);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				primitive_type();
				setState(196);
				_la = _input.LA(1);
				if (_la==T__29 || _la==T__30) {
					{
					setState(195);
					type_postfix_quantifier();
					}
				}

				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				array_type();
				setState(200);
				_la = _input.LA(1);
				if (_la==T__29 || _la==T__30) {
					{
					setState(199);
					type_postfix_quantifier();
					}
				}

				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				map_type();
				setState(204);
				_la = _input.LA(1);
				if (_la==T__29 || _la==T__30) {
					{
					setState(203);
					type_postfix_quantifier();
					}
				}

				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				object_type();
				setState(208);
				_la = _input.LA(1);
				if (_la==T__29 || _la==T__30) {
					{
					setState(207);
					type_postfix_quantifier();
					}
				}

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

	public static class Primitive_typeContext extends ParserRuleContext {
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
		enterRule(_localctx, 48, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class Array_typeContext extends ParserRuleContext {
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
		enterRule(_localctx, 50, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__23);
			setState(215);
			match(T__24);
			setState(219);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				{
				setState(216);
				primitive_type();
				}
				break;
			case T__26:
				{
				setState(217);
				object_type();
				}
				break;
			case T__23:
				{
				setState(218);
				array_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			match(T__25);
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
		enterRule(_localctx, 52, RULE_object_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__26);
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
		public List<Primitive_typeContext> primitive_type() {
			return getRuleContexts(Primitive_typeContext.class);
		}
		public Primitive_typeContext primitive_type(int i) {
			return getRuleContext(Primitive_typeContext.class,i);
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
		enterRule(_localctx, 54, RULE_map_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__27);
			setState(226);
			match(T__24);
			setState(227);
			primitive_type();
			setState(228);
			match(T__28);
			setState(233);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				{
				setState(229);
				primitive_type();
				}
				break;
			case T__23:
				{
				setState(230);
				array_type();
				}
				break;
			case T__27:
				{
				setState(231);
				map_type();
				}
				break;
			case T__26:
				{
				setState(232);
				object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235);
			match(T__25);
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
		enterRule(_localctx, 56, RULE_type_postfix_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRING() { return getToken(WDLParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(WDLParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(WDLParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WDLParser.IDENTIFIER, 0); }
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			switch (_input.LA(1)) {
			case T__29:
				{
				setState(242);
				match(T__29);
				setState(243);
				expression(19);
				}
				break;
			case T__34:
				{
				setState(244);
				match(T__34);
				setState(245);
				expression(18);
				}
				break;
			case T__35:
				{
				setState(246);
				match(T__35);
				setState(247);
				expression(17);
				}
				break;
			case STRING:
				{
				setState(248);
				match(STRING);
				}
				break;
			case T__13:
			case T__14:
				{
				setState(249);
				bool();
				}
				break;
			case INTEGER:
				{
				setState(250);
				match(INTEGER);
				}
				break;
			case FLOAT:
				{
				setState(251);
				match(FLOAT);
				}
				break;
			case IDENTIFIER:
				{
				setState(252);
				match(IDENTIFIER);
				}
				break;
			case T__3:
				{
				setState(253);
				match(T__3);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__24) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__35) | (1L << IDENTIFIER) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(254);
					expression(0);
					setState(255);
					match(T__47);
					setState(256);
					expression(0);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				match(T__4);
				}
				break;
			case T__24:
				{
				setState(264);
				match(T__24);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__24) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__35) | (1L << IDENTIFIER) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(265);
					expression(0);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				match(T__25);
				}
				break;
			case T__32:
				{
				setState(272);
				match(T__32);
				setState(273);
				expression(0);
				setState(274);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(338);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(279);
						match(T__31);
						setState(280);
						expression(23);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(282);
						match(T__36);
						setState(283);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(285);
						match(T__37);
						setState(286);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(288);
						match(T__38);
						setState(289);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(291);
						match(T__34);
						setState(292);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(294);
						match(T__35);
						setState(295);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(297);
						match(T__39);
						setState(298);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(300);
						match(T__40);
						setState(301);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(303);
						match(T__41);
						setState(304);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(306);
						match(T__42);
						setState(307);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(309);
						match(T__43);
						setState(310);
						expression(8);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(312);
						match(T__44);
						setState(313);
						expression(7);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(315);
						match(T__45);
						setState(316);
						expression(6);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(318);
						match(T__46);
						setState(319);
						expression(5);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(321);
						match(T__24);
						setState(322);
						expression(0);
						setState(323);
						match(T__25);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(326);
						match(T__32);
						setState(335);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__24) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__35) | (1L << IDENTIFIER) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
							{
							setState(327);
							expression(0);
							setState(332);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__28) {
								{
								{
								setState(328);
								match(T__28);
								setState(329);
								expression(0);
								}
								}
								setState(334);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(337);
						match(T__33);
						}
						break;
					}
					} 
				}
				setState(342);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\3\3\3\3\3\3"+
		"\3\5\3R\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3"+
		"\6\7\6b\n\6\f\6\16\6e\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bo\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\tv\n\t\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3"+
		"\n\3\n\3\n\7\n\u0084\n\n\f\n\16\n\u0087\13\n\3\n\7\n\u008a\n\n\f\n\16"+
		"\n\u008d\13\n\3\n\5\n\u0090\n\n\3\13\3\13\5\13\u0094\n\13\3\f\6\f\u0097"+
		"\n\f\r\f\16\f\u0098\3\r\3\r\5\r\u009d\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u00ad\n\21\f\21\16\21\u00b0"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u00c7\n\31\3\31\3\31\5\31"+
		"\u00cb\n\31\3\31\3\31\5\31\u00cf\n\31\3\31\3\31\5\31\u00d3\n\31\5\31\u00d5"+
		"\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u00de\n\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00ec\n\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \7 \u0105\n \f \16 \u0108\13 \3 \3 \3 \7 \u010d\n \f \16 \u0110\13 \3"+
		" \3 \3 \3 \3 \5 \u0117\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u014d\n \f \16 \u0150\13"+
		" \5 \u0152\n \3 \7 \u0155\n \f \16 \u0158\13 \3 \2\3>!\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\b\3\2\13\f\3\2\16"+
		"\16\3\2\17\23\3\2\25\31\3\2 !\3\2\20\21\u0176\2C\3\2\2\2\4M\3\2\2\2\6"+
		"S\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\fh\3\2\2\2\16j\3\2\2\2\20u\3\2\2\2\22"+
		"\u008f\3\2\2\2\24\u0093\3\2\2\2\26\u0096\3\2\2\2\30\u009a\3\2\2\2\32\u00a1"+
		"\3\2\2\2\34\u00a5\3\2\2\2\36\u00a7\3\2\2\2 \u00a9\3\2\2\2\"\u00b3\3\2"+
		"\2\2$\u00b8\3\2\2\2&\u00ba\3\2\2\2(\u00bc\3\2\2\2*\u00be\3\2\2\2,\u00c0"+
		"\3\2\2\2.\u00c2\3\2\2\2\60\u00d4\3\2\2\2\62\u00d6\3\2\2\2\64\u00d8\3\2"+
		"\2\2\66\u00e1\3\2\2\28\u00e3\3\2\2\2:\u00ef\3\2\2\2<\u00f1\3\2\2\2>\u0116"+
		"\3\2\2\2@B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E"+
		"C\3\2\2\2FJ\5.\30\2GI\5\n\6\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"K\3\3\2\2\2LJ\3\2\2\2MN\7\3\2\2NQ\5\6\4\2OP\7\4\2\2PR\5\b\5\2QO\3\2\2"+
		"\2QR\3\2\2\2R\5\3\2\2\2ST\7\65\2\2T\7\3\2\2\2UV\7\64\2\2V\t\3\2\2\2WX"+
		"\7\5\2\2XY\5\f\7\2Y]\7\6\2\2Z\\\5\16\b\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`b\5\20\t\2a`\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\7\2\2g\13\3\2\2\2hi\7\64\2\2i\r"+
		"\3\2\2\2jk\5\60\31\2kn\7\64\2\2lm\7\b\2\2mo\5> \2nl\3\2\2\2no\3\2\2\2"+
		"o\17\3\2\2\2pv\5\22\n\2qv\5(\25\2rv\5 \21\2sv\5*\26\2tv\5,\27\2up\3\2"+
		"\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\21\3\2\2\2wx\7\t\2\2x|\7"+
		"\6\2\2y{\5\24\13\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2"+
		"\2~|\3\2\2\2\177\u0090\7\7\2\2\u0080\u0081\7\t\2\2\u0081\u0085\7\n\2\2"+
		"\u0082\u0084\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\5\24\13\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\7\r\2\2\u008fw\3\2\2\2\u008f\u0080\3\2\2\2\u0090\23\3\2\2\2\u0091"+
		"\u0094\5\26\f\2\u0092\u0094\5\30\r\2\u0093\u0091\3\2\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\25\3\2\2\2\u0095\u0097\n\3\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\27\3\2\2"+
		"\2\u009a\u009c\7\16\2\2\u009b\u009d\5\32\16\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\5> \2\u009f\u00a0\7\7\2"+
		"\2\u00a0\31\3\2\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4"+
		"\5\36\20\2\u00a4\33\3\2\2\2\u00a5\u00a6\t\4\2\2\u00a6\35\3\2\2\2\u00a7"+
		"\u00a8\5> \2\u00a8\37\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ae\7\6\2\2"+
		"\u00ab\u00ad\5\"\22\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\7\7\2\2\u00b2!\3\2\2\2\u00b3\u00b4\5\60\31\2\u00b4\u00b5\5$\23"+
		"\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\5&\24\2\u00b7#\3\2\2\2\u00b8\u00b9"+
		"\7\64\2\2\u00b9%\3\2\2\2\u00ba\u00bb\7\65\2\2\u00bb\'\3\2\2\2\u00bc\u00bd"+
		"\7\65\2\2\u00bd)\3\2\2\2\u00be\u00bf\7\65\2\2\u00bf+\3\2\2\2\u00c0\u00c1"+
		"\7\65\2\2\u00c1-\3\2\2\2\u00c2\u00c3\7\65\2\2\u00c3/\3\2\2\2\u00c4\u00c6"+
		"\5\62\32\2\u00c5\u00c7\5:\36\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00d5\3\2\2\2\u00c8\u00ca\5\64\33\2\u00c9\u00cb\5:\36\2\u00ca\u00c9"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d5\3\2\2\2\u00cc\u00ce\58\35\2\u00cd"+
		"\u00cf\5:\36\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d5\3\2"+
		"\2\2\u00d0\u00d2\5\66\34\2\u00d1\u00d3\5:\36\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00c4\3\2\2\2\u00d4\u00c8\3\2"+
		"\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\61\3\2\2\2\u00d6\u00d7"+
		"\t\5\2\2\u00d7\63\3\2\2\2\u00d8\u00d9\7\32\2\2\u00d9\u00dd\7\33\2\2\u00da"+
		"\u00de\5\62\32\2\u00db\u00de\5\66\34\2\u00dc\u00de\5\64\33\2\u00dd\u00da"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\7\34\2\2\u00e0\65\3\2\2\2\u00e1\u00e2\7\35\2\2\u00e2\67\3\2\2\2"+
		"\u00e3\u00e4\7\36\2\2\u00e4\u00e5\7\33\2\2\u00e5\u00e6\5\62\32\2\u00e6"+
		"\u00eb\7\37\2\2\u00e7\u00ec\5\62\32\2\u00e8\u00ec\5\64\33\2\u00e9\u00ec"+
		"\58\35\2\u00ea\u00ec\5\66\34\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee"+
		"\7\34\2\2\u00ee9\3\2\2\2\u00ef\u00f0\t\6\2\2\u00f0;\3\2\2\2\u00f1\u00f2"+
		"\t\7\2\2\u00f2=\3\2\2\2\u00f3\u00f4\b \1\2\u00f4\u00f5\7 \2\2\u00f5\u0117"+
		"\5> \25\u00f6\u00f7\7%\2\2\u00f7\u0117\5> \24\u00f8\u00f9\7&\2\2\u00f9"+
		"\u0117\5> \23\u00fa\u0117\7\65\2\2\u00fb\u0117\5<\37\2\u00fc\u0117\7\66"+
		"\2\2\u00fd\u0117\7:\2\2\u00fe\u0117\7\64\2\2\u00ff\u0106\7\6\2\2\u0100"+
		"\u0101\5> \2\u0101\u0102\7\62\2\2\u0102\u0103\5> \2\u0103\u0105\3\2\2"+
		"\2\u0104\u0100\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0117\7\7\2\2\u010a"+
		"\u010e\7\33\2\2\u010b\u010d\5> \2\u010c\u010b\3\2\2\2\u010d\u0110\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0117\7\34\2\2\u0112\u0113\7#\2\2\u0113\u0114\5>"+
		" \2\u0114\u0115\7$\2\2\u0115\u0117\3\2\2\2\u0116\u00f3\3\2\2\2\u0116\u00f6"+
		"\3\2\2\2\u0116\u00f8\3\2\2\2\u0116\u00fa\3\2\2\2\u0116\u00fb\3\2\2\2\u0116"+
		"\u00fc\3\2\2\2\u0116\u00fd\3\2\2\2\u0116\u00fe\3\2\2\2\u0116\u00ff\3\2"+
		"\2\2\u0116\u010a\3\2\2\2\u0116\u0112\3\2\2\2\u0117\u0156\3\2\2\2\u0118"+
		"\u0119\f\30\2\2\u0119\u011a\7\"\2\2\u011a\u0155\5> \31\u011b\u011c\f\22"+
		"\2\2\u011c\u011d\7\'\2\2\u011d\u0155\5> \23\u011e\u011f\f\21\2\2\u011f"+
		"\u0120\7(\2\2\u0120\u0155\5> \22\u0121\u0122\f\20\2\2\u0122\u0123\7)\2"+
		"\2\u0123\u0155\5> \21\u0124\u0125\f\17\2\2\u0125\u0126\7%\2\2\u0126\u0155"+
		"\5> \20\u0127\u0128\f\16\2\2\u0128\u0129\7&\2\2\u0129\u0155\5> \17\u012a"+
		"\u012b\f\r\2\2\u012b\u012c\7*\2\2\u012c\u0155\5> \16\u012d\u012e\f\f\2"+
		"\2\u012e\u012f\7+\2\2\u012f\u0155\5> \r\u0130\u0131\f\13\2\2\u0131\u0132"+
		"\7,\2\2\u0132\u0155\5> \f\u0133\u0134\f\n\2\2\u0134\u0135\7-\2\2\u0135"+
		"\u0155\5> \13\u0136\u0137\f\t\2\2\u0137\u0138\7.\2\2\u0138\u0155\5> \n"+
		"\u0139\u013a\f\b\2\2\u013a\u013b\7/\2\2\u013b\u0155\5> \t\u013c\u013d"+
		"\f\7\2\2\u013d\u013e\7\60\2\2\u013e\u0155\5> \b\u013f\u0140\f\6\2\2\u0140"+
		"\u0141\7\61\2\2\u0141\u0155\5> \7\u0142\u0143\f\27\2\2\u0143\u0144\7\33"+
		"\2\2\u0144\u0145\5> \2\u0145\u0146\7\34\2\2\u0146\u0155\3\2\2\2\u0147"+
		"\u0148\f\26\2\2\u0148\u0151\7#\2\2\u0149\u014e\5> \2\u014a\u014b\7\37"+
		"\2\2\u014b\u014d\5> \2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0149\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\7$"+
		"\2\2\u0154\u0118\3\2\2\2\u0154\u011b\3\2\2\2\u0154\u011e\3\2\2\2\u0154"+
		"\u0121\3\2\2\2\u0154\u0124\3\2\2\2\u0154\u0127\3\2\2\2\u0154\u012a\3\2"+
		"\2\2\u0154\u012d\3\2\2\2\u0154\u0130\3\2\2\2\u0154\u0133\3\2\2\2\u0154"+
		"\u0136\3\2\2\2\u0154\u0139\3\2\2\2\u0154\u013c\3\2\2\2\u0154\u013f\3\2"+
		"\2\2\u0154\u0142\3\2\2\2\u0154\u0147\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157?\3\2\2\2\u0158\u0156\3\2\2\2"+
		"\37CJQ]cnu|\u0085\u008b\u008f\u0093\u0098\u009c\u00ae\u00c6\u00ca\u00ce"+
		"\u00d2\u00d4\u00dd\u00eb\u0106\u010e\u0116\u014e\u0151\u0154\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}