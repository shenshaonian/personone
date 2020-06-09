package one.threadLearn.one;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-12 23:55
 **/
public class MyThread1 extends Thread {
    private String name;

    public MyThread1() {

    }

    public MyThread1(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "---" + i);
        }
    }
}
