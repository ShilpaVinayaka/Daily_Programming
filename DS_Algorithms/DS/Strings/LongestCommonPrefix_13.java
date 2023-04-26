package Strings;

public class LongestCommonPrefix_13 {

    public static String commonPrefixUntil(String str1, String str2) {

        String res = "";
        for (int i = 0, j = 0; i < str1.length() && j<str2.length(); i++, j++) {
            if(str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            res += str1.charAt(i);
        }
        return res;
    }

    public static String commonPrefix(String str[]) {

        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {
            prefix = commonPrefixUntil(prefix, str[i]);
        }
        return prefix;

    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks",
            "geek", "geezer"};
 
        String ans = commonPrefix(arr);
 
        if (ans.length() > 0) {
            System.out.printf("The longest common prefix is - %s",
                    ans);
                    System.out.println();
        } else {
            System.out.printf("There is no common prefix");
            System.out.println();
        }
    }
}
