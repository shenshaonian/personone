package one;

/**
 * 左神直通BAT算法之找出B中不属于A的数
 * From  直通BAT  程序员弹药库  2/20
 * 找出B中不属于A的数
 */

import org.junit.Test;

/**
 * @program: lianxi
 * @description:
 * @author: 范子祺
 * @create: 2019-04-13 13:49
 **/
public class BParamsOutAParams {

    static String s = "a";


    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int B[] = {0, 4, 2, 6, 5, 7};

        for (int i = 0; i < 6; ++i) {
            //B的长度为6
            int temp = B[i];
            //二分法查找
            int left = 0, right = 5 - 1;
            // A的长度为5
            int mid = (left + right) / 2;
            while (left < right && A[mid] != temp) {
                if (A[mid] > temp) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                mid = (left + right) / 2;
            }
            if (A[mid] != temp) {
                System.out.println(temp);
            }
        }
    }

    /**
     * java base  == equal
     */
    @Test
    public void test() {
        short i = 1;
        i += 1;
        System.out.println(i);

        Integer.valueOf(124);

        String x = new String("aaa");

        String y = "aaa";
        if (x.equals(y)) {
            System.out.println("xyxy");
        }


        Integer m = new Integer(22);
        Integer n = new Integer(22);
        System.out.println(x == y);
        System.out.println(m == n);
        System.out.println(x.equals(y));
        System.out.println(m.equals(n));

        s = "b";
        System.out.println(s);
    }


    /**
     * switch
     */
    @Test
    public void testSwich() {

        String s = "fdsaf";
        switch (s) {
            case "fdsaf":
                System.out.println(s);
                break;
            case "fads":
                System.out.println(s);
                break;

            default:
                break;
        }
        switch (s) {
            case "fd":
                break;
            case "dd":
                break;
            case "kk":

            default:
                break;
        }
    }


}

