/*
Alex, Nikil and Sam are three friends playing the ludo game. After completing one round they note their points and at the end of the day they calculate the points. The one who scores the highest will be considered as the winner. Write a Java program to find who scores the highest points and display the output.
Requirements:
The points should be between 0 and 50 (both inclusive), else print "<points> is an invalid number'.
After finding the winner, print "<Name> scores <Points> points and wins the game".

Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:
Enter Alex points
10
Enter Nikil points
12
Enter Sam points
25
Sam scored 25 points and won the game

Sample Input/Output 2
Enter Alex points
10
Enter Nikil points
-5
-5 is an invalid number

Sample Input/Output 3
Enter Alex points
60
60 is an invalid number
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Alex points");
	    int a = sc.nextInt();
	    int check1 = invalidCheck(a);
	    if(check1 == 1)
	        return;
	    
	    System.out.println("Enter Nikil points");
	    int b = sc.nextInt();
	    int check2 = invalidCheck(b);
	    if(check2 == 1)
	        return;

	    System.out.println("Enter Sam points");
	    int c = sc.nextInt();
	    int check3 = invalidCheck(c);
	    if(check3 == 1)
	        return;
	    
	    int max=0; String player = null;
	    if(a>b)
	    {
	        if(a>c)
	            {
	                max = a;
	                player="Alex";
	            }
	        else{
	            max = c;
	            player="Sam";
	        }
	    }
	    else
	    {
	        if(b>c){
	            max = b;
	            player="Nikil";
	        }
	        else{
	            max = c;
	            player="Sam";
	        }
	    }
	    
	    System.out.println(player+" scored "+max+" points and won the game");
	}
	static int invalidCheck(int n)
	{
	    if(n<0 || n>50){
	        int flag = 1;
	        System.out.println(n+" is an invalid number");
	        return(flag);
	    }
	    return 0;
	}
}
