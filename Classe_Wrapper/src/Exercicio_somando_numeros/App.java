package Exercicio_somando_numeros;

public class App {
    public static void main(String[] args) {

        Somar somar = new Somar();
        System.out.println(somar.execute(1, 2));
        System.out.println(somar.execute(1, null));
    }
}
