package Exercicio_Operacoes_Matematicas;

public enum Operation implements Calculator {
    SUM('+') {
        @Override
        public double calculate(double num1, double num2) {
            return num1 + num2;
        }
    },
    SUBTRACT('-') {
        @Override
        public double calculate(double num1, double num2) {
            return num1 - num2;
        }
    },
    MULTIPLY('*') {
        @Override
        public double calculate(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIVIDE('/') {
        @Override
        public double calculate(double num1, double num2) {
            return num1 / num2;
        }
    };

    private final char symbol;

    Operation(char operacao) {
        this.symbol = operacao;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
