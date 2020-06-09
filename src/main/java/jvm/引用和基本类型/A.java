package jvm.引用和基本类型;

/**
 * @description:
 * @author: 范子祺
 **/
public class A {
    private String name;
    private B b;
    private int m;
    String at = new String("attttt");

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public A() {
        this.name = name;
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", b=" + b +
                ", m=" + m +
                '}';
    }
}
