package Exercicio_Exception_ao_Acelerar_Veiculo;

public class App {
    public static void main(String[] args) throws MaximumSpeedAchievedException {

        Vehicle v1 = new Vehicle(50);
        v1.accelerate();
        System.out.println(v1.getActualSpeed());
        v1.accelerate();
        System.out.println(v1.getActualSpeed());
        v1.accelerate();
    }
}
