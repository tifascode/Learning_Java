public abstract class Pet { // É um modelo para criar outras classes --> Não pode ser instanciada

    public String name;
    public String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public abstract void sleep(); // Um metod0 abstract obriga que as classes que herdam da super classe implementem esse metod0
                                  // Caso a classe que herda seja também abstract, torna-se opcional a implementação do metod0
}
