package com.mycompany.ide;

// $ANTLR 3.5.2 compiler.g 2025-09-27 19:57:26

    import java.util.HashMap;
    import java.util.Stack;
    import javax.swing.JTextArea;
    import org.antlr.runtime.RecognitionException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CCURLYB", "CFLOAT", "CINT", "CLASS", 
		"DOT", "DOUBLE", "ID", "INT", "OCURLYB", "PRIVATE", "PROTECTED", "PUBLIC", 
		"SEMICOLON", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int CCURLYB=4;
	public static final int CFLOAT=5;
	public static final int CINT=6;
	public static final int CLASS=7;
	public static final int DOT=8;
	public static final int DOUBLE=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int OCURLYB=12;
	public static final int PRIVATE=13;
	public static final int PROTECTED=14;
	public static final int PUBLIC=15;
	public static final int SEMICOLON=16;
	public static final int WS=17;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public compilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public compilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return compilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "compiler.g"; }


	    private JTextArea salida;
	    private Stack<HashMap<String, Integer>> TSL_stack = new Stack<HashMap<String, Integer>>();

	    public void setSalida(JTextArea taSalida){
	        this.salida = taSalida;
	    }
	    public void pushScope(){
	        TSL_stack.push(new HashMap<String, Integer>());
	    }
	    public void popScope(){
	        TSL_stack.pop();
	    }
	    public void addSym(String id, String tipo){
	        salida.append("Agregando simbolo: "+id+" tipo: "+tipo + "\n");
	        HashMap<String, Integer> currentScope = TSL_stack.peek();
	        Integer existe = (Integer) currentScope.get(id);

	        if(existe==null){
	            if(tipo.compareTo("int")==0) currentScope.put(id,1);
	            else if(tipo.compareTo("double")==0) currentScope.put(id,2);
	            else currentScope.put(id,3);
	        }
	        else{ salida.append("ID " +id+ " ya declarada" + "\n"); }
	    }

	    public int searchSymbol(String id){
	        for (int i = TSL_stack.size() - 1; i >= 0; i--) {
	            HashMap<String, Integer> currentScope = TSL_stack.get(i);
	            Integer existe = (Integer) currentScope.get(id);
	            if(existe!=null){
	                salida.append("ID " +id+ " ya declarado" + "\n"); 
	                return existe;
	            }
	        }
	        salida.append("ID " +id+ " no declarada" + "\n");
	        return 0;
	    }
	    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        salida.append("Que te fijes!!!: " + hdr + " " + msg + "\n");
	    }



	// $ANTLR start "program"
	// compiler.g:54:1: program : ( theClass )+ ;
	public final void program() throws RecognitionException {
		try {
			// compiler.g:54:8: ( ( theClass )+ )
			// compiler.g:55:5: ( theClass )+
			{
			// compiler.g:55:5: ( theClass )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= PRIVATE && LA1_0 <= PUBLIC)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// compiler.g:55:5: theClass
					{
					pushFollow(FOLLOW_theClass_in_program23);
					theClass();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "theClass"
	// compiler.g:58:1: theClass : accessModif CLASS ID OCURLYB ( member )* CCURLYB ;
	public final void theClass() throws RecognitionException {
		try {
			// compiler.g:58:9: ( accessModif CLASS ID OCURLYB ( member )* CCURLYB )
			// compiler.g:59:5: accessModif CLASS ID OCURLYB ( member )* CCURLYB
			{
			pushFollow(FOLLOW_accessModif_in_theClass40);
			accessModif();
			state._fsp--;

			match(input,CLASS,FOLLOW_CLASS_in_theClass42); 
			match(input,ID,FOLLOW_ID_in_theClass44); 
			pushScope();
			match(input,OCURLYB,FOLLOW_OCURLYB_in_theClass48); 
			// compiler.g:59:49: ( member )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// compiler.g:59:49: member
					{
					pushFollow(FOLLOW_member_in_theClass50);
					member();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_theClass53); 
			popScope();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "theClass"



	// $ANTLR start "member"
	// compiler.g:61:1: member : ( method | property );
	public final void member() throws RecognitionException {
		try {
			// compiler.g:61:7: ( method | property )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DOUBLE||LA3_1==INT) ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2==ID) ) {
						int LA3_3 = input.LA(4);
						if ( (LA3_3==18) ) {
							alt3=1;
						}
						else if ( (LA3_3==SEMICOLON||LA3_3==22) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// compiler.g:62:5: method
					{
					pushFollow(FOLLOW_method_in_member66);
					method();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:62:14: property
					{
					pushFollow(FOLLOW_property_in_member70);
					property();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "member"



	// $ANTLR start "method"
	// compiler.g:64:1: method : accessModif tipo ID '(' ( decl_of_args )? ')' block ;
	public final void method() throws RecognitionException {
		try {
			// compiler.g:64:7: ( accessModif tipo ID '(' ( decl_of_args )? ')' block )
			// compiler.g:65:5: accessModif tipo ID '(' ( decl_of_args )? ')' block
			{
			pushFollow(FOLLOW_accessModif_in_method82);
			accessModif();
			state._fsp--;

			pushFollow(FOLLOW_tipo_in_method84);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_method86); 
			match(input,18,FOLLOW_18_in_method88); 
			// compiler.g:65:29: ( decl_of_args )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DOUBLE||LA4_0==INT) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// compiler.g:65:29: decl_of_args
					{
					pushFollow(FOLLOW_decl_of_args_in_method90);
					decl_of_args();
					state._fsp--;

					}
					break;

			}

			match(input,19,FOLLOW_19_in_method93); 
			pushScope();
			pushFollow(FOLLOW_block_in_method97);
			block();
			state._fsp--;

			popScope();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "method"



	// $ANTLR start "block"
	// compiler.g:67:1: block : OCURLYB ( sentences )* CCURLYB ;
	public final void block() throws RecognitionException {
		try {
			// compiler.g:67:6: ( OCURLYB ( sentences )* CCURLYB )
			// compiler.g:68:5: OCURLYB ( sentences )* CCURLYB
			{
			match(input,OCURLYB,FOLLOW_OCURLYB_in_block110); 
			// compiler.g:68:13: ( sentences )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= DOUBLE && LA5_0 <= OCURLYB)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// compiler.g:68:13: sentences
					{
					pushFollow(FOLLOW_sentences_in_block112);
					sentences();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_block115); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block"



	// $ANTLR start "property"
	// compiler.g:70:1: property : accessModif tipo ID ( ',' ID )* SEMICOLON ;
	public final void property() throws RecognitionException {
		try {
			// compiler.g:70:9: ( accessModif tipo ID ( ',' ID )* SEMICOLON )
			// compiler.g:70:11: accessModif tipo ID ( ',' ID )* SEMICOLON
			{
			pushFollow(FOLLOW_accessModif_in_property122);
			accessModif();
			state._fsp--;

			pushFollow(FOLLOW_tipo_in_property124);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_property126); 
			// compiler.g:70:31: ( ',' ID )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==22) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// compiler.g:70:32: ',' ID
					{
					match(input,22,FOLLOW_22_in_property129); 
					match(input,ID,FOLLOW_ID_in_property130); 
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_property134); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "property"



	// $ANTLR start "decl_of_args"
	// compiler.g:72:1: decl_of_args : t1= tipo id1= ID ( ',' t2= tipo id2= ID )* ;
	public final void decl_of_args() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try {
			// compiler.g:72:13: (t1= tipo id1= ID ( ',' t2= tipo id2= ID )* )
			// compiler.g:73:5: t1= tipo id1= ID ( ',' t2= tipo id2= ID )*
			{
			pushFollow(FOLLOW_tipo_in_decl_of_args148);
			t1=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_of_args152); 
			addSym((id1!=null?id1.getText():null),(t1!=null?input.toString(t1.start,t1.stop):null));
			// compiler.g:74:5: ( ',' t2= tipo id2= ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==22) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// compiler.g:74:6: ',' t2= tipo id2= ID
					{
					match(input,22,FOLLOW_22_in_decl_of_args162); 
					pushFollow(FOLLOW_tipo_in_decl_of_args166);
					t2=tipo();
					state._fsp--;

					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_of_args170); 
					addSym((id2!=null?id2.getText():null),(t2!=null?input.toString(t2.start,t2.stop):null));
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl_of_args"



	// $ANTLR start "decl_of_varloc"
	// compiler.g:76:1: decl_of_varloc : tipo id1= ID ( ',' id2= ID )* SEMICOLON ;
	public final void decl_of_varloc() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo1 =null;

		try {
			// compiler.g:76:15: ( tipo id1= ID ( ',' id2= ID )* SEMICOLON )
			// compiler.g:77:5: tipo id1= ID ( ',' id2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_tipo_in_decl_of_varloc186);
			tipo1=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_of_varloc190); 
			addSym((id1!=null?id1.getText():null),(tipo1!=null?input.toString(tipo1.start,tipo1.stop):null));
			// compiler.g:77:49: ( ',' id2= ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==22) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// compiler.g:77:50: ',' id2= ID
					{
					match(input,22,FOLLOW_22_in_decl_of_varloc195); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_of_varloc199); 
					addSym((id2!=null?id2.getText():null),(tipo1!=null?input.toString(tipo1.start,tipo1.stop):null));
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_of_varloc205); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl_of_varloc"



	// $ANTLR start "sentences"
	// compiler.g:80:1: sentences : ( assignment | decl_of_varloc | block );
	public final void sentences() throws RecognitionException {
		try {
			// compiler.g:81:5: ( assignment | decl_of_varloc | block )
			int alt9=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt9=1;
				}
				break;
			case DOUBLE:
			case INT:
				{
				alt9=2;
				}
				break;
			case OCURLYB:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// compiler.g:81:7: assignment
					{
					pushFollow(FOLLOW_assignment_in_sentences219);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:81:20: decl_of_varloc
					{
					pushFollow(FOLLOW_decl_of_varloc_in_sentences223);
					decl_of_varloc();
					state._fsp--;

					}
					break;
				case 3 :
					// compiler.g:81:37: block
					{
					pushFollow(FOLLOW_block_in_sentences227);
					block();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sentences"



	// $ANTLR start "assignment"
	// compiler.g:83:1: assignment : ID '=' expr SEMICOLON ;
	public final void assignment() throws RecognitionException {
		int expr2 =0;

		try {
			// compiler.g:84:5: ( ID '=' expr SEMICOLON )
			// compiler.g:84:7: ID '=' expr SEMICOLON
			{
			match(input,ID,FOLLOW_ID_in_assignment240); 
			match(input,24,FOLLOW_24_in_assignment242); 
			pushFollow(FOLLOW_expr_in_assignment244);
			expr2=expr();
			state._fsp--;

			salida.append("Tipo de expr es: "+expr2 + "\n");
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignment257); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "expr"
	// compiler.g:89:1: expr returns [int eType] : m1= multExpr ( ( '+' | '-' ) m2= multExpr )* ;
	public final int expr() throws RecognitionException {
		int eType = 0;


		int m1 =0;
		int m2 =0;

		try {
			// compiler.g:89:29: (m1= multExpr ( ( '+' | '-' ) m2= multExpr )* )
			// compiler.g:90:21: m1= multExpr ( ( '+' | '-' ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr296);
			m1=multExpr();
			state._fsp--;

			eType =m1; 
			// compiler.g:91:21: ( ( '+' | '-' ) m2= multExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==21||LA10_0==23) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// compiler.g:91:22: ( '+' | '-' ) m2= multExpr
					{
					if ( input.LA(1)==21||input.LA(1)==23 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr329);
					m2=multExpr();
					state._fsp--;

					if (m1!=m2) eType =3;
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return eType;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// compiler.g:96:1: multExpr returns [int mType] : a1= atom ( '*' a2= atom )* ;
	public final int multExpr() throws RecognitionException {
		int mType = 0;


		int a1 =0;
		int a2 =0;

		try {
			// compiler.g:96:29: (a1= atom ( '*' a2= atom )* )
			// compiler.g:97:17: a1= atom ( '*' a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr408);
			a1=atom();
			state._fsp--;

			mType =a1; 
			// compiler.g:98:22: ( '*' a2= atom )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==20) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// compiler.g:98:23: '*' a2= atom
					{
					match(input,20,FOLLOW_20_in_multExpr434); 
					pushFollow(FOLLOW_atom_in_multExpr438);
					a2=atom();
					state._fsp--;

					if(a1!=a2)
					                     mType =3; 
					                   
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mType;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// compiler.g:104:1: atom returns [int aType] : ( CINT | CFLOAT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int aType = 0;


		Token ID3=null;
		int expr4 =0;

		try {
			// compiler.g:105:13: ( CINT | CFLOAT | ID | '(' expr ')' )
			int alt12=4;
			switch ( input.LA(1) ) {
			case CINT:
				{
				alt12=1;
				}
				break;
			case CFLOAT:
				{
				alt12=2;
				}
				break;
			case ID:
				{
				alt12=3;
				}
				break;
			case 18:
				{
				alt12=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// compiler.g:105:15: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom497); 
					aType = 1;
					}
					break;
				case 2 :
					// compiler.g:106:15: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atom518); 
					aType = 2;
					}
					break;
				case 3 :
					// compiler.g:107:15: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_atom537); 
					aType=searchSymbol((ID3!=null?ID3.getText():null));
					}
					break;
				case 4 :
					// compiler.g:108:15: '(' expr ')'
					{
					match(input,18,FOLLOW_18_in_atom556); 
					pushFollow(FOLLOW_expr_in_atom558);
					expr4=expr();
					state._fsp--;

					match(input,19,FOLLOW_19_in_atom560); 
					aType = expr4; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return aType;
	}
	// $ANTLR end "atom"



	// $ANTLR start "accessModif"
	// compiler.g:111:1: accessModif : ( PUBLIC | PRIVATE | PROTECTED );
	public final void accessModif() throws RecognitionException {
		try {
			// compiler.g:111:13: ( PUBLIC | PRIVATE | PROTECTED )
			// compiler.g:
			{
			if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "accessModif"


	public static class tipo_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tipo"
	// compiler.g:116:1: tipo : ( INT | DOUBLE );
	public final compilerParser.tipo_return tipo() throws RecognitionException {
		compilerParser.tipo_return retval = new compilerParser.tipo_return();
		retval.start = input.LT(1);

		try {
			// compiler.g:116:13: ( INT | DOUBLE )
			// compiler.g:
			{
			if ( input.LA(1)==DOUBLE||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tipo"

	// Delegated rules



	public static final BitSet FOLLOW_theClass_in_program23 = new BitSet(new long[]{0x000000000000E002L});
	public static final BitSet FOLLOW_accessModif_in_theClass40 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CLASS_in_theClass42 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_theClass44 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_OCURLYB_in_theClass48 = new BitSet(new long[]{0x000000000000E010L});
	public static final BitSet FOLLOW_member_in_theClass50 = new BitSet(new long[]{0x000000000000E010L});
	public static final BitSet FOLLOW_CCURLYB_in_theClass53 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_member66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_member70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModif_in_method82 = new BitSet(new long[]{0x0000000000000A00L});
	public static final BitSet FOLLOW_tipo_in_method84 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_method86 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_method88 = new BitSet(new long[]{0x0000000000080A00L});
	public static final BitSet FOLLOW_decl_of_args_in_method90 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_method93 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_method97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCURLYB_in_block110 = new BitSet(new long[]{0x0000000000001E10L});
	public static final BitSet FOLLOW_sentences_in_block112 = new BitSet(new long[]{0x0000000000001E10L});
	public static final BitSet FOLLOW_CCURLYB_in_block115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModif_in_property122 = new BitSet(new long[]{0x0000000000000A00L});
	public static final BitSet FOLLOW_tipo_in_property124 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_property126 = new BitSet(new long[]{0x0000000000410000L});
	public static final BitSet FOLLOW_22_in_property129 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_property130 = new BitSet(new long[]{0x0000000000410000L});
	public static final BitSet FOLLOW_SEMICOLON_in_property134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_of_args148 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_decl_of_args152 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_decl_of_args162 = new BitSet(new long[]{0x0000000000000A00L});
	public static final BitSet FOLLOW_tipo_in_decl_of_args166 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_decl_of_args170 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_tipo_in_decl_of_varloc186 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_decl_of_varloc190 = new BitSet(new long[]{0x0000000000410000L});
	public static final BitSet FOLLOW_22_in_decl_of_varloc195 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_decl_of_varloc199 = new BitSet(new long[]{0x0000000000410000L});
	public static final BitSet FOLLOW_SEMICOLON_in_decl_of_varloc205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_sentences219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_of_varloc_in_sentences223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_sentences227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment240 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_assignment242 = new BitSet(new long[]{0x0000000000040460L});
	public static final BitSet FOLLOW_expr_in_assignment244 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assignment257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr296 = new BitSet(new long[]{0x0000000000A00002L});
	public static final BitSet FOLLOW_set_in_expr321 = new BitSet(new long[]{0x0000000000040460L});
	public static final BitSet FOLLOW_multExpr_in_expr329 = new BitSet(new long[]{0x0000000000A00002L});
	public static final BitSet FOLLOW_atom_in_multExpr408 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_multExpr434 = new BitSet(new long[]{0x0000000000040460L});
	public static final BitSet FOLLOW_atom_in_multExpr438 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_CINT_in_atom497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atom518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_atom556 = new BitSet(new long[]{0x0000000000040460L});
	public static final BitSet FOLLOW_expr_in_atom558 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_atom560 = new BitSet(new long[]{0x0000000000000002L});
}
