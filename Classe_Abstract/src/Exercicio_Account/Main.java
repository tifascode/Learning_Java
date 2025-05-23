package Exercicio_Account;

public class Main {
    public static void main(String[] args) {

        SavingsAccount p1 = new SavingsAccount(100);
        System.out.println(p1.getBalance());
        p1.updateBalance();
        System.out.println(p1.getBalance());

        System.out.println("-----------------------");

        CheckingsAccount p2 = new CheckingsAccount(100, 0.10);
        System.out.println(p2.getBalance());
        p2.updateBalance();
        System.out.println(p2.getBalance());
    }
}
