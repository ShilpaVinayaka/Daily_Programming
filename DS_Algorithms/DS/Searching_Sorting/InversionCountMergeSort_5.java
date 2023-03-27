package Search_Sort;

import java.util.Arrays;

public class InversionCountMergeSort_5 {

    public static int merge(int arr[], int si, int mid, int ei) {
        int left[] = Arrays.copyOfRange(arr, si, mid + 1);
        int right[] = Arrays.copyOfRange(arr, mid + 1, ei + 1);

        int idx1 = 0, idx2 = 0;
        int x = si, swaps = 0;

        while (idx1 < left.length && idx2 < right.length) {
            if (left[idx1] < right[idx2])
                arr[x++] = left[idx1++];
            else {
                arr[x++] = right[idx2++];
                swaps += (mid + 1) - (si + idx1);
            }
        }
        while (idx1 < left.length)
            arr[x++] = left[idx1++];

        while (idx2 < right.length)
            arr[x++] = right[idx2++];

        return swaps;

    }

    public static int mergeSort(int arr[], int si, int ei) {

        int invCount = 0;
        if (si < ei) {
            int mid = (si + ei) / 2;
            invCount += mergeSort(arr, si, mid);

            invCount += mergeSort(arr, mid + 1, ei);

            invCount += merge(arr, si, mid, ei);

        }

        return invCount;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 20, 6, 7, 5, 8, 11,3 };

        System.out.println(mergeSort(arr, 0, arr.length - 1));

    }
}
