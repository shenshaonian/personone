package 线程.故事.吃橘子.参考别人;

/**
 * @description:
 * @author: 范子祺
 **/
public class A implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (Pan.num) {
                if (Pan.num - 2 < 0) {
                    try {
                        System.out.println("A不拿了");
                        Pan.num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Pan.num -= 2;
                System.out.println("A吃掉拿走2个橘子，盘中还剩：" + Pan.num + "个橘子");
                try {
                    //10s == 1
//                TimeUnit.SECONDS.sleep(2);
                    Pan.num.wait(2000);
//                Thread.sleep(TimeUnit.SECONDS.toSeconds(2));
//                wait(TimeUnit.SECONDS.toSeconds(2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
