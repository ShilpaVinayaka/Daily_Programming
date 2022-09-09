public class Main
{
	public static void main(String[] args) 
	{
		int x = 0;
        int y = 10;
        
        do {
            y--;
            ++x;
        } while (x < 5);
        
        System.out.print(x + "," + y);
	}
}

// Output: 5,5
