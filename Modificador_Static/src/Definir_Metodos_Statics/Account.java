package Definir_Metodos_Statics;

public class Account {

    private static int currentId = 1;

    private final String accountOwner;
    private final String accountNumber;
    private double balance;

    public Account(String accountOwner) {

        this.accountOwner = accountOwner;
        this.accountNumber = "0000" + currentId++;
        this.balance = 0;
    }

    public static int getCurrentId() { // Definindo-o como static, passa a não precisar ser instanciado;
        return currentId;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
