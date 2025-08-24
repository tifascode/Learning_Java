package Dividindo_Strings_em_Tokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String texto = "Estou cansado, Estou triste, Estou com sono";

        String[] tokens = texto.split(",");
        System.out.println(Arrays.toString(tokens));

        Scanner sc = new Scanner("Java, é bom demais");
        sc.useDelimiter(", ");
        while (sc.hasNext()) { // verifica se ainda tem uma palavra
            System.out.println(sc.next()); // pega a proxima palavra
        }
    }
}
