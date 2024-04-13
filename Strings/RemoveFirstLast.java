package Strings;

public class RemoveFirstLast {

    public static void main(String[] args) {

        String string = "etre";
        String ret = removeFirstLast(string);
        System.out.print(ret);
    }
    public static String removeFirstLast(String string){

        String newStr = new String();
        int size = string.length() - 1;

        if(string.charAt(0) == string.charAt(size)){
            newStr = string.substring(1, size);
        }
        return newStr;
    }
}