import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String customerName = sc.nextLine();
        
        System.out.println("Enter Phone Number");
        long phoneNumber = Long.parseLong(sc.nextLine());
        
        System.out.println("Enter address");
        String address = sc.nextLine();
        
        CustomerDetails c = new CustomerDetails(customerName, phoneNumber,
        address);
        
        System.out.println("Enter Bero Type");
        String beroType = sc.nextLine();
        
        System.out.println("Enter Bero Colour");
        String beroColour = sc.nextLine();
        
        double totalAmount = 0;
        if(beroType.equalsIgnoreCase("Steel Bero"))
        {
            System.out.println("Enter Bero Height");
            int beroHeight = sc.nextInt();
            SteelBero obj = new SteelBero(beroType, beroColour, beroHeight);
            Discount obj2 = new Discount();
            obj.calculatePrice();
            totalAmount  = obj.getPrice() - obj2.calculateDiscount(obj);
            System.out.printf("Amount needs to be paid Rs.%.2f",totalAmount);
        }
        else if(beroType.equalsIgnoreCase("Wooden Bero"))
        {
            System.out.println("Enter Wood Type");
            String woodType = sc.nextLine();
            Bero obj = new WoodenBero(beroType, beroColour, woodType);
            Discount obj2 = new Discount();
            obj.calculatePrice();
            totalAmount  = obj.getPrice() - obj2.calculateDiscount(obj);
            System.out.printf("Amount needs to be paid Rs.%.2f",totalAmount);
        }
    }
}
