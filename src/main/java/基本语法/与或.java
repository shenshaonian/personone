package 基本语法;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 **/
public class 与或 {
    public int a(int tab){
        int n=tab-1;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        return n;
    }

    @Test
    public void testyouyi(){
        int a = a(666);
        System.out.println(a);
    }

    @Test
    public void testyouyione(){
        int a = az(10);
        System.out.println(a);
    }


    public int az(int tab) {
        int n = tab - 1;
//        n= n >> 1;
        n |= n >> 1;
        return n;
    }
}
