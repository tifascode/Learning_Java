package Modificador_Final_Para_Atributos;

public class Account {

    final int accountNumber;
    final String accountOwner;
    double balance;

    public Account(int accountNumber, String accountOwner) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = 0;
    }

    public void deposit(double amount) {

        this.balance += amount;
    }

}
