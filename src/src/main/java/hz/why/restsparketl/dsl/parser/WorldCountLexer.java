// Generated from /Users/dxy_why/Documents/workspace/RestSparkEtl/src/src/main/java/hz/why/restsparketl/dsl/resources/WorldCount.g4 by ANTLR 4.7
package hz.why.restsparketl.dsl.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WorldCountLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FILETYPE=6, TABLENAME=7, NUM=8, 
		BACKQUOTED_IDENTIFIER=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "FILETYPE", "TABLENAME", "NUM", 
		"BACKQUOTED_IDENTIFIER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'create'", "'.'", "'as'", "'show'", "'count'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "FILETYPE", "TABLENAME", "NUM", "BACKQUOTED_IDENTIFIER", 
		"WS"
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


	public WorldCountLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WorldCount.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 9:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fS\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\66\n\7\3\b"+
		"\6\b9\n\b\r\b\16\b:\3\t\6\t>\n\t\r\t\16\t?\3\n\3\n\3\n\3\n\7\nF\n\n\f"+
		"\n\16\nI\13\n\3\n\3\n\3\13\6\13N\n\13\r\13\16\13O\3\13\3\13\2\2\f\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\5\4\2C\\c|\3\2bb\5\2\13"+
		"\f\17\17\"\"\2X\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\3\27\3\2\2\2\5\36\3\2\2\2\7 \3\2\2\2\t#\3\2\2\2\13(\3\2\2\2\r\65\3\2"+
		"\2\2\178\3\2\2\2\21=\3\2\2\2\23A\3\2\2\2\25M\3\2\2\2\27\30\7e\2\2\30\31"+
		"\7t\2\2\31\32\7g\2\2\32\33\7c\2\2\33\34\7v\2\2\34\35\7g\2\2\35\4\3\2\2"+
		"\2\36\37\7\60\2\2\37\6\3\2\2\2 !\7c\2\2!\"\7u\2\2\"\b\3\2\2\2#$\7u\2\2"+
		"$%\7j\2\2%&\7q\2\2&\'\7y\2\2\'\n\3\2\2\2()\7e\2\2)*\7q\2\2*+\7w\2\2+,"+
		"\7p\2\2,-\7v\2\2-\f\3\2\2\2./\7e\2\2/\60\7u\2\2\60\66\7x\2\2\61\62\7v"+
		"\2\2\62\63\7g\2\2\63\64\7z\2\2\64\66\7v\2\2\65.\3\2\2\2\65\61\3\2\2\2"+
		"\66\16\3\2\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;"+
		"\20\3\2\2\2<>\4\62;\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\22\3\2"+
		"\2\2AG\7b\2\2BF\n\3\2\2CD\7b\2\2DF\7b\2\2EB\3\2\2\2EC\3\2\2\2FI\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7b\2\2K\24\3\2\2\2LN\t\4"+
		"\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\b\13\2\2R\26"+
		"\3\2\2\2\t\2\65:?EGO\3\3\13\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}