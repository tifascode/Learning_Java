package Ordenando_lista_de_objetos_custom;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + "age=" + age + ", name=" + name + '}';
    }
}
