package Exercicio_Hierarquia_de_Classes;

public class EarthAnimal extends Animal {

    public EarthAnimal(String color) {
        super(color);
    }

    public void walk() {
        System.out.println("EarthAnimal Walking");
    }

    public void talk() {
        System.out.println("EarthAnimal Talking");
    }
}
