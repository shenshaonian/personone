package 设计模式.抽象工厂;

import 设计模式.抽象工厂.形状工厂.Shape;
import 设计模式.抽象工厂.颜色工厂.Color;

/**
 * @description:
 * @author: 范子祺
 **/
public class Demo {
    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactoryProducer("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();

        AbstractFactory color = FactoryProducer.getFactoryProducer("color");
        Color red = color.getColor("red");
        red.fill();
    }
}
