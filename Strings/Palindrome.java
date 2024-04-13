package Strings;

public class Palindrome {

    public static void main(String[] args) {

        String string = "radar";
        boolean ret = isPalindrome(string);
        System.out.print(ret);
    }
    public static boolean isPalindrome(String string){

        StringBuilder str = new StringBuilder(string);
        StringBuilder strRev = new StringBuilder(string).reverse();

        return strRev.toString().equals(str.toString());
    }
}
