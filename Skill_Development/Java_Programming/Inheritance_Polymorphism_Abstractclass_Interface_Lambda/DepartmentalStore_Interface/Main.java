import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the customer name");
	    String customerName = sc.nextLine();
	    
	    System.out.println("Enter the phone number");
	    String phoneNumber = sc.nextLine();
	    
	    System.out.println("Enter the street name");
	    String streetName = sc.nextLine();
	    
	    System.out.println("Enter the bill amount");
	    double billAmount = Double.parseDouble(sc.nextLine());
	    
	    System.out.println("Enter the distance");
	    int distance = sc.nextInt();
	    
	    CustomerDetails obj = new CustomerDetails(customerName, 
	    phoneNumber, streetName, billAmount, distance);
	    
	    System.out.println("Customer name "+obj.getCustomerName());
	    System.out.println("Phone number "+obj.getPhoneNumber());
	    System.out.println("Street name "+obj.getStreetName());
	    System.out.println("Bonus points "+obj.calculateBonusPoints());
	    System.out.println("Delivery charge "+obj.deliveryCharge());
	}
}
