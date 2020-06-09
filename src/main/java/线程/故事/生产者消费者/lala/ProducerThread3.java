package 线程.故事.生产者消费者.lala;

/**
 * @description:
 * @author: 范子祺
 **/
public class ProducerThread3 implements Runnable {
    private Resource3 resource3;

    public ProducerThread3(Resource3 resource) {
        this.resource3 = resource;
        //setName("生产者");
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource3.add();
        }

    }
}
