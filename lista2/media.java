package lista2;
import java.util.Scanner;

public class media {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual foi sua media na disciplina?");

        float media = Float.parseFloat(leia.nextLine());

        if (media >= 7) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você não foi aprovado");
        }

        leia.close();
    }
}

// se for 7.5, retornará "Aprovado"

// se for quatro, vai retornar um error

// se for 9, Retornará "Aprovado"