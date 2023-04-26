package Strings;

public class LongestPreficAlsoSuffix_11 {

    public static int simpleAppr(String str) {

        if(str.length()<2)
            return 0;
        int len = 0;
        int i = (str.length()+1)/2;

        while(i<str.length()) {

            if(str.charAt(i) == str.charAt(len)) {
                len++; i++;
            } 
            else{
                i = i - len +1;
                len = 0;
            }
        }

        return len;
        
    }

    public static int kmpAlgorithm(String str) {
        if(str.length()<2)
            return 0;
        int len = 0;
        int lps[] = new int[str.length()];
        int i = 1;

        int n = str.length();
        while(i<str.length()) {

            if(str.charAt(i) == str.charAt(len)) {
                len++; 
                lps[i] = len;
                i++;
            } 
            else {
                if(len !=0) {
                    len = lps[len-1];
                }                    
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        int res = lps[str.length()-1];

        return (res > n/2) ? n/2 : res;

    }
 

    public static void main(String[] args) {
        String s = "abcaabc";
        System.out.println(simpleAppr(s));    

        String s1 = "aaaa";
        System.out.println(kmpAlgorithm(s1));
    
    }
}
