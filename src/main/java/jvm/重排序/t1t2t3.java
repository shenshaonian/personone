package jvm.重排序;

/**
 * @description:
 * @author: 范子祺
 **/
public class t1t2t3 {
    /** 这是一个验证结果的变量 */
    private static int a=0;
    /** 这是一个标志位 */
    private static boolean flag=false;
    public static void main(String[] args) {

        for (int i =0;i<100;i++) {
            final Thread t2 = new Thread(new Runnable() {

                @Override
                public void run() {
//                System.out.println("t2");
                    a = 1;
                    flag = true;
                }
            });
            Thread t3 = new Thread(new Runnable() {

                @Override
                public void run() {
//                try {
//                    Thread.sleep(10);    //保证此时t2已经是运行时状态了
//                    t2.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("t3");

                    try {
//                    Thread.sleep(10);
                        t2.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (flag) {
                        a = a * 1;
                    }
                    if (a == 0) {
                        System.out.println("ha,a==0" + a);
                    }
                }
            });
        t3.start();
        t2.start();
//            t2.start();
//            t3.start();
//            System.out.println(a);
        }
    }

//————————————————
//    版权声明：本文为CSDN博主「Hurricane_m」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/hurricane_m/article/details/89469049
}
