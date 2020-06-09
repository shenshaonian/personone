package jdk8新特性.数据结构;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: 范子祺
 **/
public class collection和collections {

    public static void main(String args[]) {
//注意List是实现Collection接口的
        List list = new ArrayList();
        double array[] = {112, 111, 23, 456, 231};
        for (int i = 0; i < array.length; i++) {
            list.add(new Double(array[i]));
        }
        Collections.sort(list);  //把list按从小到大排序
        for (int i = 0; i < array.length; i++) {
            System.out.println(list.get(i));
        }
// 结果：23.0 111.0 112.0 231.0 456.0
    }

//    版权声明：本文为CSDN博主「ymfwj」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/ymfwj/article/details/52117843
}
