package Diferentes_Construtores;

import java.util.Objects;

public record PersonRecord(String name, String lastName, int age) { // Utilizando a Record com apenas esta linha de código
                                                                    // chegamos no mesmo resultado

    public PersonRecord { // Colocando código no construtor. Obs: Construtor sem parâmetros pois já recebe os definidos na Record
        Objects.requireNonNull(name);
        Objects.requireNonNull(lastName);
    }

    public PersonRecord(String name, String lastName) { // Construtor passando dois parâmetros, porém tendo que chegar o construtor principal
        this(name, lastName, 0); // Obrigado a definir um valor para a propriedade que não está no construtor
    }
}
