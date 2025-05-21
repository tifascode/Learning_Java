package Exercicio_Hierarquia_de_Classes;

public class Dog extends EarthAnimal {

    public Dog(String color) {
        super(color);
    }

    @Override
    public void walk() {
        System.out.println("Dog Walking");
    }

    @Override
    public void talk() {
        System.out.println("Wruff");
    }
}
