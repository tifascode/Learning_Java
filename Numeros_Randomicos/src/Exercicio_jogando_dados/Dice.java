package Exercicio_jogando_dados;

import java.util.Random;

public class Dice {

    Random generator = new Random();

    public Numbers roll() {
        return new Numbers(nextNumber(), nextNumber());
    }

    private int nextNumber() {
        return generator.nextInt(1, 7);
    }
}
