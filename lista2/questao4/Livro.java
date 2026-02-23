package lista2.questao4;

public class Livro {
    private String nome;
    private int anoDePublicacao;
    private Pessoa autor;

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setAnoDePublicacao(int novoAnoDePublicacao) {
        anoDePublicacao = novoAnoDePublicacao;
    }

    public void setAutor(Pessoa novoAutor) {
        autor = novoAutor;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void obterReferencia() {
        System.out.println(autor.getUltimoNome().toUpperCase() + ", " + autor.getPrimeiroNome() + ". " + nome + ". "
                + anoDePublicacao + ".");
    }
}
