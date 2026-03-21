package Lista5.cdf;

public class CDF {
    public boolean ePrimo(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
