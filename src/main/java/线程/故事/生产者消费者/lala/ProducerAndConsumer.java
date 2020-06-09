package 线程.故事.生产者消费者.lala;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @description:
 * @author: 范子祺
 **/
public class ProducerAndConsumer {
    public static void main(String[] args) {
        Resource resource = new Resource();
        //生产者线程
        ProducerThread p1 = new ProducerThread(resource);
        ProducerThread p2 = new ProducerThread(resource);
        //多个消费者
        ConsumerThread c1 = new ConsumerThread(resource);


        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(c1);
        t1.start();
        t2.start();
        t3.start();
    }


}

class ConsumerThread implements Runnable {
    private Resource resource;

    public ConsumerThread(Resource resource) {
        this.resource = resource;
        //setName("消费者");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.remove();
        }
    }

}

class ProducerThread implements Runnable{
    private Resource resource;

    public ProducerThread(Resource resource) {
        this.resource = resource;
        //setName("生产者");
    }

    @Override
    public void run () {
        while (true) {
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.add();
        }
    }
}


class Resource {
    private BlockingQueue resourceQueue = new LinkedBlockingQueue<>(10);
    /**
     * 向资源池中添加资源
     */
    public void add(){
            try {
                resourceQueue.put(1);
                System.out.println("生产者" + Thread.currentThread().getName()
                        + "生产一件资源," + "当前资源池有" + resourceQueue.size() +
                        "个资源");
                //时间越短说明生产速度越快
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    /**
     * 向资源池中移除资源
     */
    public void remove(){
        while (resourceQueue.size() > 0){
            try {
                resourceQueue.take();
                System.out.println("消费者" + Thread.currentThread().getName() +
                        "消耗一件资源," + "当前资源池有" + resourceQueue.size()
                            + "个资源");
                //时间越短说明消费速度越快
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}