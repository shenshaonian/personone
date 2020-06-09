package 线程.故事.生产者消费者.lala;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @description:
 * @author: 范子祺
 **/
public class Resource3 {
    private BlockingQueue resourceQueue = new LinkedBlockingQueue(10);
    /**
     * 向资源池中添加资源
     */
    public void add(){
        try {

            resourceQueue.put(1);
            System.out.println("生产者" + Thread.currentThread().getName()
                    + "生产一件资源," + "当前资源池有" + resourceQueue.size() +
                    "个资源");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 向资源池中移除资源
     */
    public void remove(){
        try {
            resourceQueue.take();
            resourceQueue.take();
            System.out.println("消费者" + Thread.currentThread().getName() +
                    "消耗一件资源," + "当前资源池有" + resourceQueue.size()
                    + "个资源");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
