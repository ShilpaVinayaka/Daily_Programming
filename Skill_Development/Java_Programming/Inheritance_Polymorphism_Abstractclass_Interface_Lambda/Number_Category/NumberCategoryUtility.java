import java.util.Scanner; 
public class NumberCategoryUtility{
    public static NumberCategory checkAmicable() { 
        NumberCategory a =(numi, num2)->{
            int sum_1 =0, sum_2 =0; 
            for(int i=1; i<num1; i++){ 
                if(num1%i==0)
                    sum_1 += i;
            }
            for(int i=1; i<num2; i++){ 
                if(num2%i==0)
                    sum_2 += i;
            }
            if(sum_1 == num2 && sum_2==numi)
                return true; 
            else
                return false;
        };
            return a;
    }
            public static NumberCategory checkpalindrome () {
            NumberCategory p = (num1, num2) ->{
                int rem, sum=0; 
                int prod = num1*num2; 
                int temp = prod; 
                while(prod>0){
                    rem = prod%10; 
                    sum = (sum*10) +rem; 
                    prod = prod/10;
                }
                    if(temp==sum)
                        return true; 
                    else
                        return false;
            };
            return p;
        }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in); 
        int num1 = sc.nextInt(); 
        int num2 = Sc.nextInt();
        
        NumberCategory obj = checkAmicable();
        
        if(obj.checkNumberCategory(numi, num2))
            System.out.println("The numbers are amicable"); 
        else
            System.out.println("The numbers are not amicable");
            
        NumberCategory obj1 = checkPalindrome(); 
        if(obj.checkNumberCategory (numi, num2))
        System.out.println("Product do produces a Palindrome"); 
        else
        System.out.println("Product does not produce a Palindrome");
    }
}
