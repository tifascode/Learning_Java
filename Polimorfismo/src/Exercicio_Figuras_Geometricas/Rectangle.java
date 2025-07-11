package Exercicio_Figuras_Geometricas;

public class Rectangle implements Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return height * width;
    }
}
