package 线程.java高并发程序设计.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: 范子祺
 **/
public class CacheThreadPool {
    public static class MyTask implements Runnable{
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis()+" Thread Id:"+ Thread.currentThread().getId());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(Thread.currentThread().getId());
        }
    }

    public static void main(String[] args){
        MyTask myTask = new MyTask();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i =0;i<10;i++){
            executorService.submit(myTask);
        }
        executorService.shutdown();
    }
}
