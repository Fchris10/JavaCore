package Strings;

public class EqualIsNot {

    public static void main(String[] args) {

        String string = "ThIs not NOT is";
        boolean ret = equalIsNot(string);
        System.out.print(ret);
    }
    public static boolean equalIsNot(String string){

        int count1 = 0, count2 = 0;
        String target1 = "is", target2 = "not";
        string = string.toLowerCase();

       for(int i = 0; i < string.length() - 1; i++){
           if(string.charAt(i) == 'i' && string.charAt(i + 1) == 's'){
               count1++;
           }
           if(string.charAt(i) == 'n' && string.charAt(i + 1) == 'o' && string.charAt(i + 2) == 't'){
               count2++;
           }
       }
       if(count1 == count2){
           return true;
       }
       return false;
    }
}