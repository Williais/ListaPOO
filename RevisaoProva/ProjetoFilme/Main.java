package RevisaoProva.ProjetoFilme;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Filme f = new Filme();

        while (true){
            System.out.println("Escolha as opções");
            int op = s.nextInt();

            switch (op){
                case 1:
                    System.out.println("Cadastre o nome do filme");
                    f.setTitulo(s1.nextLine());
                    System.out.println("Cadastre a duração");
                    f.setDuracao(s.nextInt());
                    System.out.println("Cadastre a classificação");
                    f.setClassificacao(s.nextInt());

                    f.exibirDetalhes();
                    break;
                case 2:
                    System.out.println("Qual sua idade");

                    if(f.podeAssistir(s.nextInt())){
                        System.out.println("Pode Assistir");
                    }else{
                        System.out.println("NÃO Pode Assistir");
                    }
                    break;
                default:
                    System.out.println("Finalizando!");
                    break;
            }
        }

    }
}
