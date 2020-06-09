package liuyubobo.arrays_02.contain_find_and_remove_5;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 21:20
 **/
public class Test5 {
    public static void main(String[] args) {
        Array5 a5 = new Array5(20);
        for (int i = 0; i < 10; i++) {
            a5.addLast(i);
        }
        System.out.println(a5);

        a5.add(1, 100);
        System.out.println(a5);

        a5.remove(2);
        System.out.println(a5);

        a5.removeElement(4);
        System.out.println(a5);

        a5.removeElement(1000);

        a5.removeFirst();
        a5.removeLast();
        System.out.println(a5);
    }
}
