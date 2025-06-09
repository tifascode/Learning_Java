package Outros_Elementos_de_Records;

public class App {
    public static void main(String[] args) {

        PersonRecord personRecord = new PersonRecord("Jonas", "Silva", 25);

        PersonRecord.create("Mauricio");
        System.out.println(personRecord.fullName());
    }
}
