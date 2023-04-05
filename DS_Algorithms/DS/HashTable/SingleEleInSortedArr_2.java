package HashTable;

public class SingleEleInSortedArr_2 {

    public static int traversing_appr1(int arr[]) {

        int ans = -1; int n = arr.length;
        for (int i = 0; i < arr.length; i= i+2) {
            if(arr[i] != arr[i+1])
            {
                ans = arr[i];
                break;
            }
        }

        if(arr[n-2] != arr[n-1] )
            ans = arr[n-2];

        return ans;
    }

    public static int binarySearch(int arr[], int low, int high) {

        if(high<low)
            return -1;

        if(low==high)
            return arr[low];

        
        int mid = low + (high - low)/2;

        if(mid % 2 == 0) {
            if(arr[mid] == arr[mid+1]) 
                return binarySearch(arr, mid+2, high);
            else    
                return binarySearch(arr, low, mid);
        }
        else {
            if(arr[mid-1] == arr[mid])
                return binarySearch(arr, mid+1, high);
            else
                return binarySearch(arr, low, mid-1);
        }
    }



    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 4, 4, 5, 5, 6, 6 };

        System.out.println(traversing_appr1(arr));

        System.out.println("Binary Search: "+binarySearch(arr, 0, arr.length-1));
    }
}
