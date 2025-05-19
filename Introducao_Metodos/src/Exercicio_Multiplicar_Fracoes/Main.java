package Exercicio_Multiplicar_Fracoes;

public class Main {
    public static void main(String[] args) {

        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();

        f1.n = 10;
        f1.d = 20;

        f2.n = 5;
        f2.d = 30;

        Fraction f3 = new Fraction();
        f3 = f1.multiply(f2);
        System.out.println("Numerador =  " + f3.n + "\nDenominador =  " + f3.d);
    }
}
