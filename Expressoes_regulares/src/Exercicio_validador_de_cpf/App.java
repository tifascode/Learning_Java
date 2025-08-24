package Exercicio_validador_de_cpf;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String cpf = "05348858021";
        String cpf2 = "053.488.580-22";
        String cpf3 = "053 488 580 33";
        String cpf4 = "053-488-580.33";

        String regex = "\\d{3}([.\\s])?\\d{3}([.\\s])?\\d{3}([-\\s])?\\d{2}";
        System.out.println(cpf.matches(regex));
        System.out.println(cpf2.matches(regex));
        System.out.println(cpf3.matches(regex));
        System.out.println(cpf4.matches(regex));

    }
}
