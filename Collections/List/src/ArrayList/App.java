package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("B");

        for(String str : list){
            System.out.println(str);
        }

        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);
    }
}
