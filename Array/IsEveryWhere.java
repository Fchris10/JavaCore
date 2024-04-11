package Arrays;

public class IsEveryWhere {

    public static void main(String[] args) {

        int[] arr = {1,2,2,1,0};
        int value = 1;
        boolean ret = isEveryWhere(arr, value);
        System.out.print(ret);
    }
    public static boolean isEveryWhere(int[] v, int value) {

        int j = 0, k = 2, op = v.length / 2;
        boolean ret = true;

        while (op != 0) {
            int count = 0;
            if ((v.length / 2) != 0 && v[v.length - 1] != value) {
                ret = false;
                break;
            }
            for (int i = j; i < k; i++) {
                if (v[i] == value) {
                    count++;
                }
            }
            if (count == 0) {
                ret = false;
                break;
            }
            j += 2;
            k += 2;
            op--;
        }
        return ret;
    }
}