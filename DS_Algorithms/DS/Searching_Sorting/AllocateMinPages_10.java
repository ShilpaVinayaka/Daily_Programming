package Search_Sort;

public class AllocateMinPages_10 {

    public static boolean isPossible(int arr[], int stu, int currMin) {

        int currMax = 0;
        int stuRequired = 1;

        for (int i = 0; i < arr.length; i++) {
            currMax += arr[i];
            if(currMax > currMin) {
                stuRequired++;
                currMax = arr[i];
            }
        }
        return stuRequired <=stu;
    }

    public static int findPages(int arr[], int stu) {

        if(arr.length < stu)
            return -1;
        
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int start = arr[arr.length-1], end = sum; 
        int res = sum;

        while(start<=end) {
            int mid = start + (end - start)/2;
            if(isPossible(arr, stu, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};

        System.out.println("Minimum Pages: " + findPages(arr, 2));
    }
}
