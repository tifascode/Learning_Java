package Modificador_Final_Para_Atributos;

public class Main {
    public static void main(String[] args) {

        final Account c1 = new Account(12548754, "Pedro");
        final Account c2 = new Account(12543654, "João");

        c1.deposit(500); // A variável c1 ser final não implica em nada ao objeto, ele pode ser alterado
                                // Pois o que é final é a varíavel que está na Stack e não o objeto a qual a variável aponta

       // c1 = c2; // Isso não é possível pois neste caso a varíavel que está na stack está sendo alterada
    }
}
