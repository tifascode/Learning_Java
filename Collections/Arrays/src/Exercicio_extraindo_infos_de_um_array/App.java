package Exercicio_extraindo_infos_de_um_array;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {

        Item[] items = new Item[] {
                new Item("Teclado", 199.99),
                new Item("Mouse", 119.99),
                new Item("Monitor", 999.99)
        };

        Object[] filtered = filter(items);
        Item min = (Item) filtered[0];
        Item max = (Item) filtered[1];
        Double average = (Double) filtered[2];

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);

    }

    public static Object[] filter(Item[] items) {
        Item min = items[0];
        Item max = items[0];
        Double sum = Double.valueOf(0.0);

        for (int i = 0; i < items.length; i++) {
            if(items[i].getPrice() < min.getPrice()) {
                min = items[i];
            }
            if(items[i].getPrice() > max.getPrice()) {
                max = items[i];
            }
            sum += items[i].getPrice();
        }
        return new Object[] {min, max, sum};
    }
}
