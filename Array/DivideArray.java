package Arrays;

public class DivideArray {

    public static void main(String[] args) {

        double[] arr = {-3, 0, 7, 9};
        double factor = 2;
        double[] ret = divideArray(arr, factor);

        for(int i = 0; i < ret.length; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static double[] divideArray(double[] v, double factor){

        double[] ris = new double[v.length];

        for(int i = 0; i < v.length; i++){

            ris[i] = v[i]/factor;
        }
        return ris;
    }
}