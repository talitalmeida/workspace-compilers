import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma expressão regular (ou 'sair' para encerrar):");

        String input = "";
        while (!input.equalsIgnoreCase("sair")) {
            System.out.print("> ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("sair")) {
                boolean result = parser.parse(input);
                System.out.println(result ? "Aceito" : "Rejeitado");
            }
        }

        scanner.close();
    }
}