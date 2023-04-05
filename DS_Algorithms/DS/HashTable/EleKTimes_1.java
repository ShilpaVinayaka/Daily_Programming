package HashTable;

import java.util.*;

public class EleKTimes_1 {

    public static int kTimes(int arr[], int k) {

        HashMap<Integer, Integer> umap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            umap.put(arr[i], umap.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if(umap.get(arr[i]) == k)
                return arr[i];
        }

        return -1;
    }

    // Element which counts to k first.
    public int firstElementKTime(int[] arr, int n, int k) {         
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
            if(map.get(arr[i]) == k)
                return arr[i];
        }
        return -1;
    } 

    public static void main(String args[]) {
        int arr[] = {1, 7, 4,8, 3, 4, 8, 8, 7};
        System.out.println(kTimes(arr, 0));
    }
}
