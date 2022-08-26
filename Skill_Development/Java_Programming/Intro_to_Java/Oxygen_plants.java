/*
Across the world, millions of plants produce oxygen for millions of people. Levi is experimenting with oxygen production in an airtight room. He calculates the total plants that can be placed in a room based on the floor area of the room. Plant sets should be a multiple of 10 if not the same shall be rounded to the nearest and the lowest multiple of 10. Also, a mature plant produces 0.9 litres of oxygen. Calculate the total production of oxygen based on the total plants in the room using Java program.

Note:
To convert cm2 to m2, divide it by 100*100.
Format the output in 2 decimal places.

Sample Input/Output:
Enter the floor area of the room(m*m)
4
4
Enter the plant area of a single plant(in cm2)
625
Total plants placed on floor area 4.00*4.00 is 250 plants produces 225.00 litres of oxygen in a day
 
Explanation:
Total plants=floor area (in m2)/plant area (in m2)
Total plants = 4*4/625*100*100 = 256 ~250 (Round it the nearest and lowest multiple of 10)
Total Production of Oxygen = 250*0.9 = 225
*/

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);

      System.out.println ("Enter the floor area of the room(m*m)");
    float l = sc.nextFloat ();
    float b = sc.nextFloat ();

      System.out.println ("Enter the plant area of a single plant(in cm2");
    float p_area = sc.nextFloat ();

    float f_tot_plants = (l * b * 10000) / (p_area) ;
    int tot_plants = (int) f_tot_plants;
    int rem = tot_plants % 10;

    if (rem != 0)
        tot_plants = tot_plants - rem;

    double oxy = ((double)tot_plants) * 0.9;
    System.out.printf("Total plants placed on floor area %.2f*%.2f is "+ tot_plants +" plants produces %.2f liters of oxygen in a day",l,b,oxy);
  }
}

