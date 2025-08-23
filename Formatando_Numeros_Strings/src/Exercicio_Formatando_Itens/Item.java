package Exercicio_Formatando_Itens;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Item {
    private String descricao;
    private double preco;
    private NumberFormat nf;

    public Item(String descricao, double preco, String moeda) {
        this.descricao = descricao;
        this.preco = preco;

        nf = NumberFormat.getCurrencyInstance();
        nf.setCurrency(Currency.getInstance(moeda));
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("%-20s - %-7s", descricao, nf.format(preco));
    }
}
