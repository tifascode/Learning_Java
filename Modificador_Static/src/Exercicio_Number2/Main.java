package Exercicio_Number2;

public class Main {
    public static void main(String[] args) {
        var n1 = Number.newNumber(10.0);
        var n2 = Number.newNumber(20.0);
        var n3 = Number.add(n1, n2);
        System.out.println(n3.getNum());
    }
}
