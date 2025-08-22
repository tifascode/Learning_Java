package Referencia_nula_classe_wrapper;

public class App {
    public static void main(String[] args) {
        Person p = new Person(null, null); // Classes Wrappers por serem objetos conseguem ser null;
        System.out.println(p);

        Person p2 = new Person(null, 10);
        System.out.println(p2.age + p2.weight); // Vai gerar exception pois valores primitivos não suportam operar com null
    }
}
