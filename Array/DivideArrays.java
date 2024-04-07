package Arrays;

public class DivideArrays {

    public static void main(String[] args) {

        double[] arr1 = {5, 35, 51};
        double[] arr2 = {49, 28, 73};
        double[] ret = divideArrays(arr1, arr2);

        for(int i = 0; i < ret.length; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static double[] divideArrays(double[] v1, double[] v2){

        if(v1.length != v2.length){
            return null;
        }
        double[] ris = new double[v1.length];

        for(int i = 0; i < v1.length; i++){

            ris[i] = (v1[i] / v2[i]);
        }
        return ris;
    }
}