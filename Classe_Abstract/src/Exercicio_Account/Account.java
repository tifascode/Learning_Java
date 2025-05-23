package Exercicio_Account;

public abstract class Account {

    private double balance;

    public Account(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void updateBalance() {

        balance += balance * rate();
    }

    public abstract double rate();
}
