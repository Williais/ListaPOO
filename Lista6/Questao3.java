package Lista6;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = s.nextLine().toLowerCase();

        int vogais = 0;
        int consoantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra >= 'a' && letra <= 'z'){
                if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                    vogais++;
                }else {
                    consoantes++;
                }
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }
}
