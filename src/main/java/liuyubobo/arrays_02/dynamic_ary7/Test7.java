package liuyubobo.arrays_02.dynamic_ary7;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 23:18
 **/
public class Test7 {
    public static void main(String[] args) {
        A7<Integer> a7 = new A7<>(5);
        for (int i = 0; i < 5; i++) {
            a7.add(i, i);
        }
        System.out.println(a7);

        for (int i = 5; i < 10; i++) {
            a7.add(i, i);
        }
        System.out.println(a7);

        a7.add(1, 100);
        System.out.println(a7);

        a7.addFirst(-1);
        System.out.println(a7);

        a7.remove(2);
        System.out.println(a7);

        a7.removeElement(4);
        System.out.println(a7);

        a7.removeFirst();
        System.out.println(a7);

        a7.addLast(90);
        System.out.println(a7);

//        a7.add(14,1);
//        System.out.println(a7);


    }
}
