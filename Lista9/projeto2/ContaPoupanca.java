package Lista9.projeto2;

public class ContaPoupanca {

    private float saldo;
    private String titular;
    private String numero;
    private float taxaDeRendimento;

    public ContaPoupanca(float saldo, String titular, String numero, float taxaDeRendimento) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(float taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public String toString(){
        return "Tipo da Conta: Conta Poupança - Numero da Conta: " + numero + " Com Saldo Total: R$ " + saldo;
    }
}
