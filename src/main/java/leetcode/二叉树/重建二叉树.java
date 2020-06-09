package leetcode.二叉树;

import org.junit.Test;

/**
 * @description:https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=13&tqId=11157&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author: 范子祺  这个太难了，主要要弄懂里面的思想
 **/
public class 重建二叉树 {
    /**
     * Definition for binary tree
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
            TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
            return root;
        }

        //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
        private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

            if (startPre > endPre || startIn > endIn)
                return null;
            TreeNode root = new TreeNode(pre[startPre]);

            for (int i = startIn; i <= endIn; i++)
                if (in[i] == pre[startPre]) {
                    root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                    root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                    break;
                }

            return root;
        }
    }

    @Test
    public void test() {
        String str = "";
        System.out.println(str.split(",").length);
        String[] s = new String[2];
        System.out.println(s.length);
        System.out.println(str.length());
    }

}
