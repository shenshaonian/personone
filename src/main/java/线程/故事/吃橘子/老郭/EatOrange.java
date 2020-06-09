package 线程.故事.吃橘子.老郭;

public class EatOrange {
    private static volatile int orangeNum = 9;

    public boolean eatOrangeNum(int eatNum, String name) {
        synchronized (this) {
            if ((orangeNum - eatNum) >= 0) {
                orangeNum -= eatNum;
                System.out.println(name + "说现在剩橘子:" + orangeNum);
                return true;

            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        StudentA a = new StudentA();
        StudentB b = new StudentB();
//        StudentC c = new StudentC();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
//        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
//        t3.start();

    }
}

class StudentA implements Runnable {
    private EatOrange eatOrange = new EatOrange();

    @Override
    public void run() {
        boolean quitFlag = true;
        while (quitFlag) {
            quitFlag = eatOrange.eatOrangeNum(2, "A");
            if (quitFlag) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("TMD不玩了-----A同学");
            }
        }
    }
}

class StudentB implements Runnable {
    private EatOrange eatOrange = new EatOrange();

    @Override
    public void run() {
        boolean quitFlag = true;
        while (quitFlag) {
            quitFlag = eatOrange.eatOrangeNum(3, "B");
            if (quitFlag) {
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("TMD不玩了-----B同学");
            }
        }
    }
}

class StudentC implements Runnable {
    private EatOrange eatOrange = new EatOrange();

    @Override
    public void run() {
        boolean quitFlag = true;
        while (quitFlag) {
            quitFlag = eatOrange.eatOrangeNum(1, "C");
            if (quitFlag) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("TMD不玩了-----C同学");
            }
        }
    }
}