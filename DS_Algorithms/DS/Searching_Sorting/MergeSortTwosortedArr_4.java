package Search_Sort;

import java.util.Arrays;

public class MergeSortTwosortedArr_4 {
    public static void mergeSortTwoArr(int arr1[], int arr2[], int arr3[]) {
        
        int i =0, j=0, x=0;
        while(i<arr1.length)
            arr3[x++] = arr1[i++];

        while(j<arr2.length)
            arr3[x++] = arr2[j++];

        Arrays.sort(arr3);
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int arr2[] = {0,2,4,8,9};

        int merged[] = new int[arr1.length+arr2.length];

        mergeSortTwoArr(arr1, arr2, merged);

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
        System.out.println();
    }
}
