// Find the max sum subarray of a fixed size k
import java.util.Scanner;
public class SlidingWindow_MaxSubArray
{
    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxVal = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i=0; i<arr.length; i++){
            currentSum += arr[i];
            if(i>=k-1) {
                maxVal = Math.max(maxVal, currentSum);
                currentSum -= arr[i -(k-1)];
            }
        }
        
        return maxVal;  
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter array size");
	    int num = sc.nextInt();
	    
	    int[] a = new int[num];
    System.out.println("Enter array:");
	    for(int i=0; i<num; i++){
	        a[i] = sc.nextInt();
	    }
	    
	    System.out.println(findMaxSumSubarray(a, 3));
		
	}
}
