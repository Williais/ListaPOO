package Lista6;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a data: ");
        String usuarioData = s.nextLine();

        String[] data = usuarioData.split("/");

        String dia = data[0];
        int mes = Integer.parseInt(data[1]);
        String ano = data[2];
        String[] mesExtenco = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        if(mes >= 1 && mes <= 12){
            String mesCerto = mesExtenco[mes -1];
            System.out.println("Data por Extenso: " + dia + " de " + mesCerto + " de " + ano);
        }else{
            System.out.println("Mes inválido");
        }
    }
}
