package 线程.实现线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

//创建线程的方式：Callable
class MyThread implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"\t coming in");
        TimeUnit.SECONDS.sleep(3l);
        return 1024;
    }
}

//创建线程的方式：Runnable
class MyThread1 implements Runnable{

    @Override
    public void run() {

    }
}


public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //用Callable的方式创建线程,相比较于Runnable，可以获取返回的值
        MyThread thread = new MyThread();
        //需要一个FutureTask，而且在两个线程里传入同一个futureTask，只会执行一次
        FutureTask<Integer> futureTask = new FutureTask<>(thread);

        new Thread(futureTask,"A").start();
        new Thread(futureTask,"AA").start();

        //想要执行两次，就需要再来一个不一样的FutureTask
        FutureTask futureTask1 = new FutureTask(thread);
        new Thread(futureTask1,"B").start();

        System.out.println(1024 + futureTask.get());

    }
}
