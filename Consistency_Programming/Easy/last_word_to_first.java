
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    int i=0;
	    String str = "Mohandas Karamchand Gandhi";
	    
	    //printing last word using substring with whitespace as delimiter
	    System.out.print(str.substring(str.lastIndexOf(" ")+1));
	    
	    //Splits string to tokens
	    StringTokenizer st = new StringTokenizer(str);
	    
	    //until there are tokens and until the number of tokens is less by one
	    while(st.hasMoreTokens() && i<(st.countTokens())){
	       System.out.print(" " + st.nextToken());
	       i++;
	   }
	    
	}
}
