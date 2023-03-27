package Search_Sort;

public class BinarySearch_1 {
    public static int binarySearch_iterative(int arr[], int key) {
        int low = 0, high = arr.length-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid+1;
            else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static int binarySearch_Recursive(int arr[], int low, int high, int key) {
        if(low<=high) {
            int mid = low + (high - low)/2;

            if(key==arr[mid])
                return mid+1;
            else if(key<arr[mid])
                return binarySearch_Recursive(arr, low, mid-1, key);
            else
                return binarySearch_Recursive(arr, mid+1, high, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]  = {1,5,7,8,9,22,44,67};
        int res = binarySearch_iterative(arr, 522);
        if(res == -1)
            System.out.println("Element not found");
        else
            System.out.println("Ele found at position: " + res);

        int resRec = binarySearch_Recursive(arr, 0, arr.length-1, 422);
        if(resRec == -1)
            System.out.println("Element not found");
        else
            System.out.println("Recursion: " + resRec);
    }
}
