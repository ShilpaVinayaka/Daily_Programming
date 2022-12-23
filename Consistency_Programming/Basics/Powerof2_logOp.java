import java.util.*;
import java.lang.Math;
public class Powerof2_logOp {

    public static boolean isPowerofTwoLogOp(int n) {
        if(n==0)
            return false;
        
        double a = log2(n);
            return (Math.floor(a))==(Math.ceil(a))?true:false;
    }
    private static double log2(int n) {
        return Math.log(n)/Math.log(2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        System.out.println(isPowerofTwoLogOp(n));
        sc.close();
    }
}
