package Strings;

public class RemoveFirstTwoChars {

    public static void main(String[] args) {

        String str = "Hello World";
        String ret = removeFirstTwoChars(str);
        System.out.print(ret);
    }
    public static String removeFirstTwoChars(String string){

        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.delete(0,1);
        return stringBuilder.toString();
    }
}