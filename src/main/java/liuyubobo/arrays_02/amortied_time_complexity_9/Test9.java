package liuyubobo.arrays_02.amortied_time_complexity_9;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-31 16:34
 **/
public class Test9 {
    public static void main(String[] args) {
        A9<Integer> arr = new A9<>();
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFisrt(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        System.out.println(arr.getSize());

        arr.removeFirst();
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);
        for (int i = 0; i < 4; i++) {
            arr.removeFirst();
            System.out.println(arr);
        }
    }
}
