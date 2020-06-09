package leetcode.找规律;

import org.junit.Test;

/**
 * @description:盛最多水的容器 这种双指针法  需要从数学上证明我们不会错过最优解，不能只凭借直观使用
 * @author: 范子祺
 **/
public class ContainerWithMostWater {
    public class Solution2 {
        public Solution2() {
        }

        public int maxArea(int[] height) {
            int maxarea = 0, l = 0, r = height.length - 1;
            while (l < r) {
                maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
                if (height[l] < height[r]) {

                    l++;
                } else {

                    r--;
                }
            }
            return maxarea;
        }
    }

    @Test
    public void test() {
        Solution2 solution = new Solution2();
        int[] s = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int t = solution.maxArea(s);
        System.out.println(t);
    }


    /**
     * 暴力破解
     */
    public class Solution1 {
        public int maxArea(int[] height) {
            int maxarea = 0;
            for (int i = 0; i < height.length; i++) {
                for (int j = i + 1; j < height.length; j++) {

                    maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
                }

            }
            return maxarea;
        }
    }

}
