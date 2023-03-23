import java.util.Arrays;

public class SwaptoEqualArrSum_17 {
    public static int getSum(int arr[]) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int getTarget(int a[], int b[]) {
        int sum1 = getSum(a);
        int sum2 = getSum(b);

        if(sum1==sum2)
            return 1;

        if((sum1-sum2)%2 != 0 )
            return 0;
        return ((sum1-sum2)/2);

    }
    public static int swapPairs(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);

        int target = getTarget(a,b);
        if(target == 1)
            return 1;

        if(target == 0)
            return -1;

        int i = 0, j=0;

        while(i<a.length && j<b.length) {
            int diff = a[i] - b[j];
            if(diff == target) {   //At index j/i whereever it is equal refer to the elementss from original array to swap
                return 1;
            }
            else if(diff<target)
                i++;
            else
                j++;
        }
        return -1;
    }
    public static void main(String args[]) {
        int A[] = {4, 1, 2, 1, 1, 2};
        int B[] = { 3,3,6,3};
        System.out.println(swapPairs(A, B));
    
    }
}
