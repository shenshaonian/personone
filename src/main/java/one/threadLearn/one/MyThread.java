package one.threadLearn.one;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-12 23:50
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
