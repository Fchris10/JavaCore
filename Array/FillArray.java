package Arrays;

import java.util.Random;

public class FillArray {

    public static void main(String[] args) {

        int size = 3;
        double value = 2.5;
        boolean set = true;

        double[] ret = fillArray(size, value, set);
        for(int i = 0; i < size; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static double[] fillArray(int size, double value, boolean addNoise){

        double[] ret = new double[size];
        Random random = new Random();

        if(addNoise == true){
            for(int i = 0; i < size; i++){

                int rand = random.nextInt(0, 1);

                if(rand == 0){
                    value -= (value * 0.05);
                }
                else{
                    value += (value * 0.05);
                }
                ret[i] = value;
            }
        }
        else{
            for(int j = 0; j < size; j++){
                ret[j] = value;
            }
        }
        return ret;
    }
}