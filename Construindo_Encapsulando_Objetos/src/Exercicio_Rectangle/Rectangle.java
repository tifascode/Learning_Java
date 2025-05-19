package Exercicio_Rectangle;

public class Rectangle {

    final private double width;
    final private double height;
    final private double square;

    public Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
        this.square = width * height;
    }

    public Rectangle (double width) {
        this(width, width);  // Mesmo a varíavel do this sendo width nas duas posições, a segunda equivale a height
    }

    public double getSquare() {

        return square;
    }

}
