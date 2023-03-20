import java.util.ArrayList;

public class ReverseInGroup_4 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void reverseGroupInArr(int arr[], int k) {
        int left, right;
        for (int i = 0; i < arr.length; i += k) {
            left = i;

            // To make up when there are left over elements outside group of 3
            right = Math.min(i + k - 1, arr.length - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        printArr(arr);
    }

    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int left, right;
        for (int i = 0; i < arr.size(); i += k) {
            left = i;

            // To make up when there are left over elements outside group of 3
            right = Math.min(i + k - 1, arr.size() - 1);

            while (left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right,temp);
                
                left++;
                right--;
            }
        }
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 4;
        reverseGroupInArr(arr, k);

        ArrayList<Integer> arry = new ArrayList<>();
        arry.add(1);
        arry.add(2);
        arry.add(3);
        arry.add(4);
        arry.add(5);
        arry.add(6);
        arry.add(7);
        arry.add(8);
        arry.add(9);
        arry.add(10);
        reverseInGroups(arry,arry.size(),3);
    }
}
