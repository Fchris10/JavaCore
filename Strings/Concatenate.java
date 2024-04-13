package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Concatenate {

    public static void main(String[] args) {

        String[] strings = {"Hello", " ", "World"," ","everybody"};
        String ret = concatenate(strings);
        System.out.print(ret);
    }
    public static String concatenate(String[] strings){

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < strings.length; i++){
            str.append(strings[i]);
        }
        return str.toString();
    }
}