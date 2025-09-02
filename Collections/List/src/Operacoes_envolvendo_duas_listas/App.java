package Operacoes_envolvendo_duas_listas;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(List.of("A", "B", "C"));
        List<String> list2 = new ArrayList<>(List.of("C", "E", "F"));
        list.addAll(list2); // métod0 addAll() adiciona uma coleção inteira
        System.out.println(list);
        list2.retainAll(list); // métod0 retainAll() faz a interseccao das listas
        System.out.println(list2);
        list2.removeAll(list); // métod0 removeAll() remove tudo que tem de igual
        System.out.println(list2);
    }
}
