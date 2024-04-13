package Strings;

public class HammingDistance {

    public static void main(String[] args) {

        String s1 = "csfr", s2 = "csfr";
        int ret = hammingDistance(s1, s2);
        System.out.print(ret);
    }
    public static int hammingDistance(String s1, String s2){

        int count = 0;
        if(s1.length() != s2.length()){
            return -1;
        }
        for(int i = 0; i < s1.length(); i++){
            char char1 = s1.charAt(i);
            for(int j = i; j < s2.length(); j++){
                if(s2.charAt(i) != char1){
                    count++;
                    break;
                }
                break;
            }
        }
        return count;
    }
}