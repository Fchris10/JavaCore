package Strings;

import java.util.StringTokenizer;

public class CountYZ {

    public static void main(String[] args) {

        String str = "fez day";
        int ret = countYZ(str);
        System.out.print(ret);
    }

    public static int countYZ(String string) {

        int count = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(string);

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken().toLowerCase();
            char LastChar = token.charAt(token.length() - 1);
            if (LastChar == 'y' || LastChar == 'z') {
                count++;
            }
        }
        return count;
    }
}