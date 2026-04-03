package Lista7;

public class Palavra {
    private String palavra;
    private String dica;

    public Palavra(String p, String d){
        this.palavra = p;
        this.dica = d;
    }

    public void setPalavra(String p){
        this.palavra = p;
    }

    public String getPalavra(){
        return palavra;
    }
}
