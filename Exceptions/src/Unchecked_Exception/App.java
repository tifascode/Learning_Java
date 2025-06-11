package Unchecked_Exception;

public class App {
    public static void main(String[] args) {
        Account a1 = new Account(500);

        a1.withdraw(300);
        System.out.println("SUCCESS");
    }
}
