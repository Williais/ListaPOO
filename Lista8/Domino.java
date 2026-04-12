package Lista8;

public class Domino {
    private int ladoA;
    private int ladoB;

    public Domino(int a, int b){
        this.setLadoA(a);
        this.setLadoB(b);
    }

    public void setLadoA(int a){
        if(a >= 0 && a <= 6){
            this.ladoA = a;
        }else{
            System.out.println("O valor ta fora do intervalo de 0 a 6");
        }
    }

    public void setLadoB(int b){
        if(b >= 0 && b <= 6){
            this.ladoB = b;
        }else{
            System.out.println("O valor ta fora do intervalo de 0 a 6");
        }
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public boolean validarJuncao(Domino d){
        if(this.ladoA == d.ladoA || this.ladoA == d.ladoB || this.ladoB == d.ladoA || this.ladoB == d.ladoB){
            return true;
        }
        return false;
    }

    public String toString(){
        return "[ " + this.ladoA + ", " + this.ladoB + " ]";
    }

    public boolean equals(Domino d){
        if(this.ladoA == d.ladoA && this.ladoB == d.ladoB || this.ladoB == d.ladoA && this.ladoA == d.ladoB){
           return true;
        }
        return false;
    }
}
