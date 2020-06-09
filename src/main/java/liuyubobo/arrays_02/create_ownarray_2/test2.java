package liuyubobo.arrays_02.create_ownarray_2;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 11:11
 **/
public class test2 {
    public static void main(String[] args) {
        Array_2 array_2 = new Array_2(20);

        System.out.println("capacity:" + array_2.getCapacity()
                + "  size:" + array_2.getSize()
                + "   是否为空:" + array_2.isEmpty());

        System.out.println(String.format("capacity:%d" +
                        "\n" + "size:%d" +
                        "\n" + "isEmpty:%b",
                array_2.getCapacity(), array_2.getSize()
                , array_2.isEmpty()));

    }
}

//public class test2 {
//    public static void main(String[] args){
//        Array_2 array_2 = new Array_2();
//        System.out.println("capacity:"+array_2.getCapacity());
//        System.out.println(array_2.getSize());
//        System.out.println(array_2.isEmpty());
//
//
//    }
//}
