import java.util.Scanner;
public class Main {
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of vehicles");
 int n = Integer.parseInt(sc.nextLine());
 
 VehicleUtility ob = new VehicleUtility();
 String[] name = new String[n];
 double[] price = new double[n];
 for(int i=0; i<n; i++)
 {
 System.out.println("Enter the vehicle name and price of Vehicle "+(i+1));
 name[i] = sc.nextLine();
 price[i] = Double.parseDouble(sc.nextLine());
 ob.addVehiclePriceDetails(name[i],price[i]);
 }
 String find;
 char c;
 do{
 find = "";
 System.out.println("Enter the vehicle name to be searched");
 find = sc.nextLine();
 double res = ob.calculateCostAfterDiscount(find);
 if(res==0)
 System.out.println(find +" is not available currently");
 else
 System.out.println("Price after discount for "+find+" is "+res);
 res = 1;
 
 System.out.println("Do you want to continue (Y/N)");
 String ch = sc.nextLine();
 char[] chars = ch.toCharArray();
 c = ch.charAt(0);
 }while(c=='y'||c=='Y');
 if(c=='N'||c=='n')
 System.out.println("Thank you for using the Application");
 }
}
