package Enum_com_Static_Imports;

import static Enum_com_Static_Imports.Car.Brand.BMW; // faz com que não precise referenciar a classe e a enum para usa-la

public class App {
    public static void main(String[] args) {

      //  Car carro1 = new Car(Car.Brand.AUDI);
        Car carro = new Car(BMW);
    }
}
