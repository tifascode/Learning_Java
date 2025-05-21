package Exercicio_Hierarquia_de_Classes;

public class Fish extends WaterAnimal {

    public Fish(String color) {
        super(color);
    }

    @Override
    public void swin() {
        System.out.println("Fish Swimming");
    }
}
