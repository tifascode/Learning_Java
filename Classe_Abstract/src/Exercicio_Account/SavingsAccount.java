package Exercicio_Account;

public class SavingsAccount extends Account {

    public SavingsAccount(double amount) {
        super(amount);
    }

    @Override
    public double rate() {
        return 0.05;
    }
}
