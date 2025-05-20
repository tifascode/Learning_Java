package Construtor_Com_Super;

public class Car extends Vehicle{

    private int power;

    public Car(String brand, String model, String color, int power) {
        super(brand, model, color);
        this.power = power;
    }

    public Car() {} // Quando temos um construtor vazio na super classe, o super fica implícito

}
