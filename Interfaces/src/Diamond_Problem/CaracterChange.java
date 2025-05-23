package Diamond_Problem;

public interface CaracterChanger {

    default String Upper(String s) {
        return "*" + s.substring(1);
    }
}
