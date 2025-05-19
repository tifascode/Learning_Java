package Exercicio_Multiplicar_Fracoes;

public class Fraction {

    int n;
    int d;

    Fraction multiply (Fraction f) {
        Fraction result = new Fraction();

        result.n = this.n * f.n;
        result.d = this.d * f.d;

        return result;
    }
}
