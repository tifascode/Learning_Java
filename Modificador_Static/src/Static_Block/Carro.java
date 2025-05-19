package Static_Block;

public class Carro {

    private static int currentId;

    private String carId;
    private String brand;
    private String model;
    private String color;
    private int year;
    private int hp;

    static {
        System.out.println("currentId Iniciado"); // Bloco static garante que ele vai ser executado
        currentId = 1;                            // Vai ser executado uma unica vez
    }                                             // Vai ser executado antes do qualquer construtor ou objeto

    public Carro(String brand, String model, String color, int year, int hp) {
        this.carId = "0000" + currentId++;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.hp = hp;
    }

    public String getId() {
        return carId;
    }
}
