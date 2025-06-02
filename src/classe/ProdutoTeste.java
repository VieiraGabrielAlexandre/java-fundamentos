package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno de Notas");
        //p1.nome = "Caderno";
        p1.preco = 12.34;
        p1.desconto = 0.25;

        Produto p2 = new Produto("Caneta Azul", 17.45);
        //p2.nome = "Caneta";
        //p2.preco = 3.45;
        p2.desconto = 0.10;
        System.out.printf("Produto 1: %s, Preço: %.2f, Desconto: %.2f\n", p1.nome, p1.preco, p1.desconto);
        System.out.printf("Produto 2: %s, Preço: %.2f, Desconto: %.2f\n", p2.nome, p2.preco, p2.desconto);

        System.out.println("Preço com desconto do Produto 1: " + p1.precoComDesconto());
        System.out.println("Preço com desconto do Produto 2: " + p2.precoComDesconto());

        System.out.println("Preço com desconto adicional do Produto 1: " + p1.precoComDesconto(1));
    }
}
