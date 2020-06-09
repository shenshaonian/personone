package 线程.故事.吃橘子.参考银行取钱;

/**
 * @description:https://blog.csdn.net/u010988549/article/details/79158121
 * @author: 范子祺
 **/
public class Orange {
    private int num = 9;


    public void out(int getOrange) {
        while (num >= 0) {
            synchronized (this) {
                if (num >= getOrange) {
                    num = num - getOrange;
                    System.out.println(Thread.currentThread().getName() + " 拿走" + getOrange + "个橘子，当前剩余橘子为: " + num + " 个");
                } else {
                    System.out.println("橘子个数不足,当前个数为: " + num + " 个");
                    break;
                }
                try {
                    Thread.sleep(100 * getOrange);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
