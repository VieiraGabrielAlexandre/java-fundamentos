package oo.polimorfismo;

public class Pessoa {
    private double peso;

    Pessoa(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

    public void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.getPeso();
        }
    }
}
