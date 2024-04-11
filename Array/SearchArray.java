package Arrays;

public class SearchArray {

    public static void main(String[] args) {

            String[] strings = {"Car", "Bike", "Boat", "Gru"};
            String searched = "Bike";
            boolean ret = containsBruteForce(strings, searched);
            System.out.print(ret);
    }
    public static boolean containsBruteForce(String[] strings, String searched){

        for(int i = 0; i < strings.length; i++){
            if(strings[i] == searched){
                return true;
            }
        }
        return false;
    }
}
