package RevisaoProva.projetoPorteiro;

public class Porteiro {
    public void boasVindas(String tipoPessoa, String nome){
       switch (tipoPessoa){
           case "Homem":
               System.out.println("Bem vindo, Senhor " + nome);
               break;
           case "Mulher":
               System.out.println("Bem vinda, Senhora " + nome);
               break;
           default:
               System.out.println("Olá, Jovem " + nome);
                break;
       }
    }
}
