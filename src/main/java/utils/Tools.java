package utils;

import java.util.Random;

public class Tools {

    public static int randomNumber(int from, int to){
        to -= from;
        return (int) (Math.random() * ++to) + from;
    }

    public static String randomWord(int size){
        String alphabit = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        for (int i = 0; i < size ; i++){
            result=result+alphabit.charAt(randomNumber(0,25));
        }
        return result;
    }

}
