package Exercicio_Login;

public class SameLoginMethod implements MethodLogin {

    @Override
    public boolean login(String username, String password) {
        return username.equals(password);
    }
}
