package Arredondamentos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) {

        double value = 10.5;

        long v = Math.round(value);
        System.out.println(v);

        double d = Math.floor(value);
        System.out.println(d);

        double d2 = Math.ceil(value);
        System.out.println(d2);

        BigDecimal b1 = BigDecimal.valueOf(10.43);
        b1 = b1.setScale(1, RoundingMode.UP);
        System.out.println(b1);

        BigDecimal b2 = BigDecimal.valueOf(10.43);
        b2 = b2.setScale(1, RoundingMode.DOWN);
        System.out.println(b2);
    }
}
