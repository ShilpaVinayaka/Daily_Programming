public class TrappingRainWater_12 {
    public static int trap_RainWater_twoPointer(int arr[]) {

        int rmax = 0, lmax = 0, left = 0, right = arr.length-1, res = 0;

        while (left <= right) {
            if (rmax <= lmax) {
                res += Math.max(0, rmax - arr[right]);
                rmax = Math.max(rmax, arr[right]);
                right--;
            } else {
                res += Math.max(0, lmax - arr[left]);
                lmax = Math.max(lmax, arr[left]);
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Amount of water trapped: "+ trap_RainWater_twoPointer(arr));
    }
}
