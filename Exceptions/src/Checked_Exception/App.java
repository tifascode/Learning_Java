package Checked_Exception;

public class App {
    public static void main(String[] args) throws Exception { // Caso não seja utilizado o bloco try-catch é necessário comunicar que a Exception pode ocorrer
        Account a1 = new Account(500);

        a1.withdraw(600);
    }
}
