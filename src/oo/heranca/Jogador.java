package oo.heranca;

public class Jogador {
    public int x;
    public int y;
    public int vida = 100;

    Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(this.x - oponente.x);
        int deltaY = Math.abs(this.y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case OESTE:
                x--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case NORTE:
                y--;
                break;
            default:
                return false; // Direção inválida
        }

        return true;
    }
}
