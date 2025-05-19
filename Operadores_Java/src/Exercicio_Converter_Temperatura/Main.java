package Exercicio_Converter_Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double TempFahrenheit = input.nextDouble();
        double  TempCelsius;

        TempCelsius = (TempFahrenheit - 32) * 5 / 9;
        System.out.println("Temperatura: " + TempCelsius);
    }
}
