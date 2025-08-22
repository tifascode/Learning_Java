package Comparando_objetos_wrapper;

public class App {
    public static void main(String[] args) {

        Integer n1 = new Integer(10); // cria explicitamente um objeto
        Integer n2 = new Integer(10);
        System.out.println(n1 == n2); // false

        Integer n3 = 10;
        System.out.println(n1 == n3); // false

        Integer n4 = 10; // utiliza o cache (tem um limite)
        System.out.println(n3 == n4); // true

        Integer n5 = 1000;
        Integer n6 = 1000;
        System.out.println(n5 == n6);

        System.out.println(n5.equals(n6)); // MANEIRA CORRETA
        System.out.println(n5.intValue() == n6.intValue()); // OUTRA MANEIRA CORRETA
    }
}
