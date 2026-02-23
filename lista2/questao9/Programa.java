package lista2.questao9;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        ProdutoImportado p = new ProdutoImportado();
        AgenteDeImportacao a = new AgenteDeImportacao();
        Scanner s = new Scanner(System.in);

        System.out.println("Diga o Tipo do Produto: (Eletronico, Moda...) ");
        String tipoP = s.nextLine();
        p.setTipo(tipoP);

        System.out.println("Diga o preço (em Dólar): ");
        float precoP = s.nextFloat();
        p.setPreco(precoP);

        float real = a.converter(p);
        float imposto = a.calcularImposto(p);
        float custoTotal = real + imposto;
        
        
        System.out.printf("O Produto do tipo " + p.getTipo() + " Com o valos em Reais de " + real + " terá um Custo Final em Real de " + custoTotal);

    }
}
