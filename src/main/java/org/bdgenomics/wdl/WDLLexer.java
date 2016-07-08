// Generated from WDLLexer.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WDLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, ID=3, OPEN=4, CLOSE=5, WORKFLOW=6, CALL=7, AS=8, TASK=9, 
		KEY=10, VALUES=11, COMMAND=12, OUTPUT=13, BLOCK_CONTENT=14, BLOCK_CLOSE=15;
	public static final int BLOCK = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "BLOCK"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "WS", "ID", "OPEN", "CLOSE", "WORKFLOW", "CALL", "AS", "TASK", 
		"KEY", "VALUES", "COMMAND", "OUTPUT", "BLOCK_CONTENT", "BLOCK_CLOSE"
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


	public WDLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WDLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u0092\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2$\n"+
		"\2\3\2\3\2\3\2\3\2\3\3\6\3+\n\3\r\3\16\3,\3\3\3\3\3\4\6\4\62\n\4\r\4\16"+
		"\4\63\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\6"+
		"\fV\n\f\r\f\16\fW\3\f\3\f\3\f\3\f\6\f^\n\f\r\f\16\f_\7\fb\n\f\f\f\16\f"+
		"e\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\rp\n\r\f\r\16\rs\13\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0081\n\16\f"+
		"\16\16\16\u0084\13\16\3\16\3\16\3\16\3\16\3\17\6\17\u008b\n\17\r\17\16"+
		"\17\u008c\3\20\3\20\3\20\3\20\2\2\21\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22"+
		"\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\4\2\3\6\5\2\13\f\17\17\"\"\6"+
		"\2\62;C\\aac|\3\2..\3\2\177\177\u0099\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\3\36\3"+
		"\2\2\2\3 \3\2\2\2\4#\3\2\2\2\6*\3\2\2\2\b\61\3\2\2\2\n\65\3\2\2\2\f\67"+
		"\3\2\2\2\169\3\2\2\2\20B\3\2\2\2\22G\3\2\2\2\24J\3\2\2\2\26O\3\2\2\2\30"+
		"R\3\2\2\2\32f\3\2\2\2\34x\3\2\2\2\36\u008a\3\2\2\2 \u008e\3\2\2\2\"$\7"+
		"\17\2\2#\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\f\2\2&\'\3\2\2\2\'(\b\2\2\2"+
		"(\5\3\2\2\2)+\t\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2"+
		"\2./\b\3\2\2/\7\3\2\2\2\60\62\t\3\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\t\3\2\2\2\65\66\7}\2\2\66\13\3\2\2\2\678\7\177"+
		"\2\28\r\3\2\2\29:\7y\2\2:;\7q\2\2;<\7t\2\2<=\7m\2\2=>\7h\2\2>?\7n\2\2"+
		"?@\7q\2\2@A\7y\2\2A\17\3\2\2\2BC\7e\2\2CD\7c\2\2DE\7n\2\2EF\7n\2\2F\21"+
		"\3\2\2\2GH\7C\2\2HI\7U\2\2I\23\3\2\2\2JK\7v\2\2KL\7c\2\2LM\7u\2\2MN\7"+
		"m\2\2N\25\3\2\2\2OP\5\b\4\2PQ\7<\2\2Q\27\3\2\2\2RS\5\b\4\2SU\7?\2\2TV"+
		"\n\4\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xc\3\2\2\2YZ\7.\2\2Z["+
		"\5\b\4\2[]\7?\2\2\\^\n\4\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2"+
		"`b\3\2\2\2aY\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\31\3\2\2\2ec\3\2\2"+
		"\2fg\7e\2\2gh\7q\2\2hi\7o\2\2ij\7o\2\2jk\7c\2\2kl\7p\2\2lm\7f\2\2mq\3"+
		"\2\2\2np\5\6\3\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3"+
		"\2\2\2tu\5\n\5\2uv\3\2\2\2vw\b\r\3\2w\33\3\2\2\2xy\7q\2\2yz\7w\2\2z{\7"+
		"v\2\2{|\7r\2\2|}\7w\2\2}~\7v\2\2~\u0082\3\2\2\2\177\u0081\5\6\3\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5\n\5\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\b\16\3\2\u0088\35\3\2\2\2\u0089\u008b\n\5\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\37\3\2\2\2\u008e\u008f\7\177\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\b\20\4\2\u0091!\3\2\2\2\r\2\3#,\63W_cq\u0082\u008c\5\b\2\2\4\3"+
		"\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}