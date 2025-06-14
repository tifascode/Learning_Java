package Importancia_do_Equals_em_Strings;

public class App {
    public static void main(String[] args) {

        String s1 = "B";
        String s2 = "B";
        String s3 = new String("B");

        System.out.println(s1 == s2); // Aqui s1 e s2 estão referenciando o mesmo objeto na Pool de Strings dentro da Heap
        System.out.println(s1 == s3); // Aqui por mais que o conteúdo da String seja o mesmo, s3 é um novo objeto, fora da Pool de Strings
        System.out.println(s1.equals(s3)); // Por isso o Equals sempre deve ser usado, pois ele compara o conteúdo ao invés da referência de memória

    }
}
