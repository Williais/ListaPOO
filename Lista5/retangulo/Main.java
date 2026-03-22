package Lista5.retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();

        System.out.println("Diga a medida da base do primeiro retangulo");
        r1.setBase(s.nextInt());
        System.out.println("Diga a medida da altura do primeiro retangulo");
        r1.setAltura(s.nextInt());
        System.out.println("Diga a medida da base do segundo retangulo");
        r2.setBase(s.nextInt());
        System.out.println("Diga a medida da altura do segundo retangulo");
        r2.setAltura(s.nextInt());

        if(r1.isQuadrad()){
            System.out.println("O retangulo 1 é quadrados");
        } else {
            System.out.println("O retangulo 1 não é quadrados");
        }

        if(r2.isQuadrad()){
            System.out.println("O retangulo 2 é quadrados");
        } else {
            System.out.println("O retangulo 2 não é quadrados");
        }

        if(r1.eIgual(r2)){
            System.out.println("Os Retângulos são iguais");
        } else{
            System.out.println("Os Retângulos são diferentes");
            if(r1.area() > r2.area()){
            System.out.println("O retangulo com a maior area é o R1: " + r1.area());
            r1.autoDesenha();
            }else{
                System.out.println("O retangulo com a maior area é o R2: " + r2.area());
                r2.autoDesenha();
            }

        }
    }
}
