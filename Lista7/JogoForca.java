package Lista7;

public class JogoForca {
    private int posicaoSorteada;
    private String gabarito;
    private Palavra[] dicionario;

    public JogoForca(Palavra[] d){
        this.dicionario = d;
    }

    public int getPosicaoSorteada() {
        return posicaoSorteada;
    }

    public String getGabarito() {
        return gabarito;
    }

    public Palavra[] getDicionario() {
        return dicionario;
    }

    public void setDicionario(Palavra[] dicionario) {
        this.dicionario = dicionario;
    }

    public String pegarDica(){
        Palavra escolhido = dicionario[posicaoSorteada];
        return escolhido.getDica();
    }

    public void sortear(){
        int num;

        do {
             num = (int) (Math.random() * dicionario.length);
        } while (dicionario[num] == null);

        this.posicaoSorteada = num;

        String palavra = dicionario[posicaoSorteada].getPalavra();
        String palavraGabarito = "";

        for (int i = 0; i < palavra.length() ; i++) {
            palavraGabarito += "?";
        }

        this.gabarito = palavraGabarito;
    }

    public boolean testarLetra(char a){
        String palavraAtual = dicionario[posicaoSorteada].getPalavra();

        char[] letra = this.gabarito.toCharArray();
        boolean achou = false;
        for (int i = 0; i < palavraAtual.length() ; i++) {
            if(palavraAtual.charAt(i) == a){
                letra[i] = a;
                achou = true;
            }
        }

        if(achou){
            this.gabarito = new String(letra);
        }
        return achou;
    }

    public boolean testaSeAcabou(){
        if(!gabarito.contains("?")){
            dicionario[posicaoSorteada] = null;
            posicaoSorteada = -1;
            return true;
        }
            return false;
    }


}
