package leetcode.array;

import org.junit.Test;

/**
 * @description: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数
 * ，判断数组中是否含有该整数。
 * https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: 范子祺
 **/
public class 查找数组中是否有某个数 {
    public class Solution {
        public boolean Find(int target, int[][] array) {
            int rowCount = array.length;
            int colCount = array[0].length;
            int i, j;
            for (i = rowCount - 1, j = 0; i >= 0 && j < colCount; ) {
                if (target == array[i][j])
                    return true;
                if (target < array[i][j]) {
                    i--;
                    continue;
                }
                if (target > array[i][j]) {
                    j++;
                    continue;
                }
            }
            return false;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        int[][] a = {{1, 2, 3, 5}, {3, 4, 5, 6}};
        boolean s = solution.Find(1, a);
        System.out.println(s);
    }

}
