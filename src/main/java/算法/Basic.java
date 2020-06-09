package 算法;

import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: 范子祺
 **/
public class Basic {

    public  static int[] bubbleSort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    swap(a, j);
                }
            }
        }
        return a;
    }



    private  static void swap(int[] a, int j) {
        int temp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = temp;
    }

    /**
     * 冒泡
     */
    @Test
    public void testBubble() {
        int[] a = {66, 4, 6, 8, 99, 9, 2, 99};
        int[] sort = bubbleSort(a);
        for (int s : sort) {
            System.out.print(s + " ");
        }
    }


    private int partition(int[] a, int low, int high) {
        int b = a[low];
        while (low < high) {
            while (low < high && a[high] >= b) {
                high--;
            }
            //把比基准值小的移过来
            a[low] = a[high];
            while (low < high && a[low] <= b) {
                low++;
            }
            //把比基准值大的移过去
            a[high] = a[low];
        }
        //把基准值填入现在的low
        a[low] = b;
        return low;
    }

    private int[] quickSort(int[] a, int low, int high) {
        int mid = 0;
        if (low < high) {
            //拿到下一个基准点
            mid = partition(a, low, high);
            quickSort(a, low, mid - 1);
            quickSort(a, mid + 1, high);
        }
        return a;
    }

    /**
     * 快速排序
     */
    @Test
    public void testQuickSort() {
        int[] a = {1, 14, 6, 8, 99, 9, 2, 99};
        int[] sort = quickSort(a, 0, 7);
        for (int s : sort) {
            System.out.print(s + " ");
        }
    }


    public class Node {
        public int data;

        public Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    @Test
    public void test单链表反转() {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        // 调用反转方法
        head = reverse(head);

        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }

    private Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node reHead = reverse(head.getNext());

        head.next.setNext(head);

        head.next = null;

        return reHead;
    }


    /**
     * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
     * 10+1   1到10 11个
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-the-duplicate-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    @Test
    public void test寻找重复数字fromleetcode() {
        int[] a = {1, 3, 4, 10, 5, 5, 5, 6, 7, 8, 9};
        int m = findDuplicate(a);
        System.out.println(m);
    }

    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;

    }

//        作者：LeetCode-Solution
//        链接：https://leetcode-cn.com/problems/find-the-duplicate-number/solution/xun-zhao-zhong-fu-shu-by-leetcode-solution/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


//    /作者：lantz
//    链接：https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/solution/0ms-zui-di-nei-cun-xie-fa-xin-shou-kan-bu-dong-wo-/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    @Test
    public void test糖果分配() {
        int[] a = {1, 3, 4, 10, 5, 5, 5, 6, 7, 8, 9};
        List<Boolean> booleans = kidsWithCandies(a, 1);
        System.out.println(booleans);
    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add((candy + extraCandies) >= max);
        }
        return result;

//        List booleans=new ArrayList();
//            int max = 0;
//            for (int i = 0;i< candies.length;i++) {
//                max = candies[i] < max ? max : candies[i];
//            }
//
//            max -= extraCandies;
//            for (int i :candies){
//                booleans.add(i >= max);
//            }
//            return booleans;
        }

    /**
     * 等差数列等差数列 2，5，8，11，14。。。。
     *
     * 输入:正整数N >0
     *
     * 输出:求等差数列前N项和
     */

    public static void main(String[] args) throws IOException {

        /**
         * 等差数列等差数列 2，5，8，11，14。。。。
         * 等差数列
         * import java.io.BufferedReader;
         * import java.io.IOException;
         * import java.io.InputStreamReader;
         */
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String message=null;
//        while((message=br.readLine())!=null){
//            int i=Integer.parseInt(message);
//            int res= 2*i + i*(i-1)*3/2;
//            System.out.println(res);
//        }

        /**
         * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
         *   import java.util.Scanner;
         *
         * public class Main {
         */
//        Scanner scanner = new Scanner(System.in);
//        double v = scanner.nextDouble();
//        int x = (int)v;
//        if (v - x >= 0.5){
//            x++;
//        }
//        System.out.println(x);
//

        /**
         * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
         */
//        Scanner scanner = new Scanner(System.in);
//        int v = scanner.nextInt();
//        int i = 0;
//        while (true){
//            if (v!=0 && v % 2 ==1){
//                i++;
//            }
//            if (v == 0){
//                break;
//            }
//            v /= 2;
//        }
//        System.out.println(i);

        /**
         * 描述：
         *
         * 输入一个整数，将这个整数以字符串的形式逆序输出
         *
         * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
         */
//        Scanner scanner = new Scanner(System.in);
//        Integer v = scanner.nextInt();
//        String s = v.toString();
////        System.out.println(s);
//        StringBuilder ss = new StringBuilder();
//        for (int i =s.length()-1;i>=0;i--){
//            ss.append(s.charAt(i));
//        }
//        System.out.println(ss);

        /**
         * 斐波那契数列，兔子
         */

//        Scanner scanner = new Scanner(System.in);
//        Integer v = scanner.nextInt();
//        int x = 1,y=0,z=0;
//        for (int i =0;i<v;i++){
//            z = x+y;
//            x=y;
//            y=z;
//        }
//        System.out.println(z);

//        Scanner scan=new Scanner(System.in);
//            while(scan.hasNext()){
//                int n=scan.nextInt();
//                System.out.println(Fibonacci(n));
//            }
        /**
         * •计算一个数字的立方根，不使用库函数
         *
         * 详细描述：
         *
         * •接口说明
         *
         * 原型：
         *
         * public static double getCubeRoot(double input)
         *
         * 输入:double 待求解参数
         *
         * 返回值:double  输入参数的立方根，保留一位小数
         *
         * 二分查找
         */

//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            double i = scanner.nextDouble();
//            double r = caculate3(i);
//            System.out.printf("%.1f\n",r);
//        }
//        scanner.close();


        /**
         * 从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值，结果保留一位小数
         */

//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String[] string = in.nextLine().split(" ");
//            int count = 0;
//            double sum = 0;
//            for (int i = 0; i <= string.length-1; i++){
//                int num = Integer.valueOf(string[i]);
//                if (num < 0){
//                    count++;
//                }else {
//                    sum += num;
//                }
//            }
//            System.out.println(count);
//            DecimalFormat decimalFormat = new DecimalFormat(".#");
//            if(count == string.length){
//                System.out.print("0.0");
//            }else {
//                System.out.print(
//                        decimalFormat.format(sum/(string.length-count)));
//                System.out.printf("%.1f",sum / (double)(string.length-count));
//            }
//        }

//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String[] string = in.nextLine().split(" ");
//            int sum = 0;
//            for (int i = 0; i <= string.length-1; i++){
//                int num = Integer.valueOf(string[i]);
//                sum += num;
//            }
//            System.out.println(sum);
//        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String[] string1 = in.nextLine().split(" ");
            String[] string2 = in.nextLine().split(" ");
            ArrayList<Integer> a = new ArrayList<>(string1.length);
            ArrayList<Integer> b = new ArrayList<>(string2.length);
//            ArrayList<Integer> s1 = Arrays.stream(string1).forEach(s -> Integer.valueOf(s));
            for (String s:string1) {
                a.add(Integer.valueOf(s));
            }
            for (String s:string2) {
                b.add(Integer.valueOf(s));
            }
            a = bubbleSorta(a);
            b = bubbleSorta(b);
            int sum = 0;
//            sum = Integer.valueOf(string1[0]) + Integer.valueOf(string1[1])+Integer.valueOf(string2[0])+Integer.valueOf(string2[1]);
            sum = a.get(0) + a.get(1) + b.get(0)+b.get(1);
//            for (int i = 0; i <= string1.length-1; i++){
//                int num = Integer.valueOf(string[i]);
//                sum += num;
//            }
            System.out.println(sum);
        }


    }

    public  static ArrayList<Integer> bubbleSorta(ArrayList<Integer> a) {
        int length = a.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (a.get(j+1) < a.get(j)) {
                    swaps(a, j);
                }
            }
        }
        return a;
    }

    private  static void swaps(ArrayList<Integer> a, int j) {
        int temp = a.get(j);
        a.set(j,a.get(j + 1));
        a.set(j + 1,temp);
    }

    private static int Fibonacci(int n){
        if(n<=2){
            return 1;
        }
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("fda","fdff");
        return Fibonacci(n-1)+Fibonacci(n-2);
    }


    /**
     * https://blog.csdn.net/weixin_39781462/article/details/83351235?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase
     * 计算最小公倍数
     */
    @Test
    public void test(){
        int i = lcm(5,7);
        int fibonacci = Fibonacci(3);
    }

    //  计算两个非负整数 p 和 q 的最小公倍数
    public static int lcm(int p, int q){
        int p1 = p;
        int q1 = q;

        while(q != 0){
            int r = p % q;
            p = q;
            q = r;
        }
        return (p1*q1)/p;
    }


    /**
     *将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符
     * StringBuilder
     * .append
     * charAt
     https://blog.csdn.net/tyut_fantao/article/details/8105584?utm_medium=distribute.pc_relevant.none-task-blog-OPENSEARCH-1.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-1.nonecase
     */


    /**
     * 功能:等差数列 2，5，8，11，14。。。。
     *
     * 输入:正整数N >0
     *
     * 输出:求等差数列前N项和
     *
     * 返回:转换成功返回 0 ,非法输入与异常返回-1
     */



    public static double caculate3(double n){
        double mid=0,min=0,max=n;

        while ((max - min)>0.001){
            mid = (max+min)/2;
            if (mid*mid*mid > n){
                max = mid;
            }else if (mid*mid*mid<n){
                min = mid;
            }else {
                return mid;
            }
        }
        return max;
    }




}
