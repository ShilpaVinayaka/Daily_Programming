/*
The Whale Fishing Club (WFC) conducted a fishing competition on a big lake. The participants allowed for this competition should be 18 years and older. The participants should catch the fishes and give them to the referee so that he will add the count of the fishes based on their size. Then at the end of the day based on the count, points will be awarded. Help WFC by developing an application to convert the count into points in Java.
Requirements:
1. There are 3 types of fishes based on their size. Determine points based on the following
Big - 10 points
Medium - 6 points
Small - 3 points
2. Take input from the user as a single string separating each fields with a colon (smile
 <participants name>:<participants age>:<big fish>:<medium fish>:<small fish>
3. Age should be greater than or equal to 18, else print "<age> is an invalid age" and terminate the application
4. If the fish count is less than 0 print "<fish count> is an invalid input" and terminate the application

Sample Input/Output 1:
Enter the details
Hari:20:5:9:15
Hari scored 149 points
Explanation:
Points calculation
Big fish = 5*10 = 50
Medium fish =  9*6 = 54
Small fish = 15*3 = 45
Total points = 50 + 54 + 45 = 149

Sample Input/Output 2:
Enter the details
Quil:15:2:7:2
15 is an invalid age

Sample Input/Output 3:
Enter the details
Allan:22:-3:2:3
-3 is an invalid input
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details");
        String input = sc.next();
        int i1,i2,i3,age;
        
        String[] inputSplit = input.split(":");
        
        age = Integer.parseInt(inputSplit[1]);
        if(age<=18){
            System.out.println(age+" is an invalid age");
            return;
        }
        i1 = Integer.parseInt(inputSplit[2]);
        if(i1<0){
            System.out.println(i1+" is an invalid input");
            return;
        }
        i2 = Integer.parseInt(inputSplit[3]);
        if(i2<0){
            System.out.println(i2+" is an invalid input");
            return;
        }
        i3 = Integer.parseInt(inputSplit[4]);
        if(i3<0){
            System.out.println(i3+" is an invalid input");
            return;
        }
        
        int points = i1*10 + i2*6 + i3*3;
        System.out.println(inputSplit[0]+" scored "+points+" points");
	}
}
