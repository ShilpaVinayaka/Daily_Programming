/*
Ravi's teacher gives him an assignment on the topic array. He got two arrays as input and in that he has to add the zero or even index integers of both arrays and subtract the odd index integers of both arrays and create the third array. Help Ravi to complete his assignment using Java.
Requirements:
If both the array size are not the same, print "Both array size are not same"
If the size is less than or equal to zero, print "Invalid array size"

Sample Input/Output 1:
Enter the size for the first array
4
Enter the elements for the first array
3
8
5
3
Enter the size for the second array
4
Enter the elements for the second array
0
2
4
6
The elements of the third array
3
6
9
-3
Explanation:
Array1 = {3,8,5,3}
Array2 = {0,2,4,6}
if the index is zero or even number, add the values in the two arrays -> Array1[0] + Array2[0] = Array3[0]
3 + 0 = 3
If the index is odd number ,subtract the values in the two arrays -> Array1[1] - Array2[1] = Array3[1]
8 - 2 = 6
Array3 = {3,6,9,-3}

Sample Input/Output 2:
Enter the size for the first array
3
Enter the elements for the first array
8
7
1
Enter the size for the second array
2
Enter the elements for the second array
5
6
Both array size are not same

Sample Input/Output 3:
Enter the size for the first array
2
Enter the elements for the first array
7
2
Enter the size for the second array
0
Invalid array size
*/

import java.util.Scanner; 
public class Main{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the size for the first array"); 
    int n1 = sc.nextInt(); 
    if(n1<=0){
        System.out.println("Invalid array size"); 
        return;
    }
    int[] a1 = new int[n1]; 
    System.out.println("Enter the elements for the first array"); 
    for (int i=0; i<n1; i++)
      a1[i] = sc.nextInt();
      
    System.out.println("Enter the size for the second array"); 
    int n2 = sc.nextInt(); 
    if(n2<=0){
        System.out.println("Invalid array size"); 
        return;
    }
    int[] a2 = new int[n1]; 
    System.out.println("Enter the elements for the second array"); 
    for (int i=0; i<n2; i++)
      a2[i] = sc.nextInt();
      
    if(n1!=n2){
      System.out.println("Both array size are not same");
      return;
    }

    int[] a3 = new int[n1];
    for(int i=0; i<n1; i+=2){
        a3[i] = al[i] + a2[i];
        if(i+d<n1)
        a3[i41] = al[i+1] - a2[i+1];
    }

    System.out.println("The elements of the third array");
    for(int i=0; i<n1; i++)
        System.out.println(a3[i]);
   }
 }
