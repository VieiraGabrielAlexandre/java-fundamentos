package oo.heranca.teste;

import oo.heranca.desafio.Bugatti;
import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;

public class Corrida {
    public static void main(String[] args) {
        Carro ferrari = new Ferrari(580);
        Carro bugatti = new Bugatti();

        System.out.println("Acelerando Ferrari: " + ferrari.acelerar());
        System.out.println("Acelerando Bugatti: " + bugatti.acelerar());

        System.out.println("Freando Ferrari: " + ferrari.frear());
        System.out.println("Freando Bugatti: " + bugatti.frear());

        System.out.println("Acelerando Ferrari: " + ferrari.acelerar());
        System.out.println("Acelerando Bugatti: " + bugatti.acelerar());

        System.out.println("Freando Ferrari: " + ferrari.acelerar());
        System.out.println("Freando Ferrari: " + ferrari.acelerar());
        System.out.println("Freando Ferrari: " + ferrari.acelerar());
        System.out.println("Freando Ferrari: " + ferrari.acelerar());
        System.out.println("Freando Ferrari: " + ferrari.acelerar());
        System.out.println("Freando Ferrari: " + ferrari.acelerar());
    }
}
