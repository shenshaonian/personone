package leetcode.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @description:输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。 https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 * @author: 范子祺
 **/

/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
public class 链表返回arraylist {

    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            if (listNode == null) {
                ArrayList list = new ArrayList();
                return list;
            }
            Stack<Integer> s = new Stack<Integer>();
            while (listNode != null) {
                s.push(listNode.val);
                listNode = listNode.next;
            }
            ArrayList<Integer> a = new ArrayList<Integer>();
            while (!s.isEmpty()) {
                a.add(s.pop());
            }
            return a;
        }
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        Solution solution = new Solution();
        ArrayList<Integer> a = solution.printListFromTailToHead(l1);
        for (Integer i : a) {
            System.out.println(i);
        }
    }

    public class Solution2 {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> list = new ArrayList();//todo   这个地方时如何做到的是同一个数组
            System.out.println(list.hashCode());
            ListNode p = listNode;
            if (p != null) {
                if (p.next != null) {
                    list = printListFromTailToHead(p.next);
                }
                list.add(p.val);
            }
            return list;
        }
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        Solution2 solution2 = new Solution2();
        ArrayList<Integer> a = solution2.printListFromTailToHead(l1);
        for (Integer i : a) {
            System.out.println(i);
        }
    }

}
