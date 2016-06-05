package minut90;

// Generated from minut90.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minut90Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, OKR_L=4, OKR_R=5, KLA_L=6, KLA_R=7, CU=8, MECZE=9, 
		PUNKTY=10, ZWYCIESTWA=11, REMISY=12, PORAZKI=13, STRZELONE=14, STRACONE=15, 
		STRING=16, WS=17, INT=18, DIGIT=19;
	public static final int
		RULE_r = 0, RULE_liga = 1, RULE_druzyny = 2, RULE_druzyna = 3, RULE_bramki = 4;
	public static final String[] ruleNames = {
		"r", "liga", "druzyny", "druzyna", "bramki"
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

	@Override
	public String getGrammarFileName() { return "minut90.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public minut90Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public LigaContext liga() {
			return getRuleContext(LigaContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			liga();
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

	public static class LigaContext extends ParserRuleContext {
		public TerminalNode OKR_L() { return getToken(minut90Parser.OKR_L, 0); }
		public TerminalNode STRING() { return getToken(minut90Parser.STRING, 0); }
		public TerminalNode OKR_R() { return getToken(minut90Parser.OKR_R, 0); }
		public TerminalNode KLA_L() { return getToken(minut90Parser.KLA_L, 0); }
		public DruzynyContext druzyny() {
			return getRuleContext(DruzynyContext.class,0);
		}
		public TerminalNode KLA_R() { return getToken(minut90Parser.KLA_R, 0); }
		public LigaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).enterLiga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).exitLiga(this);
		}
	}

	public final LigaContext liga() throws RecognitionException {
		LigaContext _localctx = new LigaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_liga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(OKR_L);
			setState(14);
			match(STRING);
			setState(15);
			match(OKR_R);
			setState(16);
			match(KLA_L);
			setState(17);
			druzyny();
			setState(18);
			match(KLA_R);
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

	public static class DruzynyContext extends ParserRuleContext {
		public DruzynaContext druzyna() {
			return getRuleContext(DruzynaContext.class,0);
		}
		public DruzynyContext druzyny() {
			return getRuleContext(DruzynyContext.class,0);
		}
		public DruzynyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_druzyny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).enterDruzyny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).exitDruzyny(this);
		}
	}

	public final DruzynyContext druzyny() throws RecognitionException {
		DruzynyContext _localctx = new DruzynyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_druzyny);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				druzyna();
				setState(21);
				druzyny();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				druzyna();
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

	public static class DruzynaContext extends ParserRuleContext {
		public TerminalNode OKR_L() { return getToken(minut90Parser.OKR_L, 0); }
		public TerminalNode STRING() { return getToken(minut90Parser.STRING, 0); }
		public TerminalNode OKR_R() { return getToken(minut90Parser.OKR_R, 0); }
		public TerminalNode KLA_L() { return getToken(minut90Parser.KLA_L, 0); }
		public TerminalNode MECZE() { return getToken(minut90Parser.MECZE, 0); }
		public TerminalNode PUNKTY() { return getToken(minut90Parser.PUNKTY, 0); }
		public TerminalNode ZWYCIESTWA() { return getToken(minut90Parser.ZWYCIESTWA, 0); }
		public TerminalNode REMISY() { return getToken(minut90Parser.REMISY, 0); }
		public TerminalNode PORAZKI() { return getToken(minut90Parser.PORAZKI, 0); }
		public BramkiContext bramki() {
			return getRuleContext(BramkiContext.class,0);
		}
		public TerminalNode KLA_R() { return getToken(minut90Parser.KLA_R, 0); }
		public DruzynaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_druzyna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).enterDruzyna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).exitDruzyna(this);
		}
	}

	public final DruzynaContext druzyna() throws RecognitionException {
		DruzynaContext _localctx = new DruzynaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_druzyna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__1);
			setState(27);
			match(OKR_L);
			setState(28);
			match(STRING);
			setState(29);
			match(OKR_R);
			setState(30);
			match(KLA_L);
			setState(31);
			match(MECZE);
			setState(32);
			match(PUNKTY);
			setState(33);
			match(ZWYCIESTWA);
			setState(34);
			match(REMISY);
			setState(35);
			match(PORAZKI);
			setState(36);
			bramki();
			setState(37);
			match(KLA_R);
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

	public static class BramkiContext extends ParserRuleContext {
		public TerminalNode OKR_L() { return getToken(minut90Parser.OKR_L, 0); }
		public TerminalNode OKR_R() { return getToken(minut90Parser.OKR_R, 0); }
		public TerminalNode KLA_L() { return getToken(minut90Parser.KLA_L, 0); }
		public TerminalNode STRZELONE() { return getToken(minut90Parser.STRZELONE, 0); }
		public TerminalNode STRACONE() { return getToken(minut90Parser.STRACONE, 0); }
		public TerminalNode KLA_R() { return getToken(minut90Parser.KLA_R, 0); }
		public BramkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bramki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).enterBramki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minut90Listener ) ((minut90Listener)listener).exitBramki(this);
		}
	}

	public final BramkiContext bramki() throws RecognitionException {
		BramkiContext _localctx = new BramkiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bramki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__2);
			setState(40);
			match(OKR_L);
			setState(41);
			match(OKR_R);
			setState(42);
			match(KLA_L);
			setState(43);
			match(STRZELONE);
			setState(44);
			match(STRACONE);
			setState(45);
			match(KLA_R);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\5\4\33\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2-\2\f"+
		"\3\2\2\2\4\16\3\2\2\2\6\32\3\2\2\2\b\34\3\2\2\2\n)\3\2\2\2\f\r\5\4\3\2"+
		"\r\3\3\2\2\2\16\17\7\3\2\2\17\20\7\6\2\2\20\21\7\22\2\2\21\22\7\7\2\2"+
		"\22\23\7\b\2\2\23\24\5\6\4\2\24\25\7\t\2\2\25\5\3\2\2\2\26\27\5\b\5\2"+
		"\27\30\5\6\4\2\30\33\3\2\2\2\31\33\5\b\5\2\32\26\3\2\2\2\32\31\3\2\2\2"+
		"\33\7\3\2\2\2\34\35\7\4\2\2\35\36\7\6\2\2\36\37\7\22\2\2\37 \7\7\2\2 "+
		"!\7\b\2\2!\"\7\13\2\2\"#\7\f\2\2#$\7\r\2\2$%\7\16\2\2%&\7\17\2\2&\'\5"+
		"\n\6\2\'(\7\t\2\2(\t\3\2\2\2)*\7\5\2\2*+\7\6\2\2+,\7\7\2\2,-\7\b\2\2-"+
		".\7\20\2\2./\7\21\2\2/\60\7\t\2\2\60\13\3\2\2\2\3\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}