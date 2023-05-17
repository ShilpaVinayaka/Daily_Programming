package Stack_Queue;

import java.util.*;

class Interval {
    int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeOverlappingIntervals_2 {    

    public static void mergeOverlapInterval(Interval arr[]) {
        if(arr.length <=0)
            return;

        Stack<Interval> stack = new Stack<>();

        //Sort the intervals based on 1st arg
        Arrays.sort(arr, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        //push 1st interval to stack
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            
            Interval top = stack.peek();

            if(top.end < arr[i].start) 
                stack.push(arr[i]);

            else if(top.end < arr[i].end) {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }


        while(!stack.isEmpty()) {
            Interval res = stack.pop();
            System.out.print("("+res.start+","+res.end+")" + " ");
        }
        System.out.println();


    }

    public static void main(String args[]) {
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(6,8);
        arr[1]=new Interval(1,9);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);

        
        mergeOverlapInterval(arr);


        Interval arr2[]=new Interval[4];
        arr2[0]=new Interval(1,3);
        arr2[1]=new Interval(2,4);
        arr2[2]=new Interval(6,8);
        arr2[3]=new Interval(9,10);        
        mergeOverlapInterval(arr2);




    }

}
