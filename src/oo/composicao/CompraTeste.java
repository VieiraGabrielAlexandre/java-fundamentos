package oo.composicao;

import java.util.ArrayList;

public class CompraTeste {
    ArrayList<Item> itens = new ArrayList<Item>();

    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Gabriel Vieira";
        c1.itens.add(new Item("Notebook", 1, 1000.00));
        c1.itens.add(new Item("Impressora", 3, 200.00));
        c1.itens.add(new Item("Mouse", 16, 15.00));

        System.out.println(c1.cliente);
        System.out.println("Itens da compra:");
        for (Item item : c1.itens) {
            System.out.println(item);
        }

        System.out.println("Valor total da compra: R$ " + c1.valorTotal());

        Compra c2 = new Compra();
        c2.cliente = "Ana Paula";
        c2.adicionarItem(new Item("Caderno", 10, 15.00));
        c2.adicionarItem(new Item("Caneta", 20, 1.50));
        c2.adicionarItem("Lápis", 30, 0.75);

        System.out.println(c2.cliente);
        System.out.println("Itens da compra:");
        for (Item item : c2.itens) {
            System.out.println(item);
        }
        System.out.println("Valor total da compra: R$ " + c2.valorTotal());
    }


}
