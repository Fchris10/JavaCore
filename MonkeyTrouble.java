package Warmup;

import java.util.Scanner;

public class MonkeyTrouble {

    public static void main(String[] args) {

        boolean aSmile;
        boolean bSmile;

        Scanner input = new Scanner(System.in);

        System.out.println("Monkey A is smiling? (true or false)");
        aSmile = input.nextBoolean();

        System.out.println("Monkey B is smiling? (true or false");
        bSmile = input.nextBoolean();

        if(aSmile == bSmile){
            System.out.println("We are in trouble!");
        }
        else{
            System.out.println("We are save!");
        }
    }
}