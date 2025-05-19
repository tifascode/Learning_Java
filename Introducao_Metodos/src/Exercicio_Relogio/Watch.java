package Exercicio_Relogio;

public class Watch {

    Pointer hour = new Pointer();
    Pointer minute = new Pointer();
    Pointer second = new Pointer();

    void setTime(int hour, int minute, int second) {
        this.hour.posicao = hour;
        this.minute.posicao = minute/5;
        this.second.posicao = second/5;
    }

    int readHour() {
        return this.hour.posicao;
    }

    int readMinute() {
        return this.minute.posicao*5;
    }

    int readSecond() {
        return this.second.posicao*5;
    }
}
