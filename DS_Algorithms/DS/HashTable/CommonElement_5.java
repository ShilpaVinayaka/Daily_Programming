package HashTable;

public class CommonElement_5 {

    public static void commonEle(int arr1[], int arr2[], int arr3[]) {
        int i = 0, j = 0, k = 0;
        int prev1, prev2, prev3;
        prev1 = prev2 = prev3 = Integer.MIN_VALUE;

        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;

        while (i < n1 && j < n2 && k < n3) {

            while (i < n1 && prev1 == arr1[i])
                i++;
            while (j < n2 && prev2 == arr2[j])
                j++;
            while (k < n3 && prev3 == arr3[k])
                k++;

            if (i < n1 && j < n2 && k < n3) {
                if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                    System.out.print(arr1[i] + " ");
                    prev1 = arr1[i++];
                    prev2 = arr2[j++];
                    prev3 = arr3[k++];
                } else if (arr1[i] < arr2[j]) {
                    prev1 = arr1[i++];
                } else if (arr2[j] < arr3[k]) {
                    prev2 = arr2[j++];
                } else {
                    prev3 = arr3[k++];
                }
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int ar1[] = { 1, 5, 10, 20, 40, 80, 80 };
        int ar2[] = { 6, 7, 20, 80, 80, 100 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 80, 120 };

        commonEle(ar1, ar2, ar3);
    }
}
