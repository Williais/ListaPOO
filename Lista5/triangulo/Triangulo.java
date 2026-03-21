package Lista5.triangulo;

public class Triangulo {
    private int l1;
    private int l2;
    private int l3;

    public int getL1() {
        return l1;
    }

    public int getL2() {
        return l2;
    }

    public int getL3() {
        return l3;
    }

    public void setL1(int l) {
        l1 = l;
    }

    public void setL2(int l) {
        l2 = l;
    }

    public void setL3(int l) {
        l3 = l;
    }

    public int perimetro() {
        return (l1 + l2 + l3);
    }

    public double area() {
        double s = (l1 + l2 + l3) / 2.0; 
        double calc = s * (s - l1) * (s - l2) * (s - l3);
        return Math.sqrt(calc);
    }

    public TipoTriangulo tipoTriangulo() {
        if (l1 == l2 && l2 == l3) {
            return TipoTriangulo.equiláteros;
        } else if (l1 != l2 && l2 != l3 && l1 != l3) {
            return TipoTriangulo.escalenos;
        } else {
            return TipoTriangulo.isósceles;
        }
    }

}
