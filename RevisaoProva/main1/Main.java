package RevisaoProva.main1;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            String nome = s1.nextLine();
            nomes[i] = nome;
        }

        int n1 = (int) (Math.random() * nomes.length);
        int n2 = 0;
        do {
            n2 = (int) (Math.random() * nomes.length);
        }while (n1 == n2);

        System.out.println(nomes[n1]);
        System.out.println(nomes[n2]);
    }
}
