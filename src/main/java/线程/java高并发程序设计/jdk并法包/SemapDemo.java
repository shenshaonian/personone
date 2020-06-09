package 线程.java高并发程序设计.jdk并法包;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @description: 信号量 允许多个线程同时访问，semaphore。
 * 无论是synchorsize还是reentrantlock 一次都只允许一个线程访问一个资源，而信号量
 * 可以指定多个线程，同时访问某一个资源。
 * acquire  tryacquire  release
 * @author: 范子祺
 **/
public class SemapDemo implements Runnable{
    final Semaphore semp = new Semaphore(4);


    @Override
    public void run() {
        try{
            semp.acquire();
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getId() + ":done!");
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            semp.release();
        }
    }

    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(8);
        final SemapDemo demo = new SemapDemo();
        //创建12个线程，但是会以4个线程为一组单位，依次输出。
        for (int i = 0; i < 12; i++){
            service.submit(demo);
        }
    }
}
