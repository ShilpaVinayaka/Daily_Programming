package HashTable;
import java.util.*;

public class SubArrinArr_10 {

    public static boolean subarrInArr(int arr1[], int subArr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i],0)+1);
        }

        for (int i = 0; i < subArr.length; i++) {
            if(map.getOrDefault(subArr[i], 0)>0)
                map.put(subArr[i], map.get(subArr[i])-1);
            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 11, 1, 13, 21, 3, 7 };
        int[] arr2 = { 11, 3, 7, 1, 9 };

        System.out.println(subarrInArr(arr1, arr2));
    }
}
