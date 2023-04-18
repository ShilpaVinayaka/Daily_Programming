package Strings;

import java.util.HashMap;

public class RemoveDuplicates_6 {

    public static String hashMapMethod(String str) {

        HashMap<Character, Integer> cMap = new HashMap<>();

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(!cMap.containsKey(str.charAt(i))) {
                newStr += str.charAt(i);
                cMap.put(str.charAt(i), 1);
            }
        }
        return newStr;

    }

    public static String simpleMethod(String str) {
        String temp = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if(!temp.contains(String.valueOf(str.charAt(i)))) {
                temp += str.charAt(i);
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(hashMapMethod("Applee"));
        System.out.println(simpleMethod("Apleee"));
    }
}
