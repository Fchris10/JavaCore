package Warmup;

public class InterestRate {

    public static void main(String[] args) {

        int year = 3;
        double value = 1000;
        double percent = 0.05;

        for(int i = 0; i < year; i++){
            value += (value * percent);
        }
        System.out.println("The current value is: " + value);
    }
}