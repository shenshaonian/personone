package 线程.故事.生产者消费者.问题代码;

/**
 * @description:
 * @author: 范子祺
 **/
public class Producter {
    public static void main(String[] args) {
        PandA pandA = new PandA();

        new Thread(() -> {
            pandA.increment();
        }, "A").start();

        new Thread(() -> {
            pandA.increment();
        }, "B").start();
    }


    static class PandA {
        private int num = 0;

        public void increment() {
            if (num != 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            num++;
            this.notify();
            System.out.println(Thread.currentThread().getName() + "生产了一个汉堡");

        }

        public void decrement() {
            if (num == 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            num--;
            this.notify();
            System.out.println(Thread.currentThread().getName() + "消费了一个汉堡");

        }

    }
}
