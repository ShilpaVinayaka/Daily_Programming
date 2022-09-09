import java.util.Scanner;
public class UserInterface {
 public static DiscountInfo generateBillAmount() {
 DiscountInfo d=(obj)->{
 double amount = 0, discount = 0;
 if(obj.getCount()>=100)
 {
 if(obj.getVolume()==10){
 discount = (obj.getCount()*20)*0.1;
 amount = (obj.getCount())*20 - discount;
 }
 else if(obj.getVolume()==25){
 discount = (obj.getCount()*50)*0.15;
 amount = (obj.getCount())*50 - discount;
 }
 else if(obj.getVolume()>=25 || (obj.getVolume()<25 && obj.getVolume()>10) || obj.getVolume
 amount = 0;
 }
 else{
 if(obj.getVolume()==10){
 amount = (obj.getCount())*20;
 }
 else if(obj.getVolume()==25){
 amount = (obj.getCount())*50;
 }
 else if(obj.getVolume()>=25 || (obj.getVolume()<25 && obj.getVolume()>10) || obj.getVolume
 amount = 0;
 }
 return amount;
 };
 return d;
 }
 
 public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the name of the distributor");
 String distributorName = sc.next();
 
 System.out.println("Enter the volume of the container(in litre)");
 int volume = sc.nextInt();
 
 System.out.println("Enter the no of containers");
 int count = sc.nextInt();
 
 Container c = new Container(distributorName, volume, count);
 DiscountInfo ob = generateBillAmount();
 
 double amount = ob.calculatePayableAmount(c);
 
 if(amount == 0){
 System.out.println("There is no Discount");
 return;
 }
 System.out.println("Generated Bill Amount");
 System.out.println("Distributor name: "+ distributorName);
 System.out.printf("Amount to be paid: Rs.%.2f",amount);
 }
 }
