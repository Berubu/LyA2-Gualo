grammar compiler;

@header{
    import java.util.HashMap;
}
@members {
    HashMap TLS = new HashMap();
    public void addSym(String id, String tipo){
        System.out,println("Agregando id: "+ id " tipo:" + tipo );
    }
}

program     : theClass+ ; 
        //public class Empleado ()
theClass    : accessModif CLASS ID 
                        OCURLYB member* CCURLYB         ;
member      : method |propety                           ;

method      : accessModif tipo ID '(' delc_of_args? ')'
                    OCURLYB sentences* CCURLYB          ;

property    : accessModiftipo ID (',' ID) SEMICOLON     ;

                //int a, double b , double c
                //tipo ID (',' tipo ID)*
delc_of_args: t1=tipo id1=ID{addSys($id1.text,$t1.text);} 
                (',' t2=tipo id2=ID {addSys($id2.text,$t2.text);} )*;
                //I¿int a, b, c
                //tipo ID (',' ID)*
delc_local  : tipo id1=ID 
                        {addSys($id1.text, $tipo.text)  ;
                        }
                        (',' id2=ID
                        {addSys($id2.text,
                        $tipo.text);})* SEMICOLON       ;

tipo        : INT | DOUBLE                              ;

sentences   : assignament | delc_local                  ;

assignment  : ID '=' expr 
        {system.out.println("Tipo de expr es: "+$expr.eType);
                         }SEMICOLON                     ;


expr  returns [int eType]:
                  m1=multExpr {$eType=a1.mType; }
                  (('+'|'-') m2=multExpr  
                  {if (m1.mType!=m2.mType)$eType=3;} 
                  )*                                    ;


multExpr returns [int mType]:
                a1=atom {$mType=a1.aType; }
                 ('*' a2=atom {if(a1.aType!=a2.aType)
                 $mType=3; 
                })*                         ;


atom  returns [int aType]   
            : CINT    {$aType = 1;}
            | CF LOAT {$aType = 2;}
            | ID 
            | '(' expr ')'  {$aType = $expr.eType; }    ;


accessModif : PUBLIC | PRIVATE | PROTECTED              ;
INT     : 'int';
DOUBLE  : 'double';
CLASS   : 'class' ;
PUBLIC  : 'public' ;
PRIVATE : 'private' ;
PROTECTED : 'protected' ;
OCURLYB : '{' ;
CCURLYB : '}' ; 

DOT     : '.' ;
CFLOAT  : CINT DOT CINT ;
CINT    : ('0'..'9')+ ;
ID      : ('a'..'z'|'A'..'Z'|'') ('a'..'z'|'A'..'Z'|''|'0'..'9')* ;

WS      : (' ' | '\n' | '\r' | '\t')+ { $channel = HIDDEN; } ;

