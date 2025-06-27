package Enum_com_Implements;

public class App {
    public static void main(String[] args) {
        talk(MyPet.CAT);
        talk(MyPet.DOG);
        talk(MyPet.PIG);
    }

    public static void talk(Pet pet) {
        System.out.println(pet.talk());
    }
}
