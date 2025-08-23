package Formatando_Strings;

public class App {
    public static void main(String[] args) {

        int n = 2;

        String s = n + " x " + n + " = " + (n*n); // Concatenação
        System.out.println(s);

        String s1 = String.format("%d x %d = %d", n, n, n*n); // String.format();
        System.out.println(s1);

        System.out.format("%d x %d = %d", n, n, n*n); // System.out.format();
        System.out.printf("%d x %d = %d", n, n, n*n); // System.out.printf();
    }
}
