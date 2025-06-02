package classe;

public class Pessoa {
    String nome;
    double peso;

    public String comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
            return this.nome + " comeu " + comida.nome + " e agora pesa " + this.peso + " kg.";
        } else {
            return this.nome + " não comeu nada.";
        }

    }

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
}
