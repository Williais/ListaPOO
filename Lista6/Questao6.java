package Lista6;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um Numero");
        int numero = s.nextInt();

        System.out.println("Seu numero foi " + numero);
        System.out.println("Seu numero foi " + Integer.toBinaryString(numero));
        System.out.println("Seu numero em Hexadecimal é " + Integer.toHexString(numero));
    }
}
