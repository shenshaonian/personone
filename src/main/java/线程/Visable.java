package 线程;

/**
 * @description:
 * @author: 范子祺
 **/
public class Visable {
    private volatile static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        new Thread(()-> {
            while(flag) {

            }
        }).start();

        Thread.sleep(2000);

        new Thread(() -> {
            flag = false;
            System.out.println("修改了共享变量flag的值");
        }).start();
    }
}
