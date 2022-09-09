import java.util.Scanner;
public class Main {
 
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the String");
 String sentence = sc.nextLine();
 System.out.println("Enter First Index");
 int number1 = sc.nextInt();
 System.out.println("Enter Second Index");
 int number2 = sc.nextInt();
 
 Main ob = new Main();
 String res = ob.extractString(sentence,number1,number2);
 System.out.println(res);
 }
 
 public String extractString(String sentence,int number1,int number2)
 { 
 String extract ="";
 try{
 extract += sentence.substring(number1,number2);
 }
 catch(StringIndexOutOfBoundsException e){
 extract+="Extraction of String using the given index is not possible";
 }
 finally{
 extract+=".Thanks for using the application.";
 }
 return extract;
 }
}
