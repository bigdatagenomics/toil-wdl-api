// Generated from WDLLexer.g4 by ANTLR 4.5.2
package org.bdgenomics.wdl.parsing;
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
		NEWLINE=1, WS=2, TASK=3, WORKFLOW=4, AS=5, IMPORT=6, RUNTIME=7, OUTPUT=8, 
		CALL=9, SEP=10, IF=11, LOOP=12, SCATTER=13, DEFAULT=14, QUOTE=15, COMMAND=16, 
		INPUT=17, STRING_TYPE=18, FILE_TYPE=19, INT_TYPE=20, FLOAT_TYPE=21, BOOL_TYPE=22, 
		OBJECT_TYPE=23, MAP_TYPE=24, ARRAY_TYPE=25, TRUE=26, FALSE=27, IDENTIFIER=28, 
		STRING=29, INTEGER=30, OCTAL=31, HEX=32, DECIMAL=33, FLOAT=34, LEFT_BLOCK=35, 
		RIGHT_BLOCK=36, VAR_START=37, COMMA=38, DOT=39, COLON=40, LEFT_BRACKET=41, 
		RIGHT_BRACKET=42, LEFT_BRACE=43, RIGHT_BRACE=44, LEFT_PAREN=45, RIGHT_PAREN=46, 
		PLUS=47, MINUS=48, QUESTION=49, BANG=50, ASTERISK=51, FSLASH=52, PERCENT=53, 
		GTEQ=54, LTEQ=55, GT=56, LT=57, EQEQ=58, EQUALS=59, BANGEQ=60, DOUBLEAMP=61, 
		DOUBLEBAR=62;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "WS", "TASK", "WORKFLOW", "AS", "IMPORT", "RUNTIME", "OUTPUT", 
		"CALL", "SEP", "IF", "LOOP", "SCATTER", "DEFAULT", "QUOTE", "COMMAND", 
		"INPUT", "STRING_TYPE", "FILE_TYPE", "INT_TYPE", "FLOAT_TYPE", "BOOL_TYPE", 
		"OBJECT_TYPE", "MAP_TYPE", "ARRAY_TYPE", "TRUE", "FALSE", "IDENTIFIER", 
		"STRING", "INTEGER", "OCTAL", "HEX", "DECIMAL", "FLOAT", "LEFT_BLOCK", 
		"RIGHT_BLOCK", "VAR_START", "COMMA", "DOT", "COLON", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", "PLUS", "MINUS", 
		"QUESTION", "BANG", "ASTERISK", "FSLASH", "PERCENT", "GTEQ", "LTEQ", "GT", 
		"LT", "EQEQ", "EQUALS", "BANGEQ", "DOUBLEAMP", "DOUBLEBAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'task'", "'workflow'", "'as'", "'import'", "'runtime'", 
		"'output'", "'call'", "'sep'", "'if'", "'loop'", "'scatter'", "'default'", 
		"'quote'", "'command'", "'input'", "'String'", "'File'", "'Int'", "'Float'", 
		"'Bool'", "'Object'", "'Map'", "'Array'", "'true'", "'false'", null, null, 
		null, null, null, null, null, "'<<<'", "'>>>'", "'${'", "','", "'.'", 
		"':'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'+'", "'-'", "'?'", 
		"'!'", "'*'", "'/'", "'%'", "'>='", "'<='", "'>'", "'<'", "'=='", "'='", 
		"'!='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "TASK", "WORKFLOW", "AS", "IMPORT", "RUNTIME", 
		"OUTPUT", "CALL", "SEP", "IF", "LOOP", "SCATTER", "DEFAULT", "QUOTE", 
		"COMMAND", "INPUT", "STRING_TYPE", "FILE_TYPE", "INT_TYPE", "FLOAT_TYPE", 
		"BOOL_TYPE", "OBJECT_TYPE", "MAP_TYPE", "ARRAY_TYPE", "TRUE", "FALSE", 
		"IDENTIFIER", "STRING", "INTEGER", "OCTAL", "HEX", "DECIMAL", "FLOAT", 
		"LEFT_BLOCK", "RIGHT_BLOCK", "VAR_START", "COMMA", "DOT", "COLON", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", 
		"PLUS", "MINUS", "QUESTION", "BANG", "ASTERISK", "FSLASH", "PERCENT", 
		"GTEQ", "LTEQ", "GT", "LT", "EQEQ", "EQUALS", "BANGEQ", "DOUBLEAMP", "DOUBLEBAR"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u01c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\6\3\u0085\n\3\r\3\16\3\u0086\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u0120"+
		"\n\35\f\35\16\35\u0123\13\35\3\35\3\35\3\35\6\35\u0128\n\35\r\35\16\35"+
		"\u0129\7\35\u012c\n\35\f\35\16\35\u012f\13\35\3\36\3\36\3\36\3\36\7\36"+
		"\u0135\n\36\f\36\16\36\u0138\13\36\3\36\3\36\3\36\3\36\3\36\7\36\u013f"+
		"\n\36\f\36\16\36\u0142\13\36\3\36\5\36\u0145\n\36\3\37\3\37\3\37\5\37"+
		"\u014a\n\37\3 \3 \7 \u014e\n \f \16 \u0151\13 \3!\3!\3!\6!\u0156\n!\r"+
		"!\16!\u0157\3\"\3\"\7\"\u015c\n\"\f\"\16\"\u015f\13\"\3#\6#\u0162\n#\r"+
		"#\16#\u0163\5#\u0166\n#\3#\3#\6#\u016a\n#\r#\16#\u016b\3#\6#\u016f\n#"+
		"\r#\16#\u0170\3#\3#\6#\u0175\n#\r#\16#\u0176\5#\u0179\n#\3#\3#\5#\u017d"+
		"\n#\3#\6#\u0180\n#\r#\16#\u0181\5#\u0184\n#\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3"+
		"?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u<w=y>{?}@\3\2\17\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\6\2"+
		"\62;C\\aac|\4\2\f\f$$\n\2\n\f\16\17$$))AA^^ccxx\3\2\629\4\2ZZzz\5\2\62"+
		";CHch\3\2\63;\3\2\62;\4\2GGgg\4\2--//\u01df\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177"+
		"\3\2\2\2\5\u0084\3\2\2\2\7\u008a\3\2\2\2\t\u008f\3\2\2\2\13\u0098\3\2"+
		"\2\2\r\u009b\3\2\2\2\17\u00a2\3\2\2\2\21\u00aa\3\2\2\2\23\u00b1\3\2\2"+
		"\2\25\u00b6\3\2\2\2\27\u00ba\3\2\2\2\31\u00bd\3\2\2\2\33\u00c2\3\2\2\2"+
		"\35\u00ca\3\2\2\2\37\u00d2\3\2\2\2!\u00d8\3\2\2\2#\u00e0\3\2\2\2%\u00e6"+
		"\3\2\2\2\'\u00ed\3\2\2\2)\u00f2\3\2\2\2+\u00f6\3\2\2\2-\u00fc\3\2\2\2"+
		"/\u0101\3\2\2\2\61\u0108\3\2\2\2\63\u010c\3\2\2\2\65\u0112\3\2\2\2\67"+
		"\u0117\3\2\2\29\u011d\3\2\2\2;\u0144\3\2\2\2=\u0149\3\2\2\2?\u014b\3\2"+
		"\2\2A\u0152\3\2\2\2C\u0159\3\2\2\2E\u0178\3\2\2\2G\u0185\3\2\2\2I\u0189"+
		"\3\2\2\2K\u018d\3\2\2\2M\u0190\3\2\2\2O\u0192\3\2\2\2Q\u0194\3\2\2\2S"+
		"\u0196\3\2\2\2U\u0198\3\2\2\2W\u019a\3\2\2\2Y\u019c\3\2\2\2[\u019e\3\2"+
		"\2\2]\u01a0\3\2\2\2_\u01a2\3\2\2\2a\u01a4\3\2\2\2c\u01a6\3\2\2\2e\u01a8"+
		"\3\2\2\2g\u01aa\3\2\2\2i\u01ac\3\2\2\2k\u01ae\3\2\2\2m\u01b0\3\2\2\2o"+
		"\u01b3\3\2\2\2q\u01b6\3\2\2\2s\u01b8\3\2\2\2u\u01ba\3\2\2\2w\u01bd\3\2"+
		"\2\2y\u01bf\3\2\2\2{\u01c2\3\2\2\2}\u01c5\3\2\2\2\177\u0080\t\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\b\2\2\2\u0082\4\3\2\2\2\u0083\u0085\t\3\2\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\3\2\2\u0089\6\3\2\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d\u008e\7m\2\2"+
		"\u008e\b\3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t"+
		"\2\2\u0092\u0093\7m\2\2\u0093\u0094\7h\2\2\u0094\u0095\7n\2\2\u0095\u0096"+
		"\7q\2\2\u0096\u0097\7y\2\2\u0097\n\3\2\2\2\u0098\u0099\7c\2\2\u0099\u009a"+
		"\7u\2\2\u009a\f\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7o\2\2\u009d\u009e"+
		"\7r\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\16\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\20\3\2\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7"+
		"v\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7v\2\2\u00b0\22"+
		"\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7n\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7r\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7h\2\2\u00bc"+
		"\30\3\2\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00c1\7r\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7e\2\2\u00c4"+
		"\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7g\2\2"+
		"\u00c8\u00c9\7t\2\2\u00c9\34\3\2\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7"+
		"g\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00d1\7v\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7s\2\2\u00d3\u00d4"+
		"\7w\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		" \3\2\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7o\2\2\u00db"+
		"\u00dc\7o\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7f\2\2"+
		"\u00df\"\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7r"+
		"\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7v\2\2\u00e5$\3\2\2\2\u00e6\u00e7"+
		"\7U\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7k\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7i\2\2\u00ec&\3\2\2\2\u00ed\u00ee\7H\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7g\2\2\u00f1(\3\2\2\2\u00f2"+
		"\u00f3\7K\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5*\3\2\2\2\u00f6"+
		"\u00f7\7H\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7c\2\2"+
		"\u00fa\u00fb\7v\2\2\u00fb,\3\2\2\2\u00fc\u00fd\7D\2\2\u00fd\u00fe\7q\2"+
		"\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7n\2\2\u0100.\3\2\2\2\u0101\u0102\7"+
		"Q\2\2\u0102\u0103\7d\2\2\u0103\u0104\7l\2\2\u0104\u0105\7g\2\2\u0105\u0106"+
		"\7e\2\2\u0106\u0107\7v\2\2\u0107\60\3\2\2\2\u0108\u0109\7O\2\2\u0109\u010a"+
		"\7c\2\2\u010a\u010b\7r\2\2\u010b\62\3\2\2\2\u010c\u010d\7C\2\2\u010d\u010e"+
		"\7t\2\2\u010e\u010f\7t\2\2\u010f\u0110\7c\2\2\u0110\u0111\7{\2\2\u0111"+
		"\64\3\2\2\2\u0112\u0113\7v\2\2\u0113\u0114\7t\2\2\u0114\u0115\7w\2\2\u0115"+
		"\u0116\7g\2\2\u0116\66\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119\7c\2\2\u0119"+
		"\u011a\7n\2\2\u011a\u011b\7u\2\2\u011b\u011c\7g\2\2\u011c8\3\2\2\2\u011d"+
		"\u0121\t\4\2\2\u011e\u0120\t\5\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u012d\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0125\7\60\2\2\u0125\u0127\t\4\2\2\u0126\u0128\t"+
		"\5\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0124\3\2\2\2\u012c\u012f\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e:\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0136\7$\2\2\u0131\u0135\n\6\2\2\u0132\u0133\7^\2\2\u0133"+
		"\u0135\t\7\2\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u0145\7$\2\2\u013a\u0140\7)\2\2\u013b\u013f\n\6\2"+
		"\2\u013c\u013d\7^\2\2\u013d\u013f\t\7\2\2\u013e\u013b\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\7)\2\2\u0144\u0130\3\2"+
		"\2\2\u0144\u013a\3\2\2\2\u0145<\3\2\2\2\u0146\u014a\5A!\2\u0147\u014a"+
		"\5? \2\u0148\u014a\5C\"\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a>\3\2\2\2\u014b\u014f\7\62\2\2\u014c\u014e\t\b\2\2"+
		"\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150@\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\62\2\2\u0153"+
		"\u0155\t\t\2\2\u0154\u0156\t\n\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158B\3\2\2\2\u0159\u015d"+
		"\t\13\2\2\u015a\u015c\t\f\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2"+
		"\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eD\3\2\2\2\u015f\u015d\3"+
		"\2\2\2\u0160\u0162\t\f\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0161\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\7\60\2\2\u0168"+
		"\u016a\t\f\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u0179\3\2\2\2\u016d\u016f\t\f\2\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0179\7\60\2\2\u0173\u0175\t\f\2\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\3\2\2\2\u0178\u0165\3\2\2\2\u0178\u016e\3\2\2\2\u0178"+
		"\u0174\3\2\2\2\u0179\u0183\3\2\2\2\u017a\u017c\t\r\2\2\u017b\u017d\t\16"+
		"\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u0180\t\f\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u017a\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184F\3\2\2\2\u0185\u0186\7>\2\2\u0186\u0187\7>\2\2\u0187"+
		"\u0188\7>\2\2\u0188H\3\2\2\2\u0189\u018a\7@\2\2\u018a\u018b\7@\2\2\u018b"+
		"\u018c\7@\2\2\u018cJ\3\2\2\2\u018d\u018e\7&\2\2\u018e\u018f\7}\2\2\u018f"+
		"L\3\2\2\2\u0190\u0191\7.\2\2\u0191N\3\2\2\2\u0192\u0193\7\60\2\2\u0193"+
		"P\3\2\2\2\u0194\u0195\7<\2\2\u0195R\3\2\2\2\u0196\u0197\7]\2\2\u0197T"+
		"\3\2\2\2\u0198\u0199\7_\2\2\u0199V\3\2\2\2\u019a\u019b\7}\2\2\u019bX\3"+
		"\2\2\2\u019c\u019d\7\177\2\2\u019dZ\3\2\2\2\u019e\u019f\7*\2\2\u019f\\"+
		"\3\2\2\2\u01a0\u01a1\7+\2\2\u01a1^\3\2\2\2\u01a2\u01a3\7-\2\2\u01a3`\3"+
		"\2\2\2\u01a4\u01a5\7/\2\2\u01a5b\3\2\2\2\u01a6\u01a7\7A\2\2\u01a7d\3\2"+
		"\2\2\u01a8\u01a9\7#\2\2\u01a9f\3\2\2\2\u01aa\u01ab\7,\2\2\u01abh\3\2\2"+
		"\2\u01ac\u01ad\7\61\2\2\u01adj\3\2\2\2\u01ae\u01af\7\'\2\2\u01afl\3\2"+
		"\2\2\u01b0\u01b1\7@\2\2\u01b1\u01b2\7?\2\2\u01b2n\3\2\2\2\u01b3\u01b4"+
		"\7>\2\2\u01b4\u01b5\7?\2\2\u01b5p\3\2\2\2\u01b6\u01b7\7@\2\2\u01b7r\3"+
		"\2\2\2\u01b8\u01b9\7>\2\2\u01b9t\3\2\2\2\u01ba\u01bb\7?\2\2\u01bb\u01bc"+
		"\7?\2\2\u01bcv\3\2\2\2\u01bd\u01be\7?\2\2\u01bex\3\2\2\2\u01bf\u01c0\7"+
		"#\2\2\u01c0\u01c1\7?\2\2\u01c1z\3\2\2\2\u01c2\u01c3\7(\2\2\u01c3\u01c4"+
		"\7(\2\2\u01c4|\3\2\2\2\u01c5\u01c6\7~\2\2\u01c6\u01c7\7~\2\2\u01c7~\3"+
		"\2\2\2\31\2\u0086\u0121\u0129\u012d\u0134\u0136\u013e\u0140\u0144\u0149"+
		"\u014f\u0157\u015d\u0163\u0165\u016b\u0170\u0176\u0178\u017c\u0181\u0183"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}