package TreeSet;

public class Account implements Comparable<Account> {

    public String numero;
    public double balance;

    public Account(String numero, double balance) {
        this.numero = numero;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(Account o) {
        return this.numero.compareTo(o.numero);
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", numero, balance);
    }
}
