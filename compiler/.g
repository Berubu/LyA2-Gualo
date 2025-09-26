grammar practica3;
@header {
    import java.util.HashMap;
}
@members {
    HashMap TSL = new HashMap();

    public void addSym(String id, String tipo){
        System.out.println("Agregando simbolo: "+id+" tipo: "+tipo);

        Integer existe = (Integer) TSL.get(id);
        if(existe==null){
            if(tipo.compareTo("int")==0) TSL.put(id,1);
            else if(tipo.compareTo("double")==0) TSL.put(id,2);
            else    TSL.put(id,3);
        }
        else{ System.out.println("ID " +id+ " ya declarada"); }
    }
}

public int searchSymbol(String id){
    Integer existe = (Integer) TSL.get(id);
    if(existe==null){
        System.out.println("ID " +id+ " no declarada");
    }
    else{ 
        System.out.println("ID " +id+ "ya declarado"); 
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
    accessModif tipo ID '(' decl_of_args? ')' OCURLYB sentences* CCURLYB
;

property: accessModif tipo ID (','ID)* SEMICOLON;

decl_of_args: 
    t1=tipo id1=ID {addSym($id1.text,$t1.text);} 
    (',' t2=tipo id2=ID {addSym($id2.text,$t2.text);})*
;
decl_of_varloc: 
    tipo id1=ID {addSym($id1.text,$tipo.text);} (',' id2=ID {addSym($id2.text,$tipo.text);})* SEMICOLON
;

sentences 
    : assignment | decl_of_varloc 
;
assignment 
    : ID '=' expr {system.out.println("Tipo de expr es: "+$expr.eType);
                         }SEMICOLON                     ;
;
expr  returns [int eType]:
                  m1=multExpr {$eType=$m1.mType; }
                  (('+'|'-') m2=multExpr  
                  {if ($m1.mType!=$m2.mType) $eType=3;} 
                  )*                                    ;


multExpr returns [int mType]:
                a1=atom {$mType=$a1.aType; }
                 ('*' a2=atom 
                 {if($a1.aType!=$a2.aType)
                 $mType=3; 
                })*                         ;


atom  returns [int aType]   
            : CINT    {$aType = 1;}
            | CFLOAT  {$aType = 2;}
            | ID  {aType=searchSymbol($ID.text);}
            | '(' expr ')'  {$aType = $expr.eType; }    ;

accessModif : PUBLIC | PRIVATE | PROTECTED ;
CLASS       : 'class' ;
PUBLIC      : 'public' ;
PRIVATE     : 'private' ;
PROTECTED   : 'protected' ;
tipo        : INT | DOUBLE ;
INT         : 'int';
DOUBLE      : 'double';
OCURLYB     : '{' ;
CCURLYB     : '}' ;
SEMICOLON   : ';' ;
DOT         : '.' ;
CFLOAT      : CINT DOT CINT ;
CINT        : ('0'..'9')+ ;
ID           : ('a'..'z' | 'A'..'Z' | '') ('a'..'z' | 'A'..'Z' | '' | '0'..'9')* ;
WS          : (' ' | '\t' | '\r' | '\n') { $channel = HIDDEN; } ;