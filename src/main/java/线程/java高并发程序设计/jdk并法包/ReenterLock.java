package 线程.java高并发程序设计.jdk并法包;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:重入锁  重入锁对于一个线程来说是可以连续两次获得，同时连续两次释放，re-entrant-lock
 * 重入锁还可以提供处理中断的能力 ，对于synchronized的线程来说，线程要们执行，要么等待，但是重入锁提供了第三种可能
 * 那就是 线程可以被中断
 * @author: 范子祺
 **/

public class ReenterLock implements Runnable{
        public static ReentrantLock lock = new ReentrantLock();
        public static int i = 0;

        @Override
        public void run() {
            for (int j=0; j< 10;j++){
                lock.lock();
                try{
                    i++;
                }finally {
                    lock.unlock();
                }
            }
        }


    @Test
    public void testReenterLock() throws  InterruptedException{
        ReenterLock r1 = new ReenterLock();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(i);
    }


}
