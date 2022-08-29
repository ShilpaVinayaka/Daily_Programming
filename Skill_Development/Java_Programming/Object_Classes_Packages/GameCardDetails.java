/*
The Game World is a famous game park for kids. The Game World Association has decided to automate their customer details and feed them into a card known as the game card. As an initiative , they have outlined to develop software that would generate the game card details.
You being their software consultant have been approached to develop software using the Java program
Component Specification: CardPoints
Type(Class)
Attributes
Methods
Responsibilities
CardPoints
int cardId
String holderName
int balancePoints
Include the getters and setters method for all the attributes.
Note:The class and methods should be declared as public and all the attributes should be declared as private.
Requirement 1: Being able to withdraw points based on the points
As per this requirement, the system should be able to withdrawPoints based on the points as follows,
Component Specification: CardPoints
Component Name
Type(Class)
Methods
Responsibilities
Calculate the withdrawPoints based on the points
CardPoints
public boolean withdrawPoints(int points)
This method is used to calculate the balancePoints in the respective card points. Before that it should ensure enough balance.
If there is enough balance, deduct the balancePoints from the balance and print "Balance points after used: XXX" and return true
If there are no enough balancePoints, print "Sorry!!! No enough points" and return false.
Component Specification: GameCardDetails
Component Name
Type(Class)
Methods
Responsibilities
Get the inputs related to the game card from the user
GameCardDetails
public CardPoints getCardDetails()
This method gets the input related to the Game Card from the user and returns the CardPoints object with all values set.
If the input given for balance points is less than or equal to zero, consider it as invalid and display "Balance points should be positive". Continue this kind of evaluation till the user enters a positive value
Component Specification: GameCardDetails
Component Name
Type(Class)
Methods
Responsibilities
Get the points to be used from the user
GameCardDetails
public int getPointUsage()
This method gets the points to be used as input from the user and returns the same.
If the input given for the point is less than or equal to zero, consider it invalid and display "Points should be positive". Continue this kind of evaluation till the user enters a positive value.
In the GameCardDetails class, Get the game card details as shown in the sample input.
In the main method create an object for the GameCardDetails class and invoke the getCardDetails() method in  the GameCardDetails and get the inputs from the user.
In the main method create an object for GameCardDetails class and invoke the getPointUsage() method in  the GameCardDetails and get  the points used by the user.
Create an object for the CardPoints class and invoke the withdrawPoints() method in the CardPoints class by passing int points as the parameter.

Sample Input/Output 1:
Enter card id
101
Enter card holder name
Mike
Enter balance points
200
Enter points should be used
10
Balance points after used:190

Sample Input/Output 2:
Enter card id
102
Enter card holder name
Nisha
Enter balance points
1000
Enter points should be used
1200
Sorry!!! No enough points 

Sample Input/Output 3:
Enter card id
100
Enter card holder name
Saran
Enter balance points
-16
Balance points should be positive
Enter balance points
50
Enter points should be used
10
Balance points after used:40
*/

import java.util.Scanner;
public class GameCardDetails {
    	
    public CardPoints getCardDetails() {
        
        Scanner sc = new Scanner(System.in);
        int balancePoints;
        
        System.out.println("Enter card id");
        int cardId = sc.nextInt();
        
        System.out.println("Enter card holder name");
        String holderName = sc.next();
        
        do{
            System.out.println("Enter balance points");
            balancePoints = sc.nextInt();
            
            if(balancePoints<=00) 
                System.out.println("Balance points should be positive");
        }while(balancePoints<=0);
        
        CardPoints obj1 = new CardPoints();
        obj1.setCardId(cardId);
        obj1.setHolderName(holderName);
        obj1.setBalancePoints(balancePoints);
        
        return obj1;
}
    
    public int getPointUsage() {
        Scanner sc = new Scanner(System.in);
        int points;
        
        do{
            System.out.println("Enter points should be used");
            points = sc.nextInt();
            
            if(points<=00) 
                System.out.println("Points should be positive");
        }while(points<=0);
        
        return points;
    }
    
    public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		GameCardDetails obj = new GameCardDetails();
		CardPoints obj1 = new CardPoints();
		
		obj1 = obj.getCardDetails();
		int pt = obj.getPointUsage();
		
		obj1.withdrawPoints(pt);
	}
}








