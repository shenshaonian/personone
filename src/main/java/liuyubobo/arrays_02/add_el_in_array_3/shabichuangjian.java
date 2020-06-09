package liuyubobo.arrays_02.add_el_in_array_3;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-29 11:08
 **/
public class shabichuangjian {
    @Test
    public void test() {
        Array a = new Array();
        a.addFirst(1);
        a.addFirst(2);
        a.addFirst(3);
        a.addFirst(4);
        a.addFirst(5);
        a.addFirst(6);
        a.add(3, 10);
        for (int i = 0; i < a.size; i++) {
            System.out.println(a.data[i]);
        }

        System.out.println("zuile");
    }

    public class Array {
        private int[] data;
        private int size;

        public Array(int capacity) {
            data = new int[capacity];
            size = 0;
        }

        public Array() {
            this(10);
        }

        public int getCapacity() {
            return data.length;
        }

        public int getSize() {
            return size;
        }

        public boolean isEmpty() {
            return 0 == size;
        }

        public void addLast(int e) {
            if (size == data.length) {
                throw new IllegalArgumentException("array full");
            }
            data[size] = e;
            size++;
        }

        public void addFirst(int e) {
            if (size == data.length) {
                throw new IllegalArgumentException("array full");
            }
            for (int i = size; i > 0; i--) {
                data[i] = data[i - 1];
            }
            data[0] = e;
            size++;
        }

        //index是索引,i是有值length
        public void add(int index, int e) {
            if (size == data.length) {
                throw new IllegalArgumentException("array full");
            }
            if (index < 0 || index > size) {
                throw new IllegalArgumentException("array break");
            }

            for (int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = e;
            size++;
        }


    }
}

