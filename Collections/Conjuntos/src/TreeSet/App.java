package TreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>(); // TreeSet faz a ordenação dos elementos no momento da inserção
        set.add(4);                         // Necessário que a classe implemente Comparable
        set.add(7);
        set.add(2);
        set.add(8);
        System.out.println(set);

        Set<Account> accounts = new TreeSet<>();
        accounts.add(new Account("Juan", 100));
        accounts.add(new Account("Pedro", 120));
        accounts.add(new Account("Maria", 120));
        System.out.println(accounts);
    }
}
