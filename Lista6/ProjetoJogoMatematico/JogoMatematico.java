package Lista6.ProjetoJogoMatematico;

public class JogoMatematico {
    private String calculo;
    private int resposta;

    public String getCalculo() {
        return calculo;
    }

    public int getResposta() {
        return resposta;
    }

    public void sortearCalculo(){
        int n1 = (int) (Math.random() * 101);
        int n2 = (int) (Math.random() * 101);

        int operacao = (int) (Math.random() * 4);

        switch (operacao) {
            case 1:
                resposta = n1 + n2;
                calculo = n1 + " + " + n2;
                break;
            case 2:
                resposta = n1 - n2;
                calculo = n1 + " - " + n2;
                break;
            case 3:
                if (n2 == 0) n2 = 1;
                resposta = n1 / n2;
                calculo = n1 + " / " + n2;
                break;
            default:
                resposta = n1 * n2;
                calculo = n1 + " * " + n2;
                break;
        }
    }

    public boolean checarResposta(int n){
        return n == resposta;
    }
}
