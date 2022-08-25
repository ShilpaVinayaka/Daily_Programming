public class Main
{
	public static void main(String[] args) {
		
		boolean isTrue = true;
		outer:
		    for(int i=0; i<5; i++)
		    {
		        while(isTrue)
		        {
		            System.out.println("Hello");
		            break outer;   //Will break out of the loop and label
		        }
		        System.out.println("Outer loop"); // Won't print
		    }
		    System.out.println("Bye Bye");
	}
}
