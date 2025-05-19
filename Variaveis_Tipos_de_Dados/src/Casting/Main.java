package Casting;

public class Main {
    public static void main(String[] args) {

        // CASTING IMPLÍCITO ---> O PRÓPRIO JAVA CONVERTE O TIPO
        byte a = 1;
        int b;
        b = a;
        System.out.println(b);

        int i = 200;
        double j = i;
        System.out.println(j);

        double d = 200;
        System.out.println(d);

        long l = 500;
        System.out.println(l);

        // CASTING EXPLÍCITO ---> O PROGRAMADOR DEVE FAZER A CONVERSÃO
        // PODE HAVER PERDA DE DADOS;
        double v1 = 250.345;
        //  int i1 = v1; // ERRO
        int i1 = (int)v1; // CASTING EXPLÍCITO
        System.out.println(i1);
    }
}
