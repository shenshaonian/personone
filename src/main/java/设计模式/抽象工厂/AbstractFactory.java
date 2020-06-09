package 设计模式.抽象工厂;

import 设计模式.抽象工厂.形状工厂.Shape;
import 设计模式.抽象工厂.颜色工厂.Color;

/**
 * @description:
 * @author: 范子祺
 **/
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
