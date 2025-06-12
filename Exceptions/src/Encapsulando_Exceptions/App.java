package Encapsulando_Exceptions;

public class App {
    public static void main(String[] args) {

        ServiceAccount service = new ServiceAccount();

        try {
            service.createAndWithdraw("123456789", 1110.0);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
