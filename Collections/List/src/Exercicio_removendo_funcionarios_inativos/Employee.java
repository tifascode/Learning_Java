package Exercicio_removendo_funcionarios_inativos;

public class Employee {
    private String name;
    private Status status;

    public Employee(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "name: " + name + ", status: " + status;
    }
}
