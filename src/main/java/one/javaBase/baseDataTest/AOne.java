package one.javaBase.baseDataTest;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-12 15:41
 **/
public class AOne {
    @Test
    public void test() {
        Byte a = new Byte("d");
//        byte b = byte[10];

        Integer.valueOf(12);
        Double.valueOf(100.0);
        Boolean.valueOf(true);


//        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;

//        System.out.println(c==d);
//        System.out.println(e==f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
        System.out.println(g.equals(a + h));
    }
}
