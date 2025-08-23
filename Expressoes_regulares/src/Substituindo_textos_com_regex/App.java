package Substituindo_textos_com_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        String text = "kaua123kaua123kaua";
        String regex = "\\d+";
        String replacement = "*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            m.appendReplacement(sb, replacement); // Troca os caracteres recebendo um StringBuilder como parâmetro
        }
        m.appendTail(sb); // Adiciona o restante dos caracteres da String

        System.out.println(sb.toString());

        // -------------------------------------------------

        System.out.println(text.replaceAll(regex, replacement)); // Forma mais direta
        System.out.println(text.replaceFirst(regex, replacement)); // Altera somente a primeira ocorrência
    }
}
