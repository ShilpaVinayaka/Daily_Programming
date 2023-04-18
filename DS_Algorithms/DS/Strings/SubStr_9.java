package Strings;

public class SubStr_9 {

    public static int substr(String s1, String s2) {

        return s1.indexOf(s2);
    
    }

    public static void main(String[] args) {
        System.out.println(substr("geeksforgeeks", "for"));
        System.out.println(substr("geeksforgeeks", "fr"));
    }
}
