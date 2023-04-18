package Strings;

public class Anagram_5 {
    public static int numofChars = 256;

    public static boolean anagramfunc(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;

        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();

        int count[] = new int[numofChars];

        for (int i = 0; i < s1.length(); i++) {
            count[str1[i]]++;
            count[str2[i]]--;


        }
        for (int i = 0; i < count.length; i++) {
            
            if(count[i]!=0){
                return false;
            }
        }

                return true;
    }

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        System.out.println(anagramfunc(s1, s2));
        System.out.println(anagramfunc("abc", "xhs"));

    }
}
