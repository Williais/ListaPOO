package Lista9.projeto2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaPoupanca[] contasPoupanca = new ContaPoupanca[100];
        ContaCorrente[] contasCorrente = new ContaCorrente[100];

        int qtdPoupanca = 0;
        int qtdCorrente = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Deseja cadastrar uma nova conta? (1 - Sim / 0 - Não)");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                break;
            }

            System.out.println("Que tipo de conta deseja abrir? (1 - Corrente / 2 - Poupança)");
            int tipoConta = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome do titular: ");
            String titular = scanner.nextLine();

            System.out.print("Número da conta: ");
            String numero = scanner.nextLine();

            System.out.print("Saldo inicial: ");
            float saldo = scanner.nextFloat();

            if (tipoConta == 1) {
                System.out.print("Limite do Cheque Especial: ");
                float chequeEspecial = scanner.nextFloat();

                contasCorrente[qtdCorrente] = new ContaCorrente(saldo, titular, numero, chequeEspecial);
                qtdCorrente++;

            } else if (tipoConta == 2) {
                System.out.print("Taxa de Rendimento: ");
                float taxaRendimento = scanner.nextFloat();

                contasPoupanca[qtdPoupanca] = new ContaPoupanca(saldo, titular, numero, taxaRendimento);
                qtdPoupanca++;

            } else {
                System.out.println("Tipo de conta inválido.");
            }
        }

        System.out.println("\n--- Relatório Final ---");
        System.out.println("Quantidade de Contas Correntes cadastradas: " + qtdCorrente);
        System.out.println("Quantidade de Contas Poupança cadastradas: " + qtdPoupanca);

        System.out.println("\n--- Contas Correntes ---");
        for (int i = 0; i < qtdCorrente; i++) {
            System.out.println(contasCorrente[i].toString());
        }

        System.out.println("\n--- Contas Poupança ---");
        for (int i = 0; i < qtdPoupanca; i++) {
            System.out.println(contasPoupanca[i].toString());
        }

    }
}