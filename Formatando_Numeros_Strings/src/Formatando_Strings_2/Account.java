package Formatando_Strings_2;

public class Account {

    private String number;
    private String name;
    private double balance;

    public Account(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("%-6s - %-15s - %-7f", number, name, balance); // Utilizando o String Format no toString()
    }
}
