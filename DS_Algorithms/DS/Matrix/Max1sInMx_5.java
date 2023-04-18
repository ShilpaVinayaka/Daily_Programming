package Matrix;

public class Max1sInMx_5 {

    public static int binarySearchMeth(int arr[], int low, int high) {
        if(high>=low) {

            int mid = low + (high-low)/2;

            if((mid==0 || arr[mid-1] == 0) && arr[mid]==1)
                return mid;
            else if(arr[mid]==0) 
                return binarySearchMeth(arr, mid+1, high);
            else
                return binarySearchMeth(arr, low, mid-1);

        }
        return -1;

    }

    public static int rowswithMax1s(int arr[][]) {

        int maxrowIndex = 0, max = -1, index;
        int C = arr.length;

        for (int i = 0; i < arr.length; i++) {
            index = binarySearchMeth(arr[i], 0, arr[i].length-1);

            if(index != -1 && C-index>max) {
                max = C-index;
                maxrowIndex = i;
            }
        }
        return maxrowIndex;
    }

    public static void main(String[] args) {
        
        int mat[][] = { { 0, 0, 0, 1 },
        { 0, 1, 1, 1 },
        { 1, 1, 1, 1 },
        { 0, 0, 0, 0 } };    
    
        System.out.println();
        System.out.println(rowswithMax1s(mat));
    }
}
