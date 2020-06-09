package 线程.java高并发程序设计.jdk并法包;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @description:  司令命令要做任务，1 集合队伍 10个人，集合完成， 2 去做任务，10个人都做完了，任务完成
 * @author: 范子祺
 **/
public class CyclicBarrierDemo {
    public static class Soldier implements Runnable{
        private String soldire;
        private final CyclicBarrier cyclicBarrier;

        public Soldier( CyclicBarrier cyclicBarrier,String soldire) {
            this.soldire = soldire;
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            try{
                cyclicBarrier.await();
                doWork();
                cyclicBarrier.await();
            }catch (InterruptedException e){}
            catch (BrokenBarrierException e){}
        }

        void doWork(){
            try{
                Thread.sleep(Math.abs(new Random().nextInt() % 10000));
            }catch (InterruptedException e){}
            System.out.println(soldire +" finished");
        }
    }

    public static class BarrierRun implements Runnable{
        boolean flag;
        int N;

        public BarrierRun(boolean flag, int n) {
            this.flag = flag;
            N = n;
        }

        @Override
        public void run() {
            if (flag){
                System.out.println("司令：[士兵"+N+"个，任务完成！]");
            } else {
                System.out.println("司令：[士兵"+N+"个，集合完毕！]");
                flag =true;
            }
        }
    }

    public static void main(String[] args) throws  InterruptedException{
        final int N = 10;
        Thread[] allSoldier = new Thread[N];
        boolean flag = false;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N, new BarrierRun(flag,N));

        System.out.println("集合队伍");
        for (int i=0;i<N;++i){
            System.out.println("士兵"+i+"报道 ！");
            allSoldier[i] = new Thread(new Soldier(cyclicBarrier,"士兵"+i));
            allSoldier[i].start();
        }
    }

}
