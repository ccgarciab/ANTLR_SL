// Generated from C:/Users/z004hkjh/IdeaProjects/SL/grammar\SL.g4 by ANTLR 4.10.1
package Gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLParser}.
 */
public interface SLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLParser#inicial}.
	 * @param ctx the parse tree
	 */
	void enterInicial(SLParser.InicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#inicial}.
	 * @param ctx the parse tree
	 */
	void exitInicial(SLParser.InicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SLParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SLParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#nombre_programa}.
	 * @param ctx the parse tree
	 */
	void enterNombre_programa(SLParser.Nombre_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#nombre_programa}.
	 * @param ctx the parse tree
	 */
	void exitNombre_programa(SLParser.Nombre_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#programa_principal}.
	 * @param ctx the parse tree
	 */
	void enterPrograma_principal(SLParser.Programa_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#programa_principal}.
	 * @param ctx the parse tree
	 */
	void exitPrograma_principal(SLParser.Programa_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(SLParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(SLParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(SLParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(SLParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(SLParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(SLParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(SLParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(SLParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#cuerpo_principal}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_principal(SLParser.Cuerpo_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#cuerpo_principal}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_principal(SLParser.Cuerpo_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#var_kw}.
	 * @param ctx the parse tree
	 */
	void enterVar_kw(SLParser.Var_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#var_kw}.
	 * @param ctx the parse tree
	 */
	void exitVar_kw(SLParser.Var_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#const_kw}.
	 * @param ctx the parse tree
	 */
	void enterConst_kw(SLParser.Const_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#const_kw}.
	 * @param ctx the parse tree
	 */
	void exitConst_kw(SLParser.Const_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipos_kw}.
	 * @param ctx the parse tree
	 */
	void enterTipos_kw(SLParser.Tipos_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipos_kw}.
	 * @param ctx the parse tree
	 */
	void exitTipos_kw(SLParser.Tipos_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void enterDecl_tipo(SLParser.Decl_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#decl_tipo}.
	 * @param ctx the parse tree
	 */
	void exitDecl_tipo(SLParser.Decl_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#decl_vars}.
	 * @param ctx the parse tree
	 */
	void enterDecl_vars(SLParser.Decl_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#decl_vars}.
	 * @param ctx the parse tree
	 */
	void exitDecl_vars(SLParser.Decl_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#decl_const}.
	 * @param ctx the parse tree
	 */
	void enterDecl_const(SLParser.Decl_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#decl_const}.
	 * @param ctx the parse tree
	 */
	void exitDecl_const(SLParser.Decl_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SLParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SLParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipo_escalar}.
	 * @param ctx the parse tree
	 */
	void enterTipo_escalar(SLParser.Tipo_escalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipo_escalar}.
	 * @param ctx the parse tree
	 */
	void exitTipo_escalar(SLParser.Tipo_escalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipo_registro}.
	 * @param ctx the parse tree
	 */
	void enterTipo_registro(SLParser.Tipo_registroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipo_registro}.
	 * @param ctx the parse tree
	 */
	void exitTipo_registro(SLParser.Tipo_registroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipo_vector}.
	 * @param ctx the parse tree
	 */
	void enterTipo_vector(SLParser.Tipo_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipo_vector}.
	 * @param ctx the parse tree
	 */
	void exitTipo_vector(SLParser.Tipo_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipo_matriz}.
	 * @param ctx the parse tree
	 */
	void enterTipo_matriz(SLParser.Tipo_matrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipo_matriz}.
	 * @param ctx the parse tree
	 */
	void exitTipo_matriz(SLParser.Tipo_matrizContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#dimensiones_variables}.
	 * @param ctx the parse tree
	 */
	void enterDimensiones_variables(SLParser.Dimensiones_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#dimensiones_variables}.
	 * @param ctx the parse tree
	 */
	void exitDimensiones_variables(SLParser.Dimensiones_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#dimensiones_fijas}.
	 * @param ctx the parse tree
	 */
	void enterDimensiones_fijas(SLParser.Dimensiones_fijasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#dimensiones_fijas}.
	 * @param ctx the parse tree
	 */
	void exitDimensiones_fijas(SLParser.Dimensiones_fijasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(SLParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(SLParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(SLParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(SLParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sino_si}.
	 * @param ctx the parse tree
	 */
	void enterSino_si(SLParser.Sino_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sino_si}.
	 * @param ctx the parse tree
	 */
	void exitSino_si(SLParser.Sino_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(SLParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(SLParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(SLParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(SLParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#repetir_hasta}.
	 * @param ctx the parse tree
	 */
	void enterRepetir_hasta(SLParser.Repetir_hastaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#repetir_hasta}.
	 * @param ctx the parse tree
	 */
	void exitRepetir_hasta(SLParser.Repetir_hastaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(SLParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(SLParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#desde}.
	 * @param ctx the parse tree
	 */
	void enterDesde(SLParser.DesdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#desde}.
	 * @param ctx the parse tree
	 */
	void exitDesde(SLParser.DesdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(SLParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(SLParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void enterDisyuncion(SLParser.DisyuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void exitDisyuncion(SLParser.DisyuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void enterConjuncion(SLParser.ConjuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void exitConjuncion(SLParser.ConjuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#negacion}.
	 * @param ctx the parse tree
	 */
	void enterNegacion(SLParser.NegacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#negacion}.
	 * @param ctx the parse tree
	 */
	void exitNegacion(SLParser.NegacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(SLParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(SLParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(SLParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(SLParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SLParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SLParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#expr_signo}.
	 * @param ctx the parse tree
	 */
	void enterExpr_signo(SLParser.Expr_signoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#expr_signo}.
	 * @param ctx the parse tree
	 */
	void exitExpr_signo(SLParser.Expr_signoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(SLParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(SLParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#acceso}.
	 * @param ctx the parse tree
	 */
	void enterAcceso(SLParser.AccesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#acceso}.
	 * @param ctx the parse tree
	 */
	void exitAcceso(SLParser.AccesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#primario}.
	 * @param ctx the parse tree
	 */
	void enterPrimario(SLParser.PrimarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#primario}.
	 * @param ctx the parse tree
	 */
	void exitPrimario(SLParser.PrimarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(SLParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(SLParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#literal_compuesto}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_compuesto(SLParser.Literal_compuestoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#literal_compuesto}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_compuesto(SLParser.Literal_compuestoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(SLParser.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(SLParser.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(SLParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(SLParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros(SLParser.Lista_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros(SLParser.Lista_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#encabezado}.
	 * @param ctx the parse tree
	 */
	void enterEncabezado(SLParser.EncabezadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#encabezado}.
	 * @param ctx the parse tree
	 */
	void exitEncabezado(SLParser.EncabezadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(SLParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(SLParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#subrutina}.
	 * @param ctx the parse tree
	 */
	void enterSubrutina(SLParser.SubrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#subrutina}.
	 * @param ctx the parse tree
	 */
	void exitSubrutina(SLParser.SubrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(SLParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(SLParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(SLParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(SLParser.SentenciasContext ctx);
}