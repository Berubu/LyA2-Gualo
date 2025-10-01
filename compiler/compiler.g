grammar compiler;

@header {
    import java.util.HashMap;
    import java.util.Stack;
}

@members {
    // Pila de scops cada scop es un HashMap de variables locales
    Stack<HashMap<String, Integer>> scopes = new Stack<>();

    // Entramos a un nuevo scope (método o bloque)
    public void enterScope() {
        scopes.push(new HashMap<String, Integer>());
    }

    // Salimos de un scope
    public void exitScope() {
        scopes.pop();
    }

    // Agregar símbolo al scope actual de la tabla de simbolos 
    public void addSym(String id, String tipo) {
        HashMap<String,Integer> currentScope = scopes.peek();

        if(currentScope.containsKey(id)) {
            System.out.println("ID " + id + " ya declarada en este scope");
            return;
        }

        int tipoInt = tipo.equals("int") ? 1 : tipo.equals("double") ? 2 : 3;
        currentScope.put(id, tipoInt);

        System.out.println("Agregando simbolo: " + id + " tipo: " + tipo);
    }

    // Buscar símbolo en el scope actual en la tabla de simbolos 
    public int searchSymbol(String id) {
        // Buscamos desde el scope más interno hacia afuera
        for(int i = scopes.size()-1; i >= 0; i--) {
            HashMap<String,Integer> scope = scopes.get(i);
            if(scope.containsKey(id)) {
                System.out.println("ID " + id + " ya declarado");
                return scope.get(id);
            }
        }
        System.out.println("ID " + id + " no declarada");
        return 0; // valor de error
    }
}

program:
    theClass+
;

theClass:
    accessModif CLASS ID OCURLYB member* CCURLYB
;

member:
    method | property
;

method: 
    accessModif tipo ID '(' {enterScope();} decl_of_args? ')' OCURLYB 
        sentences* 
    CCURLYB {exitScope();}
;


property
    : accessModif t1=tipo id1=ID { addSym($id1.text, $t1.text); }
      (',' id2=ID { addSym($id2.text, $t1.text); })*
      SEMICOLON
    ;

decl_of_args: 
    t1=tipo id1=ID {addSym($id1.text,$t1.text);} 
    (',' t2=tipo id2=ID {addSym($id2.text,$t2.text);})*
;

decl_of_varloc: 
    tipo id1=ID {addSym($id1.text,$tipo.text);} 
    (',' id2=ID {addSym($id2.text,$tipo.text);})* SEMICOLON
;

sentences: assignment | decl_of_varloc;

assignment: 
    ID '=' expr {System.out.println("Tipo de expr es: "+$expr.eType);} SEMICOLON
;

expr returns [int eType]:
    m1=multExpr {$eType=$m1.mType; }
    (('+'|'-') m2=multExpr {if ($m1.mType!=$m2.mType) $eType=3;} )*
;

multExpr returns [int mType]:
    a1=atom {$mType=$a1.aType; }
    ('*' a2=atom {if($a1.aType!=$a2.aType) $mType=3;})*
;

atom returns [int aType]:
      CINT    {$aType = 1;}
    | CFLOAT  {$aType = 2;}
    | ID      {aType=searchSymbol($ID.text);}
    | '(' expr ')'  {$aType = $expr.eType;}
;

accessModif: PUBLIC | PRIVATE | PROTECTED;
CLASS      : 'class';
PUBLIC     : 'public';
PRIVATE    : 'private';
PROTECTED  : 'protected';
tipo       : INT | DOUBLE;
INT        : 'int';
DOUBLE     : 'double';
OCURLYB    : '{';
CCURLYB    : '}';
SEMICOLON  : ';';
DOT        : '.';
CFLOAT     : CINT DOT CINT;
CINT       : ('0'..'9')+;
ID         : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
WS         : (' ' | '\t' | '\r' | '\n') { $channel = HIDDEN; } ;
