package Modificador_Final_em_Heranca;

public final class Vehicle { // Classe marcada como final significa que não pode ser herdada

    String brand;
    String model;
    String color;

    public final void moving() { // Method marcado como final significa que não pode ser sobrescrito -> Override
        System.out.println("Moving");
    }
}
