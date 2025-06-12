package Usando_Bloco_Try_Catch;

public class App {
    public static void main(String[] args) {

        Account a1 = new Account(500);

        try { // Tenta executar o bloco try
            a1.withdraw(400);
            System.out.println("SUCCESS");
        } catch (InsufficientFundsException e) { // Caso uma exception seja lançada, executa o bloco catch
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Pode ser usado mais de um bloco catch
        }
    }
}
