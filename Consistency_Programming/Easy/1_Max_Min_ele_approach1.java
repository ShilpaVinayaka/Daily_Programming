/*
Approach 1: Linear Search
Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons. */

import java.util.*;

public class Max_Min_ele_in_array
{
    static class Pair {
        int min;
        int max;
    }
    
    static Pair getMinMax(int a[], int n) {
        Pair minmax = new Pair();
        int i;
        
        //If there is only one element 
        if(n==1) {
            minmax.max = a[0];
            minmax.min = a[0];
            return minmax;
        }
        
        //If there are more than one element - Initialize max and min 
        if(a[0]>a[1]) {
            minmax.max = a[0];
            minmax.min = a[1];
        }
        else {
            minmax.max = a[1];
            minmax.min = a[0];            
        }
        
        for(i=2; i<n; i++) {
            if(a[i]>minmax.max) {
                minmax.max = a[i];
            } 
            else if(a[i]<minmax.min) {
                minmax.min = a[i];
            }
        }
        
        return minmax;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0; i<n; i++)
		    a[i] = sc.nextInt();
		    
		Pair minmax = getMinMax(a, n);
		System.out.println("Min Ele: "+ minmax.min);
		System.out.println("Max Ele: "+ minmax.max);
	}
}
