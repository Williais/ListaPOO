package Lista5;

public class Questao1 {
    public static void main(String[] args){
        int x = 10;
        System.out.println(x);
        int y = x%4;
        System.out.println(y);
        int z;


        for(z = 1; x > y; y*=2){
            System.out.println("valor x" + x);
            System.out.println("valor y" + y);
            System.out.println("valor z" + z);
            z = x++ +z;
        }
            int w = x + y + z;
            System.out.println("valor w" + w);
            System.out.println(w);
    }
}

// 10 0  0  0
// 10  2  0  0
// 10  2  0  0
// 11  2  11  0
// 11  4  11  0
// 12  4  22  0
// 12  8  22  0
// 13  8  34  0
// 13  16  34  0
// 13  14  34  63
