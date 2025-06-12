package Encapsulando_Exceptions;

public class InsufficientFundsException extends Exception {

    private final double currentBalance;

    public InsufficientFundsException(double balance) {
        super("There is no sufficient founds to withdraw");
        this.currentBalance = balance;
    }
}
