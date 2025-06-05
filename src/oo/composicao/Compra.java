package oo.composicao;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<Item>();
    String cliente;

    double valorTotal() {
        double total = 0;
        for(Item item: itens) {
            total += item.valorItem();
        }

        return total;
    }

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }
}
