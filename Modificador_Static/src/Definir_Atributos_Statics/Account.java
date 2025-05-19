package Definir_Atributos_Statics;

public class Account {

    private static int currentId = 1; // Static pertence a classe e não ao objeto, portanto qualquer objeto enxerga esse mesmo valor

    //private int currentId = 1;  // Dessa forma o atributo pertence ao objeto, então qualquer objeto criado vai ter 1 como valor;

    private final String accountOwner;
    private final String accountNumber;
    private double balance;

    public Account(String accountOwner) {

        this.accountOwner = accountOwner;
        this.accountNumber = "0000" + currentId++;
        this.balance = 0;
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
