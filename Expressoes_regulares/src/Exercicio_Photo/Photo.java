package Exercicio_Photo;

import java.util.Scanner;

public class Photo {

    String number;
    String ano;
    String cidade;

    private Photo(String number, String ano, String cidade) {
        this.number = number;
        this.ano = ano;
        this.cidade = cidade;
    }

    public static Photo createPhoto(String fileName) {
        //IMG_00013-1988-Sao_Paulo.png
        //IMG_023-1988-Sao_Paulo.png
        // String regex = "-(.*?)-";
        Scanner scanner = new Scanner(fileName);
        scanner.useDelimiter("[-.]");

        String number = scanner.next().replaceAll("\\D", "");
        String ano = scanner.next();
        String cidade = scanner.next();

        return new Photo(number, ano, cidade);
    }

    @Override
    public String toString() {
        return String.format("Numero: %s\nAno: %s\nCidade: %s", number, ano, cidade);
    }
}
