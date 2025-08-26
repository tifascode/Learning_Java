package BigInteger;

import java.math.BigInteger;

public class App {
    public static void main(String[] args) {

        BigInteger big = new BigInteger("1812738123162312371524712412412");
        big =  big.add(BigInteger.TEN); // SOMA 10
        big = big.multiply(BigInteger.TEN); // MULTIPLICA POR 10
        big = big.subtract(BigInteger.ONE); // SUBSTRAI 10
        big = big.divide(BigInteger.TEN); // DIVIDE POR 10
        big = big.remainder(BigInteger.ONE); // RESTO DA DIVISÃO POR 10
        System.out.println(big.toString());
    }
}
