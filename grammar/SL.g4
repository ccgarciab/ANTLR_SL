grammar SL;

// REGLAS SINTACTICAS
inicial: programa procedimiento* EOF;
programa: nombre_programa? programa_principal;
nombre_programa: 'programa' IDENTIFICADOR;
programa_principal: declaraciones cuerpo_principal;
declaraciones: (tipos | vars | consts)*;
tipos: tipos_kw decl_tipo*;
vars: var_kw decl_vars*;
consts: const_kw decl_const*;
cuerpo_principal: 'inicio' sentencias 'fin';
var_kw: 'var' | 'variables';
const_kw: 'const' | 'constantes';
tipos_kw: 'tipos';
decl_tipo: IDENTIFICADOR ':' tipo ';'?;
decl_vars: IDENTIFICADOR (',' IDENTIFICADOR)* ':' tipo ';'?;
decl_const: IDENTIFICADOR '=' (literal | IDENTIFICADOR) ';'?;
tipo: tipo_escalar | tipo_vector | tipo_matriz | IDENTIFICADOR;
tipo_escalar: 'numerico' | 'logico' | 'cadena';
tipo_vector: 'vector' '[' (LITERAL_NUMERICO | IDENTIFICADOR | '*') ']' tipo_escalar;
tipo_matriz: 'matriz' '[' (dimensiones_variables | dimensiones_fijas) ']' tipo_escalar;
dimensiones_variables: dimension_variable (',' dimension_variable)* (',' dimension)*;
dimensiones_fijas: dimension (',' dimension)*;
dimension: LITERAL_NUMERICO | IDENTIFICADOR;
dimension_variable: '*';
literal: LITERAL_NUMERICO | LITERAL_CADENA | LITERAL_LOGICO | literal_compuesto;
sentencia: (si | mientras | repetir_hasta | asignacion | desde | eval | expr) ';'?;
si: 'si' condicion '{' sentencia* (sino_si* 'sino' sentencia*)? '}';
sino_si: 'sino' 'si' condicion sentencia*;
condicion: '(' expr ')';
mientras: 'mientras' condicion '{' sentencia* '}';
repetir_hasta: 'repetir' sentencia* 'hasta' condicion;
eval: 'eval' '{' ('caso' condicion sentencia*)+ ('sino' sentencia*)? '}';
desde: 'desde' IDENTIFICADOR '=' expr 'hasta' expr ('paso' expr)? '{' sentencia* '}';
asignacion: IDENTIFICADOR '=' expr;
expr: disyuncion;
disyuncion: conjuncion ('or' conjuncion)*;
conjuncion: negacion ('and' negacion)*;
negacion: 'not' negacion | comparacion;
//Cata
comparacion: termino (OP_COMPARACION termino)*;
termino: factor (OP_SUMA factor)*;
factor: expr_signo (('*' | '/' | '%') expr_signo)*;
expr_signo: OP_SUMA expr_signo | potencia;
//Santiago
potencia: acceso ('^' acceso)*;
acceso: primario ('(' argumentos? ')' | '[' expr ']' | '.' IDENTIFICADOR)*;
primario: literal | IDENTIFICADOR | '(' expr ')';
argumentos: expr (',' expr)*;
//Cristian
literal_compuesto: '{' expr (',' expr)* '}';
procedimiento: subrutina | funcion;
parametros: 'ref'? IDENTIFICADOR (',' IDENTIFICADOR)* ':' tipo;
lista_parametros: parametros (';' parametros)*;
//Diego
encabezado: 'subrutina' IDENTIFICADOR '(' lista_parametros? ')';
retorno: 'retorna' expr;
subrutina: encabezado declaraciones 'inicio' sentencias 'fin';
funcion: encabezado 'retorna' tipo declaraciones 'inicio' sentencias retorno 'fin';
sentencias: sentencia*;

OP_COMPARACION: '==' | '<>' | '<' | '<=' | '>' | '>=';
OP_SUMA: '+' | '-';
//TODO cambiar por literal numero
LITERAL_NUMERICO: '-'?[0-9]+('.'[0-9]+)?([Ee][+-]?[0-9]+)?;
fragment ESCAPE_COMILLA : '\\"' | '\\\'';
fragment CONTENIDO_CADENA: ( ESCAPE_COMILLA | ~('\n'|'\r') )*?;
LITERAL_CADENA :   '"' CONTENIDO_CADENA '"' | '\'' CONTENIDO_CADENA '\'';
LITERAL_LOGICO: 'TRUE' | 'FALSE' | 'SI' | 'NO';
IDENTIFICADOR: [_A-Za-z][_A-Za-z0-9]*;
COMENTARIO_MULTILINEA: '/*' .*? '*/' -> skip;
COMENTARIO_LINEA: '//' .*? [\n\r] -> skip;
ESPACIO: [ \t\r\n]+ -> skip;
