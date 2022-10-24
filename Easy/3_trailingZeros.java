/* Count trailing zeroes in factorial of a number
 Time Complexity: O(log5 n) 
 Space Complexity: O(1)
*/

import java.util.*;
public class Main
{
    public static int trailingZeros(int n) {
        
        if(n<0)
            return -1;
        
        int count = 0;
        
        //Incremently dividing n by powers of 5
        for(int i=5; n/i >= 1; i*=5)
            count += n/i;
        
        return count;
 
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number: ");
	    int n = sc.nextInt();
      
	   System.out.println("Count of trailing zeroes: "+ trailingZeros(n));
	}
}
