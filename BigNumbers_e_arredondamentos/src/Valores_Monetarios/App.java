package Valores_Monetarios;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        double balance = 100.0;
        double price = 69.99;
        System.out.println(balance - price); // saída -> 30.010000000000005

        BigDecimal amount = new BigDecimal("100.00");
        amount = amount.subtract(BigDecimal.valueOf(69.99));
        System.out.println(amount.toString()); // saída -> 30.01


    }
}
