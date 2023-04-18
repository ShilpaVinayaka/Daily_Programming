package Strings;

public class RomanToNumeral_4 {
    public static int value(char i) {
        if (i == 'I')
            return 1;
        if (i == 'V')
            return 5;
        if (i == 'X')
            return 10;
        if (i == 'L')
            return 50;
        if (i == 'C')
            return 100;
        if (i == 'D')
            return 500;
        if (i == 'M')
            return 1000;

        return -1;

    }

    public static int romantoNumeral(String str) {
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            int str1 = value(str.charAt(i));
            if (i + 1 < str.length()) {
                int str2 = value(str.charAt(i + 1));

                if (str1 > str2) {
                    res = res + str1;
                } else {
                    res = res + str2 - str1;
                    i++;
                }
            } else {
                res = res + str1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "MCMIV";
        System.out.println(romantoNumeral(str));
    }
}
