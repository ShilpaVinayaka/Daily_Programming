package Stack_Queue;

import java.util.*;

public class NextGreaterEle_4 {

    public static void nextGreaterEleFunc(int arr[]) {
        Stack<Integer> stack = new Stack<>();

        int nge[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            
            if(stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
                nge[stack.peek()] = arr[i];
                stack.pop();
            }
            
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            nge[stack.pop()] = -1;
        }

        for (int i = 0; i < nge.length; i++) {
            System.out.println(nge[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = {13,7,6,12,10};
        nextGreaterEleFunc(arr);
    }
}