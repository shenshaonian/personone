package one.threadLearn.productAndCustomer.one;

public class Hosee {
    private static Integer count = 0;
    private final Integer FULL = 10;
    private static String LOCK = "LOCK";

    class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    while (count == FULL) {
                        try {
                            System.out.println("仓库满了");
                            LOCK.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + "生产者生产，目前总共有" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                synchronized (LOCK) {
                    while (count == 0) {
                        try {
                            System.out.println("库存空了");
                            LOCK.wait();
                        } catch (Exception e) {
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "消费者消费，目前总共有" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Hosee hosee = new Hosee();
        new Thread(hosee.new Producer()).start();
        new Thread(hosee.new Producer()).start();
        new Thread(hosee.new Consumer()).start();
        new Thread(hosee.new Producer()).start();
        new Thread(hosee.new Consumer()).start();
        new Thread(hosee.new Producer()).start();
        new Thread(hosee.new Consumer()).start();
        new Thread(hosee.new Producer()).start();
        new Thread(hosee.new Consumer()).start();
    }
}
