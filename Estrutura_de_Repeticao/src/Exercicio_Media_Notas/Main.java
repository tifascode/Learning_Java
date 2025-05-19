package Exercicio_Media_Notas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double average = 0;
        double sumNotes = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {

            String line = input.nextLine();

            if (line.equals("")) {
                break;
            }

            sumNotes += Double.parseDouble(line);
            System.out.println("Sum: " + sumNotes);

            count++;
        }
        System.out.println(count);
        average = sumNotes/count;
        System.out.println("Average Notes : " + average);

    }
}
