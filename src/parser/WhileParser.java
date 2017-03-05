// Generated from /Users/alistarle/Documents/Master/AS/src/While.g4 by ANTLR 4.5.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WhileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ADD=14, SUB=15, MUL=16, DIV=17, 
		GT=18, GTE=19, LT=20, LTE=21, EQ=22, NEQ=23, AND=24, OR=25, NOT=26, IF=27, 
		DO=28, THEN=29, ELSE=30, WHILE=31, RETURN=32, Int=33, Boolean=34, BOOLEAN=35, 
		Constante=36, Identifier=37, WS=38;
	public static final int
		RULE_main = 0, RULE_declaration = 1, RULE_ldeclIdentifier = 2, RULE_ldeclVariables = 3, 
		RULE_declVariables = 4, RULE_lidentifier = 5, RULE_controle = 6, RULE_functionCall = 7, 
		RULE_ident = 8, RULE_aexpr = 9, RULE_laexpression = 10, RULE_aexpression = 11, 
		RULE_bexpression = 12, RULE_block = 13, RULE_statements = 14, RULE_statement = 15, 
		RULE_type = 16;
	public static final String[] ruleNames = {
		"main", "declaration", "ldeclIdentifier", "ldeclVariables", "declVariables", 
		"lidentifier", "controle", "functionCall", "ident", "aexpr", "laexpression", 
		"aexpression", "bexpression", "block", "statements", "statement", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'begin'", "'end'", "'proc'", "'('", "','", "')'", 
		"';'", "'call'", "'['", "']'", "':='", "'skip'", "'+'", "'-'", "'*'", 
		"'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'and'", "'or'", 
		"'not'", "'if'", "'do'", "'then'", "'else'", "'main'", "'res'", "'int'",
		"'boolean'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ADD", "SUB", "MUL", "DIV", "GT", "GTE", "LT", "LTE", "EQ", 
		"NEQ", "AND", "OR", "NOT", "IF", "DO", "THEN", "ELSE", "WHILE", "RETURN", 
		"Int", "Boolean", "BOOLEAN", "Constante", "Identifier", "WS"
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
	public String getGrammarFileName() { return "While.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WhileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends MainContext {
		public LdeclVariablesContext ldeclVariables() {
			return getRuleContext(LdeclVariablesContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WhileParser.EOF, 0); }
		public TerminalNode Identifier() { return getToken(WhileParser.Identifier, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(36);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(35);
				match(Identifier);
				}
			}

			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(38);
					declaration();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(46);
			match(T__1);
			setState(47);
			ldeclVariables();
			setState(48);
			statements();
			setState(49);
			match(T__2);
			setState(50);
			match(EOF);
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(WhileParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(WhileParser.Identifier, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LdeclIdentifierContext ldeclIdentifier() {
			return getRuleContext(LdeclIdentifierContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(WhileParser.RETURN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__3);
			setState(53);
			match(Identifier);
			setState(54);
			match(T__4);
			setState(56);
			_la = _input.LA(1);
			if (_la==Int || _la==Boolean) {
				{
				setState(55);
				ldeclIdentifier();
				}
			}

			setState(65);
			_la = _input.LA(1);
			if (_la==T__5 || _la==RETURN) {
				{
				setState(59);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(58);
					match(T__5);
					}
				}

				setState(61);
				match(RETURN);
				setState(62);
				type();
				setState(63);
				match(Identifier);
				}
			}

			setState(67);
			match(T__6);
			setState(68);
			match(T__1);
			setState(69);
			statements();
			setState(70);
			match(T__2);
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

	public static class LdeclIdentifierContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(WhileParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(WhileParser.Identifier, i);
		}
		public LdeclIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ldeclIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterLdeclIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitLdeclIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitLdeclIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LdeclIdentifierContext ldeclIdentifier() throws RecognitionException {
		LdeclIdentifierContext _localctx = new LdeclIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ldeclIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			type();
			setState(73);
			match(Identifier);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					match(T__5);
					setState(75);
					type();
					setState(76);
					match(Identifier);
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class LdeclVariablesContext extends ParserRuleContext {
		public DeclVariablesContext declVariables() {
			return getRuleContext(DeclVariablesContext.class,0);
		}
		public List<LdeclVariablesContext> ldeclVariables() {
			return getRuleContexts(LdeclVariablesContext.class);
		}
		public LdeclVariablesContext ldeclVariables(int i) {
			return getRuleContext(LdeclVariablesContext.class,i);
		}
		public LdeclVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ldeclVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterLdeclVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitLdeclVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitLdeclVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LdeclVariablesContext ldeclVariables() throws RecognitionException {
		LdeclVariablesContext _localctx = new LdeclVariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ldeclVariables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			declVariables();
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					ldeclVariables();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class DeclVariablesContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LidentifierContext lidentifier() {
			return getRuleContext(LidentifierContext.class,0);
		}
		public DeclVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterDeclVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitDeclVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitDeclVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVariablesContext declVariables() throws RecognitionException {
		DeclVariablesContext _localctx = new DeclVariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declVariables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			type();
			setState(91);
			lidentifier();
			setState(92);
			match(T__7);
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

	public static class LidentifierContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(WhileParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(WhileParser.Identifier, i);
		}
		public LidentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lidentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterLidentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitLidentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitLidentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidentifierContext lidentifier() throws RecognitionException {
		LidentifierContext _localctx = new LidentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lidentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(Identifier);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(95);
				match(T__5);
				setState(96);
				match(Identifier);
				}
				}
				setState(101);
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

	public static class ControleContext extends ParserRuleContext {
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
	 
		public ControleContext() { }
		public void copyFrom(ControleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ControleIfContext extends ControleContext {
		public TerminalNode IF() { return getToken(WhileParser.IF, 0); }
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(WhileParser.THEN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(WhileParser.ELSE, 0); }
		public ControleIfContext(ControleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterControleIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitControleIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitControleIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ControleWhileContext extends ControleContext {
		public TerminalNode WHILE() { return getToken(WhileParser.WHILE, 0); }
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(WhileParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ControleWhileContext(ControleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterControleWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitControleWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitControleWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_controle);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new ControleIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(IF);
				setState(103);
				bexpression(0);
				setState(104);
				match(THEN);
				setState(105);
				block();
				setState(108);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(106);
					match(ELSE);
					setState(107);
					block();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new ControleWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(WHILE);
				setState(111);
				bexpression(0);
				setState(112);
				match(DO);
				setState(113);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WhileParser.Identifier, 0); }
		public LaexpressionContext laexpression() {
			return getRuleContext(LaexpressionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__8);
			setState(118);
			match(Identifier);
			setState(119);
			match(T__4);
			setState(120);
			laexpression();
			setState(121);
			match(T__6);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WhileParser.Identifier, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ident);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(Identifier);
				setState(125);
				match(T__9);
				setState(126);
				aexpr(0);
				setState(127);
				match(T__10);
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

	public static class AexprContext extends ParserRuleContext {
		public Token op;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode Constante() { return getToken(WhileParser.Constante, 0); }
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(WhileParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(WhileParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(WhileParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(WhileParser.SUB, 0); }
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitAexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitAexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		return aexpr(0);
	}

	private AexprContext aexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexprContext _localctx = new AexprContext(_ctx, _parentState);
		AexprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_aexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(132);
				ident();
				}
				break;
			case Constante:
				{
				setState(133);
				match(Constante);
				}
				break;
			case T__4:
				{
				setState(134);
				match(T__4);
				setState(135);
				aexpr(0);
				setState(136);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(140);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(141);
						((AexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((AexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(142);
						aexpr(4);
						}
						break;
					case 2:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(143);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(144);
						((AexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(145);
						aexpr(3);
						}
						break;
					}
					} 
				}
				setState(150);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LaexpressionContext extends ParserRuleContext {
		public List<AexpressionContext> aexpression() {
			return getRuleContexts(AexpressionContext.class);
		}
		public AexpressionContext aexpression(int i) {
			return getRuleContext(AexpressionContext.class,i);
		}
		public LaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterLaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitLaexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitLaexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LaexpressionContext laexpression() throws RecognitionException {
		LaexpressionContext _localctx = new LaexpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_laexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			aexpression(0);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(152);
				match(T__5);
				setState(153);
				aexpression(0);
				}
				}
				setState(158);
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

	public static class AexpressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode SUB() { return getToken(WhileParser.SUB, 0); }
		public List<AexpressionContext> aexpression() {
			return getRuleContexts(AexpressionContext.class);
		}
		public AexpressionContext aexpression(int i) {
			return getRuleContext(AexpressionContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode Constante() { return getToken(WhileParser.Constante, 0); }
		public TerminalNode MUL() { return getToken(WhileParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(WhileParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(WhileParser.ADD, 0); }
		public AexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterAexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitAexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitAexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexpressionContext aexpression() throws RecognitionException {
		return aexpression(0);
	}

	private AexpressionContext aexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexpressionContext _localctx = new AexpressionContext(_ctx, _parentState);
		AexpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_aexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(160);
				match(SUB);
				setState(161);
				aexpression(2);
				}
				break;
			case Identifier:
				{
				setState(162);
				ident();
				}
				break;
			case Constante:
				{
				setState(163);
				match(Constante);
				}
				break;
			case T__4:
				{
				setState(164);
				match(T__4);
				setState(165);
				aexpression(0);
				setState(166);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpression);
						setState(170);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(171);
						((AexpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((AexpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(172);
						aexpression(5);
						}
						break;
					case 2:
						{
						_localctx = new AexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpression);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						((AexpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AexpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(175);
						aexpression(4);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BexpressionContext extends ParserRuleContext {
		public Token op;
		public List<BexpressionContext> bexpression() {
			return getRuleContexts(BexpressionContext.class);
		}
		public BexpressionContext bexpression(int i) {
			return getRuleContext(BexpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(WhileParser.NOT, 0); }
		public TerminalNode BOOLEAN() { return getToken(WhileParser.BOOLEAN, 0); }
		public List<AexpressionContext> aexpression() {
			return getRuleContexts(AexpressionContext.class);
		}
		public AexpressionContext aexpression(int i) {
			return getRuleContext(AexpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(WhileParser.GT, 0); }
		public TerminalNode GTE() { return getToken(WhileParser.GTE, 0); }
		public TerminalNode LT() { return getToken(WhileParser.LT, 0); }
		public TerminalNode LTE() { return getToken(WhileParser.LTE, 0); }
		public TerminalNode EQ() { return getToken(WhileParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(WhileParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(WhileParser.AND, 0); }
		public TerminalNode OR() { return getToken(WhileParser.OR, 0); }
		public BexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterBexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitBexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitBexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexpressionContext bexpression() throws RecognitionException {
		return bexpression(0);
	}

	private BexpressionContext bexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexpressionContext _localctx = new BexpressionContext(_ctx, _parentState);
		BexpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_bexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(182);
				((BexpressionContext)_localctx).op = match(NOT);
				setState(183);
				bexpression(2);
				}
				break;
			case 2:
				{
				setState(184);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				setState(185);
				aexpression(0);
				setState(186);
				((BexpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE))) != 0)) ) {
					((BexpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(187);
				aexpression(0);
				}
				break;
			case 4:
				{
				setState(189);
				aexpression(0);
				setState(190);
				((BexpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
					((BexpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(191);
				aexpression(0);
				}
				break;
			case 5:
				{
				setState(193);
				match(T__4);
				setState(194);
				bexpression(0);
				setState(195);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bexpression);
					setState(199);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(200);
					((BexpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((BexpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(201);
					bexpression(4);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case T__8:
			case T__12:
			case IF:
			case WHILE:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__4);
				setState(209);
				statements();
				setState(210);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			statement();
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					match(T__7);
					setState(216);
					statements();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ControleContext controle() {
			return getRuleContext(ControleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(229);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				ident();
				setState(223);
				match(T__11);
				setState(224);
				aexpr(0);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				functionCall();
				}
				break;
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				controle();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(WhileParser.Int, 0); }
		public TerminalNode Boolean() { return getToken(WhileParser.Boolean, 0); }
		public TerminalNode Constante() { return getToken(WhileParser.Constante, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileListener ) ((WhileListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileVisitor ) return ((WhileVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(Int);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(Boolean);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(Int);
				setState(234);
				match(T__9);
				setState(235);
				match(Constante);
				setState(236);
				match(T__10);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return aexpr_sempred((AexprContext)_localctx, predIndex);
		case 11:
			return aexpression_sempred((AexpressionContext)_localctx, predIndex);
		case 12:
			return bexpression_sempred((BexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aexpression_sempred(AexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean bexpression_sempred(BexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\5\2\'\n\2\3\2\7\2*\n\2\f\2\16\2-\13\2\5\2/\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3;\n\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3\5\3D"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4\16\4T\13"+
		"\4\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7d\n"+
		"\7\f\7\16\7g\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bv\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0084\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008d\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13\13\3\f\3\f\3\f\7\f\u009d"+
		"\n\f\f\f\16\f\u00a0\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00c8\n\16\3\16\3\16\3\16\7\16\u00cd\n\16\f\16\16\16\u00d0\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d7\n\17\3\20\3\20\3\20\7\20\u00dc"+
		"\n\20\f\20\16\20\u00df\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e8"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f0\n\22\3\22\2\5\24\30\32"+
		"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\3\2\22\23\3\2\20\21"+
		"\3\2\24\27\3\2\30\31\3\2\32\33\u0102\2$\3\2\2\2\4\66\3\2\2\2\6J\3\2\2"+
		"\2\bU\3\2\2\2\n\\\3\2\2\2\f`\3\2\2\2\16u\3\2\2\2\20w\3\2\2\2\22\u0083"+
		"\3\2\2\2\24\u008c\3\2\2\2\26\u0099\3\2\2\2\30\u00aa\3\2\2\2\32\u00c7\3"+
		"\2\2\2\34\u00d6\3\2\2\2\36\u00d8\3\2\2\2 \u00e7\3\2\2\2\"\u00ef\3\2\2"+
		"\2$&\7\3\2\2%\'\7\'\2\2&%\3\2\2\2&\'\3\2\2\2\'.\3\2\2\2(*\5\4\3\2)(\3"+
		"\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.+\3\2\2\2./\3"+
		"\2\2\2/\60\3\2\2\2\60\61\7\4\2\2\61\62\5\b\5\2\62\63\5\36\20\2\63\64\7"+
		"\5\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7\6\2\2\678\7\'\2\28:\7\7\2\2"+
		"9;\5\6\4\2:9\3\2\2\2:;\3\2\2\2;C\3\2\2\2<>\7\b\2\2=<\3\2\2\2=>\3\2\2\2"+
		">?\3\2\2\2?@\7\"\2\2@A\5\"\22\2AB\7\'\2\2BD\3\2\2\2C=\3\2\2\2CD\3\2\2"+
		"\2DE\3\2\2\2EF\7\t\2\2FG\7\4\2\2GH\5\36\20\2HI\7\5\2\2I\5\3\2\2\2JK\5"+
		"\"\22\2KR\7\'\2\2LM\7\b\2\2MN\5\"\22\2NO\7\'\2\2OQ\3\2\2\2PL\3\2\2\2Q"+
		"T\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\7\3\2\2\2TR\3\2\2\2UY\5\n\6\2VX\5\b\5\2"+
		"WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[Y\3\2\2\2\\]\5\"\22"+
		"\2]^\5\f\7\2^_\7\n\2\2_\13\3\2\2\2`e\7\'\2\2ab\7\b\2\2bd\7\'\2\2ca\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2ge\3\2\2\2hi\7\35\2\2ij\5"+
		"\32\16\2jk\7\37\2\2kn\5\34\17\2lm\7 \2\2mo\5\34\17\2nl\3\2\2\2no\3\2\2"+
		"\2ov\3\2\2\2pq\7!\2\2qr\5\32\16\2rs\7\36\2\2st\5\34\17\2tv\3\2\2\2uh\3"+
		"\2\2\2up\3\2\2\2v\17\3\2\2\2wx\7\13\2\2xy\7\'\2\2yz\7\7\2\2z{\5\26\f\2"+
		"{|\7\t\2\2|\21\3\2\2\2}\u0084\7\'\2\2~\177\7\'\2\2\177\u0080\7\f\2\2\u0080"+
		"\u0081\5\24\13\2\u0081\u0082\7\r\2\2\u0082\u0084\3\2\2\2\u0083}\3\2\2"+
		"\2\u0083~\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\b\13\1\2\u0086\u008d\5"+
		"\22\n\2\u0087\u008d\7&\2\2\u0088\u0089\7\7\2\2\u0089\u008a\5\24\13\2\u008a"+
		"\u008b\7\t\2\2\u008b\u008d\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0087\3\2"+
		"\2\2\u008c\u0088\3\2\2\2\u008d\u0096\3\2\2\2\u008e\u008f\f\5\2\2\u008f"+
		"\u0090\t\2\2\2\u0090\u0095\5\24\13\6\u0091\u0092\f\4\2\2\u0092\u0093\t"+
		"\3\2\2\u0093\u0095\5\24\13\5\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\25\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0099\u009e\5\30\r\2\u009a\u009b\7\b\2\2\u009b"+
		"\u009d\5\30\r\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\27\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\b\r\1\2\u00a2\u00a3\7\21\2\2\u00a3\u00ab\5\30\r\4\u00a4\u00ab\5"+
		"\22\n\2\u00a5\u00ab\7&\2\2\u00a6\u00a7\7\7\2\2\u00a7\u00a8\5\30\r\2\u00a8"+
		"\u00a9\7\t\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2"+
		"\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\u00b4\3\2\2\2\u00ac"+
		"\u00ad\f\6\2\2\u00ad\u00ae\t\2\2\2\u00ae\u00b3\5\30\r\7\u00af\u00b0\f"+
		"\5\2\2\u00b0\u00b1\t\3\2\2\u00b1\u00b3\5\30\r\6\u00b2\u00ac\3\2\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\31\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\16\1\2\u00b8\u00b9"+
		"\7\34\2\2\u00b9\u00c8\5\32\16\4\u00ba\u00c8\7%\2\2\u00bb\u00bc\5\30\r"+
		"\2\u00bc\u00bd\t\4\2\2\u00bd\u00be\5\30\r\2\u00be\u00c8\3\2\2\2\u00bf"+
		"\u00c0\5\30\r\2\u00c0\u00c1\t\5\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c8\3"+
		"\2\2\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00c6\7\t\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00b7\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00bb\3\2"+
		"\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00ce\3\2\2\2\u00c9"+
		"\u00ca\f\5\2\2\u00ca\u00cb\t\6\2\2\u00cb\u00cd\5\32\16\6\u00cc\u00c9\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\33\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d7\5 \21\2\u00d2\u00d3\7\7\2"+
		"\2\u00d3\u00d4\5\36\20\2\u00d4\u00d5\7\t\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\35\3\2\2\2\u00d8\u00dd\5 \21"+
		"\2\u00d9\u00da\7\n\2\2\u00da\u00dc\5\36\20\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\37\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\5\22\n\2\u00e1\u00e2\7\16\2\2\u00e2"+
		"\u00e3\5\24\13\2\u00e3\u00e8\3\2\2\2\u00e4\u00e8\5\20\t\2\u00e5\u00e8"+
		"\5\16\b\2\u00e6\u00e8\7\17\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e4\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8!\3\2\2\2\u00e9\u00f0\7"+
		"#\2\2\u00ea\u00f0\7$\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\7\f\2\2\u00ed"+
		"\u00ee\7&\2\2\u00ee\u00f0\7\r\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2"+
		"\2\2\u00ef\u00eb\3\2\2\2\u00f0#\3\2\2\2\33&+.:=CRYenu\u0083\u008c\u0094"+
		"\u0096\u009e\u00aa\u00b2\u00b4\u00c7\u00ce\u00d6\u00dd\u00e7\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}