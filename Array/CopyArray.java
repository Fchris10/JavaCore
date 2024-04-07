package Arrays;

public class CopyArray {

    public static void main(String[] args) {

        double[] arr = {1.5, 3, 7.5};
        double[] ret = copyArray(arr);

        for(int i = 0; i < ret.length; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static double[] copyArray(double[] v){

        double[] ret = v.clone();
        return ret;
    }
}