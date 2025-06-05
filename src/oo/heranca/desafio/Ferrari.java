package oo.heranca.desafio;

public class Ferrari extends Carro{
    Ferrari() {
        this(350);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 350;
    }
}
