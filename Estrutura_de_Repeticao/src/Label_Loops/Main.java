package Label_Loops;

public class Main {
    public static void main(String[] args) {

        outer: // declarou uma label para o for de fora chamada outer
        for (int i = 0; i <=10; i++) {

            inner: // declarou uma label para o for de dentro chamada inner
            for (int j=0;j<10;j++){
                if (j == 5) {
                    break outer;   // ENCERRA O LOOP DE FORA COM A LABEL
                }
                System.out.println(i + " - " + j);
            }
        }
        System.out.println("Fim");
    }
}
