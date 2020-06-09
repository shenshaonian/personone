package 线程.不断的抄;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: 范子祺
 **/
public class DeadLockWithReentrantLock implements Runnable{
    public final static ReentrantLock lock1 = new ReentrantLock();
    public final static ReentrantLock lock2 = new ReentrantLock();

    private int i;

    public DeadLockWithReentrantLock(int i) {
        this.i = i;
    }


    @Override
    public void run() {
        try {


            if (i == 1) {
                lock1.lockInterruptibly();
                System.out.println(Thread.currentThread().getId() + " 1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                lock2.lockInterruptibly();
                System.out.println(Thread.currentThread().getId() + " 2");
            } else {
                lock2.lockInterruptibly();
                System.out.println(Thread.currentThread().getId() + " 3");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                lock1.lockInterruptibly();
                System.out.println(Thread.currentThread().getId() + " 4");
            }
        } catch (InterruptedException e){}
        finally {
            if (lock1.isHeldByCurrentThread()){
                lock1.unlock();
                System.out.println(Thread.currentThread().getId() + " 5");
            }if (lock2.isHeldByCurrentThread()){
                lock2.unlock();
                System.out.println(Thread.currentThread().getId() + " 6");
            }
            System.out.println(Thread.currentThread().getId() + "  7-----退出");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        DeadLockWithReentrantLock l1 = new DeadLockWithReentrantLock(1);
        DeadLockWithReentrantLock l2 = new DeadLockWithReentrantLock(2);
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);
        t1.start();t2.start();
        Thread.sleep(2000);
        t2.interrupt();

    }



}
