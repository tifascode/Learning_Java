package Ordenando_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(2, 5, 3, 4, 1));
        Collections.sort(list); // Utiliza Comparable dentro da propria classe
        System.out.println(list);

        list.sort(new DescendingComparator()); // utiliza um modo de comparação Próprio externo à classe
        System.out.println(list);
    }
}
