package Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2,5,3,7,1,7,3,9,4, 0, 99, 2, 102, 4};
        int[] ret = bubbleSortCopy(arr);

        for(int i = 0; i < ret.length; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static int[] bubbleSortCopy(int[] v){

        boolean value = true;
        int tmp;

        while(value){
            value = false;
            for(int i = 0; i < v.length - 1; i++){
                if(v[i] > v[i + 1]){
                    tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                    value = true;
                }
            }
        }
        return v;
    }
}