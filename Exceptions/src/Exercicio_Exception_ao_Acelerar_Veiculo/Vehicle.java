package Exercicio_Exception_ao_Acelerar_Veiculo;

public class Vehicle {
    private int actualSpeed;

    public Vehicle(int speed) {
        this.actualSpeed = speed;
    }

    public void accelerate() throws MaximumSpeedAchievedException {
        if (this.actualSpeed * 2 >= 200) {
            throw new MaximumSpeedAchievedException();
        }
        actualSpeed *= 2;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }
}
