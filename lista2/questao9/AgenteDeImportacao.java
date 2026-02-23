package lista2.questao9;

public class AgenteDeImportacao {

    public float converter(ProdutoImportado p){
        float real = p.getPreco() * 5.18f;
        return real;
    }
    
    public float calcularImposto(ProdutoImportado p){
        float valorEmReais = converter(p);
        float imposto = valorEmReais * 0.6f; 
        return imposto;
    }

}
