package Exercicio_Operacoes_Matematicas;

public class App {
    public static void main(String[] args) {

        System.out.println(Operation.SUM.calculate(10.0, 10.0));
        System.out.println(Operation.SUBTRACT.calculate(10.0, 10.0));
        System.out.println(Operation.MULTIPLY.calculate(10.0, 10.0));
        System.out.println(Operation.DIVIDE.calculate(10.0, 10.0));
    }
}
