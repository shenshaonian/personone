package 线程.故事.吃橘子.参考别人;

/**
 * @description:
 * @author: 范子祺
 **/
public class C implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (Pan.num) {
                if (Pan.num - 1 < 0) {
                    try {
                        System.out.println("C不拿了");
                        Pan.num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Pan.num -= 1;
                System.out.println("A吃掉拿走2个橘子，盘中还剩：" + Pan.num + "个橘子");
//                Pan.num.notify();
                try {
                    //10s == 1
//                TimeUnit.SECONDS.sleep(1);
                    Pan.num.wait(1000);
//                Thread.sleep(TimeUnit.SECONDS.toSeconds(1));
//                wait(TimeUnit.SECONDS.toSeconds(2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
