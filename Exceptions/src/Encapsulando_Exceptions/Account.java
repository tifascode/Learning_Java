package Encapsulando_Exceptions;

public class Account {

    private double balance;
    private final String accountNumber;

    public Account(String accountNumber) {
        this.balance = 1000.0;
        this.accountNumber = accountNumber;
    }

    public void withdraw(double amount) throws InsufficientFundsException { // As checked exception exigem que na assinatura do métod0 esteja comunicado que elas podem vir a ocorrer
        if (amount < 0) {
            throw new InsufficientFundsException(balance); // Estamos lançando uma Exception
        }
        if (amount > balance) {
            throw new InsufficientFundsException(balance); // Podemos ter mais de uma Exception em um mesmo bloco
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
