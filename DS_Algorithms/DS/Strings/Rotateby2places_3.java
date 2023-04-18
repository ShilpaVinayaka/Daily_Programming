package Strings;

public class Rotateby2places_3 {

    public static boolean rotateBy2Places(String str1, String str2) {

        if(str1.length() != str2.length())
            return false;

        int n = str1.length();

        boolean clockwise = true;
        boolean anticlockwise = true;
        for (int i = 0; i < n; i++) {
            if(str1.charAt(i) != str2.charAt((i+2)%n)) {
                clockwise = false;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if(str1.charAt((i+2)% n) != str2.charAt(i) ) {
                anticlockwise = false;
                break;
            }
        }

        return (clockwise || anticlockwise);
    }

    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";

        System.out.println(rotateBy2Places(str1, str2));
    }
}
