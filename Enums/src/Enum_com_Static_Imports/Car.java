package Enum_com_Static_Imports;

public class Car {

    public static enum Brand { // sem o modificador static seria necessário uma instancia pa
        BMW,
        MERCEDES,
        AUDI
    }

    public Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }
}
