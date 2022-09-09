import java.util.Scanner;
public class Main {
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of students");
 int n = sc.nextInt();
 
 StudentUtility ob = new StudentUtility();
 for(int i=0; i<n; i++){
 System.out.println("Enter the student name");
 String name = sc.next();
 System.out.println("Enter the score");
 double score = sc.nextDouble();
 ob.addStudentDetails(name,score);
 }
 int count = ob.filterStudentDetails();
 if(count ==0)
 System.out.println("No students found");
 else
 System.out.println("Count is "+count);
 }
}
