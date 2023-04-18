package Matrix;

public class CheckRotateeles_7 {

    public static boolean rotateSubstr(int arr[][]) {
        String str = "";

        for (int i = 0; i < arr[0].length; i++) {
            str = str + "-" +String.valueOf(arr[0][i]); //first row only
        }

        str = str+str;

        for (int i = 1; i < arr.length; i++) {
            String curr = "";

            for (int j = 0; j < arr[0].length; j++) {
                curr = curr+"-"+String.valueOf(arr[i][j]);
            }

            if(!str.contains(curr))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4},
        {4, 1, 2, 3},
        {3, 4, 1, 2},
        {2, 3, 4, 1},
        // {4,3,2,1}
        };
        System.out.println(rotateSubstr(mat));
    }
}
