package Switch_Expressions;

public class Main {
    public static void main(String[] args) {

        int month = 30;

        int days= switch (month) {
            case 1 -> 31;
            case 2 -> 28;
            case 3, 4, 5, 6, 7 -> 30;
            // default -> 0;
            default -> { // --> precisa ter default
                System.out.println("Invalido");
                yield 0;
            }
        };

        System.out.println(days + " dias");
    }
}
