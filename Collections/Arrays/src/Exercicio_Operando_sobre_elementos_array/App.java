package Exercicio_Operando_sobre_elementos_array;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] array = new int[] {5, 3, 6, 9};
        exp(array);
        System.out.println(Arrays.toString(array));
    }

    public static void exp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
    }
}
