package oo.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    final int VELOCIDADE_MINIMA = 0;
    int velocidade = 0;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    private int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public int acelerar() {
        if (velocidade + delta > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
            return velocidade;
        }
        velocidade += delta;
        return velocidade;
    }

    public int frear() {
        if (velocidade >= delta) {
            velocidade -= delta;
        } else {
            velocidade = 0;
        }
        return velocidade;
    }
}
