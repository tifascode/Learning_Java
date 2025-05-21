package Exercicio_Hierarquia_de_Classes;

public class Cat extends EarthAnimal {

    public Cat (String color) {
        super(color);
    }

    @Override
    public void walk() {
        System.out.println("Cat Walking");
    }

    @Override
    public void talk() {
        System.out.println("Meow");
    }
}
