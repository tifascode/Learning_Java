package List_imutaveis;

import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> list = List.of("a","b","c"); // não pode remover ou adicionar elementos
        var list2 = List.of(1, 2, 3, 4);

        for (int i = 0; i < list2.size(); i++) { // em List utiliza-se o métod0 size() para pegar o tamanho da lista
            System.out.println(list2.get(i));
        }
    }
}
