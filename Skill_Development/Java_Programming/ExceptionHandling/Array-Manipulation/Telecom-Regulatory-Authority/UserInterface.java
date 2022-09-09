import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the data usage in Mb");
 int data = sc.nextInt();
 Validator obj = new Validator();
 try{
 obj.validateDataUsage(data);
 System.out.println("There is sufficient data for usage");
 }
 catch(MaximumDataUsageException e){
 System.out.println(e.getMessage());
 }
 }
}
