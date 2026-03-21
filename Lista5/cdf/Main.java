package Lista5.cdf;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CDF teste = new CDF();
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número limite: ");
        int limite = s.nextInt();

        System.out.println("Números primos entre 1 e " + limite + ":");

        for (int i = 1; i <= limite; i++) {

            if (teste.ePrimo(i)) {
                System.out.print(i + " ");
            }
        }

        s.close();
    }
}
