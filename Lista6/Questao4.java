package Lista6;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o Nome n° " + (i+1));
            nomes[i] = s.nextLine();
        }

        int n1 = (int) (Math.random() * nomes.length);
        int n2;

        do {
            n2 = (int) (Math.random() * nomes.length);
        } while (n1 == n2);

        String nome1 = nomes[n1];
        String nome2 = nomes[n2];

        if (nome1.compareToIgnoreCase(nome2) < 0){
            System.out.println("Primeiro nome é " + nome1 + " e o Segundo Nome é " + nome2);
        }else{
            System.out.println("Primeiro nome é " + nome2 + " e o Segundo Nome é " + nome1);
        }
    }
}
