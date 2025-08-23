package Listando_locales_e_currencies;

import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        System.out.println(Currency.getAvailableCurrencies()); // Mostra todas as currencies disponíveis
        System.out.println(Arrays.toString(Locale.getAvailableLocales())); // Mostra todas as locales disponíveis
    }
}
