package Lista3;
import java.util.Scanner;

public class Questao2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Me diga um nome");
        String nome1 = s.nextLine();

        System.out.println("Me diga um Segundo nome");
        String nome2 = s.nextLine();

        if (nome1.contentEquals(nome2)) {
            System.out.println("O primeiro nome eh igual ao segundo");
        } else{
            System.out.println("O primeiro nome eh diferente do segundo");
        }

        s.close();
    }
}