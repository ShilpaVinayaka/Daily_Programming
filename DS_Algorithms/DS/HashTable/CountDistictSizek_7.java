package HashTable;

import java.util.HashMap;

public class CountDistictSizek_7 {

    public static void countDistinct(int arr[], int K) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < K; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        System.out.print(map.size() + " ");

        for (int i = K; i < arr.length; i++) {
            
            if(map.get(arr[i-K]) == 1)
                map.remove(arr[i-K]);
            else
                map.put(arr[i-K], map.get(arr[i-K])-1);

            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

            System.out.print(map.size()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        int K = 4;
 
        countDistinct(arr, K);
    }
}
