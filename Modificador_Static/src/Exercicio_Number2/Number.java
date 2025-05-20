package Exercicio_Number2;

public class Number {

    private static int nroNumbers = 0;

    private double num;

    private Number(double num) {
        this.num = num;

        nroNumbers++;
    }

    public double getNum() {
        return num;
    }

    public static Number add(Number n1, Number n2) {
        return new Number(n1.getNum() + n2.getNum());
    }

    public static int getNroNumbers() {
        return nroNumbers;
    }

    public static Number newNumber(double num) {
        return new Number(num);
    }

}
