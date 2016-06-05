package parser90;

// Generated from minut90.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minut90Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, OKR_L=4, OKR_R=5, KLA_L=6, KLA_R=7, CU=8, MECZE=9, 
		PUNKTY=10, ZWYCIESTWA=11, REMISY=12, PORAZKI=13, STRZELONE=14, STRACONE=15, 
		STRING=16, WS=17, INT=18, DIGIT=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "OKR_L", "OKR_R", "KLA_L", "KLA_R", "CU", "MECZE", 
		"PUNKTY", "ZWYCIESTWA", "REMISY", "PORAZKI", "STRZELONE", "STRACONE", 
		"ESCAPED_QUOTE", "STRING", "WS", "INT", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'liga'", "'druzyna'", "'bramki'", "'('", "')'", "'{'", "'}'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "OKR_L", "OKR_R", "KLA_L", "KLA_R", "CU", "MECZE", 
		"PUNKTY", "ZWYCIESTWA", "REMISY", "PORAZKI", "STRZELONE", "STRACONE", 
		"STRING", "WS", "INT", "DIGIT"
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


	public minut90Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "minut90.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\7\22\u00a6\n\22\f\22\16\22\u00a9\13\22\3\22\3\22"+
		"\3\23\6\23\u00ae\n\23\r\23\16\23\u00af\3\23\3\23\3\24\6\24\u00b5\n\24"+
		"\r\24\16\24\u00b6\3\25\3\25\3\u00a7\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\22%\23\'\24)\25\3\2"+
		"\5\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2\62;\u00bc\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\3+\3\2\2\2\5\60\3\2\2\2\78\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3"+
		"\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25S\3\2\2\2\27^\3\2\2\2\31"+
		"m\3\2\2\2\33x\3\2\2\2\35\u0084\3\2\2\2\37\u0092\3\2\2\2!\u009f\3\2\2\2"+
		"#\u00a2\3\2\2\2%\u00ad\3\2\2\2\'\u00b4\3\2\2\2)\u00b8\3\2\2\2+,\7n\2\2"+
		",-\7k\2\2-.\7i\2\2./\7c\2\2/\4\3\2\2\2\60\61\7f\2\2\61\62\7t\2\2\62\63"+
		"\7w\2\2\63\64\7|\2\2\64\65\7{\2\2\65\66\7p\2\2\66\67\7c\2\2\67\6\3\2\2"+
		"\289\7d\2\29:\7t\2\2:;\7c\2\2;<\7o\2\2<=\7m\2\2=>\7k\2\2>\b\3\2\2\2?@"+
		"\7*\2\2@\n\3\2\2\2AB\7+\2\2B\f\3\2\2\2CD\7}\2\2D\16\3\2\2\2EF\7\177\2"+
		"\2F\20\3\2\2\2GH\7$\2\2H\22\3\2\2\2IJ\7o\2\2JK\7g\2\2KL\7e\2\2LM\7|\2"+
		"\2MN\7g\2\2NO\3\2\2\2OP\5\t\5\2PQ\5\'\24\2QR\5\13\6\2R\24\3\2\2\2ST\7"+
		"r\2\2TU\7w\2\2UV\7p\2\2VW\7m\2\2WX\7v\2\2XY\7{\2\2YZ\3\2\2\2Z[\5\t\5\2"+
		"[\\\5\'\24\2\\]\5\13\6\2]\26\3\2\2\2^_\7|\2\2_`\7y\2\2`a\7{\2\2ab\7e\2"+
		"\2bc\7k\2\2cd\7g\2\2de\7u\2\2ef\7v\2\2fg\7y\2\2gh\7c\2\2hi\3\2\2\2ij\5"+
		"\t\5\2jk\5\'\24\2kl\5\13\6\2l\30\3\2\2\2mn\7t\2\2no\7g\2\2op\7o\2\2pq"+
		"\7k\2\2qr\7u\2\2rs\7{\2\2st\3\2\2\2tu\5\t\5\2uv\5\'\24\2vw\5\13\6\2w\32"+
		"\3\2\2\2xy\7r\2\2yz\7q\2\2z{\7t\2\2{|\7c\2\2|}\7|\2\2}~\7m\2\2~\177\7"+
		"k\2\2\177\u0080\3\2\2\2\u0080\u0081\5\t\5\2\u0081\u0082\5\'\24\2\u0082"+
		"\u0083\5\13\6\2\u0083\34\3\2\2\2\u0084\u0085\7u\2\2\u0085\u0086\7v\2\2"+
		"\u0086\u0087\7t\2\2\u0087\u0088\7|\2\2\u0088\u0089\7g\2\2\u0089\u008a"+
		"\7n\2\2\u008a\u008b\7q\2\2\u008b\u008c\7p\2\2\u008c\u008d\7g\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\5\t\5\2\u008f\u0090\5\'\24\2\u0090\u0091\5"+
		"\13\6\2\u0091\36\3\2\2\2\u0092\u0093\7u\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7c\2\2\u0096\u0097\7e\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7p\2\2\u0099\u009a\7g\2\2\u009a\u009b\3\2\2\2\u009b\u009c\5\t\5"+
		"\2\u009c\u009d\5\'\24\2\u009d\u009e\5\13\6\2\u009e \3\2\2\2\u009f\u00a0"+
		"\7^\2\2\u00a0\u00a1\7$\2\2\u00a1\"\3\2\2\2\u00a2\u00a7\7$\2\2\u00a3\u00a6"+
		"\5!\21\2\u00a4\u00a6\n\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab$\3\2\2\2\u00ac\u00ae"+
		"\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\23\2\2\u00b2&\3\2\2\2"+
		"\u00b3\u00b5\5)\25\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7(\3\2\2\2\u00b8\u00b9\t\4\2\2\u00b9"+
		"*\3\2\2\2\7\2\u00a5\u00a7\u00af\u00b6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}