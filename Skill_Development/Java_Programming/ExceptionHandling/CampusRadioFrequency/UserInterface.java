import java.util.Scanner;
public class UserInterface {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Scan the radio station");
 float freq = sc.nextFloat();
 Validator ob = new Validator();
 try{
 ob.validateStation(freq);
 System.out.println("Radio Station on!");
 }
 catch(StationNotAvailableException e){
 System.out.println(e.getMessage());
 }
 }
}
