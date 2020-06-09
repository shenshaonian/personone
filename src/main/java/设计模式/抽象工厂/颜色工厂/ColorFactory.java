package 设计模式.抽象工厂.颜色工厂;

import 设计模式.抽象工厂.AbstractFactory;
import 设计模式.抽象工厂.形状工厂.Shape;

import java.util.Objects;

/**
 * @description:
 * @author: 范子祺
 **/
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (Objects.equals(color, "red")) {
            return new Red();
        } else if (Objects.equals(color, "green")) {
            return new Green();
        } else if (Objects.equals(color, "blue")) {
            return new Blue();
        } else {
            return null;
        }
    }
}
