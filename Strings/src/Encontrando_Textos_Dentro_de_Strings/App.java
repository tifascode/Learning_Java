package Encontrando_Textos_Dentro_de_Strings;

public class App {
    public static void main(String[] args) {

        String s = "Curso de Java para Java";
        int pos1 = s.indexOf("Java"); // Procura o texto na String toda até encontrar a primeira ocorrencia
        System.out.println(pos1);
        int pos2 = s.indexOf("Java", 10); // Procura o texto a partir da posição 10
        System.out.println(pos2);

        int pos3 = s.lastIndexOf("Java"); // Procura o texto na String toda até encontrar a ultima ocorrencia
        System.out.println(pos3);
    }
}
