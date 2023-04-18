package HashTable;

import java.util.*;

public class longestConsecutiveSeq_9 {

    public static int longestConsSequence(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if(!set.contains(arr[i]-1)) {
                int j = arr[i];
                while(set.contains(j)) {
                    set.remove(Integer.valueOf(j));
                    j++;
                    count++;
                    
                }
                max = Math.max(max, count);
            }
            
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        System.out.println(longestConsSequence(arr));
    }
}
