package lista2.questao6;

public class Retangulo {
    private int base;
    private int altura;

    public void setBase(int novoBase){
        base = novoBase;
    }

    public void setAltura(int novaAltura){
        altura = novaAltura;
    }

    public int getBase(){
        return base;
    }

    public int getAltura(){
        return altura;
    }

    public int area(){
        return base * altura;
    }

    public int perimetro(){
        return 2 * (base + altura);
    }

}
