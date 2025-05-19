package Exercicio_Lamp;

public class Main {
    public static void main(String[] args) {

        Lamp l1 = new Lamp(true);

        l1.showState();
        l1.turnOff();
        l1.showState();
        l1.turnOn();
        l1.showState();

        l1.turnOff();
        l1.showState();
        
    }
}
