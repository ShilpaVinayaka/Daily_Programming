/*
Rahul is planning to buy a new sim card for his new phone. He wishes to buy a phone number where sum of odd numbers in phone number must be equal to the even numbers present in the phone number. Write a Java code to help him to find the right phone number.
Requirements:
-       Use long datatype for Phone number.
-       If the sum of the odd numbers and sum of the even numbers in the phone number are equal, print as "Sum of odd and even are equal".
-       If the sum of the even numbers is greater than the sum of the odd numbers in the phone number, then print as "Sum of even is greater than sum of odd".
-       If the sum of the odd numbers is greater than the sum of the even numbers in the phone number, then print as "Sum of odd is greater than sum of even". 
Please do not use System.exit(0) to terminate the program.
Sample Input/Output 1:
Enter the phone number
9719112322
Sum of odd is greater than sum of even 

Sample Input/Output 2:
Enter the phone number
8287123456
Sum of even is greater than sum of odd

Sample Input/Output 3:
Enter the phone number
1551462
Sum of odd and even are equal

*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the phone number");
	    long phNum = sc.nextLong();
	    
	    int eveSum=0, oddSum=0; long rem;
	    while(phNum != 0)
	    {
	        rem = phNum%10;
	        if(rem%2==0)
	            eveSum += rem;
	        else
	            oddSum += rem;
	        phNum = phNum/10;
	    }
	    
	    if(eveSum == oddSum)
	        System.out.println("Sum of odd and even are equal");
	    else if(eveSum>oddSum)
	        System.out.println("Sum of even is greater than sum of odd");
	    else
	        System.out.println("Sum of odd is greater than sum of even");
	}
}
