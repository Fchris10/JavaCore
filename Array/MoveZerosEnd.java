package Arrays;

public class MoveZerosEnd {

    public static void main(String[] args) {

        int[] arr = {5, 0, 3, 0, 0, 1, 9, 6};
        int[] ret = moveZerosEnd(arr);

        for(int i = 0; i < ret.length; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static int[] moveZerosEnd(int[] v){

        int j = 0, dim = v.length;
        boolean value = true;
        int[] ris = new int[v.length];

        while(value){

            for(int i = 0; i < v.length; i++){
                if(v[i] != 0){
                    ris[j] = v[i];
                    j++;
                }
                else{
                    ris[dim - 1] = v[i];
                    dim--;
                }
                value = false;
            }
        }
        return ris;
    }
}