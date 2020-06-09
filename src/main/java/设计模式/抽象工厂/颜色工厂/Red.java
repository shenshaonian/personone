package 设计模式.抽象工厂.颜色工厂;

/**
 * @description:
 * @author: 范子祺
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red");
    }
}