import java.util.*;

public class LeadersInArray_1 {
    public static void leadersInArray_right(int arr[]) {
        Stack<Integer> s = new Stack<>();

        s.push(arr[arr.length-1]);
        
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i]>=s.peek()) {
                s.push(arr[i]);
            }
        }
        while(!s.isEmpty()) {
            System.out.print(s.pop() +" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        leadersInArray_right(arr);
    }
}
