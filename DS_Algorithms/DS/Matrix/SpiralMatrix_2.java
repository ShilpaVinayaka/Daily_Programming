package Matrix;

import java.util.*;

public class SpiralMatrix_2 {

    public static List<Integer> spiralMatrix(int mat[][]) {
        List<Integer> ans = new ArrayList<Integer>(); 

        if(mat.length == 0)
            return ans;

        int m = mat.length, n = mat[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int x = 0, y=0, di=0;

        for (int i = 0; i < m*n; i++) {
            ans.add(mat[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cy = y + dc[di];

            if(0<= cr && 0<=cy && cr<m && cy<n && !seen[cr][cy]) {
                x = cr;
                y = cy;
            }
            else {
                di = (di+1)%4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };

        System.out.println(spiralMatrix(arr));
    }
}
