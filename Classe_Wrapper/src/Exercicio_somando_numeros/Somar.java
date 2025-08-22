package Exercicio_somando_numeros;

public class Somar implements Operation {
    @Override
    public int execute(Integer n1, Integer n2) {

        return (n1 == null ? 0 : n1) + (n2 == null ? 0 : n2);
    }
}
