package jvm.类的加载和static.单例模式;

import org.junit.Test;

/**
 * @description: 饿汉式，线程安全  这种方式比较常用，但容易产生垃圾对象。
 * @author: 范子祺
 **/
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("show");
    }


    @Test
    public void test() {
        SingleObject instance = SingleObject.getInstance();
//        instance.showMessage();
// java.lang.Exception: Test class should have exactly one public constructor
    }
}
