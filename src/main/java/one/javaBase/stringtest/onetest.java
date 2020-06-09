package one.javaBase.stringtest;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-11 23:05
 **/
public class onetest {
    @Test
    public void test() {
        String s = "ssaaaddd";
        String i = s.concat("k");
        System.out.println(i);

        String a = "aa1";
        String b = "aa";
        String c = b + 1;
        System.out.println(c);
        System.out.println(a == c);

        StringBuffer stringBuffer = new StringBuffer("da");
        StringBuilder stringBuilder = new StringBuilder("dfafd");
    }
}
