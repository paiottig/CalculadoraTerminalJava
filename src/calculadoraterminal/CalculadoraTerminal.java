package calculadoraterminal;

import java.util.Scanner;

public class CalculadoraTerminal {

    public static void soma(int n1, int n2) {
        int resultado = n1 + n2;
        System.out.printf("Soma: %d + %d = %d", n1, n2, resultado);
    }

    public static void subtracao(int n1, int n2) {
        int resultado = n1 - n2;
        System.out.printf("Subtracao: %d - %d = %d", n1, n2, resultado);
    }

    public static void multiplicacao(int n1, int n2) {
        int resultado = n1 * n2;
        System.out.printf("Multiplicacao: %d * %d = %d", n1, n2, resultado);
    }

    public static void divisao(int n1, int n2) {
        float resultado = n1 / n2;
        System.out.printf("Divisao: %d / %d = %.2f", n1, n2, resultado);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        String operador = "";
        String continuar = "";

        do {
            System.out.print("Digite um numero inteiro: ");
            n1 = teclado.nextInt();

            System.out.print("Digite o operador(+ - / *): ");
            operador = teclado.next();

            System.out.print("Digite outro numero: ");
            n2 = teclado.nextInt();

            if (operador.equals("+")) {
                soma(n1, n2);
            } else if (operador.equals("-")) {
                subtracao(n1, n2);
            } else if (operador.equals("*")) {
                multiplicacao(n1, n2);
            } else if (operador.equals("/")) {
                divisao(n1, n2);
            }

            System.out.print("\nDeseja continuar? [S/N]\nR: ");
            continuar = teclado.next();

        } while (continuar.equals("S"));
    }

}
