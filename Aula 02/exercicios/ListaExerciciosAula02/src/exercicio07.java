import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Informe dois números:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int soma = soma(num1,num2);
        System.out.println("O resultado é " + soma);
    }
}
