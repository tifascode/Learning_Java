package Casting_Automatico_com_Instanceof;

public class App {
    public static void main(String[] args) {

        Pet p1 = new Dog();
        p1.feed();
        // p1.sit(); // Não compila, pois por mais que exista essa instancia de Dog, a varíavel que está na stack é do tipo Pet

        if(p1 instanceof Dog d1) { // Usando o instanceof dessa forma não é necessário fazer o casting de forma explícita
            d1.sit();
        } else {
            System.out.println("Nao é um Dog");
        }
    }
}
