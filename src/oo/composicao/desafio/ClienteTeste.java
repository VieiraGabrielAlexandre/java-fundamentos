package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");

        cliente.compras.add(new Compra());
        cliente.compras.get(0).itens.add(new Item(new Produto("Arroz", 19.99), 2));
        cliente.compras.get(0).itens.add(new Item(new Produto("Feijão", 7.99), 1));
        cliente.compras.get(0).itens.add(new Item(new Produto("Macarrão", 3.49), 3));

        cliente.compras.add(new Compra());
        cliente.compras.get(1).itens.add(new Item(new Produto("Carne", 29.99), 1));
        cliente.compras.get(1).itens.add(new Item(new Produto("Frango", 15.49), 2));
        cliente.compras.get(1).itens.add(new Item(new Produto("Peixe", 25.00), 1));

        System.out.println(cliente.obterValorTotal());

        System.out.println(cliente);
        System.out.println(cliente.compras.get(0));
        System.out.println(cliente.compras.get(0).itens.get(0).quantidade);

    }
}
