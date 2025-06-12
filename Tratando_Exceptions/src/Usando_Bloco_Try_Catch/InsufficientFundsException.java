package Usando_Bloco_Try_Catch;

public class InsufficientFundsException extends Exception {

    private final double currentBalance;

    public InsufficientFundsException(double balance) {
        super("There is no sufficient founds to withdraw");
        this.currentBalance = balance;
    }
}
