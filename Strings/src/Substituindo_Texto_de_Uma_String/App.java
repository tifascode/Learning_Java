package Substituindo_Texto_de_Uma_String;

public class App {
    public static void main(String[] args) {

        String s = "Curso de Java Java";
        String strReplace = s.replace("Java", "Strings"); // Captura o Texto a ser alterado no primeiro parâmetro e troca pelo texto do Segundo
        System.out.println(strReplace); // Troca todos os textos que tenham a palavra
    }
}
