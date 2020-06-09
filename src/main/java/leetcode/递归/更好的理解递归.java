package leetcode.递归;

import org.junit.Test;

/**
 * @description: https://blog.csdn.net/luguifang2011/article/details/20534275
 * @author: 范子祺
 **/
public class 更好的理解递归 {

    private void soulutin(int n) {
        int q;
        q = n / 10;
        if (q != 0) {
            soulutin(q);
        }
        System.out.printf("%d,", n % 10);
    }

    @Test
    public void test() {
        soulutin(4658);
    }
}
