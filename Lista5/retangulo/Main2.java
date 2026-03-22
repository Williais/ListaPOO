package Lista5.retangulo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int qtsRetangulo = 0;
        int qtsQuadrado = 0;
        int somaPerimetro = 0;

        int maiorArea = -1;
        int baseMaior = 0, altMaior = 0;

        int menorArea = Integer.MAX_VALUE;
        int baseMenor = 0, altMenor = 0;

        for(int i = 1; i <= 10; i++){
            Retangulo r = new Retangulo();

            System.out.println("Retângulo " + i + ":");
            System.out.print("Base: ");
            r.setBase(s.nextInt());
            System.out.print("Altura: ");
            r.setAltura(s.nextInt());

            if(r.isQuadrad()){
                qtsQuadrado++;
            }else{
                qtsRetangulo++;
            }
            somaPerimetro += r.perimetro();

            int areaAtual = r.area();
            if(areaAtual > maiorArea){
                maiorArea = areaAtual;
                baseMaior = r.getBase();
                altMaior = r.getAltura();
            }

            if (areaAtual < menorArea){
                menorArea = areaAtual;
                baseMenor = r.getBase();
                altMenor = r.getAltura();
            }
        }

        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("Total de Quadrados: " + qtsQuadrado);
        System.out.println("Total de Retângulos: " + qtsRetangulo);
        System.out.println("Soma de todos os perímetros: " + somaPerimetro);

        System.out.println("\n>>> DESENHO DO MAIOR (Área: " + maiorArea + ")");
        Retangulo retanguloMaior = new Retangulo();
        retanguloMaior.setBase(baseMaior);
        retanguloMaior.setAltura(altMaior);
        retanguloMaior.autoDesenha();

        System.out.println("\n>>> DESENHO DO MENOR (Área: " + menorArea + ")");
        Retangulo retanguloMenor = new Retangulo();
        retanguloMenor.setBase(baseMenor);
        retanguloMenor.setAltura(altMenor);
        retanguloMenor.autoDesenha();

        s.close();
    }
}
