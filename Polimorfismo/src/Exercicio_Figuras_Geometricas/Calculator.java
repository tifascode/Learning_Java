package Exercicio_Figuras_Geometricas;

public class Calculator {

    private static double total;

    public static double sumSurfaceArea(Shape shape) {
        total += shape.surfaceArea();

        return total;
    }
}
