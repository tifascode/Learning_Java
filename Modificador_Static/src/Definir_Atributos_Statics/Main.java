package Definir_Atributos_Statics;

public class Main {
    public static void main(String[] args) {

        Account a1 = new Account("Pedro");
        Account a2 = new Account("Pedro");

        System.out.println(a1.getAccountNumber());
        System.out.println(a2.getAccountNumber());


    }
}
