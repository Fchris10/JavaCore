package OOP;

import java.util.Arrays;

public class EnhancedResizableArray {

    int DEFAULT_CAPACITY = 5;
    int[] v;
    public EnhancedResizableArray(){
        this.v = new int[DEFAULT_CAPACITY];
        return;
    }
    public int get(int index){
        return this.v[index];
    }
    public void set(int index, int value){
        if(v.length <= index){
            int[] tmp = new int[index * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }
    public boolean contains(int value){
        for(int i = 0; i < v.length; i++){
            if(v[i] == value){
                return true;
            }
        }
        return false;
    }
    public void fill(int value){
        Arrays.fill(v, value);
    }
    public int lengh(){
        return v.length;
    }
    public int[] toArray(){
      return Arrays.copyOf(v, v.length);
    }
}