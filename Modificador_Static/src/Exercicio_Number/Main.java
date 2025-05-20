package Exercicio_Number;

public class Main {
    public static void main(String[] args) {
        var n1 = new Number(10.0);
        var n2 = new Number(20.0);

        var n3 = Number.add(n1, n2);
        System.out.println(n3.getNum());

        System.out.println(Number.getNroNumbers());
    }
}
