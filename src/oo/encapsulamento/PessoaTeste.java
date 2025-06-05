package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel", 30);
        p1.setIdade(20);
        System.out.println(p1.getIdade());

        p1.setIdade(-50); // Isso deve lançar uma exceção
        System.out.println(p1.getIdade()); // Não será executado devido à exceção

        System.out.println(p1);
    }
}
