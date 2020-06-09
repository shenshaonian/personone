package 线程.故事.吃橘子.参考银行取钱;

/**
 * @description:
 * @author: 范子祺
 **/
public class GetOrangeDemo {
    public static void main(String[] args) {
        Orange orange = new Orange();

        Person personA = new Person("A", orange, 2);
        Person personB = new Person("B", orange, 3);
        Person personC = new Person("C", orange, 1);

        personA.start();

        personB.start();
        personC.start();
    }

}
