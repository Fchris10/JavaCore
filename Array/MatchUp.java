package Arrays;

public class MatchUp {

    public static void main(String[] args) {

        int[] v1 = {1,2,3};
        int[] v2 = {2,4,10};
        int ret = matchUp(v1, v2);
        System.out.print(ret);
    }
    public static int matchUp(int[] v1, int[] v2){

        if(v1.length != v2.length){
            return 0;
        }
        int count = 0;

        for(int i = 0; i < v1.length; i++){
            if(Math.abs(v1[i] - v2[i]) == 1 || Math.abs(v1[i] - v2[i]) == 2){
                count ++;
            }
        }
        return count;
    }
}