package Exercicio_Media_Alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.println("Digite a nota 1:");
        nota1 = input.nextDouble();
        System.out.println("Digite a nota 2:");
        nota2 = input.nextDouble(); // --> nextDouble() recebe os valores com o tipo Double
        System.out.println("Digite a nota 3:");
        nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media: " + media);
    }
}
