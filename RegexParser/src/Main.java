public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();

        String[] exemplosValidos = {
            "a",
            "a+b",
            "(a+b)*",
            "a(b+c)*d",
            "(a)",
            "a(b)"
        };

        String[] exemplosInvalidos = {
            "a++b",
            "a+*b",
            "(a+b",
            "a(b",
            "a+",
            "*a"
        };

        System.out.println("------ Testes válidos ------");
        for (String ex : exemplosValidos) {
            System.out.print("Testando: " + ex + " → ");
            boolean result = parser.parse(ex);
            System.out.println(result ? "✔ Aceito" : "❌ Rejeitado");
        }

        System.out.println("\n------ Testes inválidos ------");
        for (String ex : exemplosInvalidos) {
            System.out.print("Testando: " + ex + " → ");
            boolean result = parser.parse(ex);
            System.out.println(result ? "✔ Aceito (INCORRETO)" : "❌ Rejeitado (correto)");
        }
    }
}
