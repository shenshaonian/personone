package liuyubobo.arrays_02.create_ownarray_2;

/**
 * @description:int[] 类比写
 * @author: 范子祺
 * @create: 2019-05-30 11:06
 **/
public class Array_2 {
    private int[] data;
    private int size;

    public Array_2(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array_2() {
        this(10);
    }

    public int getCapacity() {
        return data.length;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}

//public class Array_2 {
//    private int[] data;
//    private int size;
//
//    public Array_2(int capacity){
//        data = new int[capacity];
//        size = 0;
//    }
//
//    public Array_2(){
////        data = new int[10];
////        this.size = 0;
//        this(10);
//    }
//
//    public int getCapacity(){
//        return data.length;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public boolean isEmpty(){
//        return size == 0;
//    }
//}
