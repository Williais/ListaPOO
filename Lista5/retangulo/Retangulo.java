package Lista5.retangulo;

public class Retangulo {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int perimetro(){
        return 2 * (base + altura);
    }

    public int area(){
        return base * altura;
    }

    public boolean isQuadrad(){
        if(base == altura){
            return true;
        }
        return false;
    }

    public boolean eIgual(Retangulo r){
        return (this.base == r.base && this.altura == r.altura) || (this.base == r.altura && this.altura == r.base);

    }

    public void autoDesenha(){
        System.out.println("AutoDesenhar:");

        for (int i = 0; i < this.altura ; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("O");
            }
            System.out.println();
        }
    }
}
