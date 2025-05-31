package Aplicando_Polimorfismo;

public class App {
    public static void main(String[] args) {

        Cat cat = new Cat(); // Instanciando Cat
        cat.feed();

        Pet dog = new Dog(); // Utilizando Polimorfismo
        dog.feed();
    }

    private static void feed(Pet pet) { // Deixa o métod0 mais genérico utilizando a super classe
        pet.feed();                     // Permite criar códigos que não vão quebrar no futuro
    }
}
