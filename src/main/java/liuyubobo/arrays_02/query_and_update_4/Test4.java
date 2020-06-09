package liuyubobo.arrays_02.query_and_update_4;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 20:52
 **/
public class Test4 {
    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);
    }
}
