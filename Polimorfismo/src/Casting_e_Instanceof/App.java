package Casting_e_Instanceof;

public class App {
    public static void main(String[] args) {

        Pet p1 = new Dog();
        p1.feed();
        // p1.sit(); // Não compila, pois por mais que exista essa instancia de Dog, a varíavel que está na stack é do tipo Pet

        if(p1 instanceof Dog) { // Usando o instaceof temos a certeza de que o casting não vai ter problema
            Dog d1 = (Dog) p1; // Utilizando do casting é possivel contornar esse problema
            d1.sit();
        } else {
            System.out.println("Nao é um Dog");
        }
    }
}
