package HashTable;
import java.util.*;
public class RelativeSorting_12 {

    public static void relativeSort(int arr1[], int arr2[], int ans[]){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if(!map.containsKey(arr1[i]))
                map.put(arr1[i], 1);
            else
                map.put(arr1[i], map.get(arr1[i])+1);
        }

        int idx = 0;

        for (int i = 0; i < arr2.length; i++) {
            
            if(map.containsKey(arr2[i])) {
                for(int j = 1; j<=map.get(arr2[i]); j++) {
                    ans[idx++] = arr2[i];
                }
            }
            map.remove(arr2[i]);
        }

        for(HashMap.Entry<Integer,Integer> it: map.entrySet()) {

            for(int j = 1; j<=it.getValue(); j++) {
                ans[idx++] = it.getKey();
            }
        }        
    } 

    public static void printArr(int ans[]) {
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int arr2[] = { 2, 1, 8, 3 };

        int ans[] = new int[arr1.length];

        relativeSort(arr1, arr2, ans);

        printArr(ans);
    }
}
