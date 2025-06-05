package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    Ferrari() {
        this(350);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(25);
    }

    @Override
    public void ligarTurbo() {
        setDelta(50);
    }

    @Override
    public void desligarTurbo() {
        setDelta(25);
    }

    @Override
    public void ligarAr() {

    }

    @Override
    public void desligarAr() {

    }

    @Override
    public void velocidadeDoAr(int velocidade) {
        System.out.println("Velocidade do ar: " + velocidade);
    }
}
