package oo.composicao;

import java.util.ArrayList;

public class Item {
    public Compra compra;
    String nome;
    int quantidade;
    double preco;


    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    double valorItem() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return String.format("%s tem %d unidades a R$ %.2f cada. Total: R$ %.2f",
                nome, quantidade, preco, valorItem());
    }


}
