package Referencia_nula_classe_wrapper;

public class Person {
    Integer age;
    Integer weight;

    public Person(Integer age, Integer weight) {
        this.age = age;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", weight=" + weight + '}';
    }
}
