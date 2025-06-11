package Criando_Exceptions_Customizadas;

public class Account {

    private double balance;

    public Account(double amount) {
        this.balance = amount;
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
