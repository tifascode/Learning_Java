package Exercicio_remover_elementos_string;

public class App {
    public static void main(String[] args) {

        String text = "Eu98fui5436ao6mercado87ontem";
        String regex = "\\D";
        String replecement = "";

        System.out.println(text.replaceAll(regex, replecement));
    }
}
