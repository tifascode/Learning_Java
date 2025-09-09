package Equals_e_HashCode;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Account a1 = new Account(123, 1000.0);
        Account a2 = new Account(123, 1000.0);
        Account a3 = new Account(123, 1000.0);

        Set<Account> set = new HashSet<>();
        set.add(a1); // sem sobrescrever o Equals e HashCode o set verifica se é igual por referência
        set.add(a2);
        set.add(a3);
        for (Account a : set) {
            System.out.println(a);
        }
    }
}
