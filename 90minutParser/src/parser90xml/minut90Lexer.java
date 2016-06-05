// Generated from minut90.g4 by ANTLR 4.5
package parser90xml;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class minut90Lexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, OKR_L = 11, OKR_R = 12, KLA_L = 13, KLA_R = 14, CU = 15, STRING = 16, WS = 17, INT = 18,
			DIGIT = 19;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
			"T__9", "OKR_L", "OKR_R", "KLA_L", "KLA_R", "CU", "ESCAPED_QUOTE", "STRING", "WS", "INT", "DIGIT" };

	private static final String[] _LITERAL_NAMES = { null, "'liga'", "'druzyna'", "'mecze'", "'punkty'", "'zwyciestwa'",
			"'remisy'", "'porazki'", "'bramki'", "'strzelone'", "'stracone'", "'('", "')'", "'{'", "'}'", "'\"'" };
	private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
			"OKR_L", "OKR_R", "KLA_L", "KLA_R", "CU", "STRING", "WS", "INT", "DIGIT" };
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

	public minut90Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "minut90.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u009e\b\1\4\2"
			+ "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
			+ "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
			+ "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"
			+ "\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"
			+ "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"
			+ "\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"
			+ "\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"
			+ "\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"
			+ "\3\22\3\22\3\22\7\22\u008a\n\22\f\22\16\22\u008d\13\22\3\22\3\22\3\23"
			+ "\6\23\u0092\n\23\r\23\16\23\u0093\3\23\3\23\3\24\6\24\u0099\n\24\r\24"
			+ "\16\24\u009a\3\25\3\25\3\u008b\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"
			+ "\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\22%\23\'\24)\25\3\2\5\4\2"
			+ "\f\f\17\17\5\2\13\f\17\17\"\"\3\2\62;\u00a0\2\3\3\2\2\2\2\5\3\2\2\2\2"
			+ "\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"
			+ "\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"
			+ "\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"
			+ "\2\3+\3\2\2\2\5\60\3\2\2\2\78\3\2\2\2\t>\3\2\2\2\13E\3\2\2\2\rP\3\2\2"
			+ "\2\17W\3\2\2\2\21_\3\2\2\2\23f\3\2\2\2\25p\3\2\2\2\27y\3\2\2\2\31{\3\2"
			+ "\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0086"
			+ "\3\2\2\2%\u0091\3\2\2\2\'\u0098\3\2\2\2)\u009c\3\2\2\2+,\7n\2\2,-\7k\2"
			+ "\2-.\7i\2\2./\7c\2\2/\4\3\2\2\2\60\61\7f\2\2\61\62\7t\2\2\62\63\7w\2\2"
			+ "\63\64\7|\2\2\64\65\7{\2\2\65\66\7p\2\2\66\67\7c\2\2\67\6\3\2\2\289\7"
			+ "o\2\29:\7g\2\2:;\7e\2\2;<\7|\2\2<=\7g\2\2=\b\3\2\2\2>?\7r\2\2?@\7w\2\2"
			+ "@A\7p\2\2AB\7m\2\2BC\7v\2\2CD\7{\2\2D\n\3\2\2\2EF\7|\2\2FG\7y\2\2GH\7"
			+ "{\2\2HI\7e\2\2IJ\7k\2\2JK\7g\2\2KL\7u\2\2LM\7v\2\2MN\7y\2\2NO\7c\2\2O"
			+ "\f\3\2\2\2PQ\7t\2\2QR\7g\2\2RS\7o\2\2ST\7k\2\2TU\7u\2\2UV\7{\2\2V\16\3"
			+ "\2\2\2WX\7r\2\2XY\7q\2\2YZ\7t\2\2Z[\7c\2\2[\\\7|\2\2\\]\7m\2\2]^\7k\2"
			+ "\2^\20\3\2\2\2_`\7d\2\2`a\7t\2\2ab\7c\2\2bc\7o\2\2cd\7m\2\2de\7k\2\2e"
			+ "\22\3\2\2\2fg\7u\2\2gh\7v\2\2hi\7t\2\2ij\7|\2\2jk\7g\2\2kl\7n\2\2lm\7"
			+ "q\2\2mn\7p\2\2no\7g\2\2o\24\3\2\2\2pq\7u\2\2qr\7v\2\2rs\7t\2\2st\7c\2"
			+ "\2tu\7e\2\2uv\7q\2\2vw\7p\2\2wx\7g\2\2x\26\3\2\2\2yz\7*\2\2z\30\3\2\2"
			+ "\2{|\7+\2\2|\32\3\2\2\2}~\7}\2\2~\34\3\2\2\2\177\u0080\7\177\2\2\u0080"
			+ "\36\3\2\2\2\u0081\u0082\7$\2\2\u0082 \3\2\2\2\u0083\u0084\7^\2\2\u0084"
			+ "\u0085\7$\2\2\u0085\"\3\2\2\2\u0086\u008b\7$\2\2\u0087\u008a\5!\21\2\u0088"
			+ "\u008a\n\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2"
			+ "\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d"
			+ "\u008b\3\2\2\2\u008e\u008f\7$\2\2\u008f$\3\2\2\2\u0090\u0092\t\3\2\2\u0091"
			+ "\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"
			+ "\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\23\2\2\u0096&\3\2\2\2\u0097\u0099"
			+ "\5)\25\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a"
			+ "\u009b\3\2\2\2\u009b(\3\2\2\2\u009c\u009d\t\4\2\2\u009d*\3\2\2\2\7\2\u0089"
			+ "\u008b\u0093\u009a\3\b\2\2";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}