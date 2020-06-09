package 设计模式.代理模式;

/**
 * @description:
 * @author: 范子祺
 **/
public class ProxyDemo {
    public static void main(String[] args) {
        SunWuKong sunWuKong = new SunWuKong("事件：孙悟空变成了高翠兰的样子");
        sunWuKong.display();
        System.out.println("111");
        sunWuKong.display();
    }
}
