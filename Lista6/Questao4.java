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



    }
}
