package Lista5;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int nota;
        int contador = 1;
        int aluno = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("ADICIONE A MEDIA DO ALUNO NUMERO " + contador);
            nota = s.nextInt();
            if(nota < 7){
                aluno++;
            }
            contador++;
        }

        System.out.println(aluno + " Alunos Estão com a nota menor que a média");

        s.close();
    }
}
