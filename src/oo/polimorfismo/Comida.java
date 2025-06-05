package oo.polimorfismo;

public abstract class Comida {
    public Comida(double peso) {
        setPeso(peso);
    }
    public void Arroz(double peso) {
        this.peso = peso;
    }

    public void Feijao(double peso) {
        this.peso = peso;
    }

    public void Sorvete(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private double peso;
}
