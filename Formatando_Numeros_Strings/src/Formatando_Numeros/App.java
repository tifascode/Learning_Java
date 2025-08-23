package Formatando_Numeros;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        double number = 1234.54;

        Locale locale = Locale.forLanguageTag("pt-BR"); // Criou um Locale para o Brasil
        NumberFormat nf = NumberFormat.getInstance(locale); // Criou um NumberFormat com a instancia dessa locale
        String formated = nf.format(number); // Formatou o numero e retornou uma String
        System.out.println(formated);
    }
}
