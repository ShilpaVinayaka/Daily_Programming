import java.util.Scanner;
public class UserInterface{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Customer Name");
        String customerName = sc.next();
        
        System.out.println("Enter the City name");
        String cityName = sc.next();
        
        System.out.println("Enter the phone number");
        String phoneNumber = sc.next();
        
        System.out.println("Enter number of people");
        int noOfPeople = sc.nextInt();
        
        System.out.println("Enter the option\n1. Boat House Booking\n2. Boat Ride Booking");
        int option = sc.nextInt();
        
        if(option==1){
            System.out.println("Enter number of days");
            int noOfDays = sc.nextInt();
            System.out.println("Enter food type (Veg/NonVeg)");
            String foodType = sc.next();
            
            Booking obj = new BoatHouseBooking(customerName, cityName,
            phoneNumber, noOfPeople, noOfDays, foodType);
            
            double res = obj.calculateTotalAmount();
            System.out.println("Your booking has been confirmed pay Rs."+res);
        }
        else if(option==2){
            System.out.println("Enter number of hours");
            float noOfHours = sc.nextFloat();
            System.out.println("Do you want guide (Yes/No)");
            String guide = sc.next();
            Booking obj = new BoatRideBooking(customerName, cityName,
            phoneNumber, noOfPeople, noOfHours, guide);
            double res = obj.calculateTotalAmount();
            System.out.println("Your booking has been confirmed pay Rs."+res);
        }
    }
}
