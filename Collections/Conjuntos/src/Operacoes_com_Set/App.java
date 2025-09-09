package Operacoes_com_Set;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4); // não permite valores repetidos

        for (Integer i : set) {
            System.out.println(i);
        }

        System.out.println(set.size()); // verifica o tamanho do conjunto
        System.out.println(set.isEmpty()); // verifica se o conjunto está vazio
        System.out.println(set.contains(1)); // retorna true ou false caso tenha o valor
        set.remove(1); // remove o elemento do conjunto
    }
}
