package oo.encapsulamento;

public class Pessoa {
    public Pessoa(String nome, int idade) {
        this.idade = idade;
        this.setNome(nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        idade = Math.abs(idade);
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida: " + idade);
        }

        this.idade = idade;
    }

    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
