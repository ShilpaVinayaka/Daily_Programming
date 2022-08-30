import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Id");
		String customerId = sc.next();
		
		System.out.println("Enter Customer Name");
		String customerName = sc.next();
		
		System.out.println("Enter Phone Number");
		long phoneNumber = sc.nextLong();
		
		System.out.println("Enter Email Id");
		String emailId = sc.next();
		
		System.out.println("Enter type");
		String toyType = sc.next();
		
		System.out.println("Enter Price");
		double price = sc.nextDouble();
		
		CustomerDetails obj = new CustomerDetails(customerId, customerName,
		phoneNumber, emailId, toyType, price);
		obj.setCustomerId(customerId);
		obj.setCustomerName(customerName);
		obj.setPhoneNumber(phoneNumber);
		obj.setEmailId(emailId);
		obj.setToyType(toyType);
		obj.setPrice(price);
		
		if(obj.validateCustomerId()==true){
		    double finalAmount = obj.calculateDiscount();
		    System.out.printf("Amount to be paid by the Customer %.2f",
		    finalAmount);
		}
		else{
		    System.out.println("Provide a proper Customer Id");
		}
	}
}
