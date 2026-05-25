package Lista11.questao1;

public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;

    private Golpe golpeA;
    private Golpe golpeB;
    private Golpe golpeC;
    private Golpe golpeD;

    public Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;

        this.golpeA = new Terremoto();
        this.golpeB = new Tsunami();
        this.golpeC = new GolpeVazio();
        this.golpeD = new GolpeVazio();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void ataqueA(){
        golpeA.executar();
    }

    public void ataqueB(){
        golpeB.executar();
    }

    public void ataqueC(){
        golpeC.executar();
    }

    public void ataqueD(){
        golpeD.executar();
    }
}
