package 设计模式.抽象工厂.形状工厂;

import 设计模式.抽象工厂.AbstractFactory;
import 设计模式.抽象工厂.颜色工厂.Color;

import java.util.Objects;

/**
 * @description:
 * @author: 范子祺
 **/
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
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

    @Override
    public Color getColor(String color) {
        return null;
    }
}
