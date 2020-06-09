package one.threadLearn.notifyWait;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-13 11:16
 **/
public class WaitAndNotify {
    final static Object person = new Object();

    static class T1 extends Thread {
        @Override
        public void run() {
            synchronized (person) {
                System.out.println("T1 come！");
                try {
                    System.out.println("T1 wait! ");
                    person.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1 end! ");
            }
        }
    }

    static class T2 extends Thread {
        @Override
        public void run() {
            synchronized (person) {
                System.out.println("T2 come! ");
//                person.notify();
                System.out.println("T2 over! ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();
        t1.start();
        t2.start();
    }
}
