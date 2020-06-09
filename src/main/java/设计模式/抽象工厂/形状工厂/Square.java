package 设计模式.抽象工厂.形状工厂;


/**
 * @description:
 * @author: 范子祺
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形");
    }
}
