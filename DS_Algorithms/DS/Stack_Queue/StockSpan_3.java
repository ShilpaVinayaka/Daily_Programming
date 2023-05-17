package Stack_Queue;

import java.util.*;

public class StockSpan_3 {

    public static void stockSpan(int price[]) {

        int span[] = new int[price.length];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        //Stack will contain days
        stack.push(0); 

        // Span value of first element is always 1
        span[0] = 1;

        for (int i = 1; i < price.length; i++) {
            
            while(!stack.isEmpty() && price[stack.peek()] <= price[i]) 
                stack.pop();

            // if(stack.isEmpty())
            //     span[i] = i + 1;
            // else
            //     span[i] = i - stack.peek();

            span[i] = (stack.isEmpty())? i+1 : i - stack.peek();

            stack.push(i);
        }

        printArray(span);
    }

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");    

        System.out.println();
    }
    public static void main(String[] args)
    {
        int price[] = { 10, 4, 5, 90, 120, 80 };

        stockSpan(price);
        
    }
    
}
