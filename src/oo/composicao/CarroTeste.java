package oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println("Carro ligado? " + carro.estaLigado());

        carro.ligar();
        System.out.println("Carro ligado? " + carro.estaLigado());

        System.out.println("Giros do motor: " + carro.motor.giros());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println("Giros do motor após acelerar: " + carro.motor.giros());

        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear(); // Tentativa de frear além do limite

        System.out.println("Giros do motor após frear: " + carro.motor.giros());

        System.out.println(carro.motor.carro.motor.carro.motor.giros());

    }
}
