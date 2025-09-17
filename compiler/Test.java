import org.antlr.runtime.*;

public class Test {
    public static void main(String[] args) throws Exception {

        ANTLRStringStream in = new ANTLRStringStream(System.in);
        compilerLexer lexer = new compilerLexer(input)
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        compilerParser parser = new compilerParser(tokens);

        parser.program();
    }
}