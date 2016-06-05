// Generated from minut90.g4 by ANTLR 4.5
package parser90xml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class minut90Parser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, OKR_L = 11, OKR_R = 12, KLA_L = 13, KLA_R = 14, CU = 15, STRING = 16, WS = 17, INT = 18,
			DIGIT = 19;
	public static final int RULE_r = 0, RULE_liga = 1, RULE_druzyny = 2, RULE_druzyna = 3, RULE_mecze = 4,
			RULE_punkty = 5, RULE_zwyciestwa = 6, RULE_remisy = 7, RULE_porazki = 8, RULE_bramki = 9,
			RULE_strzelone = 10, RULE_stracone = 11;
	public static final String[] ruleNames = { "r", "liga", "druzyny", "druzyna", "mecze", "punkty", "zwyciestwa",
			"remisy", "porazki", "bramki", "strzelone", "stracone" };

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
	public ATN getATN() {
		return _ATN;
	}

	public minut90Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public LigaContext liga() {
			return getRuleContext(LigaContext.class, 0);
		}

		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_r;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterR(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(24);
				liga();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LigaContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode STRING() {
			return getToken(minut90Parser.STRING, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public TerminalNode KLA_L() {
			return getToken(minut90Parser.KLA_L, 0);
		}

		public DruzynyContext druzyny() {
			return getRuleContext(DruzynyContext.class, 0);
		}

		public TerminalNode KLA_R() {
			return getToken(minut90Parser.KLA_R, 0);
		}

		public LigaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_liga;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterLiga(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitLiga(this);
		}
	}

	public final LigaContext liga() throws RecognitionException {
		LigaContext _localctx = new LigaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_liga);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(26);
				match(T__0);
				setState(27);
				match(OKR_L);
				setState(28);
				match(STRING);
				setState(29);
				match(OKR_R);
				setState(30);
				match(KLA_L);
				setState(31);
				druzyny();
				setState(32);
				match(KLA_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DruzynyContext extends ParserRuleContext {
		public DruzynaContext druzyna() {
			return getRuleContext(DruzynaContext.class, 0);
		}

		public DruzynyContext druzyny() {
			return getRuleContext(DruzynyContext.class, 0);
		}

		public DruzynyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_druzyny;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterDruzyny(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitDruzyny(this);
		}
	}

	public final DruzynyContext druzyny() throws RecognitionException {
		DruzynyContext _localctx = new DruzynyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_druzyny);
		try {
			setState(38);
			switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(34);
				druzyna();
				setState(35);
				druzyny();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(37);
				druzyna();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DruzynaContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode STRING() {
			return getToken(minut90Parser.STRING, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public TerminalNode KLA_L() {
			return getToken(minut90Parser.KLA_L, 0);
		}

		public MeczeContext mecze() {
			return getRuleContext(MeczeContext.class, 0);
		}

		public PunktyContext punkty() {
			return getRuleContext(PunktyContext.class, 0);
		}

		public ZwyciestwaContext zwyciestwa() {
			return getRuleContext(ZwyciestwaContext.class, 0);
		}

		public RemisyContext remisy() {
			return getRuleContext(RemisyContext.class, 0);
		}

		public PorazkiContext porazki() {
			return getRuleContext(PorazkiContext.class, 0);
		}

		public BramkiContext bramki() {
			return getRuleContext(BramkiContext.class, 0);
		}

		public TerminalNode KLA_R() {
			return getToken(minut90Parser.KLA_R, 0);
		}

		public DruzynaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_druzyna;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterDruzyna(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitDruzyna(this);
		}
	}

	public final DruzynaContext druzyna() throws RecognitionException {
		DruzynaContext _localctx = new DruzynaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_druzyna);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(40);
				match(T__1);
				setState(41);
				match(OKR_L);
				setState(42);
				match(STRING);
				setState(43);
				match(OKR_R);
				setState(44);
				match(KLA_L);
				setState(45);
				mecze();
				setState(46);
				punkty();
				setState(47);
				zwyciestwa();
				setState(48);
				remisy();
				setState(49);
				porazki();
				setState(50);
				bramki();
				setState(51);
				match(KLA_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeczeContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode INT() {
			return getToken(minut90Parser.INT, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public MeczeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_mecze;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterMecze(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitMecze(this);
		}
	}

	public final MeczeContext mecze() throws RecognitionException {
		MeczeContext _localctx = new MeczeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mecze);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(53);
				match(T__2);
				setState(54);
				match(OKR_L);
				setState(55);
				match(INT);
				setState(56);
				match(OKR_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PunktyContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode INT() {
			return getToken(minut90Parser.INT, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public PunktyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_punkty;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterPunkty(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitPunkty(this);
		}
	}

	public final PunktyContext punkty() throws RecognitionException {
		PunktyContext _localctx = new PunktyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_punkty);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(58);
				match(T__3);
				setState(59);
				match(OKR_L);
				setState(60);
				match(INT);
				setState(61);
				match(OKR_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZwyciestwaContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode INT() {
			return getToken(minut90Parser.INT, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public ZwyciestwaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_zwyciestwa;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterZwyciestwa(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitZwyciestwa(this);
		}
	}

	public final ZwyciestwaContext zwyciestwa() throws RecognitionException {
		ZwyciestwaContext _localctx = new ZwyciestwaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_zwyciestwa);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(63);
				match(T__4);
				setState(64);
				match(OKR_L);
				setState(65);
				match(INT);
				setState(66);
				match(OKR_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemisyContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode INT() {
			return getToken(minut90Parser.INT, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public RemisyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_remisy;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterRemisy(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitRemisy(this);
		}
	}

	public final RemisyContext remisy() throws RecognitionException {
		RemisyContext _localctx = new RemisyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_remisy);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(68);
				match(T__5);
				setState(69);
				match(OKR_L);
				setState(70);
				match(INT);
				setState(71);
				match(OKR_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PorazkiContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode INT() {
			return getToken(minut90Parser.INT, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public PorazkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_porazki;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterPorazki(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitPorazki(this);
		}
	}

	public final PorazkiContext porazki() throws RecognitionException {
		PorazkiContext _localctx = new PorazkiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_porazki);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(73);
				match(T__6);
				setState(74);
				match(OKR_L);
				setState(75);
				match(INT);
				setState(76);
				match(OKR_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BramkiContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public TerminalNode KLA_L() {
			return getToken(minut90Parser.KLA_L, 0);
		}

		public StrzeloneContext strzelone() {
			return getRuleContext(StrzeloneContext.class, 0);
		}

		public StraconeContext stracone() {
			return getRuleContext(StraconeContext.class, 0);
		}

		public TerminalNode KLA_R() {
			return getToken(minut90Parser.KLA_R, 0);
		}

		public BramkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_bramki;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterBramki(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitBramki(this);
		}
	}

	public final BramkiContext bramki() throws RecognitionException {
		BramkiContext _localctx = new BramkiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bramki);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(78);
				match(T__7);
				setState(79);
				match(OKR_L);
				setState(80);
				match(OKR_R);
				setState(81);
				match(KLA_L);
				setState(82);
				strzelone();
				setState(83);
				stracone();
				setState(84);
				match(KLA_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrzeloneContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode INT() {
			return getToken(minut90Parser.INT, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public StrzeloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_strzelone;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterStrzelone(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitStrzelone(this);
		}
	}

	public final StrzeloneContext strzelone() throws RecognitionException {
		StrzeloneContext _localctx = new StrzeloneContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_strzelone);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(86);
				match(T__8);
				setState(87);
				match(OKR_L);
				setState(88);
				match(INT);
				setState(89);
				match(OKR_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StraconeContext extends ParserRuleContext {
		public TerminalNode OKR_L() {
			return getToken(minut90Parser.OKR_L, 0);
		}

		public TerminalNode INT() {
			return getToken(minut90Parser.INT, 0);
		}

		public TerminalNode OKR_R() {
			return getToken(minut90Parser.OKR_R, 0);
		}

		public StraconeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stracone;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).enterStracone(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof minut90Listener)
				((minut90Listener) listener).exitStracone(this);
		}
	}

	public final StraconeContext stracone() throws RecognitionException {
		StraconeContext _localctx = new StraconeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stracone);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(91);
				match(T__9);
				setState(92);
				match(OKR_L);
				setState(93);
				match(INT);
				setState(94);
				match(OKR_R);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25c\4\2\t\2\4\3\t"
			+ "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"
			+ "\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"
			+ "\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"
			+ "\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"
			+ "\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"
			+ "\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26"
			+ "\30\2\2W\2\32\3\2\2\2\4\34\3\2\2\2\6(\3\2\2\2\b*\3\2\2\2\n\67\3\2\2\2"
			+ "\f<\3\2\2\2\16A\3\2\2\2\20F\3\2\2\2\22K\3\2\2\2\24P\3\2\2\2\26X\3\2\2"
			+ "\2\30]\3\2\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34\35\7\3\2\2\35\36\7\r\2\2"
			+ "\36\37\7\22\2\2\37 \7\16\2\2 !\7\17\2\2!\"\5\6\4\2\"#\7\20\2\2#\5\3\2"
			+ "\2\2$%\5\b\5\2%&\5\6\4\2&)\3\2\2\2\')\5\b\5\2($\3\2\2\2(\'\3\2\2\2)\7"
			+ "\3\2\2\2*+\7\4\2\2+,\7\r\2\2,-\7\22\2\2-.\7\16\2\2./\7\17\2\2/\60\5\n"
			+ "\6\2\60\61\5\f\7\2\61\62\5\16\b\2\62\63\5\20\t\2\63\64\5\22\n\2\64\65"
			+ "\5\24\13\2\65\66\7\20\2\2\66\t\3\2\2\2\678\7\5\2\289\7\r\2\29:\7\24\2"
			+ "\2:;\7\16\2\2;\13\3\2\2\2<=\7\6\2\2=>\7\r\2\2>?\7\24\2\2?@\7\16\2\2@\r"
			+ "\3\2\2\2AB\7\7\2\2BC\7\r\2\2CD\7\24\2\2DE\7\16\2\2E\17\3\2\2\2FG\7\b\2"
			+ "\2GH\7\r\2\2HI\7\24\2\2IJ\7\16\2\2J\21\3\2\2\2KL\7\t\2\2LM\7\r\2\2MN\7"
			+ "\24\2\2NO\7\16\2\2O\23\3\2\2\2PQ\7\n\2\2QR\7\r\2\2RS\7\16\2\2ST\7\17\2"
			+ "\2TU\5\26\f\2UV\5\30\r\2VW\7\20\2\2W\25\3\2\2\2XY\7\13\2\2YZ\7\r\2\2Z"
			+ "[\7\24\2\2[\\\7\16\2\2\\\27\3\2\2\2]^\7\f\2\2^_\7\r\2\2_`\7\24\2\2`a\7" + "\16\2\2a\31\3\2\2\2\3(";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public static void main(String[] args) {
		try {
			ANTLRInputStream is = new ANTLRInputStream(new BufferedReader(new FileReader("liga")));
			// ANTLRInputStream is = new ANTLRInputStream(System.in);
			minut90Lexer ml = new minut90Lexer(is);
			CommonTokenStream tk = new CommonTokenStream(ml);
			minut90Parser mp = new minut90Parser(tk);
			mp.addParseListener(new minut90BaseListener());
			parser90xml.minut90Parser.RContext rc = mp.r();
			// System.out.println(rc.getText());
			// LigaContext lc = (LigaContext) rc.getChild(0);
			// for (int i = 0; i < lc.getChildCount(); ++i) {
			// ParseTree pt = lc.getChild(i);
			// if (pt instanceof DruzynyContext) {
			// DruzynyContext dc = (DruzynyContext) pt;
			// for(int j = 0; j < dc.getChildCount(); ++j){
			// System.out.println("\t" + dc);
			// }
			// } else {
			// System.out.println(pt);
			// }
			// }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
