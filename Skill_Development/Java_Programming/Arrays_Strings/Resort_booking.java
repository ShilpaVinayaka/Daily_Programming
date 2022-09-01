/*
Velan resort decides to automate their bookings. By automating they can easily enter the customer details, number of people visiting the resort, and based on the customer category they can calculate the booking price. So help the resort to do the automation using a java program
Considerations & Requirements:
For 1 adult Rs. 1000 per day
For 1 child Rs. 650 per day
Take input from the user as a single string separating each field with a colon(smile
 <customer name>:<number of adults>:<number of child>:<number of days>
If the number of adults is less than zero, print "Invalid input for number of adults"
If the number of children is less than zero, print "Invalid input for number of children"
If the number of days is less than or equal to zero, print "Invalid input for number of days"

Sample Input/Output 1:
Harish:2:2:2
Harish your booking is confirmed and the total cost is Rs 6600

Sample Input/Output 2:
Guru:1:0:0
Invalid input for number of days

Sample Input/Output 3:
Ezhil:1:0:1
Ezhil your booking is confirmed and the total cost is Rs 1000
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		String[] inputSplit = input.split(":");
		int adults = Integer.parseInt(inputSplit[1]);
		int children = Integer.parseInt(inputSplit[2]);
		int days = Integer.parseInt(inputSplit[3]);
		int flag=0;

		if(adults<0){
		  System.out.println("Invalid input for number of adults");
		  flag++;
		}
		if(children<0){
		  System.out.println("Invalid input for number of children");
		  flag++;
		}
		if(days<=0){
		  System.out.println("Invalid input for number of days");
		  flag++;
		}

		if(flag>0)
		    return;
		else {
		    int billAmount;
		    billAmount = adults*days*1000 + children*days*650;
		    System.out.println(inputSplit[0]+ " your booking is confirmed and the total cost is Rs "+billAmount);
		}
	}
}
