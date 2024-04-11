package Arrays;

public class TenRun {

    public static void main(String[] args) {

        int[] arr = {1,10,1,2,20,1,2,3,30,1,2,3,4};
        int[] ret = tenRun(arr);

        for(int i = 0; i < ret.length; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static int[] tenRun(int[] v){

        for(int i = 0; i < v.length; i++){
            if((v[i] % 10) == 0){
                for(int j = i; j < v.length - 1; j++){
                    if((v[j + 1] % 10) == 0){
                        break;
                    }
                    v[j + 1] = v[i];
                }
            }
        }
        return v;
    }
}
