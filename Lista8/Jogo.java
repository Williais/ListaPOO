package Lista8;

public class Jogo {

    private Domino[] pecas = new Domino[28];
    private int indicePecaSerPuxada = 0;

    public Jogo(){
        int indice = 0;

        for (int a = 0; a <= 6; a++) {
            for (int b = a; b <= 6; b++) {
                pecas[indice] = new Domino(a, b);
                indice++;
            }
        }
    }

    public void embaralharPecas(){
        for (int i = 0; i <= 100; i++) {

            int indice1 = (int) (Math.random() * pecas.length);
            int indice2;

            do{
                indice2 = (int) (Math.random() * pecas.length);
            }while(indice2 == indice1);

            Domino temp = pecas[indice1];

            pecas[indice1] = pecas[indice2];
            pecas[indice2] = temp;
        }

        this.indicePecaSerPuxada = 0;
    }

    public Domino puxarPeca(){
        if(indicePecaSerPuxada >= pecas.length){
            return null;
        }

        return pecas[indicePecaSerPuxada++];
    }
}
