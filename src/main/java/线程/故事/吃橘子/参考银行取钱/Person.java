package 线程.故事.吃橘子.参考银行取钱;

/**
 * @description:
 * @author: 范子祺
 **/
public class Person extends Thread {
    private Orange orange;

    private int m;//每次拿走橘子个数

    public Person(String name, Orange orange, int m) {
        super(name);
        this.orange = orange;
        this.m = m;
    }

    @Override
    public void run() {
        super.run();
        orange.out(m);
    }

}
