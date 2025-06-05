package oo.heranca.desafio;

public interface Luxo {
    void ligarAr();
    void desligarAr();
    default void velocidadeDoAr(int velocidade) {
        velocidade = 1;
        System.out.println("Velocidade do ar: " + velocidade);
    }
}
