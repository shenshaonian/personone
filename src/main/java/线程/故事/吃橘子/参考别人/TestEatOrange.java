package 线程.故事.吃橘子.参考别人;

/**
 * @description:
 * @author: 范子祺
 **/
public class TestEatOrange {
    public static void main(String[] args) {
        new Thread(new A()).start();
        new Thread(new B()).start();
        new Thread(new C()).start();
    }
}
