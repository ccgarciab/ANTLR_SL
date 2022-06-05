// Generated from C:/Users/z004hkjh/IdeaProjects/SL/grammar\SL.g4 by ANTLR 4.10.1
package Gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SLParser#inicial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicial(SLParser.InicialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SLParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#nombre_programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_programa(SLParser.Nombre_programaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#programa_principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma_principal(SLParser.Programa_principalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(SLParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(SLParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(SLParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(SLParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#cuerpo_principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_principal(SLParser.Cuerpo_principalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#var_kw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_kw(SLParser.Var_kwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#const_kw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_kw(SLParser.Const_kwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipos_kw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_kw(SLParser.Tipos_kwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#decl_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_tipo(SLParser.Decl_tipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#decl_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_vars(SLParser.Decl_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#decl_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_const(SLParser.Decl_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(SLParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipo_escalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_escalar(SLParser.Tipo_escalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipo_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_vector(SLParser.Tipo_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tipo_matriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_matriz(SLParser.Tipo_matrizContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dimensiones_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensiones_variables(SLParser.Dimensiones_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dimensiones_fijas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensiones_fijas(SLParser.Dimensiones_fijasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(SLParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(SLParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sino_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino_si(SLParser.Sino_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(SLParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(SLParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#repetir_hasta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir_hasta(SLParser.Repetir_hastaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(SLParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#desde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesde(SLParser.DesdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(SLParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#disyuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisyuncion(SLParser.DisyuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#conjuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjuncion(SLParser.ConjuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#negacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(SLParser.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(SLParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(SLParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SLParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#expr_signo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_signo(SLParser.Expr_signoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(SLParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#acceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceso(SLParser.AccesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimario(SLParser.PrimarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(SLParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#literal_compuesto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_compuesto(SLParser.Literal_compuestoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimiento(SLParser.ProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(SLParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#lista_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros(SLParser.Lista_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabezado(SLParser.EncabezadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(SLParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#subrutina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrutina(SLParser.SubrutinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(SLParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(SLParser.SentenciasContext ctx);
}