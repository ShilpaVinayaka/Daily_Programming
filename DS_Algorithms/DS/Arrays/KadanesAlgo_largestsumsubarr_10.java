public class KadanesAlgo_largestsumsubarr_10 {

    public static int largestSumSubArray(int arr[]) {
        int start, end, s = 0, meh = 0;
        int msf = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            meh += arr[i];

            if (msf < meh) {
                msf = meh;
                start = s;
                end = i;
            }
            if (meh < 0) {
                meh = 0;
                s = i + 1;
            }
        }
        return msf;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(largestSumSubArray(arr));
        }
}
