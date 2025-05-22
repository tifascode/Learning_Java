package Exercicio_Login;

public class StaticLoginMethod implements MethodLogin {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";

    private String username;
    private String password;

    public StaticLoginMethod(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public StaticLoginMethod() {
        this(USERNAME, PASSWORD);
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }
}
