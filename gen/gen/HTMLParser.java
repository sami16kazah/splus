// Generated from C:/Users/User/Desktop/Ahmad Al Hafez\HTMLParser.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		XML=1, SEA_WS=2, START=3, SEA_WS2=4, AUTH=5, NAME=6, LOGO=7, LOGIN=8, 
		SIGNUP=9, INJECTUSER=10, NAV=11, FOOTER=12, PAGE=13, CONTROLLER=14, FORMS=15, 
		PNAME=16, SPLUS_COMMENT=17, END=18, CLOSE_ATTRIBUTE=19, BRACKET_OPEN=20, 
		BRACKET_CLOSE=21, BRACKET_OPEN2=22, BRACKET_CLOSE2=23, CHECK_OPEN=24, 
		CHECK_CLOSE=25, SINGLE_QOUTE=26, DOUBLE_QOUTE=27, TEXT_COLOR=28, COLOR=29, 
		INPUT_COLOR=30, ALIGN_LEFT=31, ALIGN_RIGHT=32, ALIGN_UP=33, USER_ROLE=34, 
		ADMIN_ROLE=35, USER=36, ADMIN=37, FORM=38, TABLE=39, EDIT=40, DELETE=41, 
		VIEW=42, SUBMIT=43, ATT=44, ATTEND=45, CHECK=46, CHECK_ONE=47, ONLY=48, 
		LIST=49, BLOCK=50, METRO=51, ASSIGN=52, COMMA=53, DOT=54, VAR=55, MAIL_ATT=56, 
		NUMBER=57;
	public static final int
		RULE_splus = 0, RULE_phpPlus = 1, RULE_phpElement = 2, RULE_string = 3, 
		RULE_var = 4, RULE_name = 5, RULE_logo = 6, RULE_nav = 7, RULE_footer = 8, 
		RULE_page = 9, RULE_login = 10, RULE_signUp = 11, RULE_auth = 12, RULE_inject = 13, 
		RULE_role = 14, RULE_email = 15, RULE_password = 16, RULE_name_page = 17, 
		RULE_tableName = 18, RULE_columnName = 19, RULE_pageAttributes = 20, RULE_authiticated = 21, 
		RULE_pageForm = 22, RULE_pageTable = 23, RULE_viewAs = 24, RULE_contollers = 25, 
		RULE_loginController = 26, RULE_singUpController = 27, RULE_navController = 28, 
		RULE_footerController = 29, RULE_formController = 30, RULE_pageController = 31, 
		RULE_pageName = 32, RULE_destenation = 33, RULE_array = 34, RULE_elements = 35, 
		RULE_formAttributes = 36, RULE_attributes = 37, RULE_attName = 38, RULE_attType = 39, 
		RULE_style = 40, RULE_loginStyle = 41, RULE_signUpStyle = 42, RULE_navStyle = 43, 
		RULE_footerStyle = 44, RULE_pageStyle = 45, RULE_styleAttributes = 46, 
		RULE_textColor = 47, RULE_color = 48, RULE_inputColor = 49, RULE_align = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"splus", "phpPlus", "phpElement", "string", "var", "name", "logo", "nav", 
			"footer", "page", "login", "signUp", "auth", "inject", "role", "email", 
			"password", "name_page", "tableName", "columnName", "pageAttributes", 
			"authiticated", "pageForm", "pageTable", "viewAs", "contollers", "loginController", 
			"singUpController", "navController", "footerController", "formController", 
			"pageController", "pageName", "destenation", "array", "elements", "formAttributes", 
			"attributes", "attName", "attType", "style", "loginStyle", "signUpStyle", 
			"navStyle", "footerStyle", "pageStyle", "styleAttributes", "textColor", 
			"color", "inputColor", "align"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "XML", "SEA_WS", "START", "SEA_WS2", "AUTH", "NAME", "LOGO", "LOGIN", 
			"SIGNUP", "INJECTUSER", "NAV", "FOOTER", "PAGE", "CONTROLLER", "FORMS", 
			"PNAME", "SPLUS_COMMENT", "END", "CLOSE_ATTRIBUTE", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"BRACKET_OPEN2", "BRACKET_CLOSE2", "CHECK_OPEN", "CHECK_CLOSE", "SINGLE_QOUTE", 
			"DOUBLE_QOUTE", "TEXT_COLOR", "COLOR", "INPUT_COLOR", "ALIGN_LEFT", "ALIGN_RIGHT", 
			"ALIGN_UP", "USER_ROLE", "ADMIN_ROLE", "USER", "ADMIN", "FORM", "TABLE", 
			"EDIT", "DELETE", "VIEW", "SUBMIT", "ATT", "ATTEND", "CHECK", "CHECK_ONE", 
			"ONLY", "LIST", "BLOCK", "METRO", "ASSIGN", "COMMA", "DOT", "VAR", "MAIL_ATT", 
			"NUMBER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SplusContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(HTMLParser.START, 0); }
		public TerminalNode END() { return getToken(HTMLParser.END, 0); }
		public List<PhpPlusContext> phpPlus() {
			return getRuleContexts(PhpPlusContext.class);
		}
		public PhpPlusContext phpPlus(int i) {
			return getRuleContext(PhpPlusContext.class,i);
		}
		public SplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSplus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSplus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SplusContext splus() throws RecognitionException {
		SplusContext _localctx = new SplusContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_splus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(START);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEA_WS2) | (1L << AUTH) | (1L << NAME) | (1L << LOGO) | (1L << LOGIN) | (1L << SIGNUP) | (1L << INJECTUSER) | (1L << NAV) | (1L << FOOTER) | (1L << PAGE) | (1L << CONTROLLER) | (1L << SPLUS_COMMENT))) != 0)) {
				{
				{
				setState(103);
				phpPlus();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(END);
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

	public static class PhpPlusContext extends ParserRuleContext {
		public List<TerminalNode> SPLUS_COMMENT() { return getTokens(HTMLParser.SPLUS_COMMENT); }
		public TerminalNode SPLUS_COMMENT(int i) {
			return getToken(HTMLParser.SPLUS_COMMENT, i);
		}
		public List<PhpElementContext> phpElement() {
			return getRuleContexts(PhpElementContext.class);
		}
		public PhpElementContext phpElement(int i) {
			return getRuleContext(PhpElementContext.class,i);
		}
		public PhpPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPhpPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPhpPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPhpPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhpPlusContext phpPlus() throws RecognitionException {
		PhpPlusContext _localctx = new PhpPlusContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_phpPlus);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(113);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SPLUS_COMMENT:
						{
						setState(111);
						match(SPLUS_COMMENT);
						}
						break;
					case SEA_WS2:
					case AUTH:
					case NAME:
					case LOGO:
					case LOGIN:
					case SIGNUP:
					case INJECTUSER:
					case NAV:
					case FOOTER:
					case PAGE:
					case CONTROLLER:
						{
						setState(112);
						phpElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class PhpElementContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LogoContext logo() {
			return getRuleContext(LogoContext.class,0);
		}
		public NavContext nav() {
			return getRuleContext(NavContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public LoginContext login() {
			return getRuleContext(LoginContext.class,0);
		}
		public SignUpContext signUp() {
			return getRuleContext(SignUpContext.class,0);
		}
		public AuthContext auth() {
			return getRuleContext(AuthContext.class,0);
		}
		public InjectContext inject() {
			return getRuleContext(InjectContext.class,0);
		}
		public ContollersContext contollers() {
			return getRuleContext(ContollersContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public TerminalNode SEA_WS2() { return getToken(HTMLParser.SEA_WS2, 0); }
		public PhpElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPhpElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPhpElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPhpElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhpElementContext phpElement() throws RecognitionException {
		PhpElementContext _localctx = new PhpElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_phpElement);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				logo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				nav();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				footer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				login();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				signUp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				auth();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				inject();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(125);
				contollers();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(126);
				style();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(127);
				page();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(128);
				match(SEA_WS2);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> SINGLE_QOUTE() { return getTokens(HTMLParser.SINGLE_QOUTE); }
		public TerminalNode SINGLE_QOUTE(int i) {
			return getToken(HTMLParser.SINGLE_QOUTE, i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(SINGLE_QOUTE);
			setState(132);
			var();
			setState(133);
			match(SINGLE_QOUTE);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(HTMLParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(VAR);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HTMLParser.NAME, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(NAME);
			setState(138);
			string();
			setState(139);
			match(CLOSE_ATTRIBUTE);
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

	public static class LogoContext extends ParserRuleContext {
		public TerminalNode LOGO() { return getToken(HTMLParser.LOGO, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public LogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogoContext logo() throws RecognitionException {
		LogoContext _localctx = new LogoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LOGO);
			setState(142);
			string();
			setState(143);
			match(CLOSE_ATTRIBUTE);
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

	public static class NavContext extends ParserRuleContext {
		public TerminalNode NAV() { return getToken(HTMLParser.NAV, 0); }
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public NavContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nav; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNav(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNav(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNav(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavContext nav() throws RecognitionException {
		NavContext _localctx = new NavContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nav);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(NAV);
			setState(146);
			match(CLOSE_ATTRIBUTE);
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

	public static class FooterContext extends ParserRuleContext {
		public TerminalNode FOOTER() { return getToken(HTMLParser.FOOTER, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_footer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FOOTER);
			setState(149);
			string();
			setState(150);
			match(CLOSE_ATTRIBUTE);
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

	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(HTMLParser.PAGE, 0); }
		public PageAttributesContext pageAttributes() {
			return getRuleContext(PageAttributesContext.class,0);
		}
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(PAGE);
			setState(153);
			pageAttributes();
			setState(154);
			match(CLOSE_ATTRIBUTE);
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

	public static class LoginContext extends ParserRuleContext {
		public TerminalNode LOGIN() { return getToken(HTMLParser.LOGIN, 0); }
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLogin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LOGIN);
			setState(157);
			match(CLOSE_ATTRIBUTE);
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

	public static class SignUpContext extends ParserRuleContext {
		public TerminalNode SIGNUP() { return getToken(HTMLParser.SIGNUP, 0); }
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public SignUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signUp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSignUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSignUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSignUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignUpContext signUp() throws RecognitionException {
		SignUpContext _localctx = new SignUpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(SIGNUP);
			setState(160);
			match(CLOSE_ATTRIBUTE);
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

	public static class AuthContext extends ParserRuleContext {
		public TerminalNode AUTH() { return getToken(HTMLParser.AUTH, 0); }
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public AuthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAuth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAuth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAuth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthContext auth() throws RecognitionException {
		AuthContext _localctx = new AuthContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_auth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(AUTH);
			setState(163);
			match(CLOSE_ATTRIBUTE);
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

	public static class InjectContext extends ParserRuleContext {
		public TerminalNode INJECTUSER() { return getToken(HTMLParser.INJECTUSER, 0); }
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public InjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterInject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitInject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitInject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectContext inject() throws RecognitionException {
		InjectContext _localctx = new InjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(INJECTUSER);
			setState(166);
			role();
			setState(167);
			match(COMMA);
			setState(168);
			email();
			setState(169);
			match(COMMA);
			setState(170);
			password();
			setState(171);
			match(CLOSE_ATTRIBUTE);
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

	public static class RoleContext extends ParserRuleContext {
		public TerminalNode USER_ROLE() { return getToken(HTMLParser.USER_ROLE, 0); }
		public TerminalNode ADMIN_ROLE() { return getToken(HTMLParser.ADMIN_ROLE, 0); }
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_role);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==USER_ROLE || _la==ADMIN_ROLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class EmailContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			var();
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

	public static class PasswordContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			var();
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

	public static class Name_pageContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Name_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterName_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitName_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitName_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_pageContext name_page() throws RecognitionException {
		Name_pageContext _localctx = new Name_pageContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_name_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			var();
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

	public static class TableNameContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			var();
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

	public static class ColumnNameContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			var();
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

	public static class PageAttributesContext extends ParserRuleContext {
		public Name_pageContext name_page() {
			return getRuleContext(Name_pageContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public PageFormContext pageForm() {
			return getRuleContext(PageFormContext.class,0);
		}
		public PageTableContext pageTable() {
			return getRuleContext(PageTableContext.class,0);
		}
		public AuthiticatedContext authiticated() {
			return getRuleContext(AuthiticatedContext.class,0);
		}
		public PageAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPageAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPageAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPageAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageAttributesContext pageAttributes() throws RecognitionException {
		PageAttributesContext _localctx = new PageAttributesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pageAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			name_page();
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(186);
				match(COMMA);
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORM:
				{
				setState(189);
				pageForm();
				}
				break;
			case TABLE:
				{
				setState(190);
				pageTable();
				}
				break;
			case CLOSE_ATTRIBUTE:
			case ONLY:
			case COMMA:
				break;
			default:
				break;
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(193);
				match(COMMA);
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(196);
				authiticated();
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

	public static class AuthiticatedContext extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(HTMLParser.ONLY, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode USER() { return getToken(HTMLParser.USER, 0); }
		public TerminalNode ADMIN() { return getToken(HTMLParser.ADMIN, 0); }
		public AuthiticatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authiticated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAuthiticated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAuthiticated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAuthiticated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthiticatedContext authiticated() throws RecognitionException {
		AuthiticatedContext _localctx = new AuthiticatedContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_authiticated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ONLY);
			setState(200);
			match(ASSIGN);
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==USER || _la==ADMIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class PageFormContext extends ParserRuleContext {
		public TerminalNode FORM() { return getToken(HTMLParser.FORM, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PageFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPageForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPageForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPageForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageFormContext pageForm() throws RecognitionException {
		PageFormContext _localctx = new PageFormContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pageForm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(FORM);
			setState(204);
			match(ASSIGN);
			setState(205);
			tableName();
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

	public static class PageTableContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(HTMLParser.TABLE, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(HTMLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(HTMLParser.ASSIGN, i);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ViewAsContext viewAs() {
			return getRuleContext(ViewAsContext.class,0);
		}
		public PageTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPageTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPageTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPageTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageTableContext pageTable() throws RecognitionException {
		PageTableContext _localctx = new PageTableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pageTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(TABLE);
			setState(208);
			match(ASSIGN);
			setState(209);
			tableName();
			setState(210);
			match(ASSIGN);
			setState(211);
			viewAs();
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

	public static class ViewAsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode LIST() { return getToken(HTMLParser.LIST, 0); }
		public TerminalNode BLOCK() { return getToken(HTMLParser.BLOCK, 0); }
		public TerminalNode METRO() { return getToken(HTMLParser.METRO, 0); }
		public ViewAsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewAs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterViewAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitViewAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitViewAs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewAsContext viewAs() throws RecognitionException {
		ViewAsContext _localctx = new ViewAsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_viewAs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BLOCK) | (1L << METRO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(214);
			match(ASSIGN);
			setState(215);
			columnName();
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

	public static class ContollersContext extends ParserRuleContext {
		public TerminalNode CONTROLLER() { return getToken(HTMLParser.CONTROLLER, 0); }
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public LoginControllerContext loginController() {
			return getRuleContext(LoginControllerContext.class,0);
		}
		public SingUpControllerContext singUpController() {
			return getRuleContext(SingUpControllerContext.class,0);
		}
		public NavControllerContext navController() {
			return getRuleContext(NavControllerContext.class,0);
		}
		public FooterControllerContext footerController() {
			return getRuleContext(FooterControllerContext.class,0);
		}
		public PageControllerContext pageController() {
			return getRuleContext(PageControllerContext.class,0);
		}
		public FormControllerContext formController() {
			return getRuleContext(FormControllerContext.class,0);
		}
		public ContollersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contollers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterContollers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitContollers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitContollers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContollersContext contollers() throws RecognitionException {
		ContollersContext _localctx = new ContollersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_contollers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(CONTROLLER);
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGIN:
				{
				setState(218);
				loginController();
				}
				break;
			case SIGNUP:
				{
				setState(219);
				singUpController();
				}
				break;
			case NAV:
				{
				setState(220);
				navController();
				}
				break;
			case FOOTER:
				{
				setState(221);
				footerController();
				}
				break;
			case PNAME:
				{
				setState(222);
				pageController();
				}
				break;
			case FORMS:
				{
				setState(223);
				formController();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
			match(CLOSE_ATTRIBUTE);
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

	public static class LoginControllerContext extends ParserRuleContext {
		public TerminalNode LOGIN() { return getToken(HTMLParser.LOGIN, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public DestenationContext destenation() {
			return getRuleContext(DestenationContext.class,0);
		}
		public LoginControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loginController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLoginController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLoginController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLoginController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginControllerContext loginController() throws RecognitionException {
		LoginControllerContext _localctx = new LoginControllerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loginController);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LOGIN);
			setState(229);
			match(ASSIGN);
			setState(230);
			destenation();
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

	public static class SingUpControllerContext extends ParserRuleContext {
		public TerminalNode SIGNUP() { return getToken(HTMLParser.SIGNUP, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public DestenationContext destenation() {
			return getRuleContext(DestenationContext.class,0);
		}
		public SingUpControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singUpController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSingUpController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSingUpController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSingUpController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingUpControllerContext singUpController() throws RecognitionException {
		SingUpControllerContext _localctx = new SingUpControllerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_singUpController);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(SIGNUP);
			setState(233);
			match(ASSIGN);
			setState(234);
			destenation();
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

	public static class NavControllerContext extends ParserRuleContext {
		public TerminalNode NAV() { return getToken(HTMLParser.NAV, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public NavControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNavController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNavController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNavController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavControllerContext navController() throws RecognitionException {
		NavControllerContext _localctx = new NavControllerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_navController);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(NAV);
			setState(237);
			match(ASSIGN);
			setState(238);
			array();
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

	public static class FooterControllerContext extends ParserRuleContext {
		public TerminalNode FOOTER() { return getToken(HTMLParser.FOOTER, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FooterControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footerController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFooterController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFooterController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFooterController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterControllerContext footerController() throws RecognitionException {
		FooterControllerContext _localctx = new FooterControllerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_footerController);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(FOOTER);
			setState(241);
			match(ASSIGN);
			setState(242);
			array();
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

	public static class FormControllerContext extends ParserRuleContext {
		public TerminalNode FORMS() { return getToken(HTMLParser.FORMS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public FormAttributesContext formAttributes() {
			return getRuleContext(FormAttributesContext.class,0);
		}
		public FormControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFormController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFormController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFormController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormControllerContext formController() throws RecognitionException {
		FormControllerContext _localctx = new FormControllerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_formController);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(FORMS);
			setState(245);
			tableName();
			setState(246);
			match(ASSIGN);
			setState(247);
			formAttributes();
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

	public static class PageControllerContext extends ParserRuleContext {
		public PageNameContext pageName() {
			return getRuleContext(PageNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public DestenationContext destenation() {
			return getRuleContext(DestenationContext.class,0);
		}
		public PageControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageController; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPageController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPageController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPageController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageControllerContext pageController() throws RecognitionException {
		PageControllerContext _localctx = new PageControllerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pageController);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			pageName();
			setState(250);
			match(ASSIGN);
			setState(251);
			destenation();
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

	public static class PageNameContext extends ParserRuleContext {
		public TerminalNode PNAME() { return getToken(HTMLParser.PNAME, 0); }
		public PageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageNameContext pageName() throws RecognitionException {
		PageNameContext _localctx = new PageNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(PNAME);
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

	public static class DestenationContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DestenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destenation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDestenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDestenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDestenation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestenationContext destenation() throws RecognitionException {
		DestenationContext _localctx = new DestenationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_destenation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			var();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN2() { return getToken(HTMLParser.BRACKET_OPEN2, 0); }
		public TerminalNode BRACKET_CLOSE2() { return getToken(HTMLParser.BRACKET_CLOSE2, 0); }
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(BRACKET_OPEN2);
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				elements();
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==VAR );
			setState(263);
			match(BRACKET_CLOSE2);
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

	public static class ElementsContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			var();
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(272);
					match(COMMA);
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FormAttributesContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN2() { return getToken(HTMLParser.BRACKET_OPEN2, 0); }
		public TerminalNode BRACKET_CLOSE2() { return getToken(HTMLParser.BRACKET_CLOSE2, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public FormAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFormAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFormAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFormAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormAttributesContext formAttributes() throws RecognitionException {
		FormAttributesContext _localctx = new FormAttributesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(BRACKET_OPEN2);
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				attributes();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==VAR );
			setState(284);
			match(BRACKET_CLOSE2);
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

	public static class AttributesContext extends ParserRuleContext {
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public AttTypeContext attType() {
			return getRuleContext(AttTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_attributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286);
				match(COMMA);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			attName();
			setState(293);
			match(ASSIGN);
			setState(294);
			attType();
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					match(COMMA);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class AttNameContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			var();
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

	public static class AttTypeContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AttTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAttType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAttType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAttType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttTypeContext attType() throws RecognitionException {
		AttTypeContext _localctx = new AttTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_attType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			var();
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

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode CLOSE_ATTRIBUTE() { return getToken(HTMLParser.CLOSE_ATTRIBUTE, 0); }
		public LoginStyleContext loginStyle() {
			return getRuleContext(LoginStyleContext.class,0);
		}
		public SignUpStyleContext signUpStyle() {
			return getRuleContext(SignUpStyleContext.class,0);
		}
		public NavStyleContext navStyle() {
			return getRuleContext(NavStyleContext.class,0);
		}
		public FooterStyleContext footerStyle() {
			return getRuleContext(FooterStyleContext.class,0);
		}
		public PageStyleContext pageStyle() {
			return getRuleContext(PageStyleContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGIN:
				{
				setState(305);
				loginStyle();
				}
				break;
			case SIGNUP:
				{
				setState(306);
				signUpStyle();
				}
				break;
			case NAV:
				{
				setState(307);
				navStyle();
				}
				break;
			case FOOTER:
				{
				setState(308);
				footerStyle();
				}
				break;
			case PAGE:
				{
				setState(309);
				pageStyle();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(312);
			match(CLOSE_ATTRIBUTE);
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

	public static class LoginStyleContext extends ParserRuleContext {
		public TerminalNode LOGIN() { return getToken(HTMLParser.LOGIN, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode CHECK_OPEN() { return getToken(HTMLParser.CHECK_OPEN, 0); }
		public List<StyleAttributesContext> styleAttributes() {
			return getRuleContexts(StyleAttributesContext.class);
		}
		public StyleAttributesContext styleAttributes(int i) {
			return getRuleContext(StyleAttributesContext.class,i);
		}
		public LoginStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loginStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLoginStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLoginStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLoginStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginStyleContext loginStyle() throws RecognitionException {
		LoginStyleContext _localctx = new LoginStyleContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_loginStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(LOGIN);
			setState(315);
			match(ASSIGN);
			setState(316);
			match(CHECK_OPEN);
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				styleAttributes();
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT_COLOR) | (1L << COLOR) | (1L << INPUT_COLOR) | (1L << ALIGN_LEFT) | (1L << ALIGN_RIGHT) | (1L << ALIGN_UP) | (1L << COMMA))) != 0) );
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

	public static class SignUpStyleContext extends ParserRuleContext {
		public TerminalNode SIGNUP() { return getToken(HTMLParser.SIGNUP, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode CHECK_OPEN() { return getToken(HTMLParser.CHECK_OPEN, 0); }
		public List<StyleAttributesContext> styleAttributes() {
			return getRuleContexts(StyleAttributesContext.class);
		}
		public StyleAttributesContext styleAttributes(int i) {
			return getRuleContext(StyleAttributesContext.class,i);
		}
		public SignUpStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signUpStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSignUpStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSignUpStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSignUpStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignUpStyleContext signUpStyle() throws RecognitionException {
		SignUpStyleContext _localctx = new SignUpStyleContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_signUpStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(SIGNUP);
			setState(323);
			match(ASSIGN);
			setState(324);
			match(CHECK_OPEN);
			setState(326); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(325);
				styleAttributes();
				}
				}
				setState(328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT_COLOR) | (1L << COLOR) | (1L << INPUT_COLOR) | (1L << ALIGN_LEFT) | (1L << ALIGN_RIGHT) | (1L << ALIGN_UP) | (1L << COMMA))) != 0) );
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

	public static class NavStyleContext extends ParserRuleContext {
		public TerminalNode NAV() { return getToken(HTMLParser.NAV, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode CHECK_OPEN() { return getToken(HTMLParser.CHECK_OPEN, 0); }
		public List<StyleAttributesContext> styleAttributes() {
			return getRuleContexts(StyleAttributesContext.class);
		}
		public StyleAttributesContext styleAttributes(int i) {
			return getRuleContext(StyleAttributesContext.class,i);
		}
		public NavStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNavStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNavStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNavStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavStyleContext navStyle() throws RecognitionException {
		NavStyleContext _localctx = new NavStyleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_navStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(NAV);
			setState(331);
			match(ASSIGN);
			setState(332);
			match(CHECK_OPEN);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				styleAttributes();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT_COLOR) | (1L << COLOR) | (1L << INPUT_COLOR) | (1L << ALIGN_LEFT) | (1L << ALIGN_RIGHT) | (1L << ALIGN_UP) | (1L << COMMA))) != 0) );
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

	public static class FooterStyleContext extends ParserRuleContext {
		public TerminalNode FOOTER() { return getToken(HTMLParser.FOOTER, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode CHECK_OPEN() { return getToken(HTMLParser.CHECK_OPEN, 0); }
		public List<StyleAttributesContext> styleAttributes() {
			return getRuleContexts(StyleAttributesContext.class);
		}
		public StyleAttributesContext styleAttributes(int i) {
			return getRuleContext(StyleAttributesContext.class,i);
		}
		public FooterStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footerStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFooterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFooterStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFooterStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterStyleContext footerStyle() throws RecognitionException {
		FooterStyleContext _localctx = new FooterStyleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_footerStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(FOOTER);
			setState(339);
			match(ASSIGN);
			setState(340);
			match(CHECK_OPEN);
			setState(342); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(341);
				styleAttributes();
				}
				}
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT_COLOR) | (1L << COLOR) | (1L << INPUT_COLOR) | (1L << ALIGN_LEFT) | (1L << ALIGN_RIGHT) | (1L << ALIGN_UP) | (1L << COMMA))) != 0) );
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

	public static class PageStyleContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(HTMLParser.PAGE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public TerminalNode CHECK_OPEN() { return getToken(HTMLParser.CHECK_OPEN, 0); }
		public List<StyleAttributesContext> styleAttributes() {
			return getRuleContexts(StyleAttributesContext.class);
		}
		public StyleAttributesContext styleAttributes(int i) {
			return getRuleContext(StyleAttributesContext.class,i);
		}
		public PageStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPageStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPageStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPageStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageStyleContext pageStyle() throws RecognitionException {
		PageStyleContext _localctx = new PageStyleContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pageStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(PAGE);
			setState(347);
			var();
			setState(348);
			match(ASSIGN);
			setState(349);
			match(CHECK_OPEN);
			setState(351); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(350);
				styleAttributes();
				}
				}
				setState(353); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT_COLOR) | (1L << COLOR) | (1L << INPUT_COLOR) | (1L << ALIGN_LEFT) | (1L << ALIGN_RIGHT) | (1L << ALIGN_UP) | (1L << COMMA))) != 0) );
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

	public static class StyleAttributesContext extends ParserRuleContext {
		public TextColorContext textColor() {
			return getRuleContext(TextColorContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public AlignContext align() {
			return getRuleContext(AlignContext.class,0);
		}
		public InputColorContext inputColor() {
			return getRuleContext(InputColorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public StyleAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyleAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyleAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStyleAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttributesContext styleAttributes() throws RecognitionException {
		StyleAttributesContext _localctx = new StyleAttributesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_styleAttributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(355);
				match(COMMA);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_COLOR:
				{
				setState(361);
				textColor();
				}
				break;
			case COLOR:
				{
				setState(362);
				color();
				}
				break;
			case ALIGN_LEFT:
			case ALIGN_RIGHT:
			case ALIGN_UP:
				{
				setState(363);
				align();
				}
				break;
			case INPUT_COLOR:
				{
				setState(364);
				inputColor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(367);
					match(COMMA);
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class TextColorContext extends ParserRuleContext {
		public TerminalNode TEXT_COLOR() { return getToken(HTMLParser.TEXT_COLOR, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TextColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTextColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTextColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTextColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextColorContext textColor() throws RecognitionException {
		TextColorContext _localctx = new TextColorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_textColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(TEXT_COLOR);
			setState(374);
			match(ASSIGN);
			setState(375);
			var();
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(HTMLParser.COLOR, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(COLOR);
			setState(378);
			match(ASSIGN);
			setState(379);
			var();
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

	public static class InputColorContext extends ParserRuleContext {
		public TerminalNode INPUT_COLOR() { return getToken(HTMLParser.INPUT_COLOR, 0); }
		public TerminalNode ASSIGN() { return getToken(HTMLParser.ASSIGN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public InputColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterInputColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitInputColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitInputColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputColorContext inputColor() throws RecognitionException {
		InputColorContext _localctx = new InputColorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_inputColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(INPUT_COLOR);
			setState(382);
			match(ASSIGN);
			setState(383);
			var();
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

	public static class AlignContext extends ParserRuleContext {
		public TerminalNode ALIGN_UP() { return getToken(HTMLParser.ALIGN_UP, 0); }
		public TerminalNode ALIGN_RIGHT() { return getToken(HTMLParser.ALIGN_RIGHT, 0); }
		public TerminalNode ALIGN_LEFT() { return getToken(HTMLParser.ALIGN_LEFT, 0); }
		public AlignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_align; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAlign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAlign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAlign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignContext align() throws RecognitionException {
		AlignContext _localctx = new AlignContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_align);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIGN_LEFT) | (1L << ALIGN_RIGHT) | (1L << ALIGN_UP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0186\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\3\2\3\3\3\3\6\3t\n\3\r\3\16\3"+
		"u\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00be\n\26\3\26\3\26\5\26"+
		"\u00c2\n\26\3\26\5\26\u00c5\n\26\3\26\5\26\u00c8\n\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00e3\n\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\6$\u0106\n$\r$\16"+
		"$\u0107\3$\3$\3%\7%\u010d\n%\f%\16%\u0110\13%\3%\3%\7%\u0114\n%\f%\16"+
		"%\u0117\13%\3&\3&\6&\u011b\n&\r&\16&\u011c\3&\3&\3\'\7\'\u0122\n\'\f\'"+
		"\16\'\u0125\13\'\3\'\3\'\3\'\3\'\7\'\u012b\n\'\f\'\16\'\u012e\13\'\3("+
		"\3(\3)\3)\3*\3*\3*\3*\3*\5*\u0139\n*\3*\3*\3+\3+\3+\3+\6+\u0141\n+\r+"+
		"\16+\u0142\3,\3,\3,\3,\6,\u0149\n,\r,\16,\u014a\3-\3-\3-\3-\6-\u0151\n"+
		"-\r-\16-\u0152\3.\3.\3.\3.\6.\u0159\n.\r.\16.\u015a\3/\3/\3/\3/\3/\6/"+
		"\u0162\n/\r/\16/\u0163\3\60\7\60\u0167\n\60\f\60\16\60\u016a\13\60\3\60"+
		"\3\60\3\60\3\60\5\60\u0170\n\60\3\60\7\60\u0173\n\60\f\60\16\60\u0176"+
		"\13\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\6\3\2$%\3\2&\'\3\2\63\65\3\2!#\2\u017e"+
		"\2h\3\2\2\2\4s\3\2\2\2\6\u0083\3\2\2\2\b\u0085\3\2\2\2\n\u0089\3\2\2\2"+
		"\f\u008b\3\2\2\2\16\u008f\3\2\2\2\20\u0093\3\2\2\2\22\u0096\3\2\2\2\24"+
		"\u009a\3\2\2\2\26\u009e\3\2\2\2\30\u00a1\3\2\2\2\32\u00a4\3\2\2\2\34\u00a7"+
		"\3\2\2\2\36\u00af\3\2\2\2 \u00b1\3\2\2\2\"\u00b3\3\2\2\2$\u00b5\3\2\2"+
		"\2&\u00b7\3\2\2\2(\u00b9\3\2\2\2*\u00bb\3\2\2\2,\u00c9\3\2\2\2.\u00cd"+
		"\3\2\2\2\60\u00d1\3\2\2\2\62\u00d7\3\2\2\2\64\u00db\3\2\2\2\66\u00e6\3"+
		"\2\2\28\u00ea\3\2\2\2:\u00ee\3\2\2\2<\u00f2\3\2\2\2>\u00f6\3\2\2\2@\u00fb"+
		"\3\2\2\2B\u00ff\3\2\2\2D\u0101\3\2\2\2F\u0103\3\2\2\2H\u010e\3\2\2\2J"+
		"\u0118\3\2\2\2L\u0123\3\2\2\2N\u012f\3\2\2\2P\u0131\3\2\2\2R\u0138\3\2"+
		"\2\2T\u013c\3\2\2\2V\u0144\3\2\2\2X\u014c\3\2\2\2Z\u0154\3\2\2\2\\\u015c"+
		"\3\2\2\2^\u0168\3\2\2\2`\u0177\3\2\2\2b\u017b\3\2\2\2d\u017f\3\2\2\2f"+
		"\u0183\3\2\2\2hl\7\5\2\2ik\5\4\3\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2mo\3\2\2\2nl\3\2\2\2op\7\24\2\2p\3\3\2\2\2qt\7\23\2\2rt\5\6\4\2sq"+
		"\3\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\5\3\2\2\2w\u0084\5\f"+
		"\7\2x\u0084\5\16\b\2y\u0084\5\20\t\2z\u0084\5\22\n\2{\u0084\5\26\f\2|"+
		"\u0084\5\30\r\2}\u0084\5\32\16\2~\u0084\5\34\17\2\177\u0084\5\64\33\2"+
		"\u0080\u0084\5R*\2\u0081\u0084\5\24\13\2\u0082\u0084\7\6\2\2\u0083w\3"+
		"\2\2\2\u0083x\3\2\2\2\u0083y\3\2\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083"+
		"|\3\2\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\7\3\2\2\2\u0085"+
		"\u0086\7\34\2\2\u0086\u0087\5\n\6\2\u0087\u0088\7\34\2\2\u0088\t\3\2\2"+
		"\2\u0089\u008a\79\2\2\u008a\13\3\2\2\2\u008b\u008c\7\b\2\2\u008c\u008d"+
		"\5\b\5\2\u008d\u008e\7\25\2\2\u008e\r\3\2\2\2\u008f\u0090\7\t\2\2\u0090"+
		"\u0091\5\b\5\2\u0091\u0092\7\25\2\2\u0092\17\3\2\2\2\u0093\u0094\7\r\2"+
		"\2\u0094\u0095\7\25\2\2\u0095\21\3\2\2\2\u0096\u0097\7\16\2\2\u0097\u0098"+
		"\5\b\5\2\u0098\u0099\7\25\2\2\u0099\23\3\2\2\2\u009a\u009b\7\17\2\2\u009b"+
		"\u009c\5*\26\2\u009c\u009d\7\25\2\2\u009d\25\3\2\2\2\u009e\u009f\7\n\2"+
		"\2\u009f\u00a0\7\25\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\7\13\2\2\u00a2\u00a3"+
		"\7\25\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6\7\25\2\2\u00a6"+
		"\33\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\67"+
		"\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\7\67\2\2\u00ac\u00ad\5\"\22\2\u00ad"+
		"\u00ae\7\25\2\2\u00ae\35\3\2\2\2\u00af\u00b0\t\2\2\2\u00b0\37\3\2\2\2"+
		"\u00b1\u00b2\5\n\6\2\u00b2!\3\2\2\2\u00b3\u00b4\5\n\6\2\u00b4#\3\2\2\2"+
		"\u00b5\u00b6\5\n\6\2\u00b6%\3\2\2\2\u00b7\u00b8\5\n\6\2\u00b8\'\3\2\2"+
		"\2\u00b9\u00ba\5\n\6\2\u00ba)\3\2\2\2\u00bb\u00bd\5$\23\2\u00bc\u00be"+
		"\7\67\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2"+
		"\u00bf\u00c2\5.\30\2\u00c0\u00c2\5\60\31\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\7\67\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8"+
		"\5,\27\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8+\3\2\2\2\u00c9"+
		"\u00ca\7\62\2\2\u00ca\u00cb\7\66\2\2\u00cb\u00cc\t\3\2\2\u00cc-\3\2\2"+
		"\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7\66\2\2\u00cf\u00d0\5&\24\2\u00d0/"+
		"\3\2\2\2\u00d1\u00d2\7)\2\2\u00d2\u00d3\7\66\2\2\u00d3\u00d4\5&\24\2\u00d4"+
		"\u00d5\7\66\2\2\u00d5\u00d6\5\62\32\2\u00d6\61\3\2\2\2\u00d7\u00d8\t\4"+
		"\2\2\u00d8\u00d9\7\66\2\2\u00d9\u00da\5(\25\2\u00da\63\3\2\2\2\u00db\u00e2"+
		"\7\20\2\2\u00dc\u00e3\5\66\34\2\u00dd\u00e3\58\35\2\u00de\u00e3\5:\36"+
		"\2\u00df\u00e3\5<\37\2\u00e0\u00e3\5@!\2\u00e1\u00e3\5> \2\u00e2\u00dc"+
		"\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\25"+
		"\2\2\u00e5\65\3\2\2\2\u00e6\u00e7\7\n\2\2\u00e7\u00e8\7\66\2\2\u00e8\u00e9"+
		"\5D#\2\u00e9\67\3\2\2\2\u00ea\u00eb\7\13\2\2\u00eb\u00ec\7\66\2\2\u00ec"+
		"\u00ed\5D#\2\u00ed9\3\2\2\2\u00ee\u00ef\7\r\2\2\u00ef\u00f0\7\66\2\2\u00f0"+
		"\u00f1\5F$\2\u00f1;\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3\u00f4\7\66\2\2"+
		"\u00f4\u00f5\5F$\2\u00f5=\3\2\2\2\u00f6\u00f7\7\21\2\2\u00f7\u00f8\5&"+
		"\24\2\u00f8\u00f9\7\66\2\2\u00f9\u00fa\5J&\2\u00fa?\3\2\2\2\u00fb\u00fc"+
		"\5B\"\2\u00fc\u00fd\7\66\2\2\u00fd\u00fe\5D#\2\u00feA\3\2\2\2\u00ff\u0100"+
		"\7\22\2\2\u0100C\3\2\2\2\u0101\u0102\5\n\6\2\u0102E\3\2\2\2\u0103\u0105"+
		"\7\30\2\2\u0104\u0106\5H%\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\31"+
		"\2\2\u010aG\3\2\2\2\u010b\u010d\7\67\2\2\u010c\u010b\3\2\2\2\u010d\u0110"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0115\5\n\6\2\u0112\u0114\7\67\2\2\u0113\u0112\3"+
		"\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"I\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7\30\2\2\u0119\u011b\5L\'\2"+
		"\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\31\2\2\u011fK\3\2\2\2\u0120"+
		"\u0122\7\67\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0127\5N(\2\u0127\u0128\7\66\2\2\u0128\u012c\5P)\2\u0129\u012b\7\67\2"+
		"\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012dM\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\5\n\6\2\u0130"+
		"O\3\2\2\2\u0131\u0132\5\n\6\2\u0132Q\3\2\2\2\u0133\u0139\5T+\2\u0134\u0139"+
		"\5V,\2\u0135\u0139\5X-\2\u0136\u0139\5Z.\2\u0137\u0139\5\\/\2\u0138\u0133"+
		"\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\25\2\2\u013bS\3\2\2\2"+
		"\u013c\u013d\7\n\2\2\u013d\u013e\7\66\2\2\u013e\u0140\7\32\2\2\u013f\u0141"+
		"\5^\60\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143U\3\2\2\2\u0144\u0145\7\13\2\2\u0145\u0146\7\66\2"+
		"\2\u0146\u0148\7\32\2\2\u0147\u0149\5^\60\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014bW\3\2\2\2"+
		"\u014c\u014d\7\r\2\2\u014d\u014e\7\66\2\2\u014e\u0150\7\32\2\2\u014f\u0151"+
		"\5^\60\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153Y\3\2\2\2\u0154\u0155\7\16\2\2\u0155\u0156\7\66\2"+
		"\2\u0156\u0158\7\32\2\2\u0157\u0159\5^\60\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b[\3\2\2\2"+
		"\u015c\u015d\7\17\2\2\u015d\u015e\5\n\6\2\u015e\u015f\7\66\2\2\u015f\u0161"+
		"\7\32\2\2\u0160\u0162\5^\60\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2"+
		"\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164]\3\2\2\2\u0165\u0167\7"+
		"\67\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016f\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0170\5`"+
		"\61\2\u016c\u0170\5b\62\2\u016d\u0170\5f\64\2\u016e\u0170\5d\63\2\u016f"+
		"\u016b\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2"+
		"\2\2\u0170\u0174\3\2\2\2\u0171\u0173\7\67\2\2\u0172\u0171\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175_\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0177\u0178\7\36\2\2\u0178\u0179\7\66\2\2\u0179\u017a"+
		"\5\n\6\2\u017aa\3\2\2\2\u017b\u017c\7\37\2\2\u017c\u017d\7\66\2\2\u017d"+
		"\u017e\5\n\6\2\u017ec\3\2\2\2\u017f\u0180\7 \2\2\u0180\u0181\7\66\2\2"+
		"\u0181\u0182\5\n\6\2\u0182e\3\2\2\2\u0183\u0184\t\5\2\2\u0184g\3\2\2\2"+
		"\32lsu\u0083\u00bd\u00c1\u00c4\u00c7\u00e2\u0107\u010e\u0115\u011c\u0123"+
		"\u012c\u0138\u0142\u014a\u0152\u015a\u0163\u0168\u016f\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}