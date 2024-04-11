package Arrays;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;

public class Splitter {

    public static void main(String[] args) {

        int input = 123456;
        int[] ret = splitter(input);
        for(int i = 0; i < ret.length; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static int[] splitter(int input){

        String val = Integer.toString(input);
        int dim = val.length();
        int[] ris = new int[dim];

        for(int i = dim - 1; i >= 0; i--){
            ris[i] = (input % 10);
            input /= 10;
        }
        return ris;
    }
}