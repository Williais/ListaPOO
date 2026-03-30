package Lista6;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um Nome");
        String nome = s.nextLine();

        String escada = "";
        for (int i = 0; i < nome.length(); i++) {
            escada = escada + nome.charAt(i);
            System.out.println(escada);
        }
    }
}
