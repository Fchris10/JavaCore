package Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 20;
        long[] ret = fibonacci(n);

        for(int i = 0; i < n; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static long[] fibonacci(int n){

        long[] ris = new long[n];
        ris[0] = ris[1] = 1;

        for(int i = 2; i < n; i++){
            ris[i] = (ris[i - 1] + ris[i - 2]);
        }
        return ris;
    }
}