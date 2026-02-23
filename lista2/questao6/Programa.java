package lista2.questao6;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.println("Digite a o valor da Base");
        int b = s.nextInt();
        r.setBase(b);

        System.out.println("Digite a o valor da Altura");
        int a = s.nextInt();
        r.setAltura(a);

        System.out.println("O valor da Área é " + r.area() + " com o Perímetro de " + r.perimetro());
    }
}
