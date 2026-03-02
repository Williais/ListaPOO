package Lista3.projetoPontos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto();

        System.out.println("Me diga a Primeira Coordenada do primeiro ponto - X");
        ponto1.setX(s.nextInt());

        System.out.println("Me diga a Segunda Coordenada do primeiro ponto - Y");
        ponto1.setY(s.nextInt());

        System.out.println("Me diga a Primeira Coordenada do segundo ponto - X");
        ponto2.setX(s.nextInt());

        System.out.println("Me diga a Segunda Coordenada do segundo ponto - Y");
        ponto2.setY(s.nextInt());

        System.out.println("O Primeiro Ponto está no " + ponto1.quadrante());

        System.out.println("O Segundo Ponto está no " + ponto2.quadrante());

        if (ponto1.eIgual(ponto2)) {
            System.out.println("Os dois pontos são Iguais");
        } else {
            System.out.println("Os dois pontos são Diferentes");
        }

    }
}
