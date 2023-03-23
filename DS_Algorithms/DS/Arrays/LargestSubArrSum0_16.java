import java.util.HashMap;

public class LargestSubArrSum0_16 {

    public static int largestSum_with0_hashMap(int arr[]) {
        int maxLen = 0, sum = 0;
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == 0)
                maxLen = i + 1;

            // Lookup if sum exists in hashTable
            Integer prevIdx = hmap.get(sum);

            // if sum does exists in hashmap then update maxlength
            if (prevIdx != null)
                maxLen = Math.max(maxLen, i - prevIdx);
            else
                hmap.put(sum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println("Largest subarray with sum 0 = " + largestSum_with0_hashMap(arr));
    }
}
