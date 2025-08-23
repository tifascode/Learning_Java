package Customizando_objeto_NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        double number = 1234.54;

        Locale locale = Locale.forLanguageTag("pt-BR");

        NumberFormat nf = NumberFormat.getInstance(locale);
        String formated = nf.format(number);
        nf.setGroupingUsed(false); // Tira a formatação de milhar
        nf.setMaximumFractionDigits(2); // Numero maximo de digitos a direita
        nf.setMinimumFractionDigits(2); // Numero mínimo de digitos a direita

        System.out.println(formated);
    }
}
