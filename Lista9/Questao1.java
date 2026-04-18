package Lista9;
import java.util.Scanner;

public class Questao1 {

    public static int encontrarMaior(int num1, int num2){
        return Math.max(num1, num2);
    }

    public static int encontrarMaior(int num1, int num2, int num3){
        return Math.max(encontrarMaior(num1, num2), num3);
    }

    public static int encontrarMaior(int num1, int num2, int num3, int num4){
        return Math.max(encontrarMaior(num1, num2, num3), num4);
    }

    public static int encontrarMaior(int num1, int num2, int num3, int num4, int num5){
        return Math.max(encontrarMaior(num1, num2, num3, num4), num5);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = s.nextInt();

        System.out.println("Digite o outro numero");
        int n2 = s.nextInt();

        System.out.println("Digite o outro numero");
        int n3 = s.nextInt();

        System.out.println("Digite o outro numero");
        int n4 = s.nextInt();

        System.out.println("Digite o outro numero");
        int n5 = s.nextInt();

        int oMaior = Questao1.encontrarMaior(n1, n2, n3, n4, n5);

        System.out.println("O Maior Foi " + oMaior);
    }
}
