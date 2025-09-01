package Iterando_listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(List.of("A", "B", "C", "D", "E", "F", "G", "H"));

        for (String s : list) {
            System.out.println(s); // Caso tente remover um elemento durante a iteração, lança uma exception
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) { // consegue remover elementos durante a iteração
            if (iterator.next().equals("a")) {
                iterator.remove();
            }
        }
    }
}
