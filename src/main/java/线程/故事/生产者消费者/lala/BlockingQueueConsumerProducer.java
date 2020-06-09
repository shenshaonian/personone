package 线程.故事.生产者消费者.lala;

/**
 * @description:
 * @author: 范子祺
 **/
public class BlockingQueueConsumerProducer {
    public static void main(String[] args) {
        Resource3 resource = new Resource3();
        //生产者线程
//        ProducerThread3 p = new ProducerThread3(resource);
        ProducerThread3 p1 = new ProducerThread3(resource);
        ProducerThread3 p2 = new ProducerThread3(resource);
        //多个消费者
        ConsumerThread3 c1 = new ConsumerThread3(resource);
//        ConsumerThread3 c2 = new ConsumerThread3(resource);
//        ConsumerThread3 c3 = new ConsumerThread3(resource);
//
//        p.start();
//        p1.start();
//        p2.start();
//        c1.start();
//        c2.start();
//        c3.start();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(c1);
        t1.start();
        t2.start();
        t3.start();
    }

}
