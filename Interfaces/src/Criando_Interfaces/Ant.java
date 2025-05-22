package Criando_Interfaces;

public class Ant implements Walkable { // Por Ant implementar a interface Walkble ela é obrigada a implementar seus métodos

    private int steps;

    @Override
    public void walk() {
        steps++;
    }

    @Override
    public void stop() {
        steps = 0;
    }
}
