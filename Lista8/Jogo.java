package Lista8;

public class Jogo {

    private Domino[] pecas = new Domino[28];

    public Jogo(){
        int indice = 0;

        for (int a = 0; a < 6; a++) {
            for (int b = a; b < 6; b++) {
                pecas[indice] = new Domino(a, b);
                indice++;
            }
        }
    }


}
