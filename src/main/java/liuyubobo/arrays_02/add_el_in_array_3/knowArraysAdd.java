package liuyubobo.arrays_02.add_el_in_array_3;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @description: 数组中的add(index :, element :)这个index是数组索引，意思就是从取值范围是0到数组长度
 * @author: 范子祺
 * @create: 2019-05-29 11:13
 **/
public class knowArraysAdd {
    @Test
    public void test() {
//        int[] a = {1,2,3,4,5};

        ArrayList<Integer> objects = new ArrayList<Integer>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        objects.add(5);
        System.out.println(objects);
        //index 指的是索引0 --- n
        objects.add(2, 10);
        System.out.println(objects);
        //
        objects.add(6, 100);
        System.out.println(objects);
        //0 -- n 索引
        objects.remove(6);
        System.out.println(objects);
        System.out.println();

        int[] a = new int[10];
        System.out.println(a[5]);
    }


    @Test
    public void test1() {
        System.out.println(2 > 0 ? false : true);
    }
}
