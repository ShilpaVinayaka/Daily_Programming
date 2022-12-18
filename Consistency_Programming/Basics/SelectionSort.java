public class SelectionSort {

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,6};

        //selection Sort
        for(int i=0; i<arr.length-1; i++) {
            int minIdx  = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        printArr(arr);        
    }
}
