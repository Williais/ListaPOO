package Lista5.triangulo;

import java.util.Scanner;

public class ProjetoTriangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int countEqui = 0, countIso = 0, countEsc = 0;
        double maiorArea = -1.0;
        double menorArea = Double.MAX_VALUE;

        int l1Maior = 0, l2Maior = 0, l3Maior = 0;
        int l1Menor = 0, l2Menor = 0, l3Menor = 0;

        for (int i = 1; i <= 100; i++) {
            Triangulo t = new Triangulo();

            System.out.println("Triângulo " + i + ":");
            t.setL1(scanner.nextInt());
            t.setL2(scanner.nextInt());
            t.setL3(scanner.nextInt());

            TipoTriangulo tipo = t.tipoTriangulo();
            if (tipo == TipoTriangulo.equiláteros) countEqui++;
            else if (tipo == TipoTriangulo.isósceles) countIso++;
            else countEsc++;

            double areaAtual = t.area();

            if (areaAtual > maiorArea) {
                maiorArea = areaAtual;
                l1Maior = t.getL1();
                l2Maior = t.getL2();
                l3Maior = t.getL3();
            }

            if (areaAtual < menorArea) {
                menorArea = areaAtual;
                l1Menor = t.getL1();
                l2Menor = t.getL2();
                l3Menor = t.getL3();
            }
        }

        System.out.println("\nQuantidade por tipo:");
        System.out.println("Equiláteros: " + countEqui);
        System.out.println("Isósceles: " + countIso);
        System.out.println("Escalenos: " + countEsc);

        System.out.println("\nMaior Área: " + maiorArea + " (Lados: " + l1Maior + ", " + l2Maior + ", " + l3Maior + ")");
        System.out.println("Menor Área: " + menorArea + " (Lados: " + l1Menor + ", " + l2Menor + ", " + l3Menor + ")");

        scanner.close();
    }
}
