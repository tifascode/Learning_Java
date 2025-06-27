package Exercicio_Convertendo_Caracteres;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String text = scanner.nextLine();
        System.out.println("Digite o texto que deseja substituir: ");
        String replace = scanner.nextLine();

        String result = upperCase(text, replace);
        System.out.println(result);

    }

    static String toUpper(String text, String replace){ // Esse métod0 utiliza replace e não cria uma String nova

        return text.replace(replace, replace.toUpperCase());
    }

    static String upperCase(String text, String replace){ // Esse métod0 utiliza indexOf e substring para criar uma nova String
        int pos = text.indexOf(replace);
        if(pos == -1){
            return text;
        }
        String formated = text.substring(pos, pos + replace.length());
        return text.substring(0, pos) + formated.toUpperCase() + text.substring(pos + replace.length());
    }
}
