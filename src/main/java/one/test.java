package one;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 **/
public class test {
    public static void main(String[] args) {
        String s = "s";
        String m = null;
        System.out.println(s.equals(""));
        System.out.println("".equals(s));
//        System.out.println(m.equals(s));
        System.out.println(s.equals(m));
    }
//

    @Test
    public void test1() {
        String s = "mm";
        try {

            s = new String(s.getBytes("iso-8859-1"), "gbk");
            s = s.trim();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println(s);
        Integer e = new Integer(3);
        System.out.println(e);
    }
}
