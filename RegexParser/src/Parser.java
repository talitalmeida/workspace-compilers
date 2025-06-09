public class Parser implements IParser {

    private String input;
    private int pos;
    private char lookahead;

    @Override
    public char lookahead() {
        return lookahead;
    }

    @Override
    public char next() {
        while (pos < input.length()) {
            char c = input.charAt(pos++);
            if (c != ' ') {
                return c;
            }
        }
        return EOF;
    }

    @Override
    public void match(char c) {
        if (lookahead == c) {
            lookahead = next();
        } else {
            error("Esperado '" + c + "', encontrado '" + lookahead + "'");
        }
    }

    @Override
    public void error(String msg) {
        throw new RuntimeException("Erro na coluna " + (pos) + ": " + msg);
    }

    @Override
    public boolean parse(String string) {
        this.input = string;
        this.pos = 0;
        this.lookahead = next();
        try {
            regex();
            if (lookahead == EOF) {
                return true;
            } else {
                error("Símbolos extras após expressão válida.");
                return false;
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    //---------------------
    // Métodos da gramática
    //---------------------

    // REGEX ::= CONCAT REGEX'
    public void regex() {
        concat();
        regexLinha();
    }

    // REGEX' ::= + CONCAT REGEX' | ε
    public void regexLinha() {
        if (lookahead == '+') {
            match('+');
            concat();
            regexLinha();
        }
        // else ε (vazio)
    }

    // CONCAT ::= KLEENE CONCAT'
    public void concat() {
        kleene();
        concatLinha();
    }

    // CONCAT' ::= KLEENE CONCAT' | ε
    public void concatLinha() {
        if (isId(lookahead) || lookahead == '(') {
            kleene();
            concatLinha();
        }
        // else ε (vazio)
    }

    // KLEENE ::= ATOM * | ATOM
    public void kleene() {
        atom();
        if (lookahead == '*') {
            match('*');
        }
    }

    // ATOM ::= id | (REGEX)
    public void atom() {
        if (isId(lookahead)) {
            match(lookahead); // casa com o id
        } else if (lookahead == '(') {
            match('(');
            regex();
            match(')');
        } else {
            error("Esperado id ou '('");
        }
    }

    //----------------------------
    // Função auxiliar para id
    //----------------------------
    private boolean isId(char c) {
        return c >= 'a' && c <= 'z';
    }
}
