package Utilizando_ObjectMapper;

public class Client {

    private int id;
    private String name;
    private String cpf;

    public Client(int id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Utilizando_ObjectMapper.Client{" + "id=" + id + ", name=" + name + ", cpf=" + cpf + '}';
    }
}
