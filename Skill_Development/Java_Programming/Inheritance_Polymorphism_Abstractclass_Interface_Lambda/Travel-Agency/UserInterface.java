import java.util.Scanner;
public class UserInterface{
 public static CommissionInfo generateCommissionObtained() {
     CommissionInfo c=(obj)->{
     String k = (String)obj.getClassType();
     if(k.equalsIgnoreCase("1A")||k.equalsIgnoreCase("2A")||
     k.equalsIgnoreCase("3A")){
     return 100;
     }
     return 60;
     };
     return c;
     }

     public static void main(String [] args)
     {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no of passengers");
     int n = sc.nextInt();
     Ticket tobj[] = new Ticket[n];
     int i; double sum = 0;
     for(i=0; i<n; i++){
     System.out.println("Details of Passenger "+(i+1)+":");
     System.out.println("Enter the pnr no:");
     long prno = sc.nextLong();

     System.out.println("Enter passenger name:");
     String passengerName = sc.next();

     System.out.println("Enter seat no:");
     int seatNo = sc.nextInt();

     System.out.println("Enter class type:");
     String classType = sc.next();

     System.out.println("Enter ticket fare:");
     double ticketFare = sc.nextDouble();

       tobj[i] = new Ticket(prno,passengerName,seatNo,classType,
     ticketFare);
     }

     System.out.println("Commission Obtained");
     CommissionInfo ob = generateCommissionObtained();
     for(int j=0; j<i; j++)
     sum += ob.calculateCommissionAmount(tobj[j]);

     System.out.printf("Commission obtained per each person: Rs.%.2f", sum);
     }
}
