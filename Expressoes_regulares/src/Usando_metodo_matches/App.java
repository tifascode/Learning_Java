package Usando_metodo_matches;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\w*\\s\\w*"); // verifica tem espaço no meio de uma string
        Matcher m = p.matcher("abc def");

        System.out.println(m.matches()); // retorna um booleano
        System.out.println("abc def".matches("\\w*\\s\\w*")); // Tira a necessidade de ter um Matcher e Pattern
    }
}
