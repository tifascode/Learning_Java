package Exercicio_Lamp;

public class Lamp {

    private Boolean state;

    public Lamp (Boolean state) {
        this.state = state;
    }

    public void turnOn() {
        state = true;
    }

    public void turnOff() {
        state = false;
    }

    public void showState() {

        System.out.println("Lamp: " + (state ? "On" : "Off"));

    }
}
