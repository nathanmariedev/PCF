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
		T__0=1, T__1=2, T__2=3, OP=4, LIT=5, WS=6, LINE_COMMENT=7, MULTI_COMMENT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "OP", "LIT", "WS", "LINE_COMMENT", "MULTI_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ifz'", "'then'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "OP", "LIT", "WS", "LINE_COMMENT", "MULTI_COMMENT"
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
		"\u0004\u0000\bM\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004%\b\u0004\n\u0004\f\u0004(\t\u0004"+
		"\u0003\u0004*\b\u0004\u0001\u0005\u0004\u0005-\b\u0005\u000b\u0005\f\u0005"+
		".\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u00067\b\u0006\n\u0006\f\u0006:\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007D\b\u0007\n\u0007\f\u0007G\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u00028E\u0000\b\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001"+
		"\u0000\u0004\u0003\u0000*+--//\u0001\u000019\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  Q\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0001\u0011\u0001\u0000\u0000\u0000\u0003\u0015\u0001\u0000\u0000\u0000"+
		"\u0005\u001a\u0001\u0000\u0000\u0000\u0007\u001f\u0001\u0000\u0000\u0000"+
		"\t)\u0001\u0000\u0000\u0000\u000b,\u0001\u0000\u0000\u0000\r2\u0001\u0000"+
		"\u0000\u0000\u000f?\u0001\u0000\u0000\u0000\u0011\u0012\u0005i\u0000\u0000"+
		"\u0012\u0013\u0005f\u0000\u0000\u0013\u0014\u0005z\u0000\u0000\u0014\u0002"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0005t\u0000\u0000\u0016\u0017\u0005"+
		"h\u0000\u0000\u0017\u0018\u0005e\u0000\u0000\u0018\u0019\u0005n\u0000"+
		"\u0000\u0019\u0004\u0001\u0000\u0000\u0000\u001a\u001b\u0005e\u0000\u0000"+
		"\u001b\u001c\u0005l\u0000\u0000\u001c\u001d\u0005s\u0000\u0000\u001d\u001e"+
		"\u0005e\u0000\u0000\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0007\u0000"+
		"\u0000\u0000 \b\u0001\u0000\u0000\u0000!*\u00050\u0000\u0000\"&\u0007"+
		"\u0001\u0000\u0000#%\u0007\u0002\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)!\u0001\u0000"+
		"\u0000\u0000)\"\u0001\u0000\u0000\u0000*\n\u0001\u0000\u0000\u0000+-\u0007"+
		"\u0003\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000001\u0006\u0005\u0000\u00001\f\u0001\u0000\u0000\u000023\u0005/\u0000"+
		"\u000034\u0005/\u0000\u000048\u0001\u0000\u0000\u000057\t\u0000\u0000"+
		"\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;<\u0005\n\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0006"+
		"\u0006\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005/\u0000\u0000"+
		"@A\u0005*\u0000\u0000AE\u0001\u0000\u0000\u0000BD\t\u0000\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000HI\u0005*\u0000\u0000IJ\u0005/\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KL\u0006\u0007\u0000\u0000L\u0010\u0001\u0000\u0000\u0000\u0006"+
		"\u0000&).8E\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}