// Generated from java-escape by ANTLR 4.11.1
package com.alf.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, FUNCTION=3, VARIABLE=4, ADD=5, SUB=6, MUL=7, DIV=8, REM=9, 
		INT=10, FLOAT=11, STRING=12, LIST=13, LP=14, RP=15, EQ=16, SEMICOLON=17, 
		LSP=18, RSP=19, COMMA=20, LB=21, RB=22, RETURN=23, INT_NUMBER=24, FLOAT_NUMBER=25, 
		STRING_TEXT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "NEWLINE", "FUNCTION", "VARIABLE", "ADD", "SUB", "MUL", "DIV", 
			"REM", "INT", "FLOAT", "STRING", "LIST", "LP", "RP", "EQ", "SEMICOLON", 
			"LSP", "RSP", "COMMA", "LB", "RB", "RETURN", "INT_NUMBER", "FLOAT_NUMBER", 
			"STRING_TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'function'", null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'int'", "'float'", "'String'", "'list'", "'('", "')'", "'='", "';'", 
			"'['", "']'", "','", "'{'", "'}'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NEWLINE", "FUNCTION", "VARIABLE", "ADD", "SUB", "MUL", "DIV", 
			"REM", "INT", "FLOAT", "STRING", "LIST", "LP", "RP", "EQ", "SEMICOLON", 
			"LSP", "RSP", "COMMA", "LB", "RB", "RETURN", "INT_NUMBER", "FLOAT_NUMBER", 
			"STRING_TEXT"
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


	public AlfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u00a8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001;\b\u0001\u000b\u0001"+
		"\f\u0001<\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0004\u0003L\b\u0003\u000b\u0003\f\u0003M\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u008a\b\u0017\u000b"+
		"\u0017\f\u0017\u008b\u0001\u0018\u0004\u0018\u008f\b\u0018\u000b\u0018"+
		"\f\u0018\u0090\u0001\u0018\u0001\u0018\u0004\u0018\u0095\b\u0018\u000b"+
		"\u0018\f\u0018\u0096\u0001\u0019\u0001\u0019\u0004\u0019\u009b\b\u0019"+
		"\u000b\u0019\f\u0019\u009c\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019"+
		"\u00a2\b\u0019\u000b\u0019\f\u0019\u00a3\u0001\u0019\u0003\u0019\u00a7"+
		"\b\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000\u0005\u0002"+
		"\u0000\n\n\r\r\u0003\u000009AZaz\u0001\u000009\u0001\u0000\"\"\u0001\u0000"+
		"\'\'\u00af\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u0003:\u0001"+
		"\u0000\u0000\u0000\u0005@\u0001\u0000\u0000\u0000\u0007I\u0001\u0000\u0000"+
		"\u0000\tO\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\rS\u0001"+
		"\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000"+
		"\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015]\u0001\u0000\u0000\u0000\u0017"+
		"c\u0001\u0000\u0000\u0000\u0019j\u0001\u0000\u0000\u0000\u001bo\u0001"+
		"\u0000\u0000\u0000\u001dq\u0001\u0000\u0000\u0000\u001fs\u0001\u0000\u0000"+
		"\u0000!u\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%y\u0001\u0000"+
		"\u0000\u0000\'{\u0001\u0000\u0000\u0000)}\u0001\u0000\u0000\u0000+\u007f"+
		"\u0001\u0000\u0000\u0000-\u0081\u0001\u0000\u0000\u0000/\u0089\u0001\u0000"+
		"\u0000\u00001\u008e\u0001\u0000\u0000\u00003\u00a6\u0001\u0000\u0000\u0000"+
		"56\u0005 \u0000\u000067\u0001\u0000\u0000\u000078\u0006\u0000\u0000\u0000"+
		"8\u0002\u0001\u0000\u0000\u00009;\u0007\u0000\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0006\u0001\u0000\u0000"+
		"?\u0004\u0001\u0000\u0000\u0000@A\u0005f\u0000\u0000AB\u0005u\u0000\u0000"+
		"BC\u0005n\u0000\u0000CD\u0005c\u0000\u0000DE\u0005t\u0000\u0000EF\u0005"+
		"i\u0000\u0000FG\u0005o\u0000\u0000GH\u0005n\u0000\u0000H\u0006\u0001\u0000"+
		"\u0000\u0000IK\u0005_\u0000\u0000JL\u0007\u0001\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000N\b\u0001\u0000\u0000\u0000OP\u0005+\u0000\u0000P\n"+
		"\u0001\u0000\u0000\u0000QR\u0005-\u0000\u0000R\f\u0001\u0000\u0000\u0000"+
		"ST\u0005*\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005/\u0000\u0000"+
		"V\u0010\u0001\u0000\u0000\u0000WX\u0005%\u0000\u0000X\u0012\u0001\u0000"+
		"\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005t\u0000"+
		"\u0000\\\u0014\u0001\u0000\u0000\u0000]^\u0005f\u0000\u0000^_\u0005l\u0000"+
		"\u0000_`\u0005o\u0000\u0000`a\u0005a\u0000\u0000ab\u0005t\u0000\u0000"+
		"b\u0016\u0001\u0000\u0000\u0000cd\u0005S\u0000\u0000de\u0005t\u0000\u0000"+
		"ef\u0005r\u0000\u0000fg\u0005i\u0000\u0000gh\u0005n\u0000\u0000hi\u0005"+
		"g\u0000\u0000i\u0018\u0001\u0000\u0000\u0000jk\u0005l\u0000\u0000kl\u0005"+
		"i\u0000\u0000lm\u0005s\u0000\u0000mn\u0005t\u0000\u0000n\u001a\u0001\u0000"+
		"\u0000\u0000op\u0005(\u0000\u0000p\u001c\u0001\u0000\u0000\u0000qr\u0005"+
		")\u0000\u0000r\u001e\u0001\u0000\u0000\u0000st\u0005=\u0000\u0000t \u0001"+
		"\u0000\u0000\u0000uv\u0005;\u0000\u0000v\"\u0001\u0000\u0000\u0000wx\u0005"+
		"[\u0000\u0000x$\u0001\u0000\u0000\u0000yz\u0005]\u0000\u0000z&\u0001\u0000"+
		"\u0000\u0000{|\u0005,\u0000\u0000|(\u0001\u0000\u0000\u0000}~\u0005{\u0000"+
		"\u0000~*\u0001\u0000\u0000\u0000\u007f\u0080\u0005}\u0000\u0000\u0080"+
		",\u0001\u0000\u0000\u0000\u0081\u0082\u0005r\u0000\u0000\u0082\u0083\u0005"+
		"e\u0000\u0000\u0083\u0084\u0005t\u0000\u0000\u0084\u0085\u0005u\u0000"+
		"\u0000\u0085\u0086\u0005r\u0000\u0000\u0086\u0087\u0005n\u0000\u0000\u0087"+
		".\u0001\u0000\u0000\u0000\u0088\u008a\u0007\u0002\u0000\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c0\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0007\u0002\u0000\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0005.\u0000\u0000\u0093\u0095\u0007\u0002"+
		"\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u00972\u0001\u0000\u0000\u0000\u0098\u009a\u0005\"\u0000"+
		"\u0000\u0099\u009b\b\u0003\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a7\u0005\"\u0000\u0000\u009f\u00a1\u0005\'\u0000\u0000\u00a0"+
		"\u00a2\b\u0004\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0005\'\u0000\u0000\u00a6\u0098\u0001\u0000\u0000\u0000\u00a6\u009f\u0001"+
		"\u0000\u0000\u0000\u00a74\u0001\u0000\u0000\u0000\t\u0000<M\u008b\u0090"+
		"\u0096\u009c\u00a3\u00a6\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}