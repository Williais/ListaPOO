package Lista9.AtualizacaoDomino;

public class Jogo {

    private Domino[] pecas = new Domino[28];
    private int indicePecaSerPuxada = 0;
    private int pontaAtivaEsquerda = -1;
    private int pontaAtivaDireita = -1;

    public Jogo(){
        int indice = 0;

        for (int a = 0; a <= 6; a++) {
            for (int b = a; b <= 6; b++) {
                pecas[indice] = new Domino(a, b);
                indice++;
            }
        }
    }

    public int getPontaAtivaEsquerda() {
        return pontaAtivaEsquerda;
    }

    public int getPontaAtivaDireita() {
        return pontaAtivaDireita;
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
        this.pontaAtivaDireita = -1;
        this.pontaAtivaEsquerda = -1;
    }

    public Domino puxarPeca(){
        if(indicePecaSerPuxada >= pecas.length){
            return null;
        }

        return pecas[indicePecaSerPuxada++];
    }

    public boolean conectarPontaEsquerda(Domino d){
        if(pontaAtivaEsquerda == -1){
            this.pontaAtivaDireita = d.getLadoB();
            this.pontaAtivaEsquerda = d.getLadoA();

            return true;
        }

        if (pontaAtivaEsquerda == d.getLadoA()) {
            pontaAtivaEsquerda = d.getLadoB();
            return true;
        } else if (pontaAtivaEsquerda == d.getLadoB()) {
            pontaAtivaEsquerda = d.getLadoA();
            return true;
        }
        return false;
    }

    public boolean conectarPontaDireita(Domino d){
        if(pontaAtivaDireita == -1){
            this.pontaAtivaDireita = d.getLadoB();
            this.pontaAtivaEsquerda = d.getLadoA();

            return true;
        }

        if (pontaAtivaDireita == d.getLadoA()) {
            pontaAtivaDireita = d.getLadoB();
            return true;
        } else if (pontaAtivaDireita == d.getLadoB()) {
            pontaAtivaDireita = d.getLadoA();
            return true;
        }
        return false;
    }

    public static boolean testeSeAcabou(Domino[] d){
        int diferenteDeNull = 0;

        for (int i = 0; i < d.length; i++) {
            if(d[i] != null) {
                diferenteDeNull++;
            }
        }
        return diferenteDeNull == 0;
    }
}
