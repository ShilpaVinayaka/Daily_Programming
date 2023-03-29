package Search_Sort;

import java.util.*;

public class SortByFrequency_7 {
    public static void sortArrbyFrequency(List<Integer> list, Integer[] arr) {

        final HashMap<Integer, Integer> mapCount = new HashMap<>();
        final HashMap<Integer, Integer> mapIndex = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mapCount.containsKey(arr[i])) {
                mapCount.put(arr[i], mapCount.get(arr[i])+1);
            } else {
                mapCount.put(arr[i], 1);
                mapIndex.put(arr[i], i);
            }
        }

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2) {

                int freq1 = mapCount.get(n1);
                int freq2 = mapCount.get(n2);

                if(freq1 != freq2)
                    return freq2 - freq1;
                else
                    return mapIndex.get(n1) - mapIndex.get(n2);
            }
        });
        System.out.println(list);
    } 

    public static void main(String[] args) {
        Integer arr[] = {2,5,2,8,5,6,8,8};

        List<Integer> list = Arrays.asList(arr);
        sortArrbyFrequency(list, arr);
    }
}
