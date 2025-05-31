package Serializacao_Arquivo;

import Utilizando_ObjectMapper.Client;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        String PATH = "clients.json";

        Client client1 = new Client(1, "Lucas", "54276554221");
        Client client2 = new Client(2, "Marcio", "24276554222");
        List<Client> list = List.of(client1, client2);

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(PATH))) {
            mapper.writeValue(writer, list);
        }


    }
}
