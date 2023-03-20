public class Sort012Arr_3 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void swap(int a, int b, int arr[]) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sort123_pointerAppr(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {

                swap(mid, low, arr);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(mid, high, arr);
                high--;
            } else {
                System.out.println("Not valid Input");
            }
        }

        printArr(arr);
    }

    public static void sort012_Approach2(int arr[]) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        }
        int i = 0;
        while (c0 > 0) {
            arr[i++] = 0;
            c0--;
        }
        while (c1 > 0) {
            arr[i++] = 1;
            c1--;
        }
        while (c2 > 0) {
            arr[i++] = 2;
            c2--;
        }
        printArr(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 2, 1, 0, 0, 1, 2, 1 };
        sort123_pointerAppr(arr);
        int arr1[] = { 0, 1, 2, 0, 1, 2 };
        sort012_Approach2(arr1);
    }
}
