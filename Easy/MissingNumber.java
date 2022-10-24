/* Finding Missing Number - Works for unsorted array too.
 Time Complexity: O(n) 
 Space Complexity: O(1)
*/

import java.util.*;
public class Main
{
    public static int getMissingNumber(int a[], int n) {
        
        int sum = ((n+1)*(n+2))/2;
        
        for(int i=0; i<n; i++)
            sum -= a[i];
            
        return sum;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number of Array Elements: ");
	    int n = sc.nextInt();
	    
	    System.out.println("Enter Array: ");
	    int[] a = new int[n];
	    for(int i=0; i<n; i++)
	        a[i] = sc.nextInt();
	   
	   System.out.println("Missing Number: "+ getMissingNumber(a,n));
	}
}
