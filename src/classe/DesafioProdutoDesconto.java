package classe;

public class DesafioProdutoDesconto {
    public static void main(String[] args) {
        double preco = 100.00; // Preço inicial do produto

        ProdutoDesconto produto = new ProdutoDesconto(preco);

        System.out.printf("Preço do produto após desconto: R$ %.2f%n", produto.preco);

        double preco2 = 200.00; // Preço inicial do segundo produto
        ProdutoDesconto produto2 = new ProdutoDesconto(preco2);
        System.out.printf("Preço do segundo produto após desconto: R$ %.2f%n", produto2.preco);
    }
}
