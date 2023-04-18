package Strings;

public class Atoi_8 {

    public static void StringToIntMeth1(String str1, String str2) {

        int newI1 = Integer.parseInt(str1);
        System.out.println(newI1);

        try{
            int newI2 = Integer.parseInt(str2);
            System.out.println(newI2);
        }
        catch(java.lang.NumberFormatException e) {
            int newI2 = 0;
            System.out.println(newI2);
        }
    }

    public static int asciiMethod(String str) {

        int sign = 1, res = 0;

        int i =0;
        if(str.charAt(0) == '-') {
            sign = -1;
            i++;
        }

        for (; i < str.length(); i++) {
            res = res * 10 + str.charAt(i) - '0';
        }

        return sign*res;

    }

    public static void main(String[] args) {
        StringToIntMeth1("12344949", "Geeks");

        System.out.println(asciiMethod("-39"));
    }
}
