package RevisaoProva.ProjetoFilme;

public class Filme {
    private String titulo;
    private int classificacao;
    private int duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibirDetalhes(){
        int hora = duracao / 60;
        int min = duracao % 60;

        System.out.println("O titulo do Filme é: " + titulo + " com duração de " + hora + "Hrs " + min + "min!"  );
    }

    public boolean podeAssistir(int idade){
            return idade >= classificacao;
    }
}
