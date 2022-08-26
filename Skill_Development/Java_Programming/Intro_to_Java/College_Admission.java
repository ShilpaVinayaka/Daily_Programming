/* M.K.C.E College is opening their admission for 2021 12th passed outs. The chairman of the college decides to go for online applications considering the pandemic situation. Help him to write Java code to get the basic details of the students.

Note :

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program
Sample Input/Output 1: 
Applicant name
Sarvesh VK
Marks obtained in HSC
934
Total possible marks in HSC
1200
Engineering cutoff mark
152.5
Marks obtained in SSLC
452
Total possible marks in SSLC
500
Gender
M
Your Application has been Submitted Successfully
The name of the applicant: Sarvesh VK
Engineering Cutoff: 152.5
Applicant gender: M
All the best for your Career
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Applicant Name: ");
	    String name = sc.nextLine();
	    
	    System.out.println("Marks obtained in HSC");
	    int hsc_marks = sc.nextInt();
	    
	    System.out.println("Total possible marks in HSC");
	    int tot_hsc_marks = sc.nextInt();
	    
	    System.out.println("Engineering cutoff mark");
	    float cuttoff_Marks = sc.nextFloat();
	    
	    System.out.println("Marks obtained in SSLC");
	    int sslc_Marks = sc.nextInt();
	    
	    System.out.println("Total possible marks in SSLC");
	    int tot_sslc_marks = sc.nextInt();

	    System.out.println("Gender (M/F)");
	    String gen = sc.next();
	    
		System.out.println("Your Application has been Submitted Successfully");
		System.out.println("The name of the applicant:"+name);
		System.out.println("Engineering Cutoff: "+cuttoff_Marks);
		System.out.println("Applicant gender: " + gen);
		System.out.println("All the best for your Career");
	}
}

