package Diamond_Problem;

public interface StringManipulator {

    default String Upper(String a) {
        return a.toUpperCase();
    }
}
