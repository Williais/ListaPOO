package RevisaoProva.projetoPorteiro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Porteiro p = new Porteiro();

        int op = s.nextInt();

        switch (op){
            case 1:
                String n1 = s1.nextLine();
                p.boasVindas("Homem", n1);
                break;
            case 2:
                String n2 = s1.nextLine();
                p.boasVindas("Mulher", n2);
                break;
            case 3:
                String n3 = s1.nextLine();
                p.boasVindas("Criança", n3);
                break;
            default:
                System.out.println("não foi possível continuar o programa normalmente");
        }
    }
}
