package Lista9.AtualizacaoDomino;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Jogo jogoDomino = new Jogo();

        jogoDomino.embaralharPecas();

        Domino[] jogador1 = new Domino[6];
        Domino[] jogador2 = new Domino[6];
        for (int i = 0; i < 6; i++) {
            jogador1[i] = jogoDomino.puxarPeca();
            jogador2[i] = jogoDomino.puxarPeca();
        }

        Domino primeiraPeca = jogoDomino.puxarPeca();
        jogoDomino.conectarPontaEsquerda(primeiraPeca);

        int pecasJogadas = 0;

        boolean vezDoJ1 = true;
        while(true){
        System.out.println("Peça da mesa: " + primeiraPeca);
            if(vezDoJ1){
                System.out.println("Em jogo: Esquerda:  " + primeiraPeca.getLadoA() + " | Direita: " + primeiraPeca.getLadoB());
                System.out.println("Mão do Jogador 1 : " + Arrays.toString(jogador1));

                System.out.print("Jogador 1, Indique o índice da peça que deseja casar (0-5): ");
                int indice = s.nextInt();

                if(indice < 0 || indice > 5){
                    System.out.println("indice inexistente! vc perdeu.");
                    break;
                }

                System.out.print("Jogador 1, Em qual lado deseja conectar? (Esquerdo = 1 / Direito = 2): ");
                int ladoDaPeca = s.nextInt();

                Domino pecaEscolhida = jogador1[indice];

                if(ladoDaPeca == 1){
                    if(jogoDomino.conectarPontaEsquerda(pecaEscolhida)){
                        primeiraPeca = pecaEscolhida;
                        jogador1[indice] = null;
                        pecasJogadas++;
                    }else{
                        System.out.println("As peças não se encaixaram. vc perdeu o jogo.");
                        break;
                    }


                }


                if(pecaEscolhida == null){
                    System.out.println("Essa posição ta vazia. vc perdeu o jogo.");
                    break;
                }

            }






        }

    }
}
