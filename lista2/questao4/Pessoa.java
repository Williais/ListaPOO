package lista2.questao4;

public class Pessoa {
    private String primeiroNome;
    private String ultimoNome;
    private int anoDeNascimento;

    public void setPrimeiroNome(String novoPrimeiroNome) {
        primeiroNome = novoPrimeiroNome;
    }

    public void setUltimoNome(String novoUltimoNome) {
        ultimoNome = novoUltimoNome;
    }

    public void setAnoDeNascimento(int novoAnoDeNascimento) {
        anoDeNascimento = novoAnoDeNascimento;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void seApresentar() {
        int idade = 2026 - anoDeNascimento;

        System.out.println("Oi, meu nome é " + getPrimeiroNome() + " " + getUltimoNome() + ", tenho " + idade + " anos");
    }
}
