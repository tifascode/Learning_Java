public class Car extends Vehicle { // Classe Car está herdando de Vehicle

    private int power;

    public Car(String brand, String model, String color, int power) {
        super(brand, model, color); // Chamando o construtor de Vehicle para não repetir código
        this.power = power; // Colocando o atributo adicional da classe Car
    }

    @Override
    public void print() { // Reescrevendo print com @Override
        super.print(); // Chamando o print da superclasse para não repetir código
        System.out.println(this.power); // Colacando o código adicional
    }
}
