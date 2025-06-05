package oo.composicao.desafio;

import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new java.util.ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    public double obterValorTotal() {
        double total = 0;
        for (Compra compra : compras) {
            for (Item item : compra.itens) {
                total += item.quantidade * item.produto.preco;
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", compras=" + compras +
                '}';
    }
}
