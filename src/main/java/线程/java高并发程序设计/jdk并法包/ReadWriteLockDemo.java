package 线程.java高并发程序设计.jdk并法包;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @description:读写锁   只有读读不互斥，其他情况都会互斥
 * @author: 范子祺
 **/
public class ReadWriteLockDemo {
    private static Lock lock = new ReentrantLock();
    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static Lock readLock = readWriteLock.readLock();
    private static Lock writeLock = readWriteLock.writeLock();
    private int value;

    public Object handleRead(Lock lock) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1000);
            return value;
        }finally {
            lock.unlock();
        }
    }

    public Object handleWrite(Lock lock,int index) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1000);
            return index;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args){

        System.out.println("start----"+ (new Date()));
        final ReadWriteLockDemo demo = new ReadWriteLockDemo();
        Runnable readRunable = new Runnable() {
            @Override
            public void run() {
                try{
//                    demo.handleRead(readLock);
                    demo.handleRead(lock);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Runnable writeRunable = new Runnable() {
            @Override
            public void run() {
                try{
//                    demo.handleWrite(writeLock, new Random().nextInt());
                    demo.handleWrite(lock,new Random().nextInt());
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        for (int i =0;i<18;i++){
            new Thread(readRunable).start();
        }

        for (int i = 18;i<20;i++){
            new Thread(writeRunable).start();
        }

        System.out.println("end----"+ (new Date()));
    }

}
