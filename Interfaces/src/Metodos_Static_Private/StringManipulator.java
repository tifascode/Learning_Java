package Metodos_Static_Private;

public interface StringManipulator {

    default String firstUpper(String a) {
        return getChar() + a.substring(1); // getChar como private sendo usado na própria interface
    }

    private char getChar() { // Private em Interfaces só pode ser usado na prórpria interface
        return '*';
    }
}
