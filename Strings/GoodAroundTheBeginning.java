package Strings;

public class GoodAroundTheBeginning {

    public static void main(String[] args) {

        String string = "__good afternoon";
        boolean ret = goodAroundTheBeginning(string);
        System.out.print(ret);
    }
    public static boolean goodAroundTheBeginning(String string){

       if(string.startsWith("good", 0) || string.startsWith("good", 1)){
           return true;
       }
       return false;
    }
}
