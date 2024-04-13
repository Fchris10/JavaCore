package Strings;

public class RemoveFirstTwoCharsIf {

    public static void main(String[] args) {

        String string = "Hello World";
        String ret = removeFirstTwoCharsIf(string);
        System.out.print(ret);
    }
    public static String removeFirstTwoCharsIf(String string){

        StringBuilder stringBuilder = new StringBuilder(string);

        if(string.charAt(0) != 'H' && string.charAt(1) != 'e'){
            stringBuilder.delete(0, 1);
        }
            if(string.charAt(0) != 'H'){
                stringBuilder.deleteCharAt(0);
            }
            if(string.charAt(1) != 'e'){
                stringBuilder.deleteCharAt(1);
            }
        return stringBuilder.toString();
    }
}