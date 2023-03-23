public class SubArrSum_Slidingwindow_11 {
    public static int subArraySum(int arr[], int sum) {
        int currSum = arr[0], start = 0;

        for(int i=1; i<=arr.length; i++) {
            while(currSum>sum && start<i) {
                currSum -= arr[start];
                start++;
            }

            if(currSum == sum) {
                System.out.println(start+" "+(i-1));

                for (int j = start; j <i; j++) {
                    System.out.print(arr[j] + " ");
                }
                return 1;
            }

            if(currSum<sum)
                currSum += arr[i];
        }
        System.out.println("No subarray found");
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        subArraySum(arr, 23);
    }
}
