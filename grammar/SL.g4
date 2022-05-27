grammar SL;

// REGLAS SINTACTICAS
inicial: programa EOF; // TODO: implementar regla subrutina y reemplazar por "inicial: programa subrutina*;"
programa: nombre_programa? programa_principal;
nombre_programa: 'programa' IDENTIFICADOR;
programa_principal: declaraciones cuerpo_principal;
declaraciones: (tipos | vars | consts)*;
tipos: tipos_kw decl_tipo*;
vars: var_kw decl_vars*;
consts: const_kw decl_const*;
cuerpo_principal: 'inicio' sentencia* 'fin';
var_kw: 'var' | 'variables';
const_kw: 'const' | 'constantes';
tipos_kw: 'tipos';
decl_tipo: IDENTIFICADOR ':' tipo;
decl_vars: IDENTIFICADOR (',' IDENTIFICADOR)* ':' tipo;
decl_const: IDENTIFICADOR '=' (literal | IDENTIFICADOR);
tipo: tipo_escalar | tipo_vector | tipo_matriz;
tipo_escalar: 'numerico' | 'logico' | 'cadena' | tipo_registro;
tipo_registro: 'registro' '{' decl_tipo* '}';
tipo_vector: 'vector' '[' LITERAL_ENTERO | IDENTIFICADOR | '*' ']' tipo_escalar;
tipo_matriz: 'matriz' '[' (dimensiones_variables | dimensiones_fijas) ']' tipo_escalar;
dimensiones_variables: '*' (',' '*')* (',' dimension)*;
dimensiones_fijas: dimension (',' dimension)*;
dimension: LITERAL_ENTERO | IDENTIFICADOR;
literal: LITERAL_ENTERO | LITERAL_CADENA | LITERAL_LOGICO | literal_compuesto;
sentencia: si | mientras | repetir_hasta | asignacion | desde | eval | llamada;
si: 'si' condicion '{' sentencia* (sino_si* 'sino' sentencia*)? '}';
sino_si: 'sino' 'si' condicion sentencia*;
condicion: '(' expr ')';
mientras: 'mientras' condicion '{' sentencia* '}';
repetir_hasta: 'repetir' sentencia* 'hasta' condicion;
eval: 'eval' '{' ('caso' condicion sentencia*)+ ('sino' sentencia*)? '}';
desde: 'desde' IDENTIFICADOR '=' expr 'hasta' expr ('paso' expr)? '{' sentencia* '}';
asignacion: IDENTIFICADOR '=' expr;
expr: literal | IDENTIFICADOR; // TODO: agregar todos los operadores
literal_compuesto: '{' expr (',' expr)* '}';
llamada: IDENTIFICADOR '(' (expr (',' expr)*)? ')';

IDENTIFICADOR: [_A-Za-z][_A-Za-z0-9]*;
LITERAL_ENTERO: [0-9]+;
fragment ESCAPE_COMILLA : '\\"' | '\\\'';
fragment CONTENIDO_CADENA: ( ESCAPE_COMILLA | ~('\n'|'\r') )*?;
LITERAL_CADENA :   '"' CONTENIDO_CADENA '"' | '\'' CONTENIDO_CADENA '\'';
LITERAL_LOGICO: 'TRUE' | 'FALSE' | 'SI' | 'NO';
COMENTARIO_MULTILINEA: '/*' .*? '*/' -> skip;
COMENTARIO_LINEA: '//' .*? [\n\r];
ESPACIO: [ \t\r\n]+ -> skip;