package Search_Sort;

import java.util.*;

public class KthSmallest_largestele_9 {

    public static int kthEle(TreeMap<Integer, Integer> map, int key) {

        int freq = 0;
        for(Map.Entry i : map.entrySet()) {
            freq += (int)i.getValue();

            if(freq>=key)
                return (int)i.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,9,2,4};

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        System.out.println(kthEle(map,4));
    }
}
