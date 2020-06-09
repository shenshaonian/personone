package mianshi.jiaoti;

import org.junit.Test;

/**
 * @description:聪明的小偷
 * @author: 范子祺
 * @create: 2019-05-27 23:01
 **/
public class cleverThief {
    @Test
    public void test() {
        int[] a = {1, 200, 400, 100, 100, 500, 1};
//        int[] a = {1,2,4,6,8,10,12};
        int i = steal(a);
        System.out.println(i);
    }

    public int steal(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (nums.length == 3) {
            return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        }
        int len = nums.length;
        int res1 = stealFirstOrLast(nums, 0, len - 2);
        int res2 = stealFirstOrLast(nums, 1, len - 1);
        return Math.max(res1, res2);
    }

    public int stealFirstOrLast(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }
        if (start + 1 == end) {
            return Math.max(nums[start], nums[end]);
        }
        if (start + 2 == end) {
            return Math.max(nums[start] + nums[end], nums[start + 1]);
        }
        int len = nums.length;

        // 打劫 第i个房间，所能够获得最大值
        int[] dp = new int[len];
        dp[start] = nums[start];
        dp[start + 1] = nums[start + 1];
        dp[start + 2] = nums[start + 2] + dp[start];
        for (int s = start + 3; s <= end; s++) {
            dp[s] = nums[s] + Math.max(dp[s - 3], dp[s - 2]);
        }
        return Math.max(dp[end], dp[end - 1]);
    }


}
