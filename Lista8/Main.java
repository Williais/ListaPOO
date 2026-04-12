package Lista8;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Jogo jogoDomino = new Jogo();

        jogoDomino.embaralharPecas();

        Domino[] mao = new Domino[6];
        for (int i = 0; i < 6; i++) {
            mao[i] = jogoDomino.puxarPeca();
        }

        Domino pecaDaVez = jogoDomino.puxarPeca();
        int pecasJogadas = 0;

        while (true) {
            System.out.println("Peça da vez: " + pecaDaVez);
            System.out.println("Peças na mão: " + Arrays.toString(mao));

            System.out.print("Indique o índice da peça que deseja casar (0-5): ");
            int indice = s.nextInt();


            if (indice < 0 || indice > 5) {
                System.out.println("indice inexistente! vc perdeu.");
                break;
            }

            Domino pecaEscolhida = mao[indice];

            if (pecaEscolhida == null) {
                System.out.println("Essa posição ta vazia. vc perdeu o jogo.");
                break;
            }

            if (pecaEscolhida.validarJuncao(pecaDaVez)) {
                System.out.println(pecaEscolhida + " se conecta com " + pecaDaVez);
                pecaDaVez = pecaEscolhida;
                mao[indice] = null;
                pecasJogadas++;

                if (pecasJogadas == 6) {
                    System.out.println("Parabéns! vc não tem mais peças e ganhou o jogo");
                    break;
                }
            } else {
                System.out.println("A peça " + pecaEscolhida + " não conecta com " + pecaDaVez + "! vc perdeu.");
                break;
            }
        }

        System.out.println("vc conseguiu tirar da sua mão " + pecasJogadas + " peças.");
    }
}
