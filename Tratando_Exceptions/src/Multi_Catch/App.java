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
        } finally { // O bloco finally vai ser executado nos dois cenários try e catch. Podemos ter apenas um finally por try
                    // Não é necessário ter o bloco catch para usar o bloco finally
            System.out.println("THE END");
        }
    }
}
