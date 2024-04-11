package Arrays;

public class FizzBuzz {

    public static void main(String[] args) {

        int start = -1;
        int end = -15;

        String[] ret = fizzBuzz(start, end);
        for(int i = 0; i < ret.length; i++){
            System.out.print(ret[i] + " ");
        }
    }
    public static String[] fizzBuzz(int start, int end){

        int dim = (end - start) + 1;
        String[] str = new String[Math.abs(dim)];

        if(start < 0 || end < 0 || start > end){
            return new String[0];
        }

        for(int i = 0; i < dim; i++){

            str[i] = Integer.toString(start);

            if ((start % 3) == 0 && (start % 5) == 0) {
                str[i] = "FizzBuzz";
            }
            else if((start % 3) == 0){
                str[i] = "Fizz";
            }
            else if((start % 5) == 0){
                str[i] = "Buzz";
            }
            start++;
        }
        return str;
    }
}