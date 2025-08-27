package Criando_Arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.println(array[0]);
        array[0] = 1;
        System.out.println(Arrays.toString(array));

        int[] array2 = {12, 32, 12, 67};
        System.out.println(Arrays.toString(array2));
    }
}
