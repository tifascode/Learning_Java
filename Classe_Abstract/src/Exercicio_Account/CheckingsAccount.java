package Exercicio_Account;

public class CheckingsAccount extends Account {

    private double rate;

    public CheckingsAccount(double amount, double rate) {
        super(amount);
        this.rate = rate;
    }

    @Override
    public double rate() {
        return rate;
    }
}
