package one.threadLearn.one;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-12 23:51
 **/
public class MyDemoThread {
    @Test
    public void test1() {
        MyThread myThread = new MyThread();
        myThread.run();
        myThread.run();
        System.out.println(myThread);
    }

    @Test
    public void test2() {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        System.out.println(myThread1);
        System.out.println(myThread2);
    }

    @Test
    public void test3() {
        MyThread1 myThread1 = new MyThread1("a");
        MyThread1 myThread2 = new MyThread1("b");

        myThread1.start();
        myThread2.start();

        System.out.println(myThread1.getName());
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("a");
        MyThread1 myThread2 = new MyThread1("b");

        myThread1.start();
        myThread2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
