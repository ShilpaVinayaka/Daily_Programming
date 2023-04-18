package Strings;

import java.util.HashSet;

public class RepeatedChar_1 {

    public static char repeatedChar(char[] str) {

        HashSet<Character> cSet = new HashSet<>();

        for (int i = 0; i < str.length; i++) {
            
            char c = str[i];

            if(cSet.contains(c))
                return c;
            else
                cSet.add(c);
        }

        return '\0';
    }

    String firstRepChar(String s) 
    { 
        char[] str = s.toCharArray();
        HashSet<Character> cSet = new HashSet<>();

        for (int i = 0; i < str.length; i++) {
            
            char c = str[i];

            if(cSet.contains(c))
                return Character.toString(c);
            else
                cSet.add(c);
        }

        return "-1";
    }



    public static void main(String[] args) {
        String str = "HelloGeek";
        char[] arr = str.toCharArray();

        System.out.println("Repeated Char = " + repeatedChar(arr));

    }
}
