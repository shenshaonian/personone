package 线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 范子祺
 **/
public class 线程池 {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(5);
//        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 0L, TimeUnit.MILLISECONDS, queue, Executors.defaultThreadFactory());
        for (int i = 0; i < 15; i++) {
            MyTask myTask = new MyTask(i);
//            if (i==15) {
//                Thread.sleep(2000);
//            }
            pool.execute(myTask);
            System.out.println((i + 1) + "线程来了" + "线程池中的线程数目" + pool.getPoolSize() + "  队列中等待的任务数量：" + pool.getQueue().size());
        }
        System.out.println("快结束了");
        while (true) {
            System.out.println("总线程数：" + pool.getPoolSize() + "当前活跃线程数：" + pool.getActiveCount());
            System.out.println("----Thread = " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        pool.shutdown();
//        System.out.println("结束了吗？？？");

//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        Executors.newFixedThreadPool(5);

    }

    static class MyTask implements Runnable {

        private int taskNum;

        public MyTask(int taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public void run() {
            System.out.println("正在执行task" + taskNum);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task" + taskNum + "执行完毕");
        }
    }

}
