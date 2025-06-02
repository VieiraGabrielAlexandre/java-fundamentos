package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoAdicional) {
        System.out.println("Calculando preço com desconto adicional...");
        return preco * (1 - this.desconto - descontoAdicional);
    }

    Produto(String nomeInicial) {
        nome = nomeInicial;
        preco = 0;
        desconto = 0.1; // 10% de desconto padrão
    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = 0.1; // 10% de desconto padrão
    }
}
