package Exercicio_removendo_funcionarios_inativos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Kauã", Status.ACTIVE),
                new Employee("Pedro", Status.ACTIVE),
                new Employee("João", Status.INACTIVE),
                new Employee("Marcos", Status.ACTIVE),
                new Employee("Jorge", Status.INACTIVE)
        ));

        System.out.println(employees);
        List<Employee> employeesActive = removeInactive(employees);
        System.out.println(employeesActive);

    }

    public static List<Employee> removeInactive(List<Employee> list) {
        List<Employee> listUpdate = new ArrayList<>(list.size());

        for (Employee employee : list) {
            if (employee.getStatus() == Status.ACTIVE) {
                listUpdate.add(employee);
            }
        }
        return  listUpdate;
    }
}
