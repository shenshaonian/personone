package 设计模式.模板.上班;

/**
 * @description:
 * @author: 范子祺
 **/
public class DpWork extends Work {
    @Override
    void startComputer() {
        System.out.println("打开德邦电脑");
    }

    @Override
    void lookComputer() {
        System.out.println("看德邦的电脑");
    }

    @Override
    void shutdownComputer() {
        System.out.println("关闭德邦电脑");
    }

    @Override
    void workedAndGetMoney() {
        startComputer();
        lookComputer();
        shutdownComputer();
    }
}
