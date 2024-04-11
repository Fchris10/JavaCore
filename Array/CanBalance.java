package Arrays;

public class CanBalance {

    public static void main(String[] args) {

        int[] v = {1,1,2};
        boolean ret = canBalance(v);
        System.out.print(ret);
    }
    public static boolean canBalance(int[] v){

        if(v.length == 0){
            System.out.print("The array is empty");
            return false;
        }
        boolean value = true;
        int count1 = 0, count2 = 0;
        int tmp = v.length / 2;
        if(v.length % 2 != 0){
            tmp += 1;
        }
        for(int i = 0; i < tmp; i++){
            count1 += v[i];
        }
        for(int j = tmp; j < v.length; j++){
            count2 += v[j];
        }
        if(count1 != count2){
            value = false;
        }
        return value;
    }
}