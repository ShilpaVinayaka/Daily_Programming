import java.util.*;
public class UserInterface{
 
 public static void main(String[] args){
 
 Scanner sc=new Scanner(System.in);
 
 System.out.println("Enter number of stocks to add");
 int n = sc.nextInt();
 
 String[] str = new String[n+1];
 for(int i=0;i<=n;i++){
 str[i] = sc.nextLine();
 }
 ArrayList<String> stock = new ArrayList<String>();
 for(int i=1;i<=n;i++)
 stock.add(str[i]);
 
 System.out.println(stock); 
 
 }
}
