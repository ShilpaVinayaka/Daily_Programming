package Strings;

import java.util.*;

public class FirstCharOccurStr2_16 {

    public static void firstOccurenceHashMap(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < s1.length(); i++) {
            if(!map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), i);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            
            if(map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i))<minIndex) {
                minIndex = map.get(s2.charAt(i));
            }
        }

        if (minIndex != Integer.MAX_VALUE)
            System.out.println("Minimum Index Character = " +s1.charAt(minIndex));
      
        else
            System.out.println("No character present");
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String patt = "set";
        firstOccurenceHashMap(str, patt);
    }
}
