package 线程.java高并发程序设计.jdk并法包;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: synchronized是非公平锁
 * 输出里面是1212交替的，但是有部分是很多2
 * @author: 范子祺
 **/
public class FairLock implements Runnable {
    public static ReentrantLock lock1 = new ReentrantLock(true);
    //注意这里

    @Override
    public void run() {
        while (true){
            try{
                lock1.lock();
                System.out.println(Thread.currentThread().getName()+" get lock");
            } finally {
                lock1.unlock();
            }
        }
    }

    public static void main(String[] args){
        FairLock fairLock = new FairLock();
        Thread t1 = new Thread(fairLock,"Thread-1");
        Thread t2 = new Thread(fairLock,"Thread-2");
        t1.start();t2.start();
    }
}
