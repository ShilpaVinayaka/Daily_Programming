package Strings;

public class LongestSubStr_7 {


    public static int longestSubstr_SlidingWindow(String str) {

        if(str.isEmpty())
            return 0;


        String test = "";
        int maxLength = -1;

        for (int i = 0; i < str.length(); i++) {
            String curr = String.valueOf(str.charAt(i));
            System.out.println(test);
            if(test.contains(curr)) {
                test = test.substring(test.indexOf(curr)+1);
                System.out.println(test);
            }

            test += curr;
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str= "geeksforgeeks";
        System.out.println(longestSubstr_SlidingWindow(str));
    }
}
