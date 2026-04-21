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


        System.out.println("Primeira peça: " + primeiraPeca);

        boolean vezDoJ1 = true;
        while(true){

            System.out.println("\n--- STATUS DO JOGO ---");
            System.out.println("Em jogo: Esquerda: " + jogoDomino.getPontaAtivaEsquerda() +
                    " | Direita: " + jogoDomino.getPontaAtivaDireita());

            Domino[] maoAtual = vezDoJ1 ? jogador1 : jogador2;
            int numJogador = vezDoJ1 ? 1 : 2;

            System.out.println("mao do Jogador " + numJogador + ": " + Arrays.toString(maoAtual));

            System.out.print("Jogador " + numJogador + ", indique o índice da peça (0-5): ");
            int indice = s.nextInt();

            if(indice < 0 || indice > 5 || maoAtual[indice] == null){
                System.out.println("Índice inválido ou posição vazia! Você perdeu.");
                break;
            }

            Domino pecaEscolhida = maoAtual[indice];
            System.out.print("Em qual lado conectar? (1-Esquerdo / 2-Direito): ");
            int lado = s.nextInt();

            boolean sucesso = false;
            if(lado == 1) {
                sucesso = jogoDomino.conectarPontaEsquerda(pecaEscolhida);
            } else {
                sucesso = jogoDomino.conectarPontaDireita(pecaEscolhida);
            }

            if(sucesso) {

                maoAtual[indice] = null;
                if(Jogo.testeSeAcabou(maoAtual)) {
                    System.out.println("Jogador " + numJogador + " venceu o jogo!");
                    break;
                }

                vezDoJ1 = !vezDoJ1;
            } else {
                System.out.println("peças nao se encaixam. Jogador " + numJogador + " perdeu.");
                break;
            }
        }

    }
}
