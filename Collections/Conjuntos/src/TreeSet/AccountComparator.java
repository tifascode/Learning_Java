package TreeSet;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return -Double.compare(o1.balance, o2.balance);
    }
}
