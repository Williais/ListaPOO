package Lista6;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite números separados por vírgulas: ");
        String numeros = s.nextLine();
        String[] numSeparado = numeros.split(",");
        int maior = 0;

        for (int i = 0; i < numSeparado.length ; i++) {
                int novoNumero = Integer.parseInt(numSeparado[i]);
            if(novoNumero >= maior){
                maior = novoNumero ;
            }
        }

        System.out.print("o maior número foi: " + maior);

    }
}
