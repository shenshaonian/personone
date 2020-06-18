package 线程.实现线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


public class ThirdThread {
    public static void main(String[] args) {
        //创建Callable对象
        //先使用Lambda表达式创建Callable<Integer>对象，
        //并使用FutureTask来包装Callable对象
        FutureTask<Integer> task=new FutureTask<Integer>((Callable<Integer>)()->{
            int i=0;
            for(;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"===="+i);
            }
            //call()方法可以有返回值
            return i;
        });
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"===="+i);
            if(i==20){
                Thread t1=new Thread(task,"有返回值的线程");
                t1.start();
            }
        }
        try {
            System.out.println("子线程的返回值："+task.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}