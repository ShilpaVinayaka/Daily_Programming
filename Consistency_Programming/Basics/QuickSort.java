public class Quick_Sort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //swapping
        int temp = arr[i];  // to give proper place to pivot element
        arr[i] = pivot;
        arr[high] = temp;
        return i;           //pivot index
    }

    public static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx-1); // for eles less than pivot
            quickSort(arr, pidx+1, high); // for eles greater than pivot

        }
    }

    public static void main(String[] args) {
        int arr[] = { 3,2,5,6,4,9,8,7};
        int n = arr.length;

        quickSort(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();  

    }
}
