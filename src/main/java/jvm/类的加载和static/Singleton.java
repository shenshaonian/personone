package jvm.类的加载和static;

/**
 * @description:
 * @author: 范子祺
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();
    public static int value1;
    public static int value2 = 0;

    private Singleton() {
        value1++;
        value2++;
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
