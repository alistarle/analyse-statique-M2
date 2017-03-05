// Generated from /Users/alistarle/Documents/Master/AS/src/While.g4 by ANTLR 4.5.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WhileLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "ADD", "SUB", "MUL", "DIV", "GT", "GTE", 
		"LT", "LTE", "EQ", "NEQ", "AND", "OR", "NOT", "IF", "DO", "THEN", "ELSE", 
		"WHILE", "RETURN", "Int", "Boolean", "BOOLEAN", "Constante", "Identifier", 
		"WS"
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


	public WhileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "While.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00d2\n$\3%\6%\u00d5\n%\r%\16"+
		"%\u00d6\3&\3&\7&\u00db\n&\f&\16&\u00de\13&\3\'\6\'\u00e1\n\'\r\'\16\'"+
		"\u00e2\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\6\3\2\62;\4\2C\\c|\5\2\62"+
		";C\\c|\7\2\13\f\17\17\"\"^^nn\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\3O\3\2\2\2\5W\3\2\2\2\7]\3\2\2\2\ta\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17"+
		"j\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31w\3\2\2\2"+
		"\33z\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2"+
		"\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2)\u008c\3\2\2\2+\u008e\3\2\2\2-\u0091"+
		"\3\2\2\2/\u0094\3\2\2\2\61\u0097\3\2\2\2\63\u009b\3\2\2\2\65\u009e\3\2"+
		"\2\2\67\u00a2\3\2\2\29\u00a5\3\2\2\2;\u00a8\3\2\2\2=\u00ad\3\2\2\2?\u00b2"+
		"\3\2\2\2A\u00b8\3\2\2\2C\u00bc\3\2\2\2E\u00c0\3\2\2\2G\u00d1\3\2\2\2I"+
		"\u00d4\3\2\2\2K\u00d8\3\2\2\2M\u00e0\3\2\2\2OP\7r\2\2PQ\7t\2\2QR\7q\2"+
		"\2RS\7i\2\2ST\7t\2\2TU\7c\2\2UV\7o\2\2V\4\3\2\2\2WX\7d\2\2XY\7g\2\2YZ"+
		"\7i\2\2Z[\7k\2\2[\\\7p\2\2\\\6\3\2\2\2]^\7g\2\2^_\7p\2\2_`\7f\2\2`\b\3"+
		"\2\2\2ab\7r\2\2bc\7t\2\2cd\7q\2\2de\7e\2\2e\n\3\2\2\2fg\7*\2\2g\f\3\2"+
		"\2\2hi\7.\2\2i\16\3\2\2\2jk\7+\2\2k\20\3\2\2\2lm\7=\2\2m\22\3\2\2\2no"+
		"\7e\2\2op\7c\2\2pq\7n\2\2qr\7n\2\2r\24\3\2\2\2st\7]\2\2t\26\3\2\2\2uv"+
		"\7_\2\2v\30\3\2\2\2wx\7<\2\2xy\7?\2\2y\32\3\2\2\2z{\7u\2\2{|\7m\2\2|}"+
		"\7k\2\2}~\7r\2\2~\34\3\2\2\2\177\u0080\7-\2\2\u0080\36\3\2\2\2\u0081\u0082"+
		"\7/\2\2\u0082 \3\2\2\2\u0083\u0084\7,\2\2\u0084\"\3\2\2\2\u0085\u0086"+
		"\7\61\2\2\u0086$\3\2\2\2\u0087\u0088\7@\2\2\u0088&\3\2\2\2\u0089\u008a"+
		"\7@\2\2\u008a\u008b\7?\2\2\u008b(\3\2\2\2\u008c\u008d\7>\2\2\u008d*\3"+
		"\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7?\2\2\u0090,\3\2\2\2\u0091\u0092"+
		"\7?\2\2\u0092\u0093\7?\2\2\u0093.\3\2\2\2\u0094\u0095\7#\2\2\u0095\u0096"+
		"\7?\2\2\u0096\60\3\2\2\2\u0097\u0098\7c\2\2\u0098\u0099\7p\2\2\u0099\u009a"+
		"\7f\2\2\u009a\62\3\2\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d\64"+
		"\3\2\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\66\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7h\2\2\u00a48\3\2\2\2\u00a5"+
		"\u00a6\7f\2\2\u00a6\u00a7\7q\2\2\u00a7:\3\2\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7j\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac<\3\2\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1>\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2"+
		"\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7"+
		"t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7u\2\2\u00bbB\3\2\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bfD\3\2\2\2\u00c0\u00c1"+
		"\7d\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7n\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7p\2\2\u00c7F\3\2\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7w\2\2\u00cb\u00d2\7g\2\2"+
		"\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0"+
		"\7u\2\2\u00d0\u00d2\7g\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2"+
		"H\3\2\2\2\u00d3\u00d5\t\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7J\3\2\2\2\u00d8\u00dc\t"+
		"\3\2\2\u00d9\u00db\t\4\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddL\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00df\u00e1\t\5\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\'\2\2\u00e5"+
		"N\3\2\2\2\7\2\u00d1\u00d6\u00dc\u00e2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}