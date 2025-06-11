package Criando_Exceptions_Customizadas;

public class App {
    public static void main(String[] args) throws InsufficientFundsException { // Pode ser usado o tipo mais genérico (Exception) para aceitar todas as Exceptions
        Account a1 = new Account(500);

        a1.withdraw(600);
    }
}
