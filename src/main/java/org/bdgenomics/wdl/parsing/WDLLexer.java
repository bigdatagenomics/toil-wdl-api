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
		CALL=9, SEP=10, IF=11, LOOP=12, SCATTER=13, DEFAULT=14, QUOTE=15, INPUT=16, 
		COMMAND_BRACKET_BLOCK=17, COMMAND_BRACE_BLOCK=18, STRING_TYPE=19, FILE_TYPE=20, 
		INT_TYPE=21, FLOAT_TYPE=22, BOOL_TYPE=23, OBJECT_TYPE=24, MAP_TYPE=25, 
		ARRAY_TYPE=26, TRUE=27, FALSE=28, IDENTIFIER=29, STRING=30, INTEGER=31, 
		OCTAL=32, HEX=33, DECIMAL=34, FLOAT=35, LEFT_BLOCK=36, RIGHT_BLOCK=37, 
		VAR_START=38, COMMA=39, DOT=40, COLON=41, LEFT_BRACKET=42, RIGHT_BRACKET=43, 
		LEFT_BRACE=44, RIGHT_BRACE=45, LEFT_PAREN=46, RIGHT_PAREN=47, PLUS=48, 
		MINUS=49, QUESTION=50, BANG=51, ASTERISK=52, FSLASH=53, PERCENT=54, GTEQ=55, 
		LTEQ=56, GT=57, LT=58, EQEQ=59, EQUALS=60, BANGEQ=61, DOUBLEAMP=62, DOUBLEBAR=63, 
		BRACKET_BLOCK_CLOSE=64, BRACKET_ANYTHING=65, RIGHT_ARROW=66, BRACE_BLOCK_CLOSE=67, 
		BRACE_ANYTHING=68;
	public static final int BRACKET_BLOCK_MODE = 1;
	public static final int BRACE_BLOCK_MODE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "BRACKET_BLOCK_MODE", "BRACE_BLOCK_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "WS", "TASK", "WORKFLOW", "AS", "IMPORT", "RUNTIME", "OUTPUT", 
		"CALL", "SEP", "IF", "LOOP", "SCATTER", "DEFAULT", "QUOTE", "INPUT", "COMMAND_BRACKET_BLOCK", 
		"COMMAND_BRACE_BLOCK", "STRING_TYPE", "FILE_TYPE", "INT_TYPE", "FLOAT_TYPE", 
		"BOOL_TYPE", "OBJECT_TYPE", "MAP_TYPE", "ARRAY_TYPE", "TRUE", "FALSE", 
		"IDENTIFIER", "STRING", "INTEGER", "OCTAL", "HEX", "DECIMAL", "FLOAT", 
		"LEFT_BLOCK", "RIGHT_BLOCK", "VAR_START", "COMMA", "DOT", "COLON", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", 
		"PLUS", "MINUS", "QUESTION", "BANG", "ASTERISK", "FSLASH", "PERCENT", 
		"GTEQ", "LTEQ", "GT", "LT", "EQEQ", "EQUALS", "BANGEQ", "DOUBLEAMP", "DOUBLEBAR", 
		"BRACKET_BLOCK_CLOSE", "BRACKET_ANYTHING", "RIGHT_ARROW", "BRACE_BLOCK_CLOSE", 
		"BRACE_ANYTHING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'task'", "'workflow'", "'as'", "'import'", "'runtime'", 
		"'output'", "'call'", "'sep'", "'if'", "'loop'", "'scatter'", "'default'", 
		"'quote'", "'input'", null, null, "'String'", "'File'", "'Int'", "'Float'", 
		"'Bool'", "'Object'", "'Map'", "'Array'", "'true'", "'false'", null, null, 
		null, null, null, null, null, "'<<<'", null, "'${'", "','", "'.'", "':'", 
		"'['", "']'", "'{'", null, "'('", "')'", "'+'", "'-'", "'?'", "'!'", "'*'", 
		"'/'", "'%'", "'>='", "'<='", null, "'<'", "'=='", "'='", "'!='", "'&&'", 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "TASK", "WORKFLOW", "AS", "IMPORT", "RUNTIME", 
		"OUTPUT", "CALL", "SEP", "IF", "LOOP", "SCATTER", "DEFAULT", "QUOTE", 
		"INPUT", "COMMAND_BRACKET_BLOCK", "COMMAND_BRACE_BLOCK", "STRING_TYPE", 
		"FILE_TYPE", "INT_TYPE", "FLOAT_TYPE", "BOOL_TYPE", "OBJECT_TYPE", "MAP_TYPE", 
		"ARRAY_TYPE", "TRUE", "FALSE", "IDENTIFIER", "STRING", "INTEGER", "OCTAL", 
		"HEX", "DECIMAL", "FLOAT", "LEFT_BLOCK", "RIGHT_BLOCK", "VAR_START", "COMMA", 
		"DOT", "COLON", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", 
		"LEFT_PAREN", "RIGHT_PAREN", "PLUS", "MINUS", "QUESTION", "BANG", "ASTERISK", 
		"FSLASH", "PERCENT", "GTEQ", "LTEQ", "GT", "LT", "EQEQ", "EQUALS", "BANGEQ", 
		"DOUBLEAMP", "DOUBLEBAR", "BRACKET_BLOCK_CLOSE", "BRACKET_ANYTHING", "RIGHT_ARROW", 
		"BRACE_BLOCK_CLOSE", "BRACE_ANYTHING"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2F\u020a\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3"+
		"\2\3\3\6\3\u0093\n\3\r\3\16\3\u0094\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f6\n\22\f\22\16\22\u00f9"+
		"\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u010a\n\23\f\23\16\23\u010d\13\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\7\36\u014c\n\36\f\36\16\36\u014f\13\36\3\36\3\36\3\36\6\36\u0154"+
		"\n\36\r\36\16\36\u0155\7\36\u0158\n\36\f\36\16\36\u015b\13\36\3\37\3\37"+
		"\3\37\3\37\7\37\u0161\n\37\f\37\16\37\u0164\13\37\3\37\3\37\3\37\3\37"+
		"\3\37\7\37\u016b\n\37\f\37\16\37\u016e\13\37\3\37\5\37\u0171\n\37\3 \3"+
		" \3 \5 \u0176\n \3!\3!\7!\u017a\n!\f!\16!\u017d\13!\3\"\3\"\3\"\6\"\u0182"+
		"\n\"\r\"\16\"\u0183\3#\3#\7#\u0188\n#\f#\16#\u018b\13#\3$\6$\u018e\n$"+
		"\r$\16$\u018f\5$\u0192\n$\3$\3$\6$\u0196\n$\r$\16$\u0197\3$\6$\u019b\n"+
		"$\r$\16$\u019c\3$\3$\6$\u01a1\n$\r$\16$\u01a2\5$\u01a5\n$\3$\3$\5$\u01a9"+
		"\n$\3$\6$\u01ac\n$\r$\16$\u01ad\5$\u01b0\n$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3"+
		"@\3A\3A\3A\3A\3A\3A\3B\6B\u01fc\nB\rB\16B\u01fd\3C\3C\3D\3D\3D\3D\3E\6"+
		"E\u0207\nE\rE\16E\u0208\2\2F\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13"+
		"\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63"+
		"\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61"+
		"c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@\u0081A\u0083B\u0085C\u0087"+
		"D\u0089E\u008bF\5\2\3\4\21\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\6\2\62"+
		";C\\aac|\4\2\f\f$$\n\2\n\f\16\17$$))AA^^ccxx\3\2\629\4\2ZZzz\5\2\62;C"+
		"Hch\3\2\63;\3\2\62;\4\2GGgg\4\2--//\3\2@@\3\2\177\177\u0223\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\3\u0085\3\2\2\2\3\u0087\3"+
		"\2\2\2\4\u0089\3\2\2\2\4\u008b\3\2\2\2\5\u008d\3\2\2\2\7\u0092\3\2\2\2"+
		"\t\u0098\3\2\2\2\13\u009d\3\2\2\2\r\u00a6\3\2\2\2\17\u00a9\3\2\2\2\21"+
		"\u00b0\3\2\2\2\23\u00b8\3\2\2\2\25\u00bf\3\2\2\2\27\u00c4\3\2\2\2\31\u00c8"+
		"\3\2\2\2\33\u00cb\3\2\2\2\35\u00d0\3\2\2\2\37\u00d8\3\2\2\2!\u00e0\3\2"+
		"\2\2#\u00e6\3\2\2\2%\u00ec\3\2\2\2\'\u0100\3\2\2\2)\u0112\3\2\2\2+\u0119"+
		"\3\2\2\2-\u011e\3\2\2\2/\u0122\3\2\2\2\61\u0128\3\2\2\2\63\u012d\3\2\2"+
		"\2\65\u0134\3\2\2\2\67\u0138\3\2\2\29\u013e\3\2\2\2;\u0143\3\2\2\2=\u0149"+
		"\3\2\2\2?\u0170\3\2\2\2A\u0175\3\2\2\2C\u0177\3\2\2\2E\u017e\3\2\2\2G"+
		"\u0185\3\2\2\2I\u01a4\3\2\2\2K\u01b1\3\2\2\2M\u01b5\3\2\2\2O\u01b9\3\2"+
		"\2\2Q\u01bc\3\2\2\2S\u01be\3\2\2\2U\u01c0\3\2\2\2W\u01c2\3\2\2\2Y\u01c4"+
		"\3\2\2\2[\u01c6\3\2\2\2]\u01c8\3\2\2\2_\u01ca\3\2\2\2a\u01cc\3\2\2\2c"+
		"\u01ce\3\2\2\2e\u01d0\3\2\2\2g\u01d2\3\2\2\2i\u01d4\3\2\2\2k\u01d6\3\2"+
		"\2\2m\u01d8\3\2\2\2o\u01da\3\2\2\2q\u01dc\3\2\2\2s\u01df\3\2\2\2u\u01e2"+
		"\3\2\2\2w\u01e4\3\2\2\2y\u01e6\3\2\2\2{\u01e9\3\2\2\2}\u01eb\3\2\2\2\177"+
		"\u01ee\3\2\2\2\u0081\u01f1\3\2\2\2\u0083\u01f4\3\2\2\2\u0085\u01fb\3\2"+
		"\2\2\u0087\u01ff\3\2\2\2\u0089\u0201\3\2\2\2\u008b\u0206\3\2\2\2\u008d"+
		"\u008e\t\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\2\2\2\u0090\6\3\2\2\2"+
		"\u0091\u0093\t\3\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\3\2\2\u0097"+
		"\b\3\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7c\2\2\u009a\u009b\7u\2\2\u009b"+
		"\u009c\7m\2\2\u009c\n\3\2\2\2\u009d\u009e\7y\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7m\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7n\2\2"+
		"\u00a3\u00a4\7q\2\2\u00a4\u00a5\7y\2\2\u00a5\f\3\2\2\2\u00a6\u00a7\7c"+
		"\2\2\u00a7\u00a8\7u\2\2\u00a8\16\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab"+
		"\7o\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7t\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\20\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7w\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7o\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7"+
		"w\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2"+
		"\7n\2\2\u00c2\u00c3\7n\2\2\u00c3\26\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7r\2\2\u00c7\30\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7r\2\2\u00cf\34\3\2\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2"+
		"\7e\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7t\2\2\u00d7\36\3\2\2\2\u00d8\u00d9\7f\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7w\2\2"+
		"\u00dd\u00de\7n\2\2\u00de\u00df\7v\2\2\u00df \3\2\2\2\u00e0\u00e1\7s\2"+
		"\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\"\3\2\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9"+
		"\7r\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7v\2\2\u00eb$\3\2\2\2\u00ec\u00ed"+
		"\7e\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0\7o\2\2\u00f0"+
		"\u00f1\7c\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f7\3\2\2"+
		"\2\u00f4\u00f6\t\3\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\7>\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\3\2\2"+
		"\2\u00fe\u00ff\b\22\3\2\u00ff&\3\2\2\2\u0100\u0101\7e\2\2\u0101\u0102"+
		"\7q\2\2\u0102\u0103\7o\2\2\u0103\u0104\7o\2\2\u0104\u0105\7c\2\2\u0105"+
		"\u0106\7p\2\2\u0106\u0107\7f\2\2\u0107\u010b\3\2\2\2\u0108\u010a\t\3\2"+
		"\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7}\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\b\23\4\2\u0111(\3\2\2\2\u0112\u0113\7U\2\2"+
		"\u0113\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116\7k\2\2\u0116\u0117"+
		"\7p\2\2\u0117\u0118\7i\2\2\u0118*\3\2\2\2\u0119\u011a\7H\2\2\u011a\u011b"+
		"\7k\2\2\u011b\u011c\7n\2\2\u011c\u011d\7g\2\2\u011d,\3\2\2\2\u011e\u011f"+
		"\7K\2\2\u011f\u0120\7p\2\2\u0120\u0121\7v\2\2\u0121.\3\2\2\2\u0122\u0123"+
		"\7H\2\2\u0123\u0124\7n\2\2\u0124\u0125\7q\2\2\u0125\u0126\7c\2\2\u0126"+
		"\u0127\7v\2\2\u0127\60\3\2\2\2\u0128\u0129\7D\2\2\u0129\u012a\7q\2\2\u012a"+
		"\u012b\7q\2\2\u012b\u012c\7n\2\2\u012c\62\3\2\2\2\u012d\u012e\7Q\2\2\u012e"+
		"\u012f\7d\2\2\u012f\u0130\7l\2\2\u0130\u0131\7g\2\2\u0131\u0132\7e\2\2"+
		"\u0132\u0133\7v\2\2\u0133\64\3\2\2\2\u0134\u0135\7O\2\2\u0135\u0136\7"+
		"c\2\2\u0136\u0137\7r\2\2\u0137\66\3\2\2\2\u0138\u0139\7C\2\2\u0139\u013a"+
		"\7t\2\2\u013a\u013b\7t\2\2\u013b\u013c\7c\2\2\u013c\u013d\7{\2\2\u013d"+
		"8\3\2\2\2\u013e\u013f\7v\2\2\u013f\u0140\7t\2\2\u0140\u0141\7w\2\2\u0141"+
		"\u0142\7g\2\2\u0142:\3\2\2\2\u0143\u0144\7h\2\2\u0144\u0145\7c\2\2\u0145"+
		"\u0146\7n\2\2\u0146\u0147\7u\2\2\u0147\u0148\7g\2\2\u0148<\3\2\2\2\u0149"+
		"\u014d\t\4\2\2\u014a\u014c\t\5\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0159\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0151\7\60\2\2\u0151\u0153\t\4\2\2\u0152\u0154\t"+
		"\5\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0150\3\2\2\2\u0158\u015b\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a>\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015c\u0162\7$\2\2\u015d\u0161\n\6\2\2\u015e\u015f\7^\2\2\u015f"+
		"\u0161\t\7\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0171\7$\2\2\u0166\u016c\7)\2\2\u0167\u016b\n\6\2"+
		"\2\u0168\u0169\7^\2\2\u0169\u016b\t\7\2\2\u016a\u0167\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\7)\2\2\u0170\u015c\3\2"+
		"\2\2\u0170\u0166\3\2\2\2\u0171@\3\2\2\2\u0172\u0176\5E\"\2\u0173\u0176"+
		"\5C!\2\u0174\u0176\5G#\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176B\3\2\2\2\u0177\u017b\7\62\2\2\u0178\u017a\t\b\2\2"+
		"\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017cD\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\62\2\2\u017f"+
		"\u0181\t\t\2\2\u0180\u0182\t\n\2\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184F\3\2\2\2\u0185\u0189"+
		"\t\13\2\2\u0186\u0188\t\f\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2"+
		"\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018aH\3\2\2\2\u018b\u0189\3"+
		"\2\2\2\u018c\u018e\t\f\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018d\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\7\60\2\2\u0194"+
		"\u0196\t\f\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u01a5\3\2\2\2\u0199\u019b\t\f\2\2\u019a"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a5\7\60\2\2\u019f\u01a1\t\f\2\2\u01a0"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a5\3\2\2\2\u01a4\u0191\3\2\2\2\u01a4\u019a\3\2\2\2\u01a4"+
		"\u01a0\3\2\2\2\u01a5\u01af\3\2\2\2\u01a6\u01a8\t\r\2\2\u01a7\u01a9\t\16"+
		"\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u01ac\t\f\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01a6\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0J\3\2\2\2\u01b1\u01b2\7>\2\2\u01b2\u01b3\7>\2\2\u01b3"+
		"\u01b4\7>\2\2\u01b4L\3\2\2\2\u01b5\u01b6\7@\2\2\u01b6\u01b7\7@\2\2\u01b7"+
		"\u01b8\7@\2\2\u01b8N\3\2\2\2\u01b9\u01ba\7&\2\2\u01ba\u01bb\7}\2\2\u01bb"+
		"P\3\2\2\2\u01bc\u01bd\7.\2\2\u01bdR\3\2\2\2\u01be\u01bf\7\60\2\2\u01bf"+
		"T\3\2\2\2\u01c0\u01c1\7<\2\2\u01c1V\3\2\2\2\u01c2\u01c3\7]\2\2\u01c3X"+
		"\3\2\2\2\u01c4\u01c5\7_\2\2\u01c5Z\3\2\2\2\u01c6\u01c7\7}\2\2\u01c7\\"+
		"\3\2\2\2\u01c8\u01c9\7\177\2\2\u01c9^\3\2\2\2\u01ca\u01cb\7*\2\2\u01cb"+
		"`\3\2\2\2\u01cc\u01cd\7+\2\2\u01cdb\3\2\2\2\u01ce\u01cf\7-\2\2\u01cfd"+
		"\3\2\2\2\u01d0\u01d1\7/\2\2\u01d1f\3\2\2\2\u01d2\u01d3\7A\2\2\u01d3h\3"+
		"\2\2\2\u01d4\u01d5\7#\2\2\u01d5j\3\2\2\2\u01d6\u01d7\7,\2\2\u01d7l\3\2"+
		"\2\2\u01d8\u01d9\7\61\2\2\u01d9n\3\2\2\2\u01da\u01db\7\'\2\2\u01dbp\3"+
		"\2\2\2\u01dc\u01dd\7@\2\2\u01dd\u01de\7?\2\2\u01der\3\2\2\2\u01df\u01e0"+
		"\7>\2\2\u01e0\u01e1\7?\2\2\u01e1t\3\2\2\2\u01e2\u01e3\7@\2\2\u01e3v\3"+
		"\2\2\2\u01e4\u01e5\7>\2\2\u01e5x\3\2\2\2\u01e6\u01e7\7?\2\2\u01e7\u01e8"+
		"\7?\2\2\u01e8z\3\2\2\2\u01e9\u01ea\7?\2\2\u01ea|\3\2\2\2\u01eb\u01ec\7"+
		"#\2\2\u01ec\u01ed\7?\2\2\u01ed~\3\2\2\2\u01ee\u01ef\7(\2\2\u01ef\u01f0"+
		"\7(\2\2\u01f0\u0080\3\2\2\2\u01f1\u01f2\7~\2\2\u01f2\u01f3\7~\2\2\u01f3"+
		"\u0082\3\2\2\2\u01f4\u01f5\7@\2\2\u01f5\u01f6\7@\2\2\u01f6\u01f7\7@\2"+
		"\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\bA\5\2\u01f9\u0084\3\2\2\2\u01fa\u01fc"+
		"\n\17\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2"+
		"\u01fd\u01fe\3\2\2\2\u01fe\u0086\3\2\2\2\u01ff\u0200\7@\2\2\u0200\u0088"+
		"\3\2\2\2\u0201\u0202\7\177\2\2\u0202\u0203\3\2\2\2\u0203\u0204\bD\5\2"+
		"\u0204\u008a\3\2\2\2\u0205\u0207\n\20\2\2\u0206\u0205\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u008c\3\2\2\2\37"+
		"\2\3\4\u0094\u00f7\u010b\u014d\u0155\u0159\u0160\u0162\u016a\u016c\u0170"+
		"\u0175\u017b\u0183\u0189\u018f\u0191\u0197\u019c\u01a2\u01a4\u01a8\u01ad"+
		"\u01af\u01fd\u0208\6\b\2\2\4\3\2\4\4\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}