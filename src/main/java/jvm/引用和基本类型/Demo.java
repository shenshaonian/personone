package jvm.引用和基本类型;

/**
 * @description:
 * @author: 范子祺
 **/
public class Demo {
    int i;
    int j = 10;
    static int k = 50;
    String m = "ssss";
    String t = new String("lll");

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        B b = new B("bbb", 100);
        a.setB(b);
        a.setM(200);
        a.setName("aaa");
        System.out.println(a);//A{name='aaa', b=B{nameb='bbb', nb=100}, m=200}
        System.out.println(b);//B{nameb='bbb', nb=100}

        Demo d = new Demo();
        d.test1(a);
        System.out.println(a);//A{name='aaa', b=B{nameb='cc', nb=100}, m=300}

        d.test2(d.i);
        d.test2(d.j);
        d.test2(k);
        d.test3(d.m);
        d.test3(d.t);
        System.out.println(d.i + "---" + d.j + "---" + k + "---" + d.m + "-----" + d.t);
        d.t = "mmm";
        System.out.println(d.t);

        System.out.println(a.at);
        d.test3(a.at);
        System.out.println("after-------" + a.at);

        d.test3(d.t);
        System.out.println(d.t);

        System.out.println(d.tt);
        d.test(d.tt);
        System.out.println(d.tt);

        System.out.println(d.mm);
        d.test(d.mm);
        System.out.println(d.mm);
    }

    String tt = new String("ttt");

    /**
     * surprise    这个说明，了，。，  对象，在堆上的，通过引用改变了。
     * 而string    final的哎  就是不一样，在常量池中，，。，这个原因就是，tt
     * 它是string  final 那就是它的值ttt是不会变得，除非你直接修改，抛弃了值ttt，
     * 而你通过
     * 方法的调用，将tt的传到另外一个方法，改变方法中public void test(String s)
     * s的指向，并没有改变tt的指向。
     * 而stringbuild就不同了，别人指向的就是它在堆中存的对象，所以直接就改动了，
     * 它存储值，引用不变，所以最后是可以保存的。
     */
    StringBuilder mm = new StringBuilder("asa");

    public void test1(A a) {
        a.setM(a.getM() + 100);
        a.getB().setNameb("cc");
    }

    public void test2(int t) {
        t += 10;
    }

    public void test3(String s) {
//        s = "change";
        System.out.println("-------" + s);
        s = new String("llll");
        System.out.println(s);
    }

    public void test(String s) {
        System.out.println(s);
//        s = "laji";
        s = new String("laji");
        System.out.println(s);

    }

    public void test(StringBuilder m) {
        System.out.println(m);

        m = m.append("ss");
        System.out.println(m);
    }
}
