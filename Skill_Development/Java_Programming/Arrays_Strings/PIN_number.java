/*
Harry bought a new phone. He decides to put a safety lock on his phone for which he wants to create a pin number. He asked his friend to suggest some four digit number, but the number should pass some of his condition. If the number passes the condition he will keep it as a pin number. Help him to validate the pin number using a Java program.

Requirements:
The total number of  PIN numbers entered should be a value greater than 0, else print "<no of PIN number> is an invalid number".
The PIN number should be a four digit number, else print "<PIN number> is an invalid PIN number"
Condition for the PIN number:
The starting number should be an odd number
The second number should be an even number
The third number should be a prime number
The last number should be a composite number
Assume numbers only between 1 to 9.
If all the numbers fail the above condition, then print "All these <no of PIN number> numbers are not a valid PIN number"
If more than one PIN number passes the condition, then print the number

Sample Input/Output 1:
Enter the total number of PIN numbers
4
Enter the PIN numbers
1234
8975
5656
2589
Valid PIN numbers are
1234
5656 

Sample Input/Output 2:
Enter the total number of PIN numbers
2
Enter the PIN numbers
2659
1398
All these 2 numbers are not a valid PIN number 

Sample Input/Output 3:
Enter the total number of PIN numbers
3
Enter the PIN numbers
1829
564
564 is an invalid PIN number

Sample Input/Output 4:
Enter the total number of PIN numbers
-1
-1 is an invalid number
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the total number of PIN numbers");
	    int n = sc.nextInt();
	    if(n<1){
	        System.out.println(n+" is an invalid number");
	        return;
	    }
	    int[] a = new int[n];
	    System.out.println("Enter the PIN numbers");
	    for(int i=0; i<n; i++) {
	        a[i] = sc.nextInt();
	        int c=0; int num = a[i];
	         for (; num != 0; num /= 10, ++c) {
            }
	        if(c!=4)
	            {
	                System.out.println(a[i] +" is an invalid PIN number");
	                return;
	            }
	    }
	    
	    int rem, flag =0, j=0; int[] valid = new int[n]; 
	    for(int i=0;i<n;i++) {
	        int num = a[i];
	        int count = -1;
	        while(count <4)
	        {
	            rem = num%10;
	            num = num/10;
	            count++;
	            if(rem == 0)
	                break;
	            if(count == 0){
	                if(!(isPrime(rem)))
	                   continue;
	                else
	                    break;
	            }
	                
	            if(count == 1){
	                if(isPrime(rem))
	                    continue;
	                else    
	                    break;
	            }
	                
	            if(count == 2){
	                if(rem%2 == 0)
	                    continue;
	                else
	                    break;
	            }
	            
	            if(count == 3){
	                if(rem%2 != 0)
	                    continue;
	                else
	                    break;
	            }
	            
	        }
	        
	        if(count == 4)  // Checking if all 4 digits meet conditions
	            {
	                valid[j] = a[i];
	                flag++; j++;
	            }
	    }
	    int[] res = valid;
	    valid = new int[flag];
	    if(flag == 0)
	        System.out.println("All these "+n+" numbers are not a valid PIN number");
	    else if(flag>0){
	        System.out.println("Valid PIN numbers are:");
	        for(int i=0; i<valid.length; i++)
	            System.out.println(res[i]);
	    }
    }    
	  static boolean isPrime(int num){
	       if(num<=1)
	        return false;
	       for(int i=2;i<=num/2; i++)
	       {
	           if(num%i==0)
	            return false;
	       }
	       return true;
	    }
	    

	}


