public class ZigZagArr_5 {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void zigzagArr(int arr[]) {
        boolean flag = true;
        for (int i = 0; i <= arr.length-2; i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag;
        }
        printArr(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
        zigzagArr(arr);
    }
}
