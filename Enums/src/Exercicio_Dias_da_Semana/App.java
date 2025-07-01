package Exercicio_Dias_da_Semana;

public class App {
    public static void main(String[] args) {

        DaysOfWeek dow = DaysOfWeek.Monday.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);
    }
}
