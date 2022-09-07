import java.util.Scanner;
public class User Interface {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter Endowment Id"); 
        String endowmentId = sc.nextLine();
        System.out.println("Enter Holder Name"); 
        String holderName = sc.nextLine();
        System.out.println("Enter Endowment Type"); 
        String endowmentType = sc.nextLine();
        System.out.println("Enter Registration Date"); 
        String registrationDate = sc.nextLine();
        
        if(endowmentType.equalsIgnoreCase ("Educational"))
        {
            System.out.println("Enter Educational Institution"); 
            String educational Institution = sc.nextLine(); 
            System.out.println("Enter Educational Division"); 
            String educationalDivision = sc.nextLine();
            
            Endowment obj = new Educational Endowment(endowmentId, holderName, 
            endowment Type, registrationDate, educational Institution, 
            educationalDivision);
            
            System.out.printf("Endowment Amount %.2f", obj.calculateEndowment();
        }
        
        else if(endowmentType.equals IgnoreCase ("health"))
        {
        System.out.println("Enter Health Care Center"); 
        String healthCareCenter = sc.nextLine(); 
        System.out.println("Enter Holder Age"); 
        int holderAge = sc.nextInt();
        
        Endowment obj = new HealthEndowment(endowmentId, holderName, 
        endowment Type, registrationDate, healthCareCenter, holderAge);
        
        System.out.printf("Endowment Amount %.2f", obj.calculateEndowment();
        }
    }
}
