package 工具类.Collections工具包;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:可以用来取集合中最大的元素
 * @author: 范子祺
 **/
public class 获得listmax {
    @Test
    public void test() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(21);
        list.add(23);
        System.out.println(list);
        System.out.println(Collections.max(list));
    }
}
