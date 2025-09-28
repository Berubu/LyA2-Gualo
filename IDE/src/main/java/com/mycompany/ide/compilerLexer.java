package com.mycompany.ide;

// $ANTLR 3.5.2 compiler.g 2025-09-27 19:57:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compilerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public compilerLexer() {} 
	public compilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public compilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "compiler.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:2:7: ( '(' )
			// compiler.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:3:7: ( ')' )
			// compiler.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:4:7: ( '*' )
			// compiler.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:5:7: ( '+' )
			// compiler.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:6:7: ( ',' )
			// compiler.g:6:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:7:7: ( '-' )
			// compiler.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:8:7: ( '=' )
			// compiler.g:8:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:112:13: ( 'class' )
			// compiler.g:112:15: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:113:13: ( 'public' )
			// compiler.g:113:15: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:114:13: ( 'private' )
			// compiler.g:114:15: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:115:13: ( 'protected' )
			// compiler.g:115:15: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:117:13: ( 'int' )
			// compiler.g:117:15: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:118:13: ( 'double' )
			// compiler.g:118:15: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "OCURLYB"
	public final void mOCURLYB() throws RecognitionException {
		try {
			int _type = OCURLYB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:119:13: ( '{' )
			// compiler.g:119:15: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCURLYB"

	// $ANTLR start "CCURLYB"
	public final void mCCURLYB() throws RecognitionException {
		try {
			int _type = CCURLYB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:120:13: ( '}' )
			// compiler.g:120:15: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CCURLYB"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:121:13: ( ';' )
			// compiler.g:121:15: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:122:13: ( '.' )
			// compiler.g:122:15: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "CFLOAT"
	public final void mCFLOAT() throws RecognitionException {
		try {
			int _type = CFLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:123:13: ( CINT DOT CINT )
			// compiler.g:123:15: CINT DOT CINT
			{
			mCINT(); 

			mDOT(); 

			mCINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CFLOAT"

	// $ANTLR start "CINT"
	public final void mCINT() throws RecognitionException {
		try {
			int _type = CINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:124:13: ( ( '0' .. '9' )+ )
			// compiler.g:124:15: ( '0' .. '9' )+
			{
			// compiler.g:124:15: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CINT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:125:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// compiler.g:125:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// compiler.g:125:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:126:13: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// compiler.g:126:15: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// compiler.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | CLASS | PUBLIC | PRIVATE | PROTECTED | INT | DOUBLE | OCURLYB | CCURLYB | SEMICOLON | DOT | CFLOAT | CINT | ID | WS )
		int alt3=21;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// compiler.g:1:10: T__18
				{
				mT__18(); 

				}
				break;
			case 2 :
				// compiler.g:1:16: T__19
				{
				mT__19(); 

				}
				break;
			case 3 :
				// compiler.g:1:22: T__20
				{
				mT__20(); 

				}
				break;
			case 4 :
				// compiler.g:1:28: T__21
				{
				mT__21(); 

				}
				break;
			case 5 :
				// compiler.g:1:34: T__22
				{
				mT__22(); 

				}
				break;
			case 6 :
				// compiler.g:1:40: T__23
				{
				mT__23(); 

				}
				break;
			case 7 :
				// compiler.g:1:46: T__24
				{
				mT__24(); 

				}
				break;
			case 8 :
				// compiler.g:1:52: CLASS
				{
				mCLASS(); 

				}
				break;
			case 9 :
				// compiler.g:1:58: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 10 :
				// compiler.g:1:65: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 11 :
				// compiler.g:1:73: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 12 :
				// compiler.g:1:83: INT
				{
				mINT(); 

				}
				break;
			case 13 :
				// compiler.g:1:87: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 14 :
				// compiler.g:1:94: OCURLYB
				{
				mOCURLYB(); 

				}
				break;
			case 15 :
				// compiler.g:1:102: CCURLYB
				{
				mCCURLYB(); 

				}
				break;
			case 16 :
				// compiler.g:1:110: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 17 :
				// compiler.g:1:120: DOT
				{
				mDOT(); 

				}
				break;
			case 18 :
				// compiler.g:1:124: CFLOAT
				{
				mCFLOAT(); 

				}
				break;
			case 19 :
				// compiler.g:1:131: CINT
				{
				mCINT(); 

				}
				break;
			case 20 :
				// compiler.g:1:136: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// compiler.g:1:139: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\10\uffff\4\21\4\uffff\1\30\2\uffff\5\21\2\uffff\4\21\1\44\5\21\1\uffff"+
		"\1\21\1\53\4\21\1\uffff\1\60\2\21\1\63\1\uffff\1\64\1\21\2\uffff\1\21"+
		"\1\67\1\uffff";
	static final String DFA3_eofS =
		"\70\uffff";
	static final String DFA3_minS =
		"\1\11\7\uffff\1\154\1\162\1\156\1\157\4\uffff\1\56\2\uffff\1\141\1\142"+
		"\1\151\1\164\1\165\2\uffff\1\163\1\154\1\166\1\164\1\60\1\142\1\163\1"+
		"\151\1\141\1\145\1\uffff\1\154\1\60\1\143\1\164\1\143\1\145\1\uffff\1"+
		"\60\1\145\1\164\1\60\1\uffff\1\60\1\145\2\uffff\1\144\1\60\1\uffff";
	static final String DFA3_maxS =
		"\1\175\7\uffff\1\154\1\165\1\156\1\157\4\uffff\1\71\2\uffff\1\141\1\142"+
		"\1\157\1\164\1\165\2\uffff\1\163\1\154\1\166\1\164\1\172\1\142\1\163\1"+
		"\151\1\141\1\145\1\uffff\1\154\1\172\1\143\1\164\1\143\1\145\1\uffff\1"+
		"\172\1\145\1\164\1\172\1\uffff\1\172\1\145\2\uffff\1\144\1\172\1\uffff";
	static final String DFA3_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff\1\16\1\17\1\20\1\21\1\uffff"+
		"\1\24\1\25\5\uffff\1\23\1\22\12\uffff\1\14\6\uffff\1\10\4\uffff\1\11\2"+
		"\uffff\1\15\1\12\2\uffff\1\13";
	static final String DFA3_specialS =
		"\70\uffff}>";
	static final String[] DFA3_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\7\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\17"+
			"\1\uffff\12\20\1\uffff\1\16\1\uffff\1\7\3\uffff\32\21\4\uffff\1\21\1"+
			"\uffff\2\21\1\10\1\13\4\21\1\12\6\21\1\11\12\21\1\14\1\uffff\1\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\23",
			"\1\25\2\uffff\1\24",
			"\1\26",
			"\1\27",
			"",
			"",
			"",
			"",
			"\1\31\1\uffff\12\20",
			"",
			"",
			"\1\32",
			"\1\33",
			"\1\34\5\uffff\1\35",
			"\1\36",
			"\1\37",
			"",
			"",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"",
			"\1\52",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\61",
			"\1\62",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\65",
			"",
			"",
			"\1\66",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | CLASS | PUBLIC | PRIVATE | PROTECTED | INT | DOUBLE | OCURLYB | CCURLYB | SEMICOLON | DOT | CFLOAT | CINT | ID | WS );";
		}
	}

}
