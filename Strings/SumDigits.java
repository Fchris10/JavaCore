package Strings;

public class SumDigits {

    public static void main(String[] args) {

        String string = "aa1b5c2d3";
        int ret = sumDigits(string);
        System.out.print(ret);
    }
    public static int sumDigits(String string){

        int num = 9, count = 0;

        while(num > 0){
            for(int i = 0; i < string.length(); i++){
                char digit = string.charAt(i);
                if(Character.getNumericValue(digit) == num){
                    count += num;
                }
            }
            num--;
        }
        return count;
    }
}