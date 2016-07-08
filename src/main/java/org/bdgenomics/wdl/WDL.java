// Generated from WDL.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl;
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
		NEWLINE=1, WS=2, ID=3, OPEN=4, CLOSE=5, WORKFLOW=6, CALL=7, AS=8, TASK=9, 
		KEY=10, VALUES=11, COMMAND=12, OUTPUT=13, BLOCK_CONTENT=14, BLOCK_CLOSE=15;
	public static final int
		RULE_wdl = 0, RULE_workflow = 1, RULE_call = 2, RULE_assignment_block = 3, 
		RULE_assignment = 4, RULE_task = 5, RULE_command = 6, RULE_output = 7;
	public static final String[] ruleNames = {
		"wdl", "workflow", "call", "assignment_block", "assignment", "task", "command", 
		"output"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'{'", null, "'workflow'", "'call'", "'AS'", "'task'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "ID", "OPEN", "CLOSE", "WORKFLOW", "CALL", "AS", 
		"TASK", "KEY", "VALUES", "COMMAND", "OUTPUT", "BLOCK_CONTENT", "BLOCK_CLOSE"
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
	public static class WdlContext extends ParserRuleContext {
		public WorkflowContext workflow() {
			return getRuleContext(WorkflowContext.class,0);
		}
		public List<TaskContext> task() {
			return getRuleContexts(TaskContext.class);
		}
		public TaskContext task(int i) {
			return getRuleContext(TaskContext.class,i);
		}
		public WdlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wdl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterWdl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitWdl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitWdl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WdlContext wdl() throws RecognitionException {
		WdlContext _localctx = new WdlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wdl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			workflow();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TASK) {
				{
				{
				setState(17);
				task();
				}
				}
				setState(22);
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

	public static class WorkflowContext extends ParserRuleContext {
		public TerminalNode WORKFLOW() { return getToken(WDL.WORKFLOW, 0); }
		public TerminalNode OPEN() { return getToken(WDL.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(WDL.CLOSE, 0); }
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
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
		enterRule(_localctx, 2, RULE_workflow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(WORKFLOW);
			setState(24);
			match(OPEN);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALL) {
				{
				{
				setState(25);
				call();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(WDL.CALL, 0); }
		public List<TerminalNode> ID() { return getTokens(WDL.ID); }
		public TerminalNode ID(int i) {
			return getToken(WDL.ID, i);
		}
		public Assignment_blockContext assignment_block() {
			return getRuleContext(Assignment_blockContext.class,0);
		}
		public TerminalNode AS() { return getToken(WDL.AS, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_call);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(CALL);
				setState(34);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(CALL);
				setState(36);
				match(ID);
				setState(37);
				assignment_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(CALL);
				setState(39);
				match(ID);
				setState(40);
				match(AS);
				setState(41);
				match(ID);
				setState(42);
				assignment_block();
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

	public static class Assignment_blockContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(WDL.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(WDL.CLOSE, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public Assignment_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterAssignment_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitAssignment_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitAssignment_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_blockContext assignment_block() throws RecognitionException {
		Assignment_blockContext _localctx = new Assignment_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(OPEN);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEY) {
				{
				{
				setState(46);
				assignment();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(WDL.KEY, 0); }
		public TerminalNode VALUES() { return getToken(WDL.VALUES, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(KEY);
			setState(55);
			match(VALUES);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPEN() { return getToken(WDL.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(WDL.CLOSE, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
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
		enterRule(_localctx, 10, RULE_task);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(TASK);
			setState(58);
			match(OPEN);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND || _la==OUTPUT) {
				{
				setState(61);
				switch (_input.LA(1)) {
				case COMMAND:
					{
					setState(59);
					command();
					}
					break;
				case OUTPUT:
					{
					setState(60);
					output();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMAND() { return getToken(WDL.COMMAND, 0); }
		public TerminalNode BLOCK_CONTENT() { return getToken(WDL.BLOCK_CONTENT, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(WDL.BLOCK_CLOSE, 0); }
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
		enterRule(_localctx, 12, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(COMMAND);
			setState(69);
			match(BLOCK_CONTENT);
			setState(70);
			match(BLOCK_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(WDL.OUTPUT, 0); }
		public TerminalNode BLOCK_CONTENT() { return getToken(WDL.BLOCK_CONTENT, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(WDL.BLOCK_CLOSE, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WDLListener ) ((WDLListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WDLVisitor ) return ((WDLVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(OUTPUT);
			setState(73);
			match(BLOCK_CONTENT);
			setState(74);
			match(BLOCK_CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\7\5\62\n\5\f\5\16"+
		"\5\65\13\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7@\n\7\f\7\16\7C\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2"+
		"\2M\2\22\3\2\2\2\4\31\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n8\3\2\2\2\f;\3\2"+
		"\2\2\16F\3\2\2\2\20J\3\2\2\2\22\26\5\4\3\2\23\25\5\f\7\2\24\23\3\2\2\2"+
		"\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\3\3\2\2\2\30\26\3\2\2\2"+
		"\31\32\7\b\2\2\32\36\7\6\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36"+
		"\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\7\2\2\"\5\3\2\2"+
		"\2#$\7\t\2\2$.\7\5\2\2%&\7\t\2\2&\'\7\5\2\2\'.\5\b\5\2()\7\t\2\2)*\7\5"+
		"\2\2*+\7\n\2\2+,\7\5\2\2,.\5\b\5\2-#\3\2\2\2-%\3\2\2\2-(\3\2\2\2.\7\3"+
		"\2\2\2/\63\7\6\2\2\60\62\5\n\6\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\7\2\2\67\t\3\2"+
		"\2\289\7\f\2\29:\7\r\2\2:\13\3\2\2\2;<\7\13\2\2<A\7\6\2\2=@\5\16\b\2>"+
		"@\5\20\t\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2"+
		"CA\3\2\2\2DE\7\7\2\2E\r\3\2\2\2FG\7\16\2\2GH\7\20\2\2HI\7\21\2\2I\17\3"+
		"\2\2\2JK\7\17\2\2KL\7\20\2\2LM\7\21\2\2M\21\3\2\2\2\b\26\36-\63?A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}