public class MaxMinAlternative_6 {

    public static void twoPointerApp(int arr[]) {
        int small = 0, large = arr.length - 1;

        int temp[] = arr.clone();

        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (flag)
                temp[i] = arr[large--];
            else
                temp[i] = arr[small++];

            flag = !flag;
        }
        for (int i = 0; i < temp.length; i++)
            System.out.print(temp[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        twoPointerApp(arr);
    }
}
