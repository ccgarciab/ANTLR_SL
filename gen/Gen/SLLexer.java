// Generated from C:/Users/z004hkjh/IdeaProjects/SL/grammar\SL.g4 by ANTLR 4.10.1
package Gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, RETORNA=40, OP_COMPARACION=41, OP_SUMA=42, LITERAL_NUMERICO=43, 
		LITERAL_CADENA=44, LITERAL_LOGICO=45, IDENTIFICADOR=46, COMENTARIO_MULTILINEA=47, 
		COMENTARIO_LINEA=48, ESPACIO=49, OP_MUL=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "RETORNA", "OP_COMPARACION", 
			"OP_SUMA", "LITERAL_NUMERICO", "ESCAPE_COMILLA", "CONTENIDO_CADENA", 
			"LITERAL_CADENA", "LITERAL_LOGICO", "IDENTIFICADOR", "COMENTARIO_MULTILINEA", 
			"COMENTARIO_LINEA", "ESPACIO", "OP_MUL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fin'", "'var'", "'variables'", "'const'", 
			"'constantes'", "'tipos'", "':'", "';'", "','", "'='", "'numerico'", 
			"'logico'", "'cadena'", "'vector'", "'['", "'*'", "']'", "'matriz'", 
			"'si'", "'{'", "'sino'", "'}'", "'('", "')'", "'mientras'", "'repetir'", 
			"'hasta'", "'eval'", "'caso'", "'desde'", "'paso'", "'or'", "'and'", 
			"'not'", "'^'", "'ref'", "'subrutina'", "'retorna'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "RETORNA", "OP_COMPARACION", "OP_SUMA", "LITERAL_NUMERICO", 
			"LITERAL_CADENA", "LITERAL_LOGICO", "IDENTIFICADOR", "COMENTARIO_MULTILINEA", 
			"COMENTARIO_LINEA", "ESPACIO", "OP_MUL"
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


	public SLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SL.g4"; }

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
		"\u0004\u00002\u01ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u013f\b(\u0001"+
		")\u0001)\u0001*\u0003*\u0144\b*\u0001*\u0004*\u0147\b*\u000b*\f*\u0148"+
		"\u0001*\u0001*\u0004*\u014d\b*\u000b*\f*\u014e\u0003*\u0151\b*\u0001*"+
		"\u0001*\u0003*\u0155\b*\u0001*\u0004*\u0158\b*\u000b*\f*\u0159\u0003*"+
		"\u015c\b*\u0001+\u0001+\u0001+\u0001+\u0003+\u0162\b+\u0001,\u0001,\u0005"+
		",\u0166\b,\n,\f,\u0169\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u0173\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0182\b.\u0001/\u0001"+
		"/\u0005/\u0186\b/\n/\f/\u0189\t/\u00010\u00010\u00010\u00010\u00050\u018f"+
		"\b0\n0\f0\u0192\t0\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00051\u019d\b1\n1\f1\u01a0\t1\u00011\u00011\u00011\u00011\u0001"+
		"2\u00042\u01a7\b2\u000b2\f2\u01a8\u00012\u00012\u00013\u00013\u0003\u0167"+
		"\u0190\u019e\u00004\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W\u0000Y\u0000[,]-_.a/c0e1g2\u0001\u0000"+
		"\b\u0002\u0000++--\u0001\u000009\u0002\u0000EEee\u0002\u0000\n\n\r\r\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0003\u0000%%*"+
		"*//\u01c2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
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
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000"+
		"\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000"+
		"a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001"+
		"\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0001i\u0001\u0000\u0000"+
		"\u0000\u0003r\u0001\u0000\u0000\u0000\u0005y\u0001\u0000\u0000\u0000\u0007"+
		"}\u0001\u0000\u0000\u0000\t\u0081\u0001\u0000\u0000\u0000\u000b\u008b"+
		"\u0001\u0000\u0000\u0000\r\u0091\u0001\u0000\u0000\u0000\u000f\u009c\u0001"+
		"\u0000\u0000\u0000\u0011\u00a2\u0001\u0000\u0000\u0000\u0013\u00a4\u0001"+
		"\u0000\u0000\u0000\u0015\u00a6\u0001\u0000\u0000\u0000\u0017\u00a8\u0001"+
		"\u0000\u0000\u0000\u0019\u00aa\u0001\u0000\u0000\u0000\u001b\u00b3\u0001"+
		"\u0000\u0000\u0000\u001d\u00ba\u0001\u0000\u0000\u0000\u001f\u00c1\u0001"+
		"\u0000\u0000\u0000!\u00c8\u0001\u0000\u0000\u0000#\u00ca\u0001\u0000\u0000"+
		"\u0000%\u00cc\u0001\u0000\u0000\u0000\'\u00ce\u0001\u0000\u0000\u0000"+
		")\u00d5\u0001\u0000\u0000\u0000+\u00d8\u0001\u0000\u0000\u0000-\u00da"+
		"\u0001\u0000\u0000\u0000/\u00df\u0001\u0000\u0000\u00001\u00e1\u0001\u0000"+
		"\u0000\u00003\u00e3\u0001\u0000\u0000\u00005\u00e5\u0001\u0000\u0000\u0000"+
		"7\u00ee\u0001\u0000\u0000\u00009\u00f6\u0001\u0000\u0000\u0000;\u00fc"+
		"\u0001\u0000\u0000\u0000=\u0101\u0001\u0000\u0000\u0000?\u0106\u0001\u0000"+
		"\u0000\u0000A\u010c\u0001\u0000\u0000\u0000C\u0111\u0001\u0000\u0000\u0000"+
		"E\u0114\u0001\u0000\u0000\u0000G\u0118\u0001\u0000\u0000\u0000I\u011c"+
		"\u0001\u0000\u0000\u0000K\u011e\u0001\u0000\u0000\u0000M\u0122\u0001\u0000"+
		"\u0000\u0000O\u012c\u0001\u0000\u0000\u0000Q\u013e\u0001\u0000\u0000\u0000"+
		"S\u0140\u0001\u0000\u0000\u0000U\u0143\u0001\u0000\u0000\u0000W\u0161"+
		"\u0001\u0000\u0000\u0000Y\u0167\u0001\u0000\u0000\u0000[\u0172\u0001\u0000"+
		"\u0000\u0000]\u0181\u0001\u0000\u0000\u0000_\u0183\u0001\u0000\u0000\u0000"+
		"a\u018a\u0001\u0000\u0000\u0000c\u0198\u0001\u0000\u0000\u0000e\u01a6"+
		"\u0001\u0000\u0000\u0000g\u01ac\u0001\u0000\u0000\u0000ij\u0005p\u0000"+
		"\u0000jk\u0005r\u0000\u0000kl\u0005o\u0000\u0000lm\u0005g\u0000\u0000"+
		"mn\u0005r\u0000\u0000no\u0005a\u0000\u0000op\u0005m\u0000\u0000pq\u0005"+
		"a\u0000\u0000q\u0002\u0001\u0000\u0000\u0000rs\u0005i\u0000\u0000st\u0005"+
		"n\u0000\u0000tu\u0005i\u0000\u0000uv\u0005c\u0000\u0000vw\u0005i\u0000"+
		"\u0000wx\u0005o\u0000\u0000x\u0004\u0001\u0000\u0000\u0000yz\u0005f\u0000"+
		"\u0000z{\u0005i\u0000\u0000{|\u0005n\u0000\u0000|\u0006\u0001\u0000\u0000"+
		"\u0000}~\u0005v\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f\u0080\u0005"+
		"r\u0000\u0000\u0080\b\u0001\u0000\u0000\u0000\u0081\u0082\u0005v\u0000"+
		"\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0084\u0005r\u0000\u0000\u0084"+
		"\u0085\u0005i\u0000\u0000\u0085\u0086\u0005a\u0000\u0000\u0086\u0087\u0005"+
		"b\u0000\u0000\u0087\u0088\u0005l\u0000\u0000\u0088\u0089\u0005e\u0000"+
		"\u0000\u0089\u008a\u0005s\u0000\u0000\u008a\n\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005c\u0000\u0000\u008c\u008d\u0005o\u0000\u0000\u008d\u008e"+
		"\u0005n\u0000\u0000\u008e\u008f\u0005s\u0000\u0000\u008f\u0090\u0005t"+
		"\u0000\u0000\u0090\f\u0001\u0000\u0000\u0000\u0091\u0092\u0005c\u0000"+
		"\u0000\u0092\u0093\u0005o\u0000\u0000\u0093\u0094\u0005n\u0000\u0000\u0094"+
		"\u0095\u0005s\u0000\u0000\u0095\u0096\u0005t\u0000\u0000\u0096\u0097\u0005"+
		"a\u0000\u0000\u0097\u0098\u0005n\u0000\u0000\u0098\u0099\u0005t\u0000"+
		"\u0000\u0099\u009a\u0005e\u0000\u0000\u009a\u009b\u0005s\u0000\u0000\u009b"+
		"\u000e\u0001\u0000\u0000\u0000\u009c\u009d\u0005t\u0000\u0000\u009d\u009e"+
		"\u0005i\u0000\u0000\u009e\u009f\u0005p\u0000\u0000\u009f\u00a0\u0005o"+
		"\u0000\u0000\u00a0\u00a1\u0005s\u0000\u0000\u00a1\u0010\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005:\u0000\u0000\u00a3\u0012\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005;\u0000\u0000\u00a5\u0014\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005,\u0000\u0000\u00a7\u0016\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005=\u0000\u0000\u00a9\u0018\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"n\u0000\u0000\u00ab\u00ac\u0005u\u0000\u0000\u00ac\u00ad\u0005m\u0000"+
		"\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae\u00af\u0005r\u0000\u0000\u00af"+
		"\u00b0\u0005i\u0000\u0000\u00b0\u00b1\u0005c\u0000\u0000\u00b1\u00b2\u0005"+
		"o\u0000\u0000\u00b2\u001a\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005l\u0000"+
		"\u0000\u00b4\u00b5\u0005o\u0000\u0000\u00b5\u00b6\u0005g\u0000\u0000\u00b6"+
		"\u00b7\u0005i\u0000\u0000\u00b7\u00b8\u0005c\u0000\u0000\u00b8\u00b9\u0005"+
		"o\u0000\u0000\u00b9\u001c\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005c\u0000"+
		"\u0000\u00bb\u00bc\u0005a\u0000\u0000\u00bc\u00bd\u0005d\u0000\u0000\u00bd"+
		"\u00be\u0005e\u0000\u0000\u00be\u00bf\u0005n\u0000\u0000\u00bf\u00c0\u0005"+
		"a\u0000\u0000\u00c0\u001e\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005v\u0000"+
		"\u0000\u00c2\u00c3\u0005e\u0000\u0000\u00c3\u00c4\u0005c\u0000\u0000\u00c4"+
		"\u00c5\u0005t\u0000\u0000\u00c5\u00c6\u0005o\u0000\u0000\u00c6\u00c7\u0005"+
		"r\u0000\u0000\u00c7 \u0001\u0000\u0000\u0000\u00c8\u00c9\u0005[\u0000"+
		"\u0000\u00c9\"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005*\u0000\u0000"+
		"\u00cb$\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005]\u0000\u0000\u00cd&"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005m\u0000\u0000\u00cf\u00d0\u0005"+
		"a\u0000\u0000\u00d0\u00d1\u0005t\u0000\u0000\u00d1\u00d2\u0005r\u0000"+
		"\u0000\u00d2\u00d3\u0005i\u0000\u0000\u00d3\u00d4\u0005z\u0000\u0000\u00d4"+
		"(\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005s\u0000\u0000\u00d6\u00d7\u0005"+
		"i\u0000\u0000\u00d7*\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005{\u0000"+
		"\u0000\u00d9,\u0001\u0000\u0000\u0000\u00da\u00db\u0005s\u0000\u0000\u00db"+
		"\u00dc\u0005i\u0000\u0000\u00dc\u00dd\u0005n\u0000\u0000\u00dd\u00de\u0005"+
		"o\u0000\u0000\u00de.\u0001\u0000\u0000\u0000\u00df\u00e0\u0005}\u0000"+
		"\u0000\u00e00\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005(\u0000\u0000\u00e2"+
		"2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005)\u0000\u0000\u00e44\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005m\u0000\u0000\u00e6\u00e7\u0005i\u0000"+
		"\u0000\u00e7\u00e8\u0005e\u0000\u0000\u00e8\u00e9\u0005n\u0000\u0000\u00e9"+
		"\u00ea\u0005t\u0000\u0000\u00ea\u00eb\u0005r\u0000\u0000\u00eb\u00ec\u0005"+
		"a\u0000\u0000\u00ec\u00ed\u0005s\u0000\u0000\u00ed6\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0005r\u0000\u0000\u00ef\u00f0\u0005e\u0000\u0000\u00f0"+
		"\u00f1\u0005p\u0000\u0000\u00f1\u00f2\u0005e\u0000\u0000\u00f2\u00f3\u0005"+
		"t\u0000\u0000\u00f3\u00f4\u0005i\u0000\u0000\u00f4\u00f5\u0005r\u0000"+
		"\u0000\u00f58\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005h\u0000\u0000\u00f7"+
		"\u00f8\u0005a\u0000\u0000\u00f8\u00f9\u0005s\u0000\u0000\u00f9\u00fa\u0005"+
		"t\u0000\u0000\u00fa\u00fb\u0005a\u0000\u0000\u00fb:\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005e\u0000\u0000\u00fd\u00fe\u0005v\u0000\u0000\u00fe"+
		"\u00ff\u0005a\u0000\u0000\u00ff\u0100\u0005l\u0000\u0000\u0100<\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005c\u0000\u0000\u0102\u0103\u0005a\u0000"+
		"\u0000\u0103\u0104\u0005s\u0000\u0000\u0104\u0105\u0005o\u0000\u0000\u0105"+
		">\u0001\u0000\u0000\u0000\u0106\u0107\u0005d\u0000\u0000\u0107\u0108\u0005"+
		"e\u0000\u0000\u0108\u0109\u0005s\u0000\u0000\u0109\u010a\u0005d\u0000"+
		"\u0000\u010a\u010b\u0005e\u0000\u0000\u010b@\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005p\u0000\u0000\u010d\u010e\u0005a\u0000\u0000\u010e\u010f\u0005"+
		"s\u0000\u0000\u010f\u0110\u0005o\u0000\u0000\u0110B\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005o\u0000\u0000\u0112\u0113\u0005r\u0000\u0000\u0113"+
		"D\u0001\u0000\u0000\u0000\u0114\u0115\u0005a\u0000\u0000\u0115\u0116\u0005"+
		"n\u0000\u0000\u0116\u0117\u0005d\u0000\u0000\u0117F\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0005n\u0000\u0000\u0119\u011a\u0005o\u0000\u0000\u011a"+
		"\u011b\u0005t\u0000\u0000\u011bH\u0001\u0000\u0000\u0000\u011c\u011d\u0005"+
		"^\u0000\u0000\u011dJ\u0001\u0000\u0000\u0000\u011e\u011f\u0005r\u0000"+
		"\u0000\u011f\u0120\u0005e\u0000\u0000\u0120\u0121\u0005f\u0000\u0000\u0121"+
		"L\u0001\u0000\u0000\u0000\u0122\u0123\u0005s\u0000\u0000\u0123\u0124\u0005"+
		"u\u0000\u0000\u0124\u0125\u0005b\u0000\u0000\u0125\u0126\u0005r\u0000"+
		"\u0000\u0126\u0127\u0005u\u0000\u0000\u0127\u0128\u0005t\u0000\u0000\u0128"+
		"\u0129\u0005i\u0000\u0000\u0129\u012a\u0005n\u0000\u0000\u012a\u012b\u0005"+
		"a\u0000\u0000\u012bN\u0001\u0000\u0000\u0000\u012c\u012d\u0005r\u0000"+
		"\u0000\u012d\u012e\u0005e\u0000\u0000\u012e\u012f\u0005t\u0000\u0000\u012f"+
		"\u0130\u0005o\u0000\u0000\u0130\u0131\u0005r\u0000\u0000\u0131\u0132\u0005"+
		"n\u0000\u0000\u0132\u0133\u0005a\u0000\u0000\u0133P\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0005=\u0000\u0000\u0135\u013f\u0005=\u0000\u0000\u0136"+
		"\u0137\u0005<\u0000\u0000\u0137\u013f\u0005>\u0000\u0000\u0138\u013f\u0005"+
		"<\u0000\u0000\u0139\u013a\u0005<\u0000\u0000\u013a\u013f\u0005=\u0000"+
		"\u0000\u013b\u013f\u0005>\u0000\u0000\u013c\u013d\u0005>\u0000\u0000\u013d"+
		"\u013f\u0005=\u0000\u0000\u013e\u0134\u0001\u0000\u0000\u0000\u013e\u0136"+
		"\u0001\u0000\u0000\u0000\u013e\u0138\u0001\u0000\u0000\u0000\u013e\u0139"+
		"\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013fR\u0001\u0000\u0000\u0000\u0140\u0141\u0007"+
		"\u0000\u0000\u0000\u0141T\u0001\u0000\u0000\u0000\u0142\u0144\u0005-\u0000"+
		"\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000"+
		"\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0147\u0007\u0001\u0000"+
		"\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000"+
		"\u0000\u0149\u0150\u0001\u0000\u0000\u0000\u014a\u014c\u0005.\u0000\u0000"+
		"\u014b\u014d\u0007\u0001\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000"+
		"\u0150\u014a\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151\u015b\u0001\u0000\u0000\u0000\u0152\u0154\u0007\u0002\u0000\u0000"+
		"\u0153\u0155\u0007\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000"+
		"\u0156\u0158\u0007\u0001\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000"+
		"\u015b\u0152\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015cV\u0001\u0000\u0000\u0000\u015d\u015e\u0005\\\u0000\u0000\u015e"+
		"\u0162\u0005\"\u0000\u0000\u015f\u0160\u0005\\\u0000\u0000\u0160\u0162"+
		"\u0005\'\u0000\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0162X\u0001\u0000\u0000\u0000\u0163\u0166\u0003W+"+
		"\u0000\u0164\u0166\b\u0003\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000"+
		"\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000"+
		"\u0168Z\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005\"\u0000\u0000\u016b\u016c\u0003Y,\u0000\u016c\u016d\u0005"+
		"\"\u0000\u0000\u016d\u0173\u0001\u0000\u0000\u0000\u016e\u016f\u0005\'"+
		"\u0000\u0000\u016f\u0170\u0003Y,\u0000\u0170\u0171\u0005\'\u0000\u0000"+
		"\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u016a\u0001\u0000\u0000\u0000"+
		"\u0172\u016e\u0001\u0000\u0000\u0000\u0173\\\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0005T\u0000\u0000\u0175\u0176\u0005R\u0000\u0000\u0176\u0177\u0005"+
		"U\u0000\u0000\u0177\u0182\u0005E\u0000\u0000\u0178\u0179\u0005F\u0000"+
		"\u0000\u0179\u017a\u0005A\u0000\u0000\u017a\u017b\u0005L\u0000\u0000\u017b"+
		"\u017c\u0005S\u0000\u0000\u017c\u0182\u0005E\u0000\u0000\u017d\u017e\u0005"+
		"S\u0000\u0000\u017e\u0182\u0005I\u0000\u0000\u017f\u0180\u0005N\u0000"+
		"\u0000\u0180\u0182\u0005O\u0000\u0000\u0181\u0174\u0001\u0000\u0000\u0000"+
		"\u0181\u0178\u0001\u0000\u0000\u0000\u0181\u017d\u0001\u0000\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0182^\u0001\u0000\u0000\u0000\u0183"+
		"\u0187\u0007\u0004\u0000\u0000\u0184\u0186\u0007\u0005\u0000\u0000\u0185"+
		"\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187"+
		"\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"`\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0005/\u0000\u0000\u018b\u018c\u0005*\u0000\u0000\u018c\u0190\u0001\u0000"+
		"\u0000\u0000\u018d\u018f\t\u0000\u0000\u0000\u018e\u018d\u0001\u0000\u0000"+
		"\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0194\u0005*\u0000\u0000"+
		"\u0194\u0195\u0005/\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u00060\u0000\u0000\u0197b\u0001\u0000\u0000\u0000\u0198\u0199\u0005"+
		"/\u0000\u0000\u0199\u019a\u0005/\u0000\u0000\u019a\u019e\u0001\u0000\u0000"+
		"\u0000\u019b\u019d\t\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000"+
		"\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000"+
		"\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0007\u0003\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u00061\u0000\u0000\u01a4"+
		"d\u0001\u0000\u0000\u0000\u01a5\u01a7\u0007\u0006\u0000\u0000\u01a6\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u00062\u0000\u0000\u01abf\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0007\u0007\u0000\u0000\u01adh\u0001\u0000\u0000"+
		"\u0000\u0012\u0000\u013e\u0143\u0148\u014e\u0150\u0154\u0159\u015b\u0161"+
		"\u0165\u0167\u0172\u0181\u0187\u0190\u019e\u01a8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}