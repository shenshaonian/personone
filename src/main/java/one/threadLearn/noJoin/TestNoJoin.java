package one.threadLearn.noJoin;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-13 10:14
 **/
public class TestNoJoin {

//    public static void main(String[] args){
//        System.out.println("MainThread run start.");
//
//        //启动一个子线程
//        Thread threadA = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("threadA run start.");
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                System.out.println("threadA run finished.");
//            }
//        });
//        threadA.start();
//
//        System.out.println("MainThread join before");
//        System.out.println("MainThread run finished.");
//
//    }

    //    public static void main(String[] args){
//        System.out.println("MainThread run start.");
//
//        //启动一个子线程
//        Thread threadA = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("threadA run start.");
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                System.out.println("threadA run finished.");
//            }
//        });
//        threadA.start();
//
//        System.out.println("MainThread join before");
//        try {
//            threadA.join(500);    //调用join()
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("MainThread run finished.");
//    }
    public static void main(String[] args) {
        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T1 start");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1 end");
            }
        });
        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T2 start");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T2 end");
            }
        });
        Thread T3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T3 start");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T3 end");
            }
        });

        T1.start();
//        try {
//            T1.join();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        T2.start();
//        try {
//
//            T2.join();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        T3.start();
//        try {
//
//            T3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("end1");
        System.out.println("end2");
        System.out.println("end3");
    }

}
