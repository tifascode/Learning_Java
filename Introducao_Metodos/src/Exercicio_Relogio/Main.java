package Exercicio_Relogio;

public class Main {
    public static void main(String[] args) {

        Watch w = new Watch();

        w.setTime(3, 25,50);

        System.out.println("Hour(s): " + w.readHour() + " | " + "Minute(s): " + w.readMinute()+ " | " + "Second(s): " + w.readSecond());
        System.out.println(w.hour.posicao + " " +  w.minute.posicao + " " + w.second.posicao);

    }
}
