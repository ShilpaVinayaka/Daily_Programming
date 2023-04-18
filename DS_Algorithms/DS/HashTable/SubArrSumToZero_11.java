package HashTable;

import java.util.*;

public class SubArrSumToZero_11 {

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static ArrayList<Pair> findSubArrays(int arr[]) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        ArrayList<Pair> out = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0)
                out.add(new Pair(0, i));

            ArrayList<Integer> ilist = new ArrayList<>();

            if (map.containsKey(sum)) {
                ilist = map.get(sum);

                for (int it = 0; it < ilist.size(); it++) {
                    out.add(new Pair(ilist.get(it) + 1, i));
                }
            }

            ilist.add(i);
            map.put(sum, ilist);
        }
        return out;
    }

    public static void print(ArrayList<Pair> out) {
        for (int i = 0; i < out.size(); i++) {
            Pair p = out.get(i);
            System.out.println(p.first + " - " + p.second);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
        ArrayList<Pair> out = findSubArrays(arr);

        if (out.size() == 0)
            System.out.println("No subarrays");
        else
            print(out);

    }
}
