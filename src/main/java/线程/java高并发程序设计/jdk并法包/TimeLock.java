package 线程.java高并发程序设计.jdk并法包;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 带参数的trylock 限时等待 解除死锁
 * @author: 范子祺
 **/
public class TimeLock implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)){
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getId());
            } else {
                System.out.println("get lock failed"+ Thread.currentThread().getId());
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }

    public static void main(String[] args){
        TimeLock timeLock = new TimeLock();
        Thread t1= new Thread(timeLock);
        Thread t2 = new Thread(timeLock);
        t1.start();
        t2.start();

    }
}
