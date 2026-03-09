package ProjetoPorteiro;

public class Porteiro{

    public void boasVindas(String tipoPessoa, String nome){
        switch (tipoPessoa) {
            case "Homem":
                System.out.println("Bem Vindo, Senhor " + nome);
                break;
            case "Mulher":
                System.out.println("Bem Vinda, Senhorita " + nome);
                break;
            case "Criança":
                System.out.println("Olá, Jovem " + nome);
                break;
        }
    }
}