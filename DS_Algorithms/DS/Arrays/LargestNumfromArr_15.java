import java.util.*;

public class LargestNumfromArr_15 {

    public static String printLargest(int[] arr) {
        if(arr.length == 0) 
            return "";

        String[] sa = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sa[i] = Integer.toString(arr[i]);
        }

        Arrays.sort(sa, new Comparator<String>() {
            public int compare(String a, String b) {
                // System.out.println(a+" "+b);
                String o1 = a+b;
                String o2 = b+a;
                // System.out.println(o1+" "+o2);
                // System.out.println(o2.compareTo(o1));
                return o2.compareTo(o1);
            }
        });

        if(sa[0].equals("0"))
            return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s: sa) {
            // System.out.println(s);
            sb.append(s);
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {

        int arr[] = {54,546, 548, 60};
        System.out.println("Largest Number = " + printLargest(arr));
    }
}
