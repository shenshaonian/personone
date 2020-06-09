package jvm;

import jvm.类的加载和static.Singleton;
import jvm.类的加载和static.Singleton2;

/**
 * @description:
 * @author: 范子祺
 **/
public class test {

    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        System.out.println("Singleton1 value1:" + singleton.value1);
//        System.out.println("Singleton1 value2:" + singleton.value2);
//
//
//        Singleton2 singleton2 = Singleton2.getInstance2();
//        System.out.println("Singleton2 value1:" + singleton2.value1);
//        System.out.println("Singleton2 value2:" + singleton2.value2);

        System.out.println(Singleton.value1);

        System.out.println(Singleton.value2);
        System.out.println(Singleton2.value1);
        System.out.println(Singleton2.value2);

    }

//---------------------
//    作者：是Guava不是瓜娃
//    来源：CSDN
//    原文：https://blog.csdn.net/noaman_wgs/article/details/74489549
//    版权声明：本文为博主原创文章，转载请附上博文链接！
}
