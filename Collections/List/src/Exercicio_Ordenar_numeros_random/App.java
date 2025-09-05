package Exercicio_Ordenar_numeros_random;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        List<Integer> list = listNumberGenerator(sc.nextInt());
        Collections.sort(list);
        System.out.println(list);
    }



    public static List<Integer> listNumberGenerator(int qtd) {
        Random random = new Random();

        List<Integer> numbers = new ArrayList<>(qtd);
        for (int i = 0; i < qtd; i++) {
            numbers.add(random.nextInt(0, 101));
        }
        return numbers;
    }
}
