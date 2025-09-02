package Ordenando_lista_de_objetos_custom;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(List.of(
                new Person(24, "Kaua"),
                new Person(32, "Maria"),
                new Person(21, "João"),
                new Person(23, "Roberto")));

        System.out.println(list);

        list.sort(new PersonComparator());
        System.out.println(list);
    }
}
