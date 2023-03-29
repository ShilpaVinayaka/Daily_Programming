package Search_Sort;

public class SearchInSortedRotatedArr_6 {

    public static int binarySearch_Recursive(int arr[], int low, int high, int key) {
        if (low > high)
            return -1;

        // dividing arr to left and right part at mid
        int mid = low + (high - low) / 2;

        // if key at mid
        if (arr[mid] == key)
            return mid;

        // check if left part is sorted
        if (arr[low] <= arr[mid]) {
            // whether key exists in left part
            if (key >= arr[low] && key < arr[mid])
                return binarySearch_Recursive(arr, low, mid - 1, key);

            // send right part for search
            return binarySearch_Recursive(arr, mid + 1, high, key);
        }

        // if left part is not sorted and key is in right part
        if (key > arr[mid] && key <= arr[high])
            return binarySearch_Recursive(arr, mid + 1, high, key);

        // if left part is not sorted and key is not in right part
        return binarySearch_Recursive(arr, low, mid - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int idx = binarySearch_Recursive(arr, 0, arr.length - 1, 989);
        if (idx != -1)
            System.out.println("Index: " + idx);
        else
            System.out.println("Key not found");
    }
}
