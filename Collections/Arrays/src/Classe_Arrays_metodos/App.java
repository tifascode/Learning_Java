package Classe_Arrays_metodos;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        String[] array = new String[10];

        Arrays.fill(array, "A"); // Coloca um valor em todas as posições do array
        String arrayString = Arrays.toString(array); // Pega todos os elementos do array e coloca em uma String

        array[0] = "T";
        array[1] = "J";
        array[2] = "D";
        array[3] = "W";
        array[4] = "V";
        array[5] = "Z";

        Arrays.sort(array); // Ordena o array
        System.out.println(Arrays.toString(array));

        int posicao = Arrays.binarySearch(array, "W"); // Utiliza busca binária para encontrar um valor e retorna sua posição
        System.out.println(posicao);

        String[] array2 = Arrays.copyOf(array, 5); // Faz uma copía do array retornando um novo array (pode definir o range da cópia)
        System.out.println(Arrays.toString(array2));

    }
}
