public class Vehicle {

    private String brand;
    private String model;
    private String color;

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void print() {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.color);
    }
}
