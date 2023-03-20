public class EquilibriumPoint_2 {

    // Approach 1
    public static int EquilibriumPoint_fun1(int arr[]) {
        int rightSum = 0, leftSum = 0;

        for (int i = 1; i < arr.length; i++) {
            rightSum += arr[i];
        }

        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            rightSum -= arr[j];
            leftSum += arr[i];

            if (rightSum == leftSum)
                return arr[i + 1];
        }
        return -1;
    }

    // Approach 2
    public static int Equilibriumpoint_fun2(int arr[]) {
        // if there is only 1 element in an array
        if (arr.length == 1)
            return arr[0];

        int start = 0, end = arr.length - 1, leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Finding equilibrium point
            if (start == end && leftSum == rightSum)
                return arr[start];

            // If there is no equilibrium point
            if (start == end)
                return -1;

            // Increase leftsum if rightsum is high and vice versa
            if (rightSum > leftSum) {
                leftSum += arr[start++];
                System.out.println(leftSum);
            } else {
                rightSum += arr[end--];
                System.out.println(rightSum);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 5, 0 };
        int res = EquilibriumPoint_fun1(arr);
        System.out.println("Approach 1: Equilibrium Point is " + res);

        int arr2[] = { 2, 3, 4, 1, 4, 5 };
        System.out.println("Approach 2: Equilibrium Point is " + Equilibriumpoint_fun2(arr2));
    }
}
