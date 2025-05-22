package Metodos_Default_em_Interfaces;

public interface StringManipulator {

    String concat(String a, String b);

    default String Upper(String a) { // Usando default é possível implementar métodos em Interfaces --> Resolve o problema da quebra de contrato
        return a.toUpperCase();
    }
}
