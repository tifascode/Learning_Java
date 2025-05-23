package Metodos_Static_Private;

public interface StringManipulator {

    default String firstUpper(String a) {
        return getChar() + a.substring(1); // getChar como private sendo usado na própria interface
    }

    private char getChar() { // Private em Interfaces só pode ser usado na prórpria interface
        return '*';
    }

    static String lower(String a) { // Por ser Static pertence a interface, sendo necessário chamar a interface quando for utilizado
        return a.toLowerCase();
    }
}
