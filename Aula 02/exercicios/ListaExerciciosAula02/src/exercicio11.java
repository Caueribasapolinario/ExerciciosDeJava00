import java.util.Scanner;

public class exercicio11 {
    public static void ehPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}
