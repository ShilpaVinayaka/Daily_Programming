/* Minimum steps to make the product of the array equal to 1
 Time Complexity: O(n) 
 Space Complexity: O(1)
*/

import java.util.*;
public class Main
{
    public static int minimumStep(int a[], int n) {
        
        // To store the count of 0s, positive and negative numbers
        int pos = 0, neg = 0, zero = 0;
        int step = 0;
        
        for(int i=0; i<n; i++)
        {
            //If array ele is zero
            if(a[i] == 0)  
                zero++;
                
            //If array ele is negative
            else if(a[i]<0) {
                neg++;
                step = step + (-1 - a[i]); //Steps to make it -1
            }
            //If array ele is positive
            else {
                pos++;
                step = step + (a[i]-1); //Steps to make it 1
            }
        }
        // Now array has only -1, 0, 1
        
        //If count of negative ele is even
        if(neg % 2 == 0) {
            // Change all 0 to 1 and count steps
            step = step + zero;
        }
        else {
            // If there are zeroes in the array
            if(zero>0){
                // Change 1 zero to -1 and the rest to 1
                step = step + zero;
            }
            // If there are no zeros in the array
            else {
                // change -1 to 1. It will take 2 steps
                step += 2;
            }
        }
        return step;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number of Array Elements: ");
	    int n = sc.nextInt();
	    
	    System.out.println("Enter Array: ");
	    int[] a = new int[n];
	    for(int i=0; i<n; i++)
	        a[i] = sc.nextInt();
	   
	   System.out.println("Number of steps: "+ minimumStep(a,n));
	}
}
