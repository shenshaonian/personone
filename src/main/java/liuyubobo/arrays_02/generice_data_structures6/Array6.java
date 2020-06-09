package liuyubobo.arrays_02.generice_data_structures6;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 21:31
 **/
public class Array6<E> {
    private E[] data;
    private int size;

    public Array6(int capacity) {
//        data = new Array6<E>[capacity];
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array6() {
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

    public void add(int index, E e) {
        if (data.length == size) {
            throw new IllegalArgumentException();
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("out index");
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;

        size++;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index less 0 or  equal more size");
        }
    }

    public E get(int index) {
        checkIndex(index);
        return get(index);
    }

    public void set(int index, E e) {
        checkIndex(index);
        data[index] = e;
    }

    //这里要考虑，data里面有没有null，还有equal的标准要重新定义也就是equal要重写
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public E remove(int index) {
        checkIndex(index);
        E rs = data[index];
        for (int i = index; i < size - 1; i++) {
            data[index] = data[index + 1];
        }
        size--;
        data[size] = null;
        return rs;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public void removeElement(E e) {
        int index = find(e);
        if (-1 != index) {
            remove(index);
            System.out.println("remove success\n");
        }
        System.out.println("this element not in here\n");
    }

    @Override
    public String toString() {
        StringBuilder rs = new StringBuilder();
        rs.append(String.format("array:size = %d,capacity = %d\n", size, getCapacity()));
        rs.append("[");
        for (int i = 0; i < size; i++) {
            rs.append(data[i]);
            if (size - 1 != i) {
                rs.append(",");
            }
        }
        rs.append("]");
        return rs.toString();

    }
}
