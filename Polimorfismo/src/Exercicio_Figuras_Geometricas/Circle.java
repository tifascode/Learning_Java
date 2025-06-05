package Exercicio_Figuras_Geometricas;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
