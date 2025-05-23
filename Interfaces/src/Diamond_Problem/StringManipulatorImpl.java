package Diamond_Problem;

// Diamond Problem occorre quando um classe implementa duas interfaces ou mais que tenham métodos de mesmo nome e mesma assinatura;
// Fazendo com que o Compilador não saiba qual usar quando for chamado

public class StringManipulatorImpl implements StringManipulator, CaracterChanger {

    @Override
    public String Upper(String a) {
        return StringManipulator.super.Upper(a); // Faz com que ao usar Upper seja o implementado em StringManipulator. Resolve o Diamond Problem
    }
}
