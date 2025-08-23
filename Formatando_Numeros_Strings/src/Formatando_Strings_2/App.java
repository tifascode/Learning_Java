package Formatando_Strings_2;

public class App {
    public static void main(String[] args) {

        Account a1 = new Account("102030", "Carlos Tosin", 2000);
        Account a2 = new Account("908070", "Marcos Freitas", 3000);
        Account a3 = new Account("456567", "Vladimir Putin", 30000);
        Account a4 = new Account("333444", "Donald Trump", 25000);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
