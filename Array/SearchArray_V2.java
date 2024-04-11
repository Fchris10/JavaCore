package Arrays;

public class SearchArray_V2 {

    public static void main(String[] args) {

        String[] strings = {"car", "bike", "boat", "motorbike", "cart", "machine", "plane", "aircraft"};
        String searched = "boat";
        boolean ret = containsBinary(strings, searched);
        System.out.print(ret);
    }
    public static boolean containsBinary(String[] strings, String searched){

        int left = 0;
        int right = strings.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            int compareStrings = strings[mid].compareTo(searched);
            if(compareStrings == 0){
                return true;
            }
            if(compareStrings < 0){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}