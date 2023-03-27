package Search_Sort;

public class QuickSort_2 {

    public static int partition(int arr[], int low, int high) {
        int i = low - 1;
        int pivot = arr[high];

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i]; // swapping pivot to proper order
        arr[i] = arr[high];
        arr[high] = temp;         //use arr[high] only and not pivot

        return i;
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quicksort(arr, low, pidx - 1);
            quicksort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 5, 6, 8, 2, 3 };

        quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
