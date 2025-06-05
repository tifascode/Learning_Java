package Classes_Sealed;

public abstract sealed class Vehicle permits Car { // Utilizando o modificar sealed a classe passa a permitir extends apenas do que está em permits
}
