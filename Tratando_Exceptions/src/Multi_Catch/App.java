package Multi_Catch;

import Usando_Bloco_Try_Catch.Account;
import Usando_Bloco_Try_Catch.InsufficientFundsException;

public class App {
    public static void main(String[] args) {

        Usando_Bloco_Try_Catch.Account a1 = new Account(500);

        try { // Tenta executar o bloco try
            a1.withdraw(400);
            System.out.println("SUCCESS");
        } catch (InsufficientFundsException | IllegalArgumentException e) { // Multi Catch, usado para exceptions que vão receber o mesmo tratamento
            System.out.println(e.getMessage());
        }
    }
}
