package ProjetoTriangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Triangulo t = new Triangulo();

        System.out.println("Diga as medidas dos 3 lados do triangulo");
        t.setL1(s.nextInt());
        t.setL2(s.nextInt());
        t.setL3(s.nextInt());
        
        System.out.println("O Perímetro desse triangulo é " + t.perimetro());
        System.out.println("A Área desse triangulo é " + t.area());

        switch (t.tipoTriangulo()) {
            case escalenos:
                System.out.println("É um Triângulo Escaleno");
                break;
            case isósceles:
                System.out.println("É um Triângulo Isósceles");
                break;
            case equiláteros:
                System.out.println("É um Triângulo Equiláteros");
                break;
        }

        s.close();
    }
}
