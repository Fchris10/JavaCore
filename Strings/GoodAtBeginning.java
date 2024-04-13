package Strings;

public class GoodAtBeginning {

    public static void main(String[] args) {

        String string = "good morning";
        boolean ret = goodAtTheBeginning(string);
        System.out.print(ret);
    }
    public static boolean goodAtTheBeginning(String string){

        if(string.startsWith("good")){
            return true;
        }
        return false;
    }
}