package Gerando_UUIDs;

import java.util.UUID;

public class App {
    public static void main(String[] args) {

        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        System.out.println(s);
    }
}
