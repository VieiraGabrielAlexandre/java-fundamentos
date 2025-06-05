package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Jogador heroi = new Heroi(10,11);

        Jogador monstro = new Monstro(10, 12);

        System.out.println("Heroi: " + heroi.x + ", " + heroi.y);
        System.out.println("Monstro: " + monstro.x + ", " + monstro.y);

        System.out.println("Heroi Vida: " + heroi.vida);
        System.out.println("Monstro Vida: " + monstro.vida);

        System.out.println("Heroi Atacar: " + heroi.atacar(monstro));
        System.out.println("Monstro Vida: " + monstro.vida);

        System.out.println("Monstro Atacar: " + monstro.atacar(heroi));
        System.out.println("Heroi Vida: " + heroi.vida);

        monstro.andar(Direcao.NORTE);
        System.out.println("Monstro Andou para o Norte: " + monstro.x + ", " + monstro.y);
    }
}
