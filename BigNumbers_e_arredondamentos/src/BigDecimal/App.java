package BigDecimal;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        BigDecimal big = new BigDecimal("10000000");
        big = big.add(BigDecimal.ONE);
        big = big.multiply(BigDecimal.TEN);
        System.out.println(big.toString());

        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1+d2); // saída -> 0.30000000000000004

        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2)); // saída -> 0.3

        BigDecimal b3 = BigDecimal.valueOf(1.0);
        BigDecimal b4 = BigDecimal.valueOf(1);
        System.out.println(b3 == b4); // False
        System.out.println(b3.equals(b4)); // False
        System.out.println(b3.compareTo(b4) == 0); // True
    }
}
