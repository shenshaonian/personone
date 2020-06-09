package 线程;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description:keepalive为0的时候线程什么情况
 * @author: 范子祺
 **/
public class ExecutorsDemo implements Runnable {
    private int i = 0;

    public ExecutorsDemo(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 2, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(1));
        for (int i = 0; i < 3; i++) {
            executor.execute(new ExecutorsDemo(i));
        }
        while (true) {
            System.out.println("总线程数：" + executor.getPoolSize() + "当前活跃线程数：" + executor.getActiveCount());
            System.out.println("----Thread = " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        System.out.println("i=" + i + " Thread = " + Thread.currentThread().getName());
        if (i >= 1) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("i=" + i + " sleep 1 s结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("i=" + i + " sleep 3 s结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//---------------------
//    版权声明：本文为CSDN博主「xuhangsong」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/xuhangsong/article/details/89474989
}
