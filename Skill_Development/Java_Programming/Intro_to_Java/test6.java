import java.util.Scanner;
public class Main   
{
    final static short a = 2;
    public static int b = 0;
    public static void main(String [] args)      
    {
        for (int c=0; c < 4; c++)
        {
            switch (c)   
            {
                case a: System.out.print("a ");
                default: System.out.print("default ");
                case a-1: System.out.print("a-1 ");
                            break;
                case a-2: System.out.print("a-2 ");

            }
        }
    }
}

//Output: a-2 a-1 a default a-1 default a-1
