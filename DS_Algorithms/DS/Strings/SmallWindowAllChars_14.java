package Strings;

public class SmallWindowAllChars_14 {

    public static String allCharactersinWindow(char[] str, char[] t) {

        int m[] = new int[256];
        int ans = Integer.MAX_VALUE;
        int count = 0, start = 0;

        for (int i = 0; i < t.length; i++) {
            if(m[t[i]] == 0)
                count++;
            m[t[i]]++;
            
        }

        int i = 0, j = 0;

        while(j < str.length) {
            
            m[str[j]]--;
            if(m[str[j]] == 0)
                count--;

            if(count == 0 ) {
                while(count == 0) {

                    if(ans>j-i+1) {
                        ans = Math.min(ans, j-i+1);
                        start = i;
                    }

                    m[str[i]]++;
                    if(m[str[i]]>0)
                        count++;

                    i++;
                }
            }
            j++;

        }

        if(ans != Integer.MAX_VALUE) 
            return String.valueOf(str).substring(start, ans+start);
        else
            return "-1";

    }

    public static void main(String[] args) {
        String s = "this is a test string";
        String t = "tist";
 
        System.out.print(allCharactersinWindow(s.toCharArray(),
                                        t.toCharArray()));
    }
}
