package leetcode.array;

/**
 * @description: Given an array A of non-negative integers, return an array
 * consisting of all the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 * <p>
 * Example 1:
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * <p>
 * Note:
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * @author: 范子祺
 **/
public class Sort_Array_By_Parity_905 {
    static class Solution {
        public int[] sortArrayByParity(int[] A) {

            for (int i = 0, j = A.length - 1, m = 0; i < A.length - m - 1; i++) {
                for (; A.length - m - 1 > i; ) {
                    if (A[i] % 2 == 1) {
                        int temp = A[j];
                        A[j] = A[i];
                        A[i] = temp;
                        j--;
                        m++;
                        continue;
                    }
                    break;
                }
            }
            return A;
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{2, 3, 1, 5};
        A = new Solution().sortArrayByParity(A);
        for (int i : A) {
            System.out.printf(i + "\t");
        }
    }
}
