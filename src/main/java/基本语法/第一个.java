package 基本语法;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 **/
public class 第一个 {


    @Test
    public void test() {
        Integer i = 1;
        System.out.println(i.getClass());

        System.out.println(System.currentTimeMillis());
        String temp = Long.toString(System.currentTimeMillis(), 16);
        System.out.println(temp);
    }


}
