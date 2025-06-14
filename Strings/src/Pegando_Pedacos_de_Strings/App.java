package Pegando_Pedacos_de_Strings;

public class App {
    public static void main(String[] args) {

        String s = "Curso de Java";

        String subs1 = s.substring(0, 5); // a posição do primeiro parâmetro é capturada, a do segundo parâmetro é capturada uma antes 5-1;
        System.out.println(subs1);

        String subs2 = s.substring(5).trim();
        System.out.println(subs2);
    }
}
