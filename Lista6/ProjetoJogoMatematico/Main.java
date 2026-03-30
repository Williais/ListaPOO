package Lista6.ProjetoJogoMatematico;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a resposta certa");
        int erros = 0;
        int acerto = 0;

        while(true){
            JogoMatematico j = new JogoMatematico();

            j.sortearCalculo();
            System.out.println("\nResolva: " + j.getCalculo());

            System.out.println("Qual a Resposta?");
            int resp = s.nextInt();

            if( j.checarResposta(resp)){
                System.out.println("Parabens, próxima");
                acerto++;
            }else{
                erros ++;

                if(erros < 3){
                    System.out.println("Você Errou. Tente dnv");
                }else{
                    System.out.println("Você Errou 3x. Fim do programa");
                    System.out.println("Você Acertou o total de: " + acerto);
                    break;
                }
            }

        }

    }
}
