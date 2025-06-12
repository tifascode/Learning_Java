package Encapsulando_Exceptions;

public class ServiceAccount {

    public void createAndWithdraw(String accountNumber, double amount) throws ServiceException {
        Account account = new Account(accountNumber);

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            throw new ServiceException(e.getMessage());
        }
    }
}
