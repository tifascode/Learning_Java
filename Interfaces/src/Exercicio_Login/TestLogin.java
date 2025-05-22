package Exercicio_Login;

public class TestLogin {
    public static void main(String[] args) {

        StaticLoginMethod l1 = new StaticLoginMethod();
        System.out.println(l1.login("admin", "admin"));
        System.out.println(l1.login("admin", "123"));

        SameLoginMethod l2 = new SameLoginMethod();
        System.out.println(l2.login("admin", "admin"));
        System.out.println(l2.login("admin", "password"));

        StaticLoginMethod l3 = new StaticLoginMethod("a", "b");
        System.out.println(l3.login("a", "c"));
    }
}
