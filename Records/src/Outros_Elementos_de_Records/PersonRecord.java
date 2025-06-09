package Outros_Elementos_de_Records;

import java.util.Objects;

public record PersonRecord(String name, String lastName, int age) { // Utilizando a Record com apenas esta linha de código
                                                                    // chegamos no mesmo resultado

    public static final int DEFAULT_AGE = 0; // É possível ter propriedades dentro da Record caso for static

    public PersonRecord { // Colocando código no construtor. Obs: Construtor sem parâmetros pois já recebe os definidos na Record
        Objects.requireNonNull(name);
        Objects.requireNonNull(lastName);
    }

    public PersonRecord(String name, String lastName) { // Construtor passando dois parâmetros, porém tendo que chegar o construtor principal
        this(name, lastName, DEFAULT_AGE); // Obrigado a definir um valor para a propriedade que não está no construtor
    }

    public String fullName() { // É possível ter métodos em Records
        return name + " " + lastName;
    }

    public static PersonRecord create(String name) { // É possível ter métodos static em Records
        return new PersonRecord(name, "");
    }
}
