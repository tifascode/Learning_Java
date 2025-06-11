package Unchecked_Exception;

public class Account {

    private double balance;

    public Account(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new RuntimeException("Amount cannot be negative"); // Estamos lançando uma RuntimeException
        }
        if (amount > balance) {
            throw new RuntimeException("Insufficient funds"); // Podemos ter mais de uma Exception em um mesmo bloco
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
