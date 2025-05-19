package Exercicio_Rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10.0, 5.0);
        System.out.println(r1.getSquare());

        Rectangle r2 = new Rectangle(10);
        System.out.println(r2.getSquare());
    }
}
