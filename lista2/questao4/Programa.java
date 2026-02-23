package lista2.questao4;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Livro l = new Livro();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String primeiroNome = s.nextLine();
        p.setPrimeiroNome(primeiroNome);

        System.out.println("Digite seu Segundo Nome: ");
        String ultimoNome = s.nextLine();
        p.setUltimoNome(ultimoNome);

        System.out.println("Digite seu Ano de Nascimento: ");
        int anoNascimento = s.nextInt();
        p.setAnoDeNascimento(anoNascimento);

        
        System.out.println("Digite o Ano de Publicação: ");
        int anoPubli = s.nextInt();
        l.setAnoDePublicacao(anoPubli);
        
        s.nextLine();

        System.out.println("Digite nome do Livro: ");
        String livro = s.nextLine();
        l.setNome(livro);

        l.setAutor(p);

        p.seApresentar();
        l.obterReferencia();
    }
}
