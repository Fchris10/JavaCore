package Warmup;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Scanner;

public class TheRightPrice {

    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt(0, 100);

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Chose a price between 0 and 100");
        System.out.println("Utent1: ");
        int ret1 = input1.nextInt();
        System.out.println("Utent2: ");
        int ret2 = input2.nextInt();

        int diff1 = Math.abs(num - ret1);
        int diff2 = Math.abs(num - ret2);

        if(diff1 < diff2){
            System.out.println("The price is: " + num + " and " + ret1 + " is the nearer price to the one i've chosen");
        }
        else{
            System.out.println("The price is: " + num + " and " + ret2 + " is the nearer price to the one i've chosen");
        }
    }
}
