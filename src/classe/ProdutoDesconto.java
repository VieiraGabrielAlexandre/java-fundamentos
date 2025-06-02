package classe;

public class ProdutoDesconto {
    static double desconto = 0.25; // Desconto fixo de 25%
    double preco;

    ProdutoDesconto (double precoInicial) {
        preco = precoInicial;

        preco = preco - (preco * desconto);
    }
}
