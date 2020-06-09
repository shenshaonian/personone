package string相关;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 **/
public class string_stringbuffer_stringbuiler extends Throwable {
    @Test
    public void test() {
        String s = new String("ss");
        String ss = null;
//        System.out.println(ss.equals(s));java.lang.NullPointerException
        System.out.println(s.equals(ss));
//s.equals()
        StringBuilder stringBuilder = new StringBuilder("iof");

        StringBuffer stringBuffer = new StringBuffer("fdsafs");
    }

    @Test
    public void testfinally() {
        try {
            System.out.printf("klll");
            System.exit(1);
            return;
        } finally {
            System.out.printf("before return");
        }

//        try{
//            System.out.printf("klll");
//            return;
//        } finally {
//            System.out.printf("before return");
//        }
    }
}
