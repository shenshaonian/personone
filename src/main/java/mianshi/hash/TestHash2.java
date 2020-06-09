package mianshi.hash;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 16:58
 **/
public class TestHash2 {
    @Test
    public void test() {
        List<Long> test1 = new ArrayList<Long>();
        test1.add(1L);
        test1.add(2L);
        System.out.println(test1.get(0) + "-----" + test1.get(1));
        System.out.println(test1.get(0).hashCode() + "-----" + test1.get(1).hashCode());
        System.out.println(test1.hashCode());
        test1.set(0, 2L);
        System.out.println(test1.hashCode());
        System.out.println(test1.get(0) + "-----" + test1.get(1));
    }
}
