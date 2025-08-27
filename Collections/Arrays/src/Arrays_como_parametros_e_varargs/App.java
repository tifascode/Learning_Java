package Arrays_como_parametros_e_varargs;

public class App {
    public static void main(String[] args) {
        System.out.println(sum(10, 2));
        System.out.println(sumArray(new int[] {10,2,2}));
        System.out.println(sumVarArgs(10,2,2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static int sumVarArgs(int... array) { // precisa que o varargs seja o ultimo parâmetro do métod0
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
