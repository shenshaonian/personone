package leetcode.array;

/**
 * @description: Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 * <p>
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * <p>
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 * <p>
 * Example 1:
 * <p>
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Example 2:
 * <p>
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Notes:
 * <p>
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 * @author: 范子祺
 **/
public class Flipping_an_Image_832 {
    static class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int m = A.length;
            for (int n = 0; n < m; n++) {
                int i = 0, j = m - 1;
                while (i < j) {
                    int temp = A[n][i];
                    A[n][i] = 1 - A[n][j];
                    A[n][j] = 1 - temp;
                    i++;
                    j--;
                }
                if (i == j) {
                    A[n][i] = 1 - A[n][j];
                }
            }
            return A;
        }
    }

    public static void main(String[] args) {
        int[][] B = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        print(B);
        B = new Solution().flipAndInvertImage(B);
        print(B);
    }

    static void print(int[][] B) {
        System.out.printf("{");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (j == 0) {
                    System.out.printf("{");
                }
                System.out.printf(String.valueOf(B[i][j]));
                if (j != B.length - 1) {
                    System.out.printf(",");
                }
            }
            System.out.println("},");
        }
        System.out.println("}");

    }
}
