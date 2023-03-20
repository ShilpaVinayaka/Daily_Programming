import java.util.Arrays;

public class KthEle_2SortedArr_8 {

    public static int kthEle(int arr[], int arr2[], int k) {
        int sorted[] = new int[arr.length + arr2.length];
        int i = 0, j = 0, idx = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                sorted[idx++] = arr[i++];
            } else {
                sorted[idx++] = arr[j++];
            }
        }

        while (i < arr.length)
            sorted[idx++] = arr[i++];
        while (j < arr2.length)
            sorted[idx++] = arr[j++];

        return sorted[k - 1];
    }

    public static int kth_divideconquer(int arr1[], int arr2[], int k) {
        int m = arr1.length;
        int n = arr2.length;

        // when k value is out of array
        if (k < 1 || k > (m + n))
            return -1;

        // We make sure 1st array is the smallest array
        if (m > n)
            return kth_divideconquer(arr2, arr1, k);

        // If any of the array is empty
        if (m == 0)
            return arr2[k-1];

        //When k==1 we get our answer
        if (k==1)
            return Math.min(arr1[0], arr2[0]);

        int i = Math.min(m, k / 2);
        int j = Math.min(n, k / 2);

        if (arr1[i - 1] > arr2[j - 1]) {
            int temp[] = Arrays.copyOfRange(arr2, j, n);
            return kth_divideconquer(arr1, temp, k - j);
        }

        int temp[] = Arrays.copyOfRange(arr1, i, m);
        return kth_divideconquer(temp, arr2, k - i);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };
        System.out.println("Kth ele = " + kthEle(arr, arr2, 5));

        int a1[] = {2, 3, 6, 9 };
        int a2[] = {1, 4, 8};
        System.out.println("Kth Ele divide-conquer = " + kth_divideconquer(a1, a2, 6));
    }
}
