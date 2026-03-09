package Lista3.projetoPontos;

public class Ponto {
    private int x;
    private int y;

    

    public void setX(int a) {
        x = a;
    }

    public void setY(int b) {
        y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public TipoQuadrante quadrante() {

        if (x == 0 && y == 0) {
            return TipoQuadrante.ORIGEM;
        } else if (x == 0) {
            return TipoQuadrante.EIXO_Y;
        } else if (y == 0) {
            return TipoQuadrante.EIXO_X;
        } else if (x > 0 && y > 0) {
            return TipoQuadrante.PRIMEIRO;
        } else if (x < 0 && y > 0) {
            return TipoQuadrante.SEGUNDO;
        } else if (x < 0 && y < 0) {
            return TipoQuadrante.TERCEIRO;
        } else {
            return TipoQuadrante.QUARTO;
        }
    }

    public boolean eIgual(Ponto p){
        return (this.x == p.getX() && this.y == p.getY());
    }
}
