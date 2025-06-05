package oo.heranca;

public class Heroi extends Jogador{
    @Override
    public boolean atacar(Jogador oponente) {
        boolean atacou = super.atacar(oponente);
        if (atacou) {
            this.vida += 2; // O herói recupera 2 pontos de vida ao atacar
        }
        return atacou;
    }

    public Heroi(int x, int y) {
        super(x, y);
    }
}
