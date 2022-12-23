import java.util.Scanner;

public class Powerof2_bitshift {

    public static boolean isPowerofTwoBitShift(int n) {
        if(n==0)
            return false;
        
        while(n>1 && (n&1)==0)
            n>>=1;
        
        return n==1?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(isPowerofTwoBitShift(n));
       sc.close();
    }
}
