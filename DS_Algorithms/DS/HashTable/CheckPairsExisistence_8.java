package HashTable;

import java.util.*;

public class CheckPairsExisistence_8 {

    public static boolean checkPairs(int arr[], int k) {

        // odd length arr cannot be divided into pairs
        if (arr.length % 2 != 0)
            return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = ((arr[i] % k) + k) % k;

            if (!map.containsKey(rem)) {
                map.put(rem, 0);
            }
            map.put(rem, map.get(rem) + 1);
        }

        for (int i = 0; i < arr.length; i++) {

            int rem = ((arr[i] % k) + k) % k;

            if (2 * rem == k) {
                if (map.get(rem) % 2 == 1)
                    return false;
            } else if (rem == 0) {
                if (map.get(rem) % 2 == 1)
                    return false;
            } else {
                if (map.get(rem) != map.get(k - rem))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 14, 12, 14 };
        int k = 2;

        // Function call
        boolean ans = checkPairs(arr, k);
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
