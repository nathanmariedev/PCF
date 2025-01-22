// Generated from /Users/nathan/Documents/IMT/1A/NOYE/PCF/src/parser/PCF.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PCFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, OP1=12, OP2=13, LIT=14, VAR=15, WS=16, LINE_COMMENT=17, 
		MULTI_COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "OP1", "OP2", "LIT", "VAR", "WS", "LINE_COMMENT", "MULTI_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'ifz'", "'then'", "'else'", "'let'", "'='", "'in'", 
			"'fun'", "'->'", "'fix'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"OP1", "OP2", "LIT", "VAR", "WS", "LINE_COMMENT", "MULTI_COMMENT"
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


	public PCFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

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
		"\u0004\u0000\u0012\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\rS\b\r\n\r\f\rV\t\r\u0003"+
		"\rX\b\r\u0001\u000e\u0001\u000e\u0005\u000e\\\b\u000e\n\u000e\f\u000e"+
		"_\t\u000e\u0001\u000f\u0004\u000fb\b\u000f\u000b\u000f\f\u000fc\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010l\b\u0010\n\u0010\f\u0010o\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011y\b\u0011\n\u0011\f\u0011|\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0002mz\u0000\u0012\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012\u0001\u0000\u0007\u0002\u0000**//\u0002\u0000++--\u0001\u0000"+
		"19\u0001\u000009\u0001\u0000az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r"+
		"  \u0087\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001"+
		"\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000"+
		"\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000\u0000"+
		"\u000b7\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f=\u0001"+
		"\u0000\u0000\u0000\u0011@\u0001\u0000\u0000\u0000\u0013D\u0001\u0000\u0000"+
		"\u0000\u0015G\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019"+
		"M\u0001\u0000\u0000\u0000\u001bW\u0001\u0000\u0000\u0000\u001dY\u0001"+
		"\u0000\u0000\u0000\u001fa\u0001\u0000\u0000\u0000!g\u0001\u0000\u0000"+
		"\u0000#t\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000&\u0002\u0001\u0000"+
		"\u0000\u0000\'(\u0005)\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005"+
		"i\u0000\u0000*+\u0005f\u0000\u0000+,\u0005z\u0000\u0000,\u0006\u0001\u0000"+
		"\u0000\u0000-.\u0005t\u0000\u0000./\u0005h\u0000\u0000/0\u0005e\u0000"+
		"\u000001\u0005n\u0000\u00001\b\u0001\u0000\u0000\u000023\u0005e\u0000"+
		"\u000034\u0005l\u0000\u000045\u0005s\u0000\u000056\u0005e\u0000\u0000"+
		"6\n\u0001\u0000\u0000\u000078\u0005l\u0000\u000089\u0005e\u0000\u0000"+
		"9:\u0005t\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0005=\u0000\u0000"+
		"<\u000e\u0001\u0000\u0000\u0000=>\u0005i\u0000\u0000>?\u0005n\u0000\u0000"+
		"?\u0010\u0001\u0000\u0000\u0000@A\u0005f\u0000\u0000AB\u0005u\u0000\u0000"+
		"BC\u0005n\u0000\u0000C\u0012\u0001\u0000\u0000\u0000DE\u0005-\u0000\u0000"+
		"EF\u0005>\u0000\u0000F\u0014\u0001\u0000\u0000\u0000GH\u0005f\u0000\u0000"+
		"HI\u0005i\u0000\u0000IJ\u0005x\u0000\u0000J\u0016\u0001\u0000\u0000\u0000"+
		"KL\u0007\u0000\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MN\u0007\u0001"+
		"\u0000\u0000N\u001a\u0001\u0000\u0000\u0000OX\u00050\u0000\u0000PT\u0007"+
		"\u0002\u0000\u0000QS\u0007\u0003\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WO\u0001\u0000"+
		"\u0000\u0000WP\u0001\u0000\u0000\u0000X\u001c\u0001\u0000\u0000\u0000"+
		"Y]\u0007\u0004\u0000\u0000Z\\\u0007\u0005\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\u001e\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"`b\u0007\u0006\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0006\u000f\u0000\u0000f \u0001\u0000\u0000\u0000gh\u0005"+
		"/\u0000\u0000hi\u0005/\u0000\u0000im\u0001\u0000\u0000\u0000jl\t\u0000"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pq\u0005\n\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0006\u0010\u0000\u0000s\"\u0001\u0000\u0000\u0000tu\u0005/\u0000\u0000"+
		"uv\u0005*\u0000\u0000vz\u0001\u0000\u0000\u0000wy\t\u0000\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}~\u0005*\u0000\u0000~\u007f\u0005/\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0006\u0011\u0000\u0000\u0081$\u0001"+
		"\u0000\u0000\u0000\u0007\u0000TW]cmz\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}