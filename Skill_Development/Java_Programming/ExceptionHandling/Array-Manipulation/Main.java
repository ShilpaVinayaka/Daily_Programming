import java.util.*;
public class Main
{
 
 public String getDuplicateElement()
 {
 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the size of an array");
 
 try{
 int sizeArr = sc.nextInt();
 int[] arr = new int[sizeArr];
 System.out.println("Enter the array elements");
 for(int i=0; i<sizeArr; i++)
 {
 arr[i] = sc.nextInt();
 }
 System.out.println("Enter the position of the element to be replicated");
 int pos = sc.nextInt();
 int repEle = arr[pos];
 String ans = "The array elements are";
 for(int i=0;i<sizeArr;i++)
 ans += " "+arr[i];
 ans = ans+" "+arr[pos];
 return ans;
 }
 catch(ArrayIndexOutOfBoundsException e)
 {
 return("Array index is out of range");
 }
 catch(InputMismatchException e){
 return("Input was not in the correct format");
 }
 catch(NegativeArraySizeException e){
 return("Array size should be positive");
 }
 }
 
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 Main ex = new Main();
 System.out.println(ex.getDuplicateElement());
 }
