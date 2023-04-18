package Matrix;

public class PalinPathToptoBtm_4 {

    public static boolean isPalin(String str) {

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void palinpath(String str, char[][] arr, int i, int j, int m, int n) {

        if(j<m-1 || i<n-1) {
            if(i<n-1)
                palinpath(str+arr[i][j], arr, i+1, j, m, n);
            if(j<m-1)
                palinpath(str+arr[i][j], arr, i, j+1, m, n);
        }
        else {

            str = str + arr[n-1][m-1];
            if(isPalin(str))
                System.out.println(str);
        }
    }
    public static void main(String[] args) {
        char arr[][] = { { 'a', 'a', 'a', 'b' },
        { 'b', 'a', 'a', 'a' },
        { 'a', 'b', 'b', 'a' } };
        String str = "";
        palinpath(str, arr, 0, 0, 4, 3);    }
}
