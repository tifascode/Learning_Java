package Exercicio_Somar_Dois_Numeros;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = readNumber(scanner);
        int number2 = readNumber(scanner);

        System.out.println("sum = " + (number1 + number2));

    }

    public static int readNumber(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 10;
        }
    }
}
