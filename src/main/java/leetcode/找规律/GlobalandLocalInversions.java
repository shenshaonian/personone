package leetcode.找规律;

import org.junit.Test;

/**
 * @description:全局倒置与局部倒置 这个根据题目意思画一下就知道了
 * <p>
 * https://leetcode-cn.com/problems/global-and-local-inversions/
 * @author: 范子祺
 **/
public class GlobalandLocalInversions {
    class Solution {
        public boolean isIdealPermutation(int[] A) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] - i > 1 || A[i] - i < -1)
                    return false;
            }
            return true;
        }
    }

    @Test
    public void test() {
//        Solution solution = new Solution();
//        int[] s = {3,0,4};
//        int[] t = {1,0,2};
//        boolean ss = solution.isIdealPermutation(s);
//        boolean tt = solution.isIdealPermutation(t);
//        System.out.println("sss--"+ss+"---tttt--"+tt);

        Solution1 solution1 = new Solution1();
        int[] s = {3, 0, 4};
        int[] t = {1, 0, 2};
        boolean ss = solution1.isIdealPermutation(s);
        boolean tt = solution1.isIdealPermutation(t);
        System.out.println("sss--" + ss + "---tttt--" + tt);
    }


    /**
     * 这个解决任意序列，不限于题目了
     */
    class Solution1 {
        public boolean isIdealPermutation(int[] A) {
            int len = A.length;
            if (len <= 2) return true;
            int max = A[0];
            for (int i = 2; i < len; i++) {
                if (max > A[i]) return false;
                if (A[i - 1] > max) max = A[i - 1];
            }

            return true;
        }
    }


    @Test
    public void test1() {
        System.out.println(-5 + 1 / 4 + 2 * -3 + 5.0);
    }

}
