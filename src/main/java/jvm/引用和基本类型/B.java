package jvm.引用和基本类型;

/**
 * @description:
 * @author: 范子祺
 **/
public class B {
    private String nameb;
    private int nb;


    public B(String nameb, int nb) {
        this.nameb = nameb;
        this.nb = nb;
    }

    public String getNameb() {
        return nameb;
    }

    public void setNameb(String nameb) {
        this.nameb = nameb;
    }

    @Override
    public String toString() {
        return "B{" +
                "nameb='" + nameb + '\'' +
                ", nb=" + nb +
                '}';
    }
}
