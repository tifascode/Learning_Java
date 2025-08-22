package Autoboxing;

public class App {
    public static void main(String[] args) {
        // Autoboxing
        Integer n1 = 10;
        n1++;
        System.out.println(n1);

        // No Autoboxing
        Integer n2 = Integer.valueOf(10);
        int temp = n2.intValue();
        temp++;
        n2 = Integer.valueOf(temp);
        System.out.println(n2);

    }
}
