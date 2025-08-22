package Criando_objetos_wrapper;

public class app {
    public static void main(String[] args) {

        // Integer = new Integer(1); --> NÃO UTILIZAR
        Integer i1 = 1;  // Maneira correta de instanciar o Integer
        Integer i2 = Integer.valueOf("1"); // Tenta converter a string em um numero do tipo Integer
        int i3 = Integer.parseInt("1"); // Tentar converter a string em um tipo primitivo int

        Float f1 = 1.1f;
        Float f2 = Float.valueOf("1.1f");
        float f3 = Float.parseFloat("1.1f");

        Double d1 = 1.2d;
        Double d2 = Double.valueOf("1.2d");
        double d3 = Double.parseDouble("1.2d");

        Boolean b = true;
        Boolean b2 = Boolean.valueOf("true");
        boolean b3 = Boolean.parseBoolean("true");

    }
}
