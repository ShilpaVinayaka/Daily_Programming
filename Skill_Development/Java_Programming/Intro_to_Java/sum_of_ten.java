/*
Mr. Ben gives an assignment to his students, he gives a number and the students need to add ten numbers from it and display the sum. Help the students to complete the assignment using the Java program.
The output should be displayed as "The sum of ten numbers is <sum>".

Sample Input/Output 1:
Enter the number
1
The sum of ten numbers is 55

Explanation:
Number : 1
Sum = 1+2+3+4+5+6+7+8+9+10 = 55
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num  = sc.nextInt();
		
		int sum = 0;
		
		for(int i=num; i<10+num; i++)
		    sum += i;
		    
		System.out.println("The sum of ten numbers is "+sum);
	}
}
