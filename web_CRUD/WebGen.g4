grammar WebGen;

/* -----------------
 * Reglas del Parser (Sintaxis)
 * ----------------- */

pagina: INICIO_PAGINA (elemento)+ FIN_PAGINA EOF;

elemento
    : linea
    | titulo
    | menu
    | seccionImagenes
    | texto
    | crud
    | seccionAcercade
    ;

linea           : LINEA_SIMPLE;
titulo          : TITULO STRING;
menu            : MENU_OPCIONES;
seccionImagenes : SECCION_IMAGENES ( (STRING)+ | (FILENAME)+ ); 
texto           : TEXTO STRING;
seccionAcercade : SECCION_ACERCADE (propiedad)+;
propiedad       : ID ':' STRING; 
crud            : CRUD_INICIO bdd tabla CRUD_FIN;
bdd             : BDD ID;
tabla           : TABLA ID (campo)+ FIN_TABLA;
campo           : CAMPO ID;


/* -----------------
 * Reglas del Lexer (Tokens)
 * ----------------- */

// Palabras Clave
INICIO_PAGINA   : 'Inicio pagina';
FIN_PAGINA      : 'fin pagina';
LINEA_SIMPLE    : 'linea simple';
TITULO          : 'titulo';
MENU_OPCIONES   : 'menu opciones';
SECCION_IMAGENES: 'seccion imagenes';
TEXTO           : 'texto';
CRUD_INICIO     : 'crud inicio';
CRUD_FIN        : 'crud fin';
BDD             : 'bdd';
TABLA           : 'tabla';
CAMPO           : 'campo';
FIN_TABLA       : 'fintabla'; // <-- CORREGIDO (decía FIN_TAFLA)
SECCION_ACERCADE: 'seccion acercade';

// ---- ¡AQUÍ ESTÁ LA REGLA CORREGIDA CON CÓDIGOS UNICODE! ----
STRING          : '"' ( ~["\r\n] )*? '"'  // Opción 1: comillas rectas
                | '\u201C' ( ~[\u201D\r\n] )*? '\u201D' // Opción 2: “ y ”
                ;

FILENAME        : [a-zA-Z_0-9]+ ('.' [a-zA-Z_0-9]+)+ ; 
ID              : [a-zA-Z_][a-zA-Z_0-9]*;
WHITESPACE      : [ \t\r\n]+ -> skip;