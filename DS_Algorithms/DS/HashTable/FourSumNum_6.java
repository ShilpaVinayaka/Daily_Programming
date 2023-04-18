package HashTable;

import java.util.HashMap;

public class FourSumNum_6 {

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void fourSumNumbers(int arr[], int X) {

        HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                map.put(arr[i]+arr[j], new Pair(i, j));
            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                if(map.containsKey(X - sum)) {
                    Pair p = map.get(X - sum);

                    if(p.first != i && p.first != j && p.second != i && p.second !=j) {
                        System.out.print(arr[i]+", "+arr[j]+", "+arr[p.first]+", "+arr[p.second]);
                        System.out.println();
                        return;
                    }
                }

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 1, 2 };
        int X = 91;

        fourSumNumbers(arr, X);
    }
}
