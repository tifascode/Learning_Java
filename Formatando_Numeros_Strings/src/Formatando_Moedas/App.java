package Formatando_Moedas;

import java.text.NumberFormat;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        double money = 13243.50;

        Locale locale = Locale.forLanguageTag("en-US");

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String moneyFormat = nf.format(money);
        System.out.println(moneyFormat);
    }
}
