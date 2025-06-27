package Comparando_Strings_Alfabeticamente;

public class App {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Pet";

        int r = s1.compareTo(s2); // a variável que chama compareTo é o lado negativo e o parâmetro é o lado positivo

        System.out.println(r);  // Logo se o resultado for um valor negativo significa que a variável que chama compareTo é maior
                                // Se o resultado for um valor posisitvo significa que a varíavel do parâmetro do compareTo é maior
                                // Se o resultado for 0 signfica que as Strings são iguais
    }
}
