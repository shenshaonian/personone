package 线程.java高并发程序设计.jdk并法包;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 用reentrantlock实现死锁并解决死锁，通过外部通知，解除死锁
 *
 * @author: 范子祺
 **/
public class IntLock implements Runnable{
    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();

    int lock;

    public IntLock(int i) {
        this.lock = i;
    }


    @Override
    public void run() {
        try{
            if (lock == 1){
                lock1.lockInterruptibly();
                System.out.println(Thread.currentThread().getId()+" 1");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    //
                }
                lock2.lockInterruptibly();
                System.out.println(Thread.currentThread().getId()+" 2");
            } else {
                lock2.lockInterruptibly();
                System.out.println(Thread.currentThread().getId()+" 3");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    //
                }
                lock1.lockInterruptibly();
                System.out.println(Thread.currentThread().getId()+" 4");
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            if (lock1.isHeldByCurrentThread()){
                lock1.unlock();
                System.out.println(Thread.currentThread().getId()+" 5");
            }
            if (lock2.isHeldByCurrentThread()){
                System.out.println(Thread.currentThread().getId()+" 6");
                lock2.unlock();
            }
            System.out.println(Thread.currentThread().getId()+"线程退出");
        }
    }


    public static void main(String[] args) throws InterruptedException{
        IntLock r1 = new IntLock(1);
        IntLock r2 = new IntLock(2);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();t2.start();
        Thread.sleep(10000);
        t2.interrupt();  //通过外部通知，解除死锁
    }
}
