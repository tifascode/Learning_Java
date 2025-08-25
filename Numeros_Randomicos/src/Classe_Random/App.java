package Classe_Random;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.nextInt(0, 11));
        }

        Random generator2 = new Random(2L); // Seed -> vai recriar sempre a mesma randomização;
        for (int i = 0; i < 10; i++) {
            System.out.println(generator2.nextInt(0, 11));
        }
    }
}
