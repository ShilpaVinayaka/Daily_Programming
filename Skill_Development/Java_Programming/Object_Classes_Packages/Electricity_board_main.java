/*
The Chief Officer of the Electricity Board has decided to automate the customer details and calculate the electricity bill. As an initiative he wants the system to store the customer details and help him to generate the bill.
You being their software consultant have been approached to develop software to implement the functionality of calculating the electricity bill and displaying the bill amount.
Component Specification: CustomerDetails
Type(Class)
Attributes
Methods
Responsibilities
CustomerDetails
String customerId
String customerName
long phoneNumber
String city
double unitsConsumed
double costPerUnit
Include the getters and setters method for all the attributes.
Include a parametrized constructor of six arguments in the following order - customerId,customerName,phoneNumber,city,unitsConsumed,costPerUnit to intialize the values for the CustomerDetails object
Note:The class and methods should be declared as public and all the attributes should be declared as private.
Requirement 1: Being able to calculate the Electricity Bill based on the units consumed and cost per unit
As per this requirement, the system should be able to calculate the Electricity Bill based on the units consumed and cost per unit as follows,
Component Specification: CustomerDetails
Component Name
Type(Class)
Methods
Responsibilities
Calculate the electricity bill based on the units consumed and cost per unit
CustomerDetils
public double calculateElectricityBill ()
This method should calculate the Electricity Bill based on the units consumed and cost per unit and return the electricity bill

Example
unitsConsumed = 523, costPerUnit = 1.5
amount  = unitsConsumed * costPerUnit
amount = 784.50
To get two decimal places, refer to the below-mentioned print statement:
System.out.printf("%.2f", amount);
In the Main class, Get the customer details as shown in the sample input.
Create an object for the CustomerDetails class and invoke the calculateElectricityBill method in the CustomerDetails class.
Invoke the corresponding getters to display the member details as shown in the Sample Output

Sample Input/Output 1:
Enter Customer Id
EB101
Enter Customer  Name
Nikil
Enter Phone Number
986745123
Enter City
Chennai
Enter Units Consumed
620
Enter Cost per Unit
5
Amount to be paid is Rs.3100.00
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Customer Id");
		String CustomerId = sc.nextLine();
		System.out.println("Enter Customer  Name");
		String CustomerName = sc.nextLine();
		System.out.println("Enter Phone Number");
		long PhoneNumber = sc.nextLong();
		System.out.println("Enter City");
		String City = sc.next();
        System.out.println("Enter Units Consumed");
		double UnitsConsumed = sc.nextDouble();
        System.out.println("Enter Cost per Unit");
		double CostPerUnit = sc.nextDouble();
		
		CustomerDetails obj = new CustomerDetails(CustomerId, CustomerName,
		PhoneNumber, City, UnitsConsumed, CostPerUnit);
		
		double res = obj.calculateElectricityBill();
		System.out.printf("Amount to be paid is Rs.%.2f",res);
	}
}
