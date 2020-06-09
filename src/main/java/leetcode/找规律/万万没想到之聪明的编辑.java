package leetcode.找规律;

import org.junit.Test;

import java.util.Scanner;

/**
 * @description:https://www.nowcoder.com/questionTerminal/42852fd7045c442192fa89404ab42e92?orderByHotValue=1&page=1&onlyReference=false
 * @author: 范子祺
 **/
public class 万万没想到之聪明的编辑 {
    /**
     * 链接：https://www.nowcoder.com/questionTerminal/42852fd7045c442192fa89404ab42e92?orderByHotValue=1&page=1&onlyReference=false
     * 来源：牛客网
     * <p>
     * n = int(input())
     * while n > 0:
     * s = input()
     * res = []
     * for e in s:
     * if len(res) < 2:
     * res.append(e)
     * continue
     * if len(res) >= 2:
     * if e == res[-1] and e == res[-2]:
     * continue
     * if len(res) >= 3:
     * if e == res[-1] and res[-2] == res[-3]:
     * continue
     * res.append(e)
     * print("".join(res))
     * n -= 1
     */
    public static String getRightString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
//        int n = s.length();
        int f = 0;

        for (char i : s.toCharArray()) {
            if (f < 2) {
                stringBuilder.append(i);
                f += 1;
                continue;
            }
            if (f >= 2) {
                if (i == s.charAt(f - 1) && i == s.charAt(f - 2)) {
                    f += 1;
                    continue;
                }
            }
            if (f >= 3) {
                if (i == s.charAt(f - 1) && s.charAt(f - 2) == s.charAt(f - 3)) {
                    f += 1;
                    continue;
                }
            }
            f += 1;
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }


    @Test
    public void test0() {
        String s = getRightString("wooooooow");
        System.out.println(s);

    }

    @Test
    public void test() {
//        String s = getRightString("wooooooow");
//        System.out.println(s);


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = sc.next();
        }
        Solution1 solution = new Solution1();
        for (String str : strings)
            System.out.println(solution.solve(str));
    }

    @Test
    public void test3() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
        sc.close();
    }


    //    public class Main1 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int N = sc.nextInt();
//            String[] strings = new String[N];
//            for (int i = 0; i < N; i++) {
//                strings[i] = sc.next();
//            }
//            Solution1 solution = new Solution1();
//            for (String str : strings)
//                System.out.println(solution.solve(str));
//        }
//    }
    class Solution1 {
        public String solve(String s) {
            if (s == null || s.length() <= 2) return s;
            for (int i = 0; i < s.length() - 3; i++) {
                if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 2) == s.charAt(i + 3)) {//AABB
                    s = delete(s, i + 2);
                    i--;
                } else if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {//AAA
                    s = delete(s, i);
                    i--;
                }
            }
            int n = s.length();
            if (s.charAt(n - 1) == s.charAt(n - 2) && s.charAt(n - 1) == s.charAt(n - 3))//可能结尾剩余3个AAA的情况
                s = delete(s, n - 1);
            return s;
        }

        private String delete(String s, int i) {
            return s.substring(0, i) + s.substring(i + 1);
        }
    }

}
