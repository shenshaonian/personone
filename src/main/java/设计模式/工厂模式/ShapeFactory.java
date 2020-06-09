package 设计模式.工厂模式;

import org.junit.Test;

import java.util.Objects;

/**
 * @description:
 * @author: 范子祺
 **/
public class ShapeFactory {
    public static Shape getShape(String shape) {
        if (Objects.equals(shape, "circle")) {
            return new Circle();
        } else if (Objects.equals(shape, "rectangle")) {
            return new Rectangle();
        } else if (Objects.equals(shape, "square")) {
            return new Square();
        } else {
            return null;
        }
    }

    @Test
    public void test() {
        Shape s = ShapeFactory.getShape("circle");
        s.draw();
        Shape ss = ShapeFactory.getShape("rectangle");
        ss.draw();
        Shape sss = ShapeFactory.getShape("square");
        sss.draw();
    }
}
