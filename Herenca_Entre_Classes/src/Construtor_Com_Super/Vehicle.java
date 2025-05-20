package Construtor_Com_Super;

public class Vehicle {

    private String brand;
    private String model;
    private String color;

    public  Vehicle() {}

    public Vehicle(String brand, String model, String color) { // Tendo um construtor na super classe torna-se obrigatório o construtor na sub classe
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
}
