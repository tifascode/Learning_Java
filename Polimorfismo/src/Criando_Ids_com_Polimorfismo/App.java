package Criando_Ids_com_Polimorfismo;

import Criando_Ids_com_Polimorfismo.Generator.Generator;
import Criando_Ids_com_Polimorfismo.Generator.RandomGenerator;
import Criando_Ids_com_Polimorfismo.Generator.SequenceGenerator;

public class App {
    public static void main(String[] args) {

        Generator generator = new RandomGenerator(); // Utilizando o polimorfismo

        Person p1 = new Person(generator.next()); // Faz com que o código fique dinamico
        System.out.println(p1.getId());

        Person p2 = new Person(generator.next());
        System.out.println(p2.getId());
    }
}
