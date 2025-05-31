package Utilizando_ObjectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        Client client = new Client(1, "Lucas", "54276554221");
        String json = mapper.writeValueAsString(client);

        System.out.println(json);
    }
}
