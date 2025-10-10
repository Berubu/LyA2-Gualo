import org.antlr.runtime.*;

public class Test {
    public static void main(String[] args) throws Exception {
        // Correct way to read from System.in for ANTLR v3
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        exprLexer lexer = new exprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        exprParser parser = new exprParser(tokens);

        parser.prog();
    }
}