package Exercicio_diferentes_representacoes_numero;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int n = askNumber();
        System.out.println("Binary => " + Integer.toBinaryString(n));
        System.out.println("Hex => " + Integer.toHexString(n));
        System.out.println("Octal => " + Integer.toOctalString(n));
    }

    private static Integer askNumber() {

        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Digite um numero: ");
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Digite novamente.");
            }
        }
    }
}
