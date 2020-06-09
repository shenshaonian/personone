package jvm.类的加载和static.单例模式;

/**
 * @description: 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * @author: 范子祺
 **/
public class SingletonDoubleChecked {
    private volatile static SingletonDoubleChecked instance;

    private SingletonDoubleChecked() {
    }

    ;

    public static SingletonDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (instance == null) {
                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }

}
