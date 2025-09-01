package Convertendo_entre_arrays_e_lists;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = Arrays.asList(array); // cria uma list com base em um Array
        Integer[] array2 = list.toArray(new Integer[list.size()]); // cria um array com base em uma list
    }
}
