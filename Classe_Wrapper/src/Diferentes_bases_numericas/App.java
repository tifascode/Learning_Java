package Diferentes_bases_numericas;

public class App {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));

        System.out.println();

        System.out.println(Integer.valueOf("1010", 2)); // --> base binária
        System.out.println(Integer.valueOf("32fc", 16)); // --> base hexadecimal
        System.out.println(Integer.valueOf("12", 8)); // --> base octal

        System.out.println();

        System.out.println(Integer.decode("0x32fc"));
        System.out.println(Integer.decode("10"));
        System.out.println(Integer.decode("07"));
    }
}
