package ProjetoPorteiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Porteiro p = new Porteiro();
        
        System.out.println("Digite o Nome");
        String resp = s.nextLine();
        
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Cumprimentar Homem");
        System.out.println("2 - Cumprimentar Mulher");
        System.out.println("3 - Cumprimentar Criança");
        int pessoa = s.nextInt();

        switch (pessoa) {
            case 1:
                p.boasVindas("Homem", resp);
                break;
            case 2:
                p.boasVindas("Mulher", resp);
                break;
            case 3:
                p.boasVindas("Criança", resp);
                break;
        }
    }
}
