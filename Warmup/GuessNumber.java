package Warmup;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(0, 3);

        System.out.println("Guess the number between 0 and 3 i'm thinking");

        while(true){
            int val_in = input.nextInt();

            if(val_in != 0){
                System.out.print("Retry!");
            }
            else{
                System.out.print("You guessed the number!");
                break;
            }
        }
    }
}