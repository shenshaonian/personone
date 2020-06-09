package 线程.java高并发程序设计.jdk并法包;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:  condition 在arrayblockingqueue中的使用可以去看看源码
 * @author: 范子祺
 **/
public class ReentrantLockCondition implements Runnable {
//    public static ArrayBlockingQueue arraylist = new ArrayBlockingQueue;
//    static {
//        arraylist.put(new Integer(1));
//        arraylist.take();
//    }

    public static ReentrantLock lock1 = new ReentrantLock();
    public static Condition condition = lock1.newCondition();

    @Override
    public void run() {
        try{
            lock1.lock();  // get lock first
            condition.await(); // drop lock first  when signal ,get lock third

            System.out.println("go  on");
        } catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock1.unlock(); /// drop lock third
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ReentrantLockCondition reentrantLockCondition = new ReentrantLockCondition();
        Thread thread = new Thread(reentrantLockCondition);
        thread.start();
        Thread.sleep(2000);

        lock1.lock();  // get lock second
        condition.signal(); // say no sleep
        lock1.unlock(); // drop lock second
    }
}
