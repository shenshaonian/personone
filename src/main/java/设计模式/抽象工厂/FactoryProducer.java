package 设计模式.抽象工厂;

import 设计模式.抽象工厂.形状工厂.ShapeFactory;
import 设计模式.抽象工厂.颜色工厂.ColorFactory;

import java.util.Objects;

/**
 * @description:
 * @author: 范子祺
 **/
public class FactoryProducer {

    public static AbstractFactory getFactoryProducer(String factory) {
        if (Objects.equals(factory, "color")) {
            return new ColorFactory();
        } else if (Objects.equals(factory, "shape")) {
            return new ShapeFactory();
        } else {
            return null;
        }
    }
}
