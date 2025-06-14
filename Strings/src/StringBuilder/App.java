package StringBuilder;

public class App {
    public static void main(String[] args) {

//        String s = "";
//        for (char c = 'A'; c <= 'Z'; c++) { // Pessimo em performance (Cria diversos objetos na Heap a cada concatenação)
//            s += c;
//        }
//
//        System.out.println(s);

        StringBuilder sb = new StringBuilder(); // O StringBuilder não trabalha internamente com String e sim com CharSequence
        for(char c = 'A'; c <= 'Z'; c++) {      // Dessa forma não temos o problema de criar diversos Objetos
            sb.append(c);
        }
        System.out.println(sb.toString()); // Somente nessa linha será criado um Objeto String

    }
}
