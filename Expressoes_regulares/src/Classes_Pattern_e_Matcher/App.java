package Classes_Pattern_e_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {


        printMatcher("abc95590-000a98765-876bc", "\\d\\d\\d\\d\\d-\\d\\d\\d");
        printMatcher("ah7ghf9fd", "([a-z])+");
    }

    private static void printMatcher(String text, String regex) {
        Pattern p = Pattern.compile(regex); // Compila a regex
        Matcher m = p.matcher(text); // Extrai o texto da String com base na regex

        while (m.find()) {
            System.out.println(m.group()); // Pega o grupo de Caracteres
        }
    }
}
