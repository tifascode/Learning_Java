package Exercicio_Hierarquia_de_Classes;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog("Red");
        d1.talk();
        d1.walk();

        Cat c1 = new Cat("Green");
        c1.talk();
        c1.walk();

        Fish f1 = new Fish("Yellow");
        f1.swin();
    }
}
