package TreeSet;

import java.util.Comparator;
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

        Set<Account> accounts2 = new TreeSet<>(new AccountComparator()); // Utilizando Comparator
        accounts2.add(new Account("Juan", 100));
        accounts2.add(new Account("Pedro", 500));
        accounts2.add(new Account("Maria", 90));
        System.out.println(accounts2);

        Set<Account> accounts3 = new TreeSet<>(Comparator.comparing(Account::getBalance).reversed()); // Utilizando Lambda
        accounts3.add(new Account("Juan", 100));
        accounts3.add(new Account("Pedro", 500));
        accounts3.add(new Account("Maria", 90));
        System.out.println(accounts3);

    }
}
