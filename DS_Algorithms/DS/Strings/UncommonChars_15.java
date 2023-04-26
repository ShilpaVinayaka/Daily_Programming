package Strings;

import java.util.*;

public class UncommonChars_15 {

    public static int Max_CHAR = 26;

    public static void uncommonCharacters(String s1, String s2) {

        int present[] = new int[Max_CHAR];
        for (int i = 0; i < Max_CHAR; i++) {
            present[i] = 0;
        }

        for (int i = 0; i < s1.length(); i++) {
            present[s1.charAt(i) - 'a'] = 1;
        }

        for (int i = 0; i < s2.length(); i++) {
            
            //if s2 char is in s1
            if(present[s2.charAt(i) - 'a'] == 1 || present[s2.charAt(i) - 'a'] == -1 ) {
                present[s2.charAt(i) - 'a'] = -1;
            }
            else {
                present[s2.charAt(i) - 'a'] = 2;
            }
        }

        for (int i = 0; i < Max_CHAR; i++) {
            if(present[i] == 1 || present[i] == 2) {
                System.out.print((char)(i+'a') + " ");
            }
        }
        System.out.println();
    }

    public static void hashMethodUncommonCHars(String s1, String s2) {

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }

        HashSet<Character> diff = new HashSet<>(set1);
        diff.addAll(set2);

        HashSet<Character> temp = new HashSet<>(set1);
        temp.retainAll(set2);

        diff.removeAll(temp);

        StringBuilder sb = new StringBuilder();
        for(char ch:diff) {
            sb.append(ch);
        }

        String res = sb.toString();
        System.out.println(res);


    }

    public static void main(String[] args) {
        String str1 = "characters";
        String str2 = "alphabets";

        uncommonCharacters(str1, str2);
        hashMethodUncommonCHars("geeksforgeeks", "geeksquiz");
    }
}
