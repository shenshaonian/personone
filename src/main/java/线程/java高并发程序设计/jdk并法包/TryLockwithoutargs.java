package 线程.java高并发程序设计.jdk并法包;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 不带参数的trylock   它会立刻返回，不会等待
 * @author: 范子祺
 **/
public class TryLockwithoutargs implements Runnable{
    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();
    int lock;

    public TryLockwithoutargs(int lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        if (lock ==1){
            while (true){
                if (lock1.tryLock()){
                    try{
                        try{
                            Thread.sleep(500);
                        }catch (InterruptedException e){
                            //
                        }
                        if (lock2.tryLock()){
                            try{
                                System.out.println(Thread.currentThread().getId()+" 12 my done");
                                return;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
        }
    }  else {
            while (true){
                if (lock2.tryLock()){
                    try{
                        try{
                            Thread.sleep(500);
                        }catch (InterruptedException e){}
                        if (lock1.tryLock()){
                            try{
                                System.out.println(Thread.currentThread().getId()+" 21 my done");
                                return;
                            } finally {
                                lock1.unlock();
                            }
                        }
                    } finally {
                        lock2.unlock();
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        TryLockwithoutargs tl1 = new TryLockwithoutargs(1);
        TryLockwithoutargs tl2 = new TryLockwithoutargs(2);
        Thread t1 = new Thread(tl1);
        Thread t2 = new Thread(tl2);
        t1.start();
        t2.start();
    }

}
