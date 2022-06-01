// Generated from C:/Users/z004hkjh/IdeaProjects/SL/grammar\SL.g4 by ANTLR 4.10.1
package Gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, OP_COMPARACION=45, 
		OP_SUMA=46, LITERAL_NUMERICO=47, LITERAL_CADENA=48, LITERAL_LOGICO=49, 
		IDENTIFICADOR=50, COMENTARIO_MULTILINEA=51, COMENTARIO_LINEA=52, ESPACIO=53;
	public static final int
		RULE_inicial = 0, RULE_programa = 1, RULE_nombre_programa = 2, RULE_programa_principal = 3, 
		RULE_declaraciones = 4, RULE_tipos = 5, RULE_vars = 6, RULE_consts = 7, 
		RULE_cuerpo_principal = 8, RULE_var_kw = 9, RULE_const_kw = 10, RULE_tipos_kw = 11, 
		RULE_decl_tipo = 12, RULE_decl_vars = 13, RULE_decl_const = 14, RULE_tipo = 15, 
		RULE_tipo_escalar = 16, RULE_tipo_registro = 17, RULE_tipo_vector = 18, 
		RULE_tipo_matriz = 19, RULE_dimensiones_variables = 20, RULE_dimensiones_fijas = 21, 
		RULE_dimension = 22, RULE_literal = 23, RULE_sentencia = 24, RULE_si = 25, 
		RULE_sino_si = 26, RULE_condicion = 27, RULE_mientras = 28, RULE_repetir_hasta = 29, 
		RULE_eval = 30, RULE_desde = 31, RULE_asignacion = 32, RULE_expr = 33, 
		RULE_disyuncion = 34, RULE_conjuncion = 35, RULE_negacion = 36, RULE_comparacion = 37, 
		RULE_termino = 38, RULE_factor = 39, RULE_expr_signo = 40, RULE_potencia = 41, 
		RULE_acceso = 42, RULE_primario = 43, RULE_argumentos = 44, RULE_literal_compuesto = 45, 
		RULE_procedimiento = 46, RULE_parametros = 47, RULE_lista_parametros = 48, 
		RULE_encabezado = 49, RULE_retorno = 50, RULE_subrutina = 51, RULE_funcion = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicial", "programa", "nombre_programa", "programa_principal", "declaraciones", 
			"tipos", "vars", "consts", "cuerpo_principal", "var_kw", "const_kw", 
			"tipos_kw", "decl_tipo", "decl_vars", "decl_const", "tipo", "tipo_escalar", 
			"tipo_registro", "tipo_vector", "tipo_matriz", "dimensiones_variables", 
			"dimensiones_fijas", "dimension", "literal", "sentencia", "si", "sino_si", 
			"condicion", "mientras", "repetir_hasta", "eval", "desde", "asignacion", 
			"expr", "disyuncion", "conjuncion", "negacion", "comparacion", "termino", 
			"factor", "expr_signo", "potencia", "acceso", "primario", "argumentos", 
			"literal_compuesto", "procedimiento", "parametros", "lista_parametros", 
			"encabezado", "retorno", "subrutina", "funcion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fin'", "'var'", "'variables'", "'const'", 
			"'constantes'", "'tipos'", "':'", "';'", "','", "'='", "'numerico'", 
			"'logico'", "'cadena'", "'registro'", "'{'", "'}'", "'vector'", "'['", 
			"'*'", "']'", "'matriz'", "'si'", "'sino'", "'('", "')'", "'mientras'", 
			"'repetir'", "'hasta'", "'eval'", "'caso'", "'desde'", "'paso'", "'or'", 
			"'and'", "'not'", "'/'", "'%'", "'^'", "'.'", "'ref'", "'subrutina'", 
			"'retorna'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "OP_COMPARACION", 
			"OP_SUMA", "LITERAL_NUMERICO", "LITERAL_CADENA", "LITERAL_LOGICO", "IDENTIFICADOR", 
			"COMENTARIO_MULTILINEA", "COMENTARIO_LINEA", "ESPACIO"
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
	public String getGrammarFileName() { return "SL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicialContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SLParser.EOF, 0); }
		public List<ProcedimientoContext> procedimiento() {
			return getRuleContexts(ProcedimientoContext.class);
		}
		public ProcedimientoContext procedimiento(int i) {
			return getRuleContext(ProcedimientoContext.class,i);
		}
		public InicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitInicial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitInicial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicialContext inicial() throws RecognitionException {
		InicialContext _localctx = new InicialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			programa();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(107);
				procedimiento();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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

	public static class ProgramaContext extends ParserRuleContext {
		public Programa_principalContext programa_principal() {
			return getRuleContext(Programa_principalContext.class,0);
		}
		public Nombre_programaContext nombre_programa() {
			return getRuleContext(Nombre_programaContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(115);
				nombre_programa();
				}
			}

			setState(118);
			programa_principal();
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

	public static class Nombre_programaContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SLParser.IDENTIFICADOR, 0); }
		public Nombre_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNombre_programa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNombre_programa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNombre_programa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nombre_programaContext nombre_programa() throws RecognitionException {
		Nombre_programaContext _localctx = new Nombre_programaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nombre_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__0);
			setState(121);
			match(IDENTIFICADOR);
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

	public static class Programa_principalContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public Cuerpo_principalContext cuerpo_principal() {
			return getRuleContext(Cuerpo_principalContext.class,0);
		}
		public Programa_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterPrograma_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitPrograma_principal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitPrograma_principal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Programa_principalContext programa_principal() throws RecognitionException {
		Programa_principalContext _localctx = new Programa_principalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programa_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			declaraciones();
			setState(124);
			cuerpo_principal();
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public List<TiposContext> tipos() {
			return getRuleContexts(TiposContext.class);
		}
		public TiposContext tipos(int i) {
			return getRuleContext(TiposContext.class,i);
		}
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public List<ConstsContext> consts() {
			return getRuleContexts(ConstsContext.class);
		}
		public ConstsContext consts(int i) {
			return getRuleContext(ConstsContext.class,i);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(126);
					tipos();
					}
					break;
				case T__3:
				case T__4:
					{
					setState(127);
					vars();
					}
					break;
				case T__5:
				case T__6:
					{
					setState(128);
					consts();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(133);
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

	public static class TiposContext extends ParserRuleContext {
		public Tipos_kwContext tipos_kw() {
			return getRuleContext(Tipos_kwContext.class,0);
		}
		public List<Decl_tipoContext> decl_tipo() {
			return getRuleContexts(Decl_tipoContext.class);
		}
		public Decl_tipoContext decl_tipo(int i) {
			return getRuleContext(Decl_tipoContext.class,i);
		}
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			tipos_kw();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR) {
				{
				{
				setState(135);
				decl_tipo();
				}
				}
				setState(140);
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

	public static class VarsContext extends ParserRuleContext {
		public Var_kwContext var_kw() {
			return getRuleContext(Var_kwContext.class,0);
		}
		public List<Decl_varsContext> decl_vars() {
			return getRuleContexts(Decl_varsContext.class);
		}
		public Decl_varsContext decl_vars(int i) {
			return getRuleContext(Decl_varsContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			var_kw();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR) {
				{
				{
				setState(142);
				decl_vars();
				}
				}
				setState(147);
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

	public static class ConstsContext extends ParserRuleContext {
		public Const_kwContext const_kw() {
			return getRuleContext(Const_kwContext.class,0);
		}
		public List<Decl_constContext> decl_const() {
			return getRuleContexts(Decl_constContext.class);
		}
		public Decl_constContext decl_const(int i) {
			return getRuleContext(Decl_constContext.class,i);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_consts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			const_kw();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR) {
				{
				{
				setState(149);
				decl_const();
				}
				}
				setState(154);
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

	public static class Cuerpo_principalContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Cuerpo_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCuerpo_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCuerpo_principal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCuerpo_principal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo_principalContext cuerpo_principal() throws RecognitionException {
		Cuerpo_principalContext _localctx = new Cuerpo_principalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cuerpo_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__1);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(156);
				sentencia();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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

	public static class Var_kwContext extends ParserRuleContext {
		public Var_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterVar_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitVar_kw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitVar_kw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_kwContext var_kw() throws RecognitionException {
		Var_kwContext _localctx = new Var_kwContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_kw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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

	public static class Const_kwContext extends ParserRuleContext {
		public Const_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterConst_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitConst_kw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitConst_kw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_kwContext const_kw() throws RecognitionException {
		Const_kwContext _localctx = new Const_kwContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_const_kw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class Tipos_kwContext extends ParserRuleContext {
		public Tipos_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipos_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipos_kw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipos_kw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_kwContext tipos_kw() throws RecognitionException {
		Tipos_kwContext _localctx = new Tipos_kwContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipos_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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

	public static class Decl_tipoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SLParser.IDENTIFICADOR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Decl_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDecl_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDecl_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDecl_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_tipoContext decl_tipo() throws RecognitionException {
		Decl_tipoContext _localctx = new Decl_tipoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decl_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IDENTIFICADOR);
			setState(171);
			match(T__8);
			setState(172);
			tipo();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(173);
				match(T__9);
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

	public static class Decl_varsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SLParser.IDENTIFICADOR, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Decl_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDecl_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDecl_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDecl_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_varsContext decl_vars() throws RecognitionException {
		Decl_varsContext _localctx = new Decl_varsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decl_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IDENTIFICADOR);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(177);
				match(T__10);
				setState(178);
				match(IDENTIFICADOR);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(T__8);
			setState(185);
			tipo();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(186);
				match(T__9);
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

	public static class Decl_constContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SLParser.IDENTIFICADOR, i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Decl_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDecl_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDecl_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDecl_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_constContext decl_const() throws RecognitionException {
		Decl_constContext _localctx = new Decl_constContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decl_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IDENTIFICADOR);
			setState(190);
			match(T__11);
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case LITERAL_NUMERICO:
			case LITERAL_CADENA:
			case LITERAL_LOGICO:
				{
				setState(191);
				literal();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(192);
				match(IDENTIFICADOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(195);
				match(T__9);
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

	public static class TipoContext extends ParserRuleContext {
		public Tipo_escalarContext tipo_escalar() {
			return getRuleContext(Tipo_escalarContext.class,0);
		}
		public Tipo_vectorContext tipo_vector() {
			return getRuleContext(Tipo_vectorContext.class,0);
		}
		public Tipo_matrizContext tipo_matriz() {
			return getRuleContext(Tipo_matrizContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				tipo_escalar();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				tipo_vector();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				tipo_matriz();
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

	public static class Tipo_escalarContext extends ParserRuleContext {
		public Tipo_registroContext tipo_registro() {
			return getRuleContext(Tipo_registroContext.class,0);
		}
		public Tipo_escalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_escalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipo_escalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipo_escalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipo_escalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_escalarContext tipo_escalar() throws RecognitionException {
		Tipo_escalarContext _localctx = new Tipo_escalarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo_escalar);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				tipo_registro();
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

	public static class Tipo_registroContext extends ParserRuleContext {
		public List<Decl_tipoContext> decl_tipo() {
			return getRuleContexts(Decl_tipoContext.class);
		}
		public Decl_tipoContext decl_tipo(int i) {
			return getRuleContext(Decl_tipoContext.class,i);
		}
		public Tipo_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipo_registro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipo_registro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipo_registro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_registroContext tipo_registro() throws RecognitionException {
		Tipo_registroContext _localctx = new Tipo_registroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipo_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__15);
			setState(210);
			match(T__16);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR) {
				{
				{
				setState(211);
				decl_tipo();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(T__17);
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

	public static class Tipo_vectorContext extends ParserRuleContext {
		public Tipo_escalarContext tipo_escalar() {
			return getRuleContext(Tipo_escalarContext.class,0);
		}
		public TerminalNode LITERAL_NUMERICO() { return getToken(SLParser.LITERAL_NUMERICO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SLParser.IDENTIFICADOR, 0); }
		public Tipo_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipo_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipo_vector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipo_vector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_vectorContext tipo_vector() throws RecognitionException {
		Tipo_vectorContext _localctx = new Tipo_vectorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tipo_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__18);
			setState(220);
			match(T__19);
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << LITERAL_NUMERICO) | (1L << IDENTIFICADOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			match(T__21);
			setState(223);
			tipo_escalar();
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

	public static class Tipo_matrizContext extends ParserRuleContext {
		public Tipo_escalarContext tipo_escalar() {
			return getRuleContext(Tipo_escalarContext.class,0);
		}
		public Dimensiones_variablesContext dimensiones_variables() {
			return getRuleContext(Dimensiones_variablesContext.class,0);
		}
		public Dimensiones_fijasContext dimensiones_fijas() {
			return getRuleContext(Dimensiones_fijasContext.class,0);
		}
		public Tipo_matrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_matriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipo_matriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipo_matriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTipo_matriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_matrizContext tipo_matriz() throws RecognitionException {
		Tipo_matrizContext _localctx = new Tipo_matrizContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tipo_matriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__22);
			setState(226);
			match(T__19);
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(227);
				dimensiones_variables();
				}
				break;
			case LITERAL_NUMERICO:
			case IDENTIFICADOR:
				{
				setState(228);
				dimensiones_fijas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
			match(T__21);
			setState(232);
			tipo_escalar();
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

	public static class Dimensiones_variablesContext extends ParserRuleContext {
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public Dimensiones_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensiones_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDimensiones_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDimensiones_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDimensiones_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimensiones_variablesContext dimensiones_variables() throws RecognitionException {
		Dimensiones_variablesContext _localctx = new Dimensiones_variablesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dimensiones_variables);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__20);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					match(T__10);
					setState(236);
					match(T__20);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(242);
				match(T__10);
				setState(243);
				dimension();
				}
				}
				setState(248);
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

	public static class Dimensiones_fijasContext extends ParserRuleContext {
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public Dimensiones_fijasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensiones_fijas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDimensiones_fijas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDimensiones_fijas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDimensiones_fijas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimensiones_fijasContext dimensiones_fijas() throws RecognitionException {
		Dimensiones_fijasContext _localctx = new Dimensiones_fijasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dimensiones_fijas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			dimension();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(250);
				match(T__10);
				setState(251);
				dimension();
				}
				}
				setState(256);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode LITERAL_NUMERICO() { return getToken(SLParser.LITERAL_NUMERICO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SLParser.IDENTIFICADOR, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode LITERAL_NUMERICO() { return getToken(SLParser.LITERAL_NUMERICO, 0); }
		public TerminalNode LITERAL_CADENA() { return getToken(SLParser.LITERAL_CADENA, 0); }
		public TerminalNode LITERAL_LOGICO() { return getToken(SLParser.LITERAL_LOGICO, 0); }
		public Literal_compuestoContext literal_compuesto() {
			return getRuleContext(Literal_compuestoContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_NUMERICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(LITERAL_NUMERICO);
				}
				break;
			case LITERAL_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(LITERAL_CADENA);
				}
				break;
			case LITERAL_LOGICO:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(LITERAL_LOGICO);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				literal_compuesto();
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

	public static class SentenciaContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public Repetir_hastaContext repetir_hasta() {
			return getRuleContext(Repetir_hastaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DesdeContext desde() {
			return getRuleContext(DesdeContext.class,0);
		}
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(265);
				si();
				}
				break;
			case 2:
				{
				setState(266);
				mientras();
				}
				break;
			case 3:
				{
				setState(267);
				repetir_hasta();
				}
				break;
			case 4:
				{
				setState(268);
				asignacion();
				}
				break;
			case 5:
				{
				setState(269);
				desde();
				}
				break;
			case 6:
				{
				setState(270);
				eval();
				}
				break;
			case 7:
				{
				setState(271);
				expr();
				}
				break;
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(274);
				match(T__9);
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

	public static class SiContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<Sino_siContext> sino_si() {
			return getRuleContexts(Sino_siContext.class);
		}
		public Sino_siContext sino_si(int i) {
			return getRuleContext(Sino_siContext.class,i);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_si);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__23);
			setState(278);
			condicion();
			setState(279);
			match(T__16);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(280);
				sentencia();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(286);
						sino_si();
						}
						} 
					}
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(292);
				match(T__24);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
					{
					{
					setState(293);
					sentencia();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(301);
			match(T__17);
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

	public static class Sino_siContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Sino_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSino_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSino_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSino_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sino_siContext sino_si() throws RecognitionException {
		Sino_siContext _localctx = new Sino_siContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sino_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__24);
			setState(304);
			match(T__23);
			setState(305);
			condicion();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(306);
				sentencia();
				}
				}
				setState(311);
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

	public static class CondicionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__25);
			setState(313);
			expr();
			setState(314);
			match(T__26);
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

	public static class MientrasContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__27);
			setState(317);
			condicion();
			setState(318);
			match(T__16);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(319);
				sentencia();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(T__17);
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

	public static class Repetir_hastaContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Repetir_hastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir_hasta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterRepetir_hasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitRepetir_hasta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRepetir_hasta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repetir_hastaContext repetir_hasta() throws RecognitionException {
		Repetir_hastaContext _localctx = new Repetir_hastaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_repetir_hasta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__28);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(328);
				sentencia();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(T__29);
			setState(335);
			condicion();
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

	public static class EvalContext extends ParserRuleContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__30);
			setState(338);
			match(T__16);
			setState(347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(339);
				match(T__31);
				setState(340);
				condicion();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
					{
					{
					setState(341);
					sentencia();
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__31 );
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(351);
				match(T__24);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
					{
					{
					setState(352);
					sentencia();
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(360);
			match(T__17);
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

	public static class DesdeContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SLParser.IDENTIFICADOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public DesdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDesde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDesde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDesde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesdeContext desde() throws RecognitionException {
		DesdeContext _localctx = new DesdeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__32);
			setState(363);
			match(IDENTIFICADOR);
			setState(364);
			match(T__11);
			setState(365);
			expr();
			setState(366);
			match(T__29);
			setState(367);
			expr();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(368);
				match(T__33);
				setState(369);
				expr();
				}
			}

			setState(372);
			match(T__16);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(373);
				sentencia();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(T__17);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SLParser.IDENTIFICADOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IDENTIFICADOR);
			setState(382);
			match(T__11);
			setState(383);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public DisyuncionContext disyuncion() {
			return getRuleContext(DisyuncionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			disyuncion();
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

	public static class DisyuncionContext extends ParserRuleContext {
		public List<ConjuncionContext> conjuncion() {
			return getRuleContexts(ConjuncionContext.class);
		}
		public ConjuncionContext conjuncion(int i) {
			return getRuleContext(ConjuncionContext.class,i);
		}
		public DisyuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disyuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDisyuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDisyuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitDisyuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisyuncionContext disyuncion() throws RecognitionException {
		DisyuncionContext _localctx = new DisyuncionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_disyuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			conjuncion();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(388);
				match(T__34);
				setState(389);
				conjuncion();
				}
				}
				setState(394);
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

	public static class ConjuncionContext extends ParserRuleContext {
		public List<NegacionContext> negacion() {
			return getRuleContexts(NegacionContext.class);
		}
		public NegacionContext negacion(int i) {
			return getRuleContext(NegacionContext.class,i);
		}
		public ConjuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterConjuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitConjuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitConjuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuncionContext conjuncion() throws RecognitionException {
		ConjuncionContext _localctx = new ConjuncionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conjuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			negacion();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(396);
				match(T__35);
				setState(397);
				negacion();
				}
				}
				setState(402);
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

	public static class NegacionContext extends ParserRuleContext {
		public NegacionContext negacion() {
			return getRuleContext(NegacionContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public NegacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNegacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitNegacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegacionContext negacion() throws RecognitionException {
		NegacionContext _localctx = new NegacionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_negacion);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(T__36);
				setState(404);
				negacion();
				}
				break;
			case T__16:
			case T__25:
			case OP_SUMA:
			case LITERAL_NUMERICO:
			case LITERAL_CADENA:
			case LITERAL_LOGICO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				comparacion();
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

	public static class ComparacionContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> OP_COMPARACION() { return getTokens(SLParser.OP_COMPARACION); }
		public TerminalNode OP_COMPARACION(int i) {
			return getToken(SLParser.OP_COMPARACION, i);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			termino();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMPARACION) {
				{
				{
				setState(409);
				match(OP_COMPARACION);
				setState(410);
				termino();
				}
				}
				setState(415);
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

	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> OP_SUMA() { return getTokens(SLParser.OP_SUMA); }
		public TerminalNode OP_SUMA(int i) {
			return getToken(SLParser.OP_SUMA, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_termino);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			factor();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					match(OP_SUMA);
					setState(418);
					factor();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public List<Expr_signoContext> expr_signo() {
			return getRuleContexts(Expr_signoContext.class);
		}
		public Expr_signoContext expr_signo(int i) {
			return getRuleContext(Expr_signoContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			expr_signo();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__37) | (1L << T__38))) != 0)) {
				{
				{
				setState(425);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__37) | (1L << T__38))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(426);
				expr_signo();
				}
				}
				setState(431);
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

	public static class Expr_signoContext extends ParserRuleContext {
		public TerminalNode OP_SUMA() { return getToken(SLParser.OP_SUMA, 0); }
		public Expr_signoContext expr_signo() {
			return getRuleContext(Expr_signoContext.class,0);
		}
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public Expr_signoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_signo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterExpr_signo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitExpr_signo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitExpr_signo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_signoContext expr_signo() throws RecognitionException {
		Expr_signoContext _localctx = new Expr_signoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr_signo);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(OP_SUMA);
				setState(433);
				expr_signo();
				}
				break;
			case T__16:
			case T__25:
			case LITERAL_NUMERICO:
			case LITERAL_CADENA:
			case LITERAL_LOGICO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				potencia();
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

	public static class PotenciaContext extends ParserRuleContext {
		public List<AccesoContext> acceso() {
			return getRuleContexts(AccesoContext.class);
		}
		public AccesoContext acceso(int i) {
			return getRuleContext(AccesoContext.class,i);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitPotencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitPotencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_potencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			acceso();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(438);
				match(T__39);
				setState(439);
				acceso();
				}
				}
				setState(444);
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

	public static class AccesoContext extends ParserRuleContext {
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SLParser.IDENTIFICADOR, i);
		}
		public List<ArgumentosContext> argumentos() {
			return getRuleContexts(ArgumentosContext.class);
		}
		public ArgumentosContext argumentos(int i) {
			return getRuleContext(ArgumentosContext.class,i);
		}
		public AccesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterAcceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitAcceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitAcceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoContext acceso() throws RecognitionException {
		AccesoContext _localctx = new AccesoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_acceso);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			primario();
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(457);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__25:
						{
						setState(446);
						match(T__25);
						setState(448);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__25) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
							{
							setState(447);
							argumentos();
							}
						}

						setState(450);
						match(T__26);
						}
						break;
					case T__19:
						{
						setState(451);
						match(T__19);
						setState(452);
						expr();
						setState(453);
						match(T__21);
						}
						break;
					case T__40:
						{
						setState(455);
						match(T__40);
						setState(456);
						match(IDENTIFICADOR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class PrimarioContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(SLParser.IDENTIFICADOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitPrimario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitPrimario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primario);
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case LITERAL_NUMERICO:
			case LITERAL_CADENA:
			case LITERAL_LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				literal();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(IDENTIFICADOR);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(T__25);
				setState(465);
				expr();
				setState(466);
				match(T__26);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			expr();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(471);
				match(T__10);
				setState(472);
				expr();
				}
				}
				setState(477);
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

	public static class Literal_compuestoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Literal_compuestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_compuesto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLiteral_compuesto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLiteral_compuesto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLiteral_compuesto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_compuestoContext literal_compuesto() throws RecognitionException {
		Literal_compuestoContext _localctx = new Literal_compuestoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_literal_compuesto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__16);
			setState(479);
			expr();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(480);
				match(T__10);
				setState(481);
				expr();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487);
			match(T__17);
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

	public static class ProcedimientoContext extends ParserRuleContext {
		public SubrutinaContext subrutina() {
			return getRuleContext(SubrutinaContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterProcedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitProcedimiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitProcedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_procedimiento);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				subrutina();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				funcion();
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SLParser.IDENTIFICADOR, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(493);
				match(T__41);
				}
			}

			setState(496);
			match(IDENTIFICADOR);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(497);
				match(T__10);
				setState(498);
				match(IDENTIFICADOR);
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			match(T__8);
			setState(505);
			tipo();
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

	public static class Lista_parametrosContext extends ParserRuleContext {
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public Lista_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLista_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLista_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitLista_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametrosContext lista_parametros() throws RecognitionException {
		Lista_parametrosContext _localctx = new Lista_parametrosContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lista_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			parametros();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(508);
				match(T__9);
				setState(509);
				parametros();
				}
				}
				setState(514);
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

	public static class EncabezadoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SLParser.IDENTIFICADOR, 0); }
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public EncabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encabezado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterEncabezado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitEncabezado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitEncabezado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncabezadoContext encabezado() throws RecognitionException {
		EncabezadoContext _localctx = new EncabezadoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_encabezado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__42);
			setState(516);
			match(IDENTIFICADOR);
			setState(517);
			match(T__25);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41 || _la==IDENTIFICADOR) {
				{
				setState(518);
				lista_parametros();
				}
			}

			setState(521);
			match(T__26);
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

	public static class RetornoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__43);
			setState(524);
			expr();
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

	public static class SubrutinaContext extends ParserRuleContext {
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SubrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubrutina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitSubrutina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrutinaContext subrutina() throws RecognitionException {
		SubrutinaContext _localctx = new SubrutinaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_subrutina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			encabezado();
			setState(527);
			declaraciones();
			setState(528);
			match(T__1);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(529);
				sentencia();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
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

	public static class FuncionContext extends ParserRuleContext {
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			encabezado();
			setState(538);
			match(T__43);
			setState(539);
			tipo();
			setState(540);
			declaraciones();
			setState(541);
			match(T__1);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__36) | (1L << OP_SUMA) | (1L << LITERAL_NUMERICO) | (1L << LITERAL_CADENA) | (1L << LITERAL_LOGICO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(542);
				sentencia();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
			retorno();
			setState(549);
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

	public static final String _serializedATN =
		"\u0004\u00015\u0228\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u0001\u0000\u0001\u0000\u0005\u0000"+
		"m\b\u0000\n\u0000\f\u0000p\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0003\u0001u\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0082\b\u0004\n\u0004\f\u0004\u0085\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0089\b\u0005\n\u0005\f\u0005\u008c\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0090\b\u0006\n\u0006\f\u0006\u0093"+
		"\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u0097\b\u0007\n\u0007\f\u0007"+
		"\u009a\t\u0007\u0001\b\u0001\b\u0005\b\u009e\b\b\n\b\f\b\u00a1\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00af\b\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00b4\b\r\n\r\f\r\u00b7\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bc\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c2\b"+
		"\u000e\u0001\u000e\u0003\u000e\u00c5\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00ca\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00d0\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00d5\b\u0011\n\u0011\f\u0011\u00d8\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e6\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00ee\b\u0014\n\u0014\f\u0014\u00f1\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u00f5\b\u0014\n\u0014\f\u0014\u00f8\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u00fd\b\u0015\n\u0015\f\u0015\u0100"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0108\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0111\b\u0018\u0001"+
		"\u0018\u0003\u0018\u0114\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u011a\b\u0019\n\u0019\f\u0019\u011d\t\u0019\u0001\u0019"+
		"\u0005\u0019\u0120\b\u0019\n\u0019\f\u0019\u0123\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0127\b\u0019\n\u0019\f\u0019\u012a\t\u0019\u0003\u0019"+
		"\u012c\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0134\b\u001a\n\u001a\f\u001a\u0137\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0141\b\u001c\n\u001c\f\u001c\u0144\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u014a\b\u001d"+
		"\n\u001d\f\u001d\u014d\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0157"+
		"\b\u001e\n\u001e\f\u001e\u015a\t\u001e\u0004\u001e\u015c\b\u001e\u000b"+
		"\u001e\f\u001e\u015d\u0001\u001e\u0001\u001e\u0005\u001e\u0162\b\u001e"+
		"\n\u001e\f\u001e\u0165\t\u001e\u0003\u001e\u0167\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0173\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u0177\b\u001f\n\u001f\f\u001f\u017a\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u0187\b\"\n\"\f\"\u018a\t\"\u0001#\u0001#\u0001#\u0005"+
		"#\u018f\b#\n#\f#\u0192\t#\u0001$\u0001$\u0001$\u0003$\u0197\b$\u0001%"+
		"\u0001%\u0001%\u0005%\u019c\b%\n%\f%\u019f\t%\u0001&\u0001&\u0001&\u0005"+
		"&\u01a4\b&\n&\f&\u01a7\t&\u0001\'\u0001\'\u0001\'\u0005\'\u01ac\b\'\n"+
		"\'\f\'\u01af\t\'\u0001(\u0001(\u0001(\u0003(\u01b4\b(\u0001)\u0001)\u0001"+
		")\u0005)\u01b9\b)\n)\f)\u01bc\t)\u0001*\u0001*\u0001*\u0003*\u01c1\b*"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u01ca\b*\n*\f"+
		"*\u01cd\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01d5\b+\u0001"+
		",\u0001,\u0001,\u0005,\u01da\b,\n,\f,\u01dd\t,\u0001-\u0001-\u0001-\u0001"+
		"-\u0005-\u01e3\b-\n-\f-\u01e6\t-\u0001-\u0001-\u0001.\u0001.\u0003.\u01ec"+
		"\b.\u0001/\u0003/\u01ef\b/\u0001/\u0001/\u0001/\u0005/\u01f4\b/\n/\f/"+
		"\u01f7\t/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00050\u01ff\b0\n"+
		"0\f0\u0202\t0\u00011\u00011\u00011\u00011\u00031\u0208\b1\u00011\u0001"+
		"1\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00053\u0213\b3\n3"+
		"\f3\u0216\t3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u0005"+
		"4\u0220\b4\n4\f4\u0223\t4\u00014\u00014\u00014\u00014\u0000\u00005\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh\u0000\u0005\u0001\u0000"+
		"\u0004\u0005\u0001\u0000\u0006\u0007\u0003\u0000\u0015\u0015//22\u0002"+
		"\u0000//22\u0002\u0000\u0015\u0015&\'\u0238\u0000j\u0001\u0000\u0000\u0000"+
		"\u0002t\u0001\u0000\u0000\u0000\u0004x\u0001\u0000\u0000\u0000\u0006{"+
		"\u0001\u0000\u0000\u0000\b\u0083\u0001\u0000\u0000\u0000\n\u0086\u0001"+
		"\u0000\u0000\u0000\f\u008d\u0001\u0000\u0000\u0000\u000e\u0094\u0001\u0000"+
		"\u0000\u0000\u0010\u009b\u0001\u0000\u0000\u0000\u0012\u00a4\u0001\u0000"+
		"\u0000\u0000\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000"+
		"\u0000\u0000\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00b0\u0001\u0000"+
		"\u0000\u0000\u001c\u00bd\u0001\u0000\u0000\u0000\u001e\u00c9\u0001\u0000"+
		"\u0000\u0000 \u00cf\u0001\u0000\u0000\u0000\"\u00d1\u0001\u0000\u0000"+
		"\u0000$\u00db\u0001\u0000\u0000\u0000&\u00e1\u0001\u0000\u0000\u0000("+
		"\u00ea\u0001\u0000\u0000\u0000*\u00f9\u0001\u0000\u0000\u0000,\u0101\u0001"+
		"\u0000\u0000\u0000.\u0107\u0001\u0000\u0000\u00000\u0110\u0001\u0000\u0000"+
		"\u00002\u0115\u0001\u0000\u0000\u00004\u012f\u0001\u0000\u0000\u00006"+
		"\u0138\u0001\u0000\u0000\u00008\u013c\u0001\u0000\u0000\u0000:\u0147\u0001"+
		"\u0000\u0000\u0000<\u0151\u0001\u0000\u0000\u0000>\u016a\u0001\u0000\u0000"+
		"\u0000@\u017d\u0001\u0000\u0000\u0000B\u0181\u0001\u0000\u0000\u0000D"+
		"\u0183\u0001\u0000\u0000\u0000F\u018b\u0001\u0000\u0000\u0000H\u0196\u0001"+
		"\u0000\u0000\u0000J\u0198\u0001\u0000\u0000\u0000L\u01a0\u0001\u0000\u0000"+
		"\u0000N\u01a8\u0001\u0000\u0000\u0000P\u01b3\u0001\u0000\u0000\u0000R"+
		"\u01b5\u0001\u0000\u0000\u0000T\u01bd\u0001\u0000\u0000\u0000V\u01d4\u0001"+
		"\u0000\u0000\u0000X\u01d6\u0001\u0000\u0000\u0000Z\u01de\u0001\u0000\u0000"+
		"\u0000\\\u01eb\u0001\u0000\u0000\u0000^\u01ee\u0001\u0000\u0000\u0000"+
		"`\u01fb\u0001\u0000\u0000\u0000b\u0203\u0001\u0000\u0000\u0000d\u020b"+
		"\u0001\u0000\u0000\u0000f\u020e\u0001\u0000\u0000\u0000h\u0219\u0001\u0000"+
		"\u0000\u0000jn\u0003\u0002\u0001\u0000km\u0003\\.\u0000lk\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0005\u0000\u0000\u0001r\u0001\u0001\u0000\u0000\u0000su\u0003\u0004"+
		"\u0002\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vw\u0003\u0006\u0003\u0000w\u0003\u0001\u0000\u0000"+
		"\u0000xy\u0005\u0001\u0000\u0000yz\u00052\u0000\u0000z\u0005\u0001\u0000"+
		"\u0000\u0000{|\u0003\b\u0004\u0000|}\u0003\u0010\b\u0000}\u0007\u0001"+
		"\u0000\u0000\u0000~\u0082\u0003\n\u0005\u0000\u007f\u0082\u0003\f\u0006"+
		"\u0000\u0080\u0082\u0003\u000e\u0007\u0000\u0081~\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\t\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u008a\u0003\u0016\u000b\u0000\u0087"+
		"\u0089\u0003\u0018\f\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u000b\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u0091\u0003\u0012\t\u0000\u008e\u0090\u0003"+
		"\u001a\r\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0098\u0003\u0014\n\u0000\u0095\u0097\u0003\u001c\u000e\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u000f\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009f\u0005\u0002\u0000\u0000\u009c\u009e\u00030\u0018\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0003\u0000\u0000\u00a3\u0011\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0007\u0000\u0000\u0000\u00a5\u0013\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0007\u0001\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\b\u0000\u0000\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u00052\u0000\u0000\u00ab\u00ac\u0005\t\u0000\u0000\u00ac\u00ae\u0003"+
		"\u001e\u000f\u0000\u00ad\u00af\u0005\n\u0000\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u0019\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b5\u00052\u0000\u0000\u00b1\u00b2\u0005\u000b\u0000"+
		"\u0000\u00b2\u00b4\u00052\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\t\u0000\u0000\u00b9"+
		"\u00bb\u0003\u001e\u000f\u0000\u00ba\u00bc\u0005\n\u0000\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u001b"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u00052\u0000\u0000\u00be\u00c1\u0005"+
		"\f\u0000\u0000\u00bf\u00c2\u0003.\u0017\u0000\u00c0\u00c2\u00052\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005\n\u0000\u0000"+
		"\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u001d\u0001\u0000\u0000\u0000\u00c6\u00ca\u0003 \u0010\u0000\u00c7"+
		"\u00ca\u0003$\u0012\u0000\u00c8\u00ca\u0003&\u0013\u0000\u00c9\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u001f\u0001\u0000\u0000\u0000\u00cb\u00d0\u0005"+
		"\r\u0000\u0000\u00cc\u00d0\u0005\u000e\u0000\u0000\u00cd\u00d0\u0005\u000f"+
		"\u0000\u0000\u00ce\u00d0\u0003\"\u0011\u0000\u00cf\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0!\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005\u0010\u0000\u0000\u00d2\u00d6\u0005\u0011\u0000\u0000"+
		"\u00d3\u00d5\u0003\u0018\f\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0012\u0000\u0000\u00da"+
		"#\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0013\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0014\u0000\u0000\u00dd\u00de\u0007\u0002\u0000\u0000\u00de\u00df"+
		"\u0005\u0016\u0000\u0000\u00df\u00e0\u0003 \u0010\u0000\u00e0%\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005\u0017\u0000\u0000\u00e2\u00e5\u0005\u0014"+
		"\u0000\u0000\u00e3\u00e6\u0003(\u0014\u0000\u00e4\u00e6\u0003*\u0015\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0016\u0000\u0000"+
		"\u00e8\u00e9\u0003 \u0010\u0000\u00e9\'\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ef\u0005\u0015\u0000\u0000\u00eb\u00ec\u0005\u000b\u0000\u0000\u00ec"+
		"\u00ee\u0005\u0015\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f6\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u000b\u0000\u0000\u00f3"+
		"\u00f5\u0003,\u0016\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7)\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fe\u0003,\u0016\u0000\u00fa\u00fb\u0005\u000b"+
		"\u0000\u0000\u00fb\u00fd\u0003,\u0016\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff+\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0007\u0003\u0000\u0000"+
		"\u0102-\u0001\u0000\u0000\u0000\u0103\u0108\u0005/\u0000\u0000\u0104\u0108"+
		"\u00050\u0000\u0000\u0105\u0108\u00051\u0000\u0000\u0106\u0108\u0003Z"+
		"-\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0107\u0104\u0001\u0000\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0106\u0001\u0000\u0000"+
		"\u0000\u0108/\u0001\u0000\u0000\u0000\u0109\u0111\u00032\u0019\u0000\u010a"+
		"\u0111\u00038\u001c\u0000\u010b\u0111\u0003:\u001d\u0000\u010c\u0111\u0003"+
		"@ \u0000\u010d\u0111\u0003>\u001f\u0000\u010e\u0111\u0003<\u001e\u0000"+
		"\u010f\u0111\u0003B!\u0000\u0110\u0109\u0001\u0000\u0000\u0000\u0110\u010a"+
		"\u0001\u0000\u0000\u0000\u0110\u010b\u0001\u0000\u0000\u0000\u0110\u010c"+
		"\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0113"+
		"\u0001\u0000\u0000\u0000\u0112\u0114\u0005\n\u0000\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u01141\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005\u0018\u0000\u0000\u0116\u0117\u00036\u001b"+
		"\u0000\u0117\u011b\u0005\u0011\u0000\u0000\u0118\u011a\u00030\u0018\u0000"+
		"\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u012b\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011e\u0120\u00034\u001a\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120"+
		"\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123"+
		"\u0121\u0001\u0000\u0000\u0000\u0124\u0128\u0005\u0019\u0000\u0000\u0125"+
		"\u0127\u00030\u0018\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u012a"+
		"\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012b\u0121\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005\u0012\u0000\u0000\u012e3\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"\u0019\u0000\u0000\u0130\u0131\u0005\u0018\u0000\u0000\u0131\u0135\u0003"+
		"6\u001b\u0000\u0132\u0134\u00030\u0018\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u01365\u0001\u0000\u0000\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u001a\u0000\u0000"+
		"\u0139\u013a\u0003B!\u0000\u013a\u013b\u0005\u001b\u0000\u0000\u013b7"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u001c\u0000\u0000\u013d\u013e"+
		"\u00036\u001b\u0000\u013e\u0142\u0005\u0011\u0000\u0000\u013f\u0141\u0003"+
		"0\u0018\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005\u0012\u0000\u0000\u01469\u0001\u0000\u0000"+
		"\u0000\u0147\u014b\u0005\u001d\u0000\u0000\u0148\u014a\u00030\u0018\u0000"+
		"\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0005\u001e\u0000\u0000\u014f\u0150\u00036\u001b\u0000\u0150"+
		";\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u001f\u0000\u0000\u0152\u015b"+
		"\u0005\u0011\u0000\u0000\u0153\u0154\u0005 \u0000\u0000\u0154\u0158\u0003"+
		"6\u001b\u0000\u0155\u0157\u00030\u0018\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u0153\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0166\u0001\u0000\u0000"+
		"\u0000\u015f\u0163\u0005\u0019\u0000\u0000\u0160\u0162\u00030\u0018\u0000"+
		"\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000"+
		"\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000"+
		"\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000"+
		"\u0166\u015f\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0012\u0000\u0000"+
		"\u0169=\u0001\u0000\u0000\u0000\u016a\u016b\u0005!\u0000\u0000\u016b\u016c"+
		"\u00052\u0000\u0000\u016c\u016d\u0005\f\u0000\u0000\u016d\u016e\u0003"+
		"B!\u0000\u016e\u016f\u0005\u001e\u0000\u0000\u016f\u0172\u0003B!\u0000"+
		"\u0170\u0171\u0005\"\u0000\u0000\u0171\u0173\u0003B!\u0000\u0172\u0170"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0001\u0000\u0000\u0000\u0174\u0178\u0005\u0011\u0000\u0000\u0175\u0177"+
		"\u00030\u0018\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u017a\u0001"+
		"\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001"+
		"\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0178\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0005\u0012\u0000\u0000\u017c?\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u00052\u0000\u0000\u017e\u017f\u0005\f\u0000"+
		"\u0000\u017f\u0180\u0003B!\u0000\u0180A\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0003D\"\u0000\u0182C\u0001\u0000\u0000\u0000\u0183\u0188\u0003"+
		"F#\u0000\u0184\u0185\u0005#\u0000\u0000\u0185\u0187\u0003F#\u0000\u0186"+
		"\u0184\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"E\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u0190"+
		"\u0003H$\u0000\u018c\u018d\u0005$\u0000\u0000\u018d\u018f\u0003H$\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000"+
		"\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000"+
		"\u0191G\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0005%\u0000\u0000\u0194\u0197\u0003H$\u0000\u0195\u0197\u0003"+
		"J%\u0000\u0196\u0193\u0001\u0000\u0000\u0000\u0196\u0195\u0001\u0000\u0000"+
		"\u0000\u0197I\u0001\u0000\u0000\u0000\u0198\u019d\u0003L&\u0000\u0199"+
		"\u019a\u0005-\u0000\u0000\u019a\u019c\u0003L&\u0000\u019b\u0199\u0001"+
		"\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019eK\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a5\u0003N\'"+
		"\u0000\u01a1\u01a2\u0005.\u0000\u0000\u01a2\u01a4\u0003N\'\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		"M\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ad"+
		"\u0003P(\u0000\u01a9\u01aa\u0007\u0004\u0000\u0000\u01aa\u01ac\u0003P"+
		"(\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000"+
		"\u0000\u01aeO\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0005.\u0000\u0000\u01b1\u01b4\u0003P(\u0000\u01b2\u01b4"+
		"\u0003R)\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b4Q\u0001\u0000\u0000\u0000\u01b5\u01ba\u0003T*\u0000"+
		"\u01b6\u01b7\u0005(\u0000\u0000\u01b7\u01b9\u0003T*\u0000\u01b8\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bbS\u0001"+
		"\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01cb\u0003"+
		"V+\u0000\u01be\u01c0\u0005\u001a\u0000\u0000\u01bf\u01c1\u0003X,\u0000"+
		"\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01ca\u0005\u001b\u0000\u0000"+
		"\u01c3\u01c4\u0005\u0014\u0000\u0000\u01c4\u01c5\u0003B!\u0000\u01c5\u01c6"+
		"\u0005\u0016\u0000\u0000\u01c6\u01ca\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0005)\u0000\u0000\u01c8\u01ca\u00052\u0000\u0000\u01c9\u01be\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c3\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01ccU\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d5\u0003.\u0017\u0000"+
		"\u01cf\u01d5\u00052\u0000\u0000\u01d0\u01d1\u0005\u001a\u0000\u0000\u01d1"+
		"\u01d2\u0003B!\u0000\u01d2\u01d3\u0005\u001b\u0000\u0000\u01d3\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d4\u01ce\u0001\u0000\u0000\u0000\u01d4\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d0\u0001\u0000\u0000\u0000\u01d5W\u0001\u0000"+
		"\u0000\u0000\u01d6\u01db\u0003B!\u0000\u01d7\u01d8\u0005\u000b\u0000\u0000"+
		"\u01d8\u01da\u0003B!\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01dd"+
		"\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0001\u0000\u0000\u0000\u01dcY\u0001\u0000\u0000\u0000\u01dd\u01db\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0005\u0011\u0000\u0000\u01df\u01e4\u0003"+
		"B!\u0000\u01e0\u01e1\u0005\u000b\u0000\u0000\u01e1\u01e3\u0003B!\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0005\u0012\u0000\u0000\u01e8[\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ec\u0003f3\u0000\u01ea\u01ec\u0003h4\u0000\u01eb\u01e9\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec]\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ef\u0005*\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f5\u00052\u0000\u0000\u01f1\u01f2\u0005\u000b\u0000\u0000\u01f2"+
		"\u01f4\u00052\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005\t\u0000\u0000\u01f9\u01fa\u0003"+
		"\u001e\u000f\u0000\u01fa_\u0001\u0000\u0000\u0000\u01fb\u0200\u0003^/"+
		"\u0000\u01fc\u01fd\u0005\n\u0000\u0000\u01fd\u01ff\u0003^/\u0000\u01fe"+
		"\u01fc\u0001\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200"+
		"\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201"+
		"a\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0005+\u0000\u0000\u0204\u0205\u00052\u0000\u0000\u0205\u0207\u0005\u001a"+
		"\u0000\u0000\u0206\u0208\u0003`0\u0000\u0207\u0206\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0005\u001b\u0000\u0000\u020ac\u0001\u0000\u0000\u0000\u020b"+
		"\u020c\u0005,\u0000\u0000\u020c\u020d\u0003B!\u0000\u020de\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0003b1\u0000\u020f\u0210\u0003\b\u0004\u0000"+
		"\u0210\u0214\u0005\u0002\u0000\u0000\u0211\u0213\u00030\u0018\u0000\u0212"+
		"\u0211\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000\u0000\u0000\u0214"+
		"\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215"+
		"\u0217\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0217"+
		"\u0218\u0005\u0003\u0000\u0000\u0218g\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0003b1\u0000\u021a\u021b\u0005,\u0000\u0000\u021b\u021c\u0003\u001e"+
		"\u000f\u0000\u021c\u021d\u0003\b\u0004\u0000\u021d\u0221\u0005\u0002\u0000"+
		"\u0000\u021e\u0220\u00030\u0018\u0000\u021f\u021e\u0001\u0000\u0000\u0000"+
		"\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0001\u0000\u0000\u0000"+
		"\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0225\u0003d2\u0000\u0225\u0226"+
		"\u0005\u0003\u0000\u0000\u0226i\u0001\u0000\u0000\u00009nt\u0081\u0083"+
		"\u008a\u0091\u0098\u009f\u00ae\u00b5\u00bb\u00c1\u00c4\u00c9\u00cf\u00d6"+
		"\u00e5\u00ef\u00f6\u00fe\u0107\u0110\u0113\u011b\u0121\u0128\u012b\u0135"+
		"\u0142\u014b\u0158\u015d\u0163\u0166\u0172\u0178\u0188\u0190\u0196\u019d"+
		"\u01a5\u01ad\u01b3\u01ba\u01c0\u01c9\u01cb\u01d4\u01db\u01e4\u01eb\u01ee"+
		"\u01f5\u0200\u0207\u0214\u0221";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}