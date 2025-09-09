package Equals_e_HashCode;

import java.util.Objects;

public class Account {
    private int number;
    private double balance;

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + "number=" + number + ", balance=" + balance + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number && Double.compare(balance, account.balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance);
    }
}
