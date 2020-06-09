package jdk8新特性.冒号和尖头拉姆达表达式;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @description:
 * @author: 范子祺
 **/
public class AcceptMethod {
    public static void printChar(String s) {
        System.out.println("print char:" + s);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("a", "b", "c", "d");

        for (String a : al) {
            AcceptMethod.printChar(a);
        }


        System.out.println(">>>");
        al.forEach(x -> {
            AcceptMethod.printChar(x);
        });


        System.out.println(":::::");
        al.forEach(AcceptMethod::printChar);

        System.out.println("getMethod");
        Consumer<String> stringConsumer = AcceptMethod::printChar;
        al.forEach(x -> stringConsumer.accept(x));
    }

}
