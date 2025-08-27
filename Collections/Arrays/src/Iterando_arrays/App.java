package Iterando_arrays;

public class App {
    public static void main(String[] args) {

        int[] array = {12, 32, 12, 67};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int j : array) {
            System.out.println(j);
        }
    }
}
