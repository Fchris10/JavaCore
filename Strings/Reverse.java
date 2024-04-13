package Strings;

public class Reverse {

    public static void main(String[] args) {

        String strings = "String Test";
        String ret = reverse(strings);
        System.out.print(ret);
    }
    public static String reverse(String string){
        char[] str = new char[string.length()];

        int size = string.length() - 1;
        for(int i = 0; i < string.length(); i++){
            str[size] = string.charAt(i);
            size--;
        }
        return new String(str);
    }
}
