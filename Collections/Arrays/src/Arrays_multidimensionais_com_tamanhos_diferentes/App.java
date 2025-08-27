package Arrays_multidimensionais_com_tamanhos_diferentes;

public class App {
    public static void main(String[] args) {

        int[][] array = new int[2][]; // não especifica o tamanho das colunas
        array[0] = new int[3]; // posição zero vai ter 3 posições
        array[1] = new int[2]; // posição 1 vai ter 2 posições

        for(int[] c : array){ // for que acessa os arrays de cada posição
            for(int c1 : c){ // for que acessa os ints de cada posição
                System.out.print(c1);
            }
            System.out.println();
        }
    }
}
