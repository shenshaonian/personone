package jvm.虚拟机栈;

/**
 * @description:
 * @author: 范子祺
 **/
public class Demo1 {static int hello() {
    int a = 1;
    int b = 2;
    int c = a + b;
    return c;
}

    public static void main(String[] args) {
        System.out.println(hello());
    }
}
