package Exercicio_Invertendo_Strings;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder(text).reverse();
        System.out.println(text + " ===> " + sb);
    }
}
