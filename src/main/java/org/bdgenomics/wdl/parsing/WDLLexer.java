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
		INPUT=17, COMMAND_BLOCK=18, STRING_TYPE=19, FILE_TYPE=20, INT_TYPE=21, 
		FLOAT_TYPE=22, BOOL_TYPE=23, OBJECT_TYPE=24, MAP_TYPE=25, ARRAY_TYPE=26, 
		TRUE=27, FALSE=28, IDENTIFIER=29, STRING=30, INTEGER=31, OCTAL=32, HEX=33, 
		DECIMAL=34, FLOAT=35, LEFT_BLOCK=36, RIGHT_BLOCK=37, VAR_START=38, COMMA=39, 
		DOT=40, COLON=41, LEFT_BRACKET=42, RIGHT_BRACKET=43, LEFT_BRACE=44, RIGHT_BRACE=45, 
		LEFT_PAREN=46, RIGHT_PAREN=47, PLUS=48, MINUS=49, QUESTION=50, BANG=51, 
		ASTERISK=52, FSLASH=53, PERCENT=54, GTEQ=55, LTEQ=56, GT=57, LT=58, EQEQ=59, 
		EQUALS=60, BANGEQ=61, DOUBLEAMP=62, DOUBLEBAR=63, COMMAND_CLOSE=64, ANYTHING=65, 
		RIGHT_ARROW=66;
	public static final int COMMAND_MODE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMAND_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "WS", "TASK", "WORKFLOW", "AS", "IMPORT", "RUNTIME", "OUTPUT", 
		"CALL", "SEP", "IF", "LOOP", "SCATTER", "DEFAULT", "QUOTE", "COMMAND", 
		"INPUT", "COMMAND_BLOCK", "STRING_TYPE", "FILE_TYPE", "INT_TYPE", "FLOAT_TYPE", 
		"BOOL_TYPE", "OBJECT_TYPE", "MAP_TYPE", "ARRAY_TYPE", "TRUE", "FALSE", 
		"IDENTIFIER", "STRING", "INTEGER", "OCTAL", "HEX", "DECIMAL", "FLOAT", 
		"LEFT_BLOCK", "RIGHT_BLOCK", "VAR_START", "COMMA", "DOT", "COLON", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", 
		"PLUS", "MINUS", "QUESTION", "BANG", "ASTERISK", "FSLASH", "PERCENT", 
		"GTEQ", "LTEQ", "GT", "LT", "EQEQ", "EQUALS", "BANGEQ", "DOUBLEAMP", "DOUBLEBAR", 
		"COMMAND_CLOSE", "ANYTHING", "RIGHT_ARROW"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'task'", "'workflow'", "'as'", "'import'", "'runtime'", 
		"'output'", "'call'", "'sep'", "'if'", "'loop'", "'scatter'", "'default'", 
		"'quote'", "'command'", "'input'", null, "'String'", "'File'", "'Int'", 
		"'Float'", "'Bool'", "'Object'", "'Map'", "'Array'", "'true'", "'false'", 
		null, null, null, null, null, null, null, null, null, "'${'", "','", "'.'", 
		"':'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'+'", "'-'", "'?'", 
		"'!'", "'*'", "'/'", "'%'", "'>='", "'<='", null, "'<'", "'=='", "'='", 
		"'!='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "TASK", "WORKFLOW", "AS", "IMPORT", "RUNTIME", 
		"OUTPUT", "CALL", "SEP", "IF", "LOOP", "SCATTER", "DEFAULT", "QUOTE", 
		"COMMAND", "INPUT", "COMMAND_BLOCK", "STRING_TYPE", "FILE_TYPE", "INT_TYPE", 
		"FLOAT_TYPE", "BOOL_TYPE", "OBJECT_TYPE", "MAP_TYPE", "ARRAY_TYPE", "TRUE", 
		"FALSE", "IDENTIFIER", "STRING", "INTEGER", "OCTAL", "HEX", "DECIMAL", 
		"FLOAT", "LEFT_BLOCK", "RIGHT_BLOCK", "VAR_START", "COMMA", "DOT", "COLON", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", 
		"RIGHT_PAREN", "PLUS", "MINUS", "QUESTION", "BANG", "ASTERISK", "FSLASH", 
		"PERCENT", "GTEQ", "LTEQ", "GT", "LT", "EQEQ", "EQUALS", "BANGEQ", "DOUBLEAMP", 
		"DOUBLEBAR", "COMMAND_CLOSE", "ANYTHING", "RIGHT_ARROW"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u01e4\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\6\3\u008e\n"+
		"\3\r\3\16\3\u008f\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u012f\n\36\f\36"+
		"\16\36\u0132\13\36\3\36\3\36\3\36\6\36\u0137\n\36\r\36\16\36\u0138\7\36"+
		"\u013b\n\36\f\36\16\36\u013e\13\36\3\37\3\37\3\37\3\37\7\37\u0144\n\37"+
		"\f\37\16\37\u0147\13\37\3\37\3\37\3\37\3\37\3\37\7\37\u014e\n\37\f\37"+
		"\16\37\u0151\13\37\3\37\5\37\u0154\n\37\3 \3 \3 \5 \u0159\n \3!\3!\7!"+
		"\u015d\n!\f!\16!\u0160\13!\3\"\3\"\3\"\6\"\u0165\n\"\r\"\16\"\u0166\3"+
		"#\3#\7#\u016b\n#\f#\16#\u016e\13#\3$\6$\u0171\n$\r$\16$\u0172\5$\u0175"+
		"\n$\3$\3$\6$\u0179\n$\r$\16$\u017a\3$\6$\u017e\n$\r$\16$\u017f\3$\3$\6"+
		"$\u0184\n$\r$\16$\u0185\5$\u0188\n$\3$\3$\5$\u018c\n$\3$\6$\u018f\n$\r"+
		"$\16$\u0190\5$\u0193\n$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3:"+
		"\3:\3;\3;\3<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\3A"+
		"\3B\6B\u01df\nB\rB\16B\u01e0\3C\3C\2\2D\4\3\6\4\b\5\n\6\f\7\16\b\20\t"+
		"\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27."+
		"\30\60\31\62\32\64\33\66\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-"+
		"Z.\\/^\60`\61b\62d\63f\64h\65j\66l\67n8p9r:t;v<x=z>|?~@\u0080A\u0082B"+
		"\u0084C\u0086D\4\2\3\20\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\6\2\62;C"+
		"\\aac|\4\2\f\f$$\n\2\n\f\16\17$$))AA^^ccxx\3\2\629\4\2ZZzz\5\2\62;CHc"+
		"h\3\2\63;\3\2\62;\4\2GGgg\4\2--//\3\2@@\u01fb\2\4\3\2\2\2\2\6\3\2\2\2"+
		"\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3"+
		"\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2"+
		"\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2"+
		"\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2"+
		"\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2"+
		"\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2"+
		"N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3"+
		"\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2"+
		"\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2"+
		"\2t\3\2\2\2\2v\3\2\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080"+
		"\3\2\2\2\3\u0082\3\2\2\2\3\u0084\3\2\2\2\3\u0086\3\2\2\2\4\u0088\3\2\2"+
		"\2\6\u008d\3\2\2\2\b\u0093\3\2\2\2\n\u0098\3\2\2\2\f\u00a1\3\2\2\2\16"+
		"\u00a4\3\2\2\2\20\u00ab\3\2\2\2\22\u00b3\3\2\2\2\24\u00ba\3\2\2\2\26\u00bf"+
		"\3\2\2\2\30\u00c3\3\2\2\2\32\u00c6\3\2\2\2\34\u00cb\3\2\2\2\36\u00d3\3"+
		"\2\2\2 \u00db\3\2\2\2\"\u00e1\3\2\2\2$\u00e9\3\2\2\2&\u00ef\3\2\2\2(\u00f5"+
		"\3\2\2\2*\u00fc\3\2\2\2,\u0101\3\2\2\2.\u0105\3\2\2\2\60\u010b\3\2\2\2"+
		"\62\u0110\3\2\2\2\64\u0117\3\2\2\2\66\u011b\3\2\2\28\u0121\3\2\2\2:\u0126"+
		"\3\2\2\2<\u012c\3\2\2\2>\u0153\3\2\2\2@\u0158\3\2\2\2B\u015a\3\2\2\2D"+
		"\u0161\3\2\2\2F\u0168\3\2\2\2H\u0187\3\2\2\2J\u0194\3\2\2\2L\u0198\3\2"+
		"\2\2N\u019c\3\2\2\2P\u019f\3\2\2\2R\u01a1\3\2\2\2T\u01a3\3\2\2\2V\u01a5"+
		"\3\2\2\2X\u01a7\3\2\2\2Z\u01a9\3\2\2\2\\\u01ab\3\2\2\2^\u01ad\3\2\2\2"+
		"`\u01af\3\2\2\2b\u01b1\3\2\2\2d\u01b3\3\2\2\2f\u01b5\3\2\2\2h\u01b7\3"+
		"\2\2\2j\u01b9\3\2\2\2l\u01bb\3\2\2\2n\u01bd\3\2\2\2p\u01bf\3\2\2\2r\u01c2"+
		"\3\2\2\2t\u01c5\3\2\2\2v\u01c7\3\2\2\2x\u01c9\3\2\2\2z\u01cc\3\2\2\2|"+
		"\u01ce\3\2\2\2~\u01d1\3\2\2\2\u0080\u01d4\3\2\2\2\u0082\u01d7\3\2\2\2"+
		"\u0084\u01de\3\2\2\2\u0086\u01e2\3\2\2\2\u0088\u0089\t\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\b\2\2\2\u008b\5\3\2\2\2\u008c\u008e\t\3\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\3\2\2\u0092\7\3\2\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0095\7c\2\2\u0095\u0096\7u\2\2\u0096\u0097\7m\2\2\u0097"+
		"\t\3\2\2\2\u0098\u0099\7y\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b"+
		"\u009c\7m\2\2\u009c\u009d\7h\2\2\u009d\u009e\7n\2\2\u009e\u009f\7q\2\2"+
		"\u009f\u00a0\7y\2\2\u00a0\13\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7"+
		"u\2\2\u00a3\r\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7"+
		"\7r\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\17\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\21\3\2\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7"+
		"v\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7v\2\2\u00b9\23"+
		"\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7n\2\2\u00be\25\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7r\2\2\u00c2\27\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7h\2\2\u00c5"+
		"\31\3\2\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\u00ca\7r\2\2\u00ca\33\3\2\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7e\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\u00d2\7t\2\2\u00d2\35\3\2\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7"+
		"g\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9"+
		"\7n\2\2\u00d9\u00da\7v\2\2\u00da\37\3\2\2\2\u00db\u00dc\7s\2\2\u00dc\u00dd"+
		"\7w\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"!\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7o\2\2\u00e4"+
		"\u00e5\7o\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7f\2\2"+
		"\u00e8#\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7r\2"+
		"\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7v\2\2\u00ee%\3\2\2\2\u00ef\u00f0\7"+
		">\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\b\23\3\2\u00f4\'\3\2\2\2\u00f5\u00f6\7U\2\2\u00f6\u00f7\7v\2\2"+
		"\u00f7\u00f8\7t\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb"+
		"\7i\2\2\u00fb)\3\2\2\2\u00fc\u00fd\7H\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff"+
		"\7n\2\2\u00ff\u0100\7g\2\2\u0100+\3\2\2\2\u0101\u0102\7K\2\2\u0102\u0103"+
		"\7p\2\2\u0103\u0104\7v\2\2\u0104-\3\2\2\2\u0105\u0106\7H\2\2\u0106\u0107"+
		"\7n\2\2\u0107\u0108\7q\2\2\u0108\u0109\7c\2\2\u0109\u010a\7v\2\2\u010a"+
		"/\3\2\2\2\u010b\u010c\7D\2\2\u010c\u010d\7q\2\2\u010d\u010e\7q\2\2\u010e"+
		"\u010f\7n\2\2\u010f\61\3\2\2\2\u0110\u0111\7Q\2\2\u0111\u0112\7d\2\2\u0112"+
		"\u0113\7l\2\2\u0113\u0114\7g\2\2\u0114\u0115\7e\2\2\u0115\u0116\7v\2\2"+
		"\u0116\63\3\2\2\2\u0117\u0118\7O\2\2\u0118\u0119\7c\2\2\u0119\u011a\7"+
		"r\2\2\u011a\65\3\2\2\2\u011b\u011c\7C\2\2\u011c\u011d\7t\2\2\u011d\u011e"+
		"\7t\2\2\u011e\u011f\7c\2\2\u011f\u0120\7{\2\2\u0120\67\3\2\2\2\u0121\u0122"+
		"\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124\7w\2\2\u0124\u0125\7g\2\2\u0125"+
		"9\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128\7c\2\2\u0128\u0129\7n\2\2\u0129"+
		"\u012a\7u\2\2\u012a\u012b\7g\2\2\u012b;\3\2\2\2\u012c\u0130\t\4\2\2\u012d"+
		"\u012f\t\5\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u013c\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0134\7\60\2\2\u0134\u0136\t\4\2\2\u0135\u0137\t\5\2\2\u0136\u0135\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0133\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d=\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0145"+
		"\7$\2\2\u0140\u0144\n\6\2\2\u0141\u0142\7^\2\2\u0142\u0144\t\7\2\2\u0143"+
		"\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0154\7$\2\2\u0149\u014f\7)\2\2\u014a\u014e\n\6\2\2\u014b\u014c\7^\2"+
		"\2\u014c\u014e\t\7\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0151"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0154\7)\2\2\u0153\u013f\3\2\2\2\u0153\u0149\3\2"+
		"\2\2\u0154?\3\2\2\2\u0155\u0159\5D\"\2\u0156\u0159\5B!\2\u0157\u0159\5"+
		"F#\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"A\3\2\2\2\u015a\u015e\7\62\2\2\u015b\u015d\t\b\2\2\u015c\u015b\3\2\2\2"+
		"\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015fC\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\62\2\2\u0162\u0164\t\t\2\2\u0163"+
		"\u0165\t\n\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167E\3\2\2\2\u0168\u016c\t\13\2\2\u0169\u016b"+
		"\t\f\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016dG\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\t\f\2\2"+
		"\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0170\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0178\7\60\2\2\u0177\u0179\t\f\2\2\u0178\u0177\3"+
		"\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u0188\3\2\2\2\u017c\u017e\t\f\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0188\7\60\2\2\u0182\u0184\t\f\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3"+
		"\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0174\3\2\2\2\u0187\u017d\3\2\2\2\u0187\u0183\3\2\2\2\u0188\u0192\3\2"+
		"\2\2\u0189\u018b\t\r\2\2\u018a\u018c\t\16\2\2\u018b\u018a\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018f\t\f\2\2\u018e\u018d\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0189\3\2\2\2\u0192\u0193\3\2\2\2\u0193I\3\2\2\2"+
		"\u0194\u0195\7>\2\2\u0195\u0196\7>\2\2\u0196\u0197\7>\2\2\u0197K\3\2\2"+
		"\2\u0198\u0199\7@\2\2\u0199\u019a\7@\2\2\u019a\u019b\7@\2\2\u019bM\3\2"+
		"\2\2\u019c\u019d\7&\2\2\u019d\u019e\7}\2\2\u019eO\3\2\2\2\u019f\u01a0"+
		"\7.\2\2\u01a0Q\3\2\2\2\u01a1\u01a2\7\60\2\2\u01a2S\3\2\2\2\u01a3\u01a4"+
		"\7<\2\2\u01a4U\3\2\2\2\u01a5\u01a6\7]\2\2\u01a6W\3\2\2\2\u01a7\u01a8\7"+
		"_\2\2\u01a8Y\3\2\2\2\u01a9\u01aa\7}\2\2\u01aa[\3\2\2\2\u01ab\u01ac\7\177"+
		"\2\2\u01ac]\3\2\2\2\u01ad\u01ae\7*\2\2\u01ae_\3\2\2\2\u01af\u01b0\7+\2"+
		"\2\u01b0a\3\2\2\2\u01b1\u01b2\7-\2\2\u01b2c\3\2\2\2\u01b3\u01b4\7/\2\2"+
		"\u01b4e\3\2\2\2\u01b5\u01b6\7A\2\2\u01b6g\3\2\2\2\u01b7\u01b8\7#\2\2\u01b8"+
		"i\3\2\2\2\u01b9\u01ba\7,\2\2\u01bak\3\2\2\2\u01bb\u01bc\7\61\2\2\u01bc"+
		"m\3\2\2\2\u01bd\u01be\7\'\2\2\u01beo\3\2\2\2\u01bf\u01c0\7@\2\2\u01c0"+
		"\u01c1\7?\2\2\u01c1q\3\2\2\2\u01c2\u01c3\7>\2\2\u01c3\u01c4\7?\2\2\u01c4"+
		"s\3\2\2\2\u01c5\u01c6\7@\2\2\u01c6u\3\2\2\2\u01c7\u01c8\7>\2\2\u01c8w"+
		"\3\2\2\2\u01c9\u01ca\7?\2\2\u01ca\u01cb\7?\2\2\u01cby\3\2\2\2\u01cc\u01cd"+
		"\7?\2\2\u01cd{\3\2\2\2\u01ce\u01cf\7#\2\2\u01cf\u01d0\7?\2\2\u01d0}\3"+
		"\2\2\2\u01d1\u01d2\7(\2\2\u01d2\u01d3\7(\2\2\u01d3\177\3\2\2\2\u01d4\u01d5"+
		"\7~\2\2\u01d5\u01d6\7~\2\2\u01d6\u0081\3\2\2\2\u01d7\u01d8\7@\2\2\u01d8"+
		"\u01d9\7@\2\2\u01d9\u01da\7@\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\bA\4"+
		"\2\u01dc\u0083\3\2\2\2\u01dd\u01df\n\17\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u0085\3\2"+
		"\2\2\u01e2\u01e3\7@\2\2\u01e3\u0087\3\2\2\2\33\2\3\u008f\u0130\u0138\u013c"+
		"\u0143\u0145\u014d\u014f\u0153\u0158\u015e\u0166\u016c\u0172\u0174\u017a"+
		"\u017f\u0185\u0187\u018b\u0190\u0192\u01e0\5\b\2\2\4\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}