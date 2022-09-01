/*
The Sprinter sports club conducted a zone level relay running race, due to the covid situation they conducted the race in a different manner by making the teams perform individually and calculating the time taken by the team to finish the race. The team that takes less time to complete the race will be considered as the winner. Help the sports club to identify their winners by developing a java application.
Assumptions:
Assume each team has 4 members
Take input from the user as a single string with fields separated by a colon as <team name>:<time taken1>:<time taken2>:<time taken3>:<time taken4> and the time taken by the athlete should be in float
Requirements:
If the team number is less than or equal to one, print "Invalid input" and terminate the program
If the time is less than one, print "Invalid number" and terminate the program
The output should be like "<winning team name> team wins the race in <total time taken> minutes"
If two teams have same time, then who started the race first will be the winning team
Assume the  inputs taken from the user will be in the order of the teams which started the race first, second, and so on.
Precision the output time to 2 decimal places, i.e, display the time in the  output print statement up to 2 decimal places. For that use,  System.out.print("%.2f", time);

Sample Input/Output 1:
Enter the number of teams
4
Enter the details
Green:1.10:1.05:1.00:1.02
Red:1.05:1.04:1.10:1.00
Blue:1.11:1.10:1.10:1.05
Yellow:1.09:1.15:1.08:1.10
Green team wins the race in 4.17 minutes

Sample Input/Output 2:
Enter the number of teams
1
Invalid input

Sample Input/Output 3:
Enter the number of teams
2
Enter the details
White:1.02:1.03:0:1.03
Invalid number

Sample Input/Output 4:
Enter the number of teams
2
Enter the details
Red:1.00:1.00:1.00:1.00
White:1.00:1.00:1.00:1.00
Red team wins the race in 4.00 minutes

Explanation:

Here Red team started the race first, that's why provided as 1st input.
Since both teams completed the race in same time,  i .e in 4.00 minutes, the team which started the race first will be considered as a winner.
So, Red team wins the race.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of teams");
	    int n = sc.nextInt();
	    if(n<=1){
	        System.out.println("Invalid input");
	        return;
	    }
	        
	    float i1, i2, i3, i4, min=0; //Scores
	    String[] team = new String[n];
	    float[] score = new float[n];
	    
	    System.out.println("Enter the details");
	    for(int i=0; i<n; i++)
	    {
	        String input = sc.next();
	        String[] inputSplit = input.split(":");
	        
	        i1 = Float.parseFloat(inputSplit[1]);
	        i2 = Float.parseFloat(inputSplit[2]);
	        i3 = Float.parseFloat(inputSplit[3]);
	        i4 = Float.parseFloat(inputSplit[4]);
	        
	        team[i] = inputSplit[0];
	        
	        if(i1<1||i2<1||i3<1||i4<1) {
	            System.out.println("Invalid number");
	            return;
	        }
	        
	        score[i] = i1+i2+i3+i4;
	    }
	    min=score[0]; int pos=0;
	    for(int i=1; i<n; i++){
	        if(min>score[i]){
	           min = score[i];
	           pos = i;
	        }
	        if(min==score[i]){
	           min = score[i];
	        }
	    }
	    
	    System.out.printf(team[pos]+" team wins the race in %.2f minutes",score[pos]);
	    
	}
}
