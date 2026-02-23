package lista2;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double salario;
        int horaTrabalhada;

        System.out.println("De quanto é seu salário?");
        salario = leitor.nextDouble();
        System.out.println("Seu salário é de " + salario);

        System.out.println("Quantas horas você trabalha por dia?");
        horaTrabalhada = leitor.nextInt();

        double calc = salario / (30 * horaTrabalhada);
        
        System.out.printf("Considerando um mês de 30 dias, você recebe R$ %.2f por hora.%n", calc);


        leitor.close();
    }
}