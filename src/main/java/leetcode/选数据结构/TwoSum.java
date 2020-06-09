package leetcode.选数据结构;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 两数之和   https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-2/
 * @author: 范子祺
 * 加深了我对hashcode  equal的理解
 **/
public class TwoSum {

    /**
     * 暴力法
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }


    /**
     * 最后一个没有必要添加进去的原因是，最后一个，会经过a-b=c,,b代表最后一个，
     * 而a代表target  而c在前面肯定添加了，，，至于hashmap的resize，这个有个平均复杂度的看法
     * 不是每次都会resize的
     */
    class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }


    /**
     * 对于1，1。。。  2，2.。这种，我们后面,加进去的是：1，0；1，1
     * 而基本数据类型  和对象是不同的， 2，0；2，1的话，先入的会被后入的替代掉
     */
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
//看看 112，224的
            for (int key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[]{i, map.get(complement)};
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }


    @Test
    public void test() {


//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(1,0);
//        map.put(1,1);
//        for (int key:map.keySet()){
//            System.out.println(key+": "+map.get(key));
//        }
//        System.out.println(map.get(1) != 1);


//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(1,1);
//        for (int key:map.keySet()){
//            System.out.println(key+": "+map.get(key));
//        }
//        System.out.println(map.get(1) != 1);


        Solution2 solution2 = new Solution2();
        int[] n = {2, 2};
        int target = 4;
        int[] m = solution2.twoSum(n, target);
        for (int i : m) {

            System.out.println(i);
        }

//        Solution1 solution1 = new Solution1();
//        int[] n = {2,3,5};
//        int target = 7;
//        int[] m = solution1.twoSum(n,target);
//        for (int i: m){
//
//            System.out.println(i);
//        }


    }


    /**
     * 看一下对象的hash，应该和栈堆有关
     */
    class seeStringHash {
        void seeOne() {
            Map<String, String> stringMap = new HashMap<>();
            stringMap.put("i", "love");
            stringMap.put("i", "you");
            for (String key : stringMap.keySet()) {
                System.out.println(key + ":  " + stringMap.get(key));
            }
            System.out.println(stringMap.size());
        }

        void seeTwoNewString() {
            Map<String, String> stringMap = new HashMap<>();
            stringMap.put(new String("i"), "love");
            stringMap.put(new String("i"), "you");
            String s1 = new String("yiqi");
            String s2 = new String("yiqi");
            System.out.println(s1 == s2);  //false


            stringMap.put(s1, "hh");
            stringMap.put(s2, "heihei");

            for (String key : stringMap.keySet()) {
                System.out.println(key + ":  " + stringMap.get(key));
            }
            System.out.println(stringMap.size());
        }

        void seeTwoNewStringBuilder() {
            Map<StringBuilder, String> stringMap = new HashMap<>();
            stringMap.put(new StringBuilder("i"), "love");
            stringMap.put(new StringBuilder("i"), "you");
            for (StringBuilder key : stringMap.keySet()) {
                key.hashCode();
                System.out.println(key + ":  " + stringMap.get(key));
            }
            System.out.println(stringMap.size());
        }
    }

    @Test
    public void test1() {
        seeStringHash seeStringHash = new seeStringHash();
        seeStringHash.seeOne();
        System.out.println("------------");
        seeStringHash.seeTwoNewString();
        System.out.println("------------");
        seeStringHash.seeTwoNewStringBuilder();
    }

    /**
     * 结果
     * i:  you
     * 1
     * ------------
     * false
     * yiqi:  heihei
     * i:  you
     * 2
     * ------------
     * i:  love
     * i:  you
     * 2
     *
     * 分析，应该是因为String是final的原因，hashmap做了优化，就是key算出来的相同
     * 且key每一个字母也相同，则将之前的替换掉，hash冲出的出现时key不同但是算出来的hashcode相同
     */


    /**
     * string中的
     * public int hashCode() {
     *         int h = hash;
     *         if (h == 0 && value.length > 0) {
     *             char val[] = value;
     *
     *             for (int i = 0; i < value.length; i++) {
     *                 h = 31 * h + val[i];
     *             }
     *             hash = h;
     *         }
     *         return h;
     *     }
     */

    /**
     * stringBuilder中的
     * public native int hashCode();
     * 根据   Object默认的hashcode方法，由于默认的hashcode方法是根据对象的内存地址经哈希算法得来的
     */

}
