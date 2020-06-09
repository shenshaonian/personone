package 线程.java高并发程序设计;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: 范子祺
 **/
public class 锁分离 {
    private static BlockingQueue resourceQueue = new LinkedBlockingQueue<>(10);
    public void 看看锁分离(){

        //这里面会拿到一个添加锁，putLock.lockInterruptibly();

//        resourceQueue.put(1);
    }
}
