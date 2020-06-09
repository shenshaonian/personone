package liuyubobo.arrays_02.dynamic_ary7;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 22:43
 **/
public class A7<E> {
    private E[] data;
    private int size;

    public A7(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public A7() {
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
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add out size");
        }
        if (size == data.length) {
            resize(2 * data.length);
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }

    public void addLast(E e) {
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("get index . wrong");
        }
        return data[index];
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("set index e . worong");
        }

        data[index] = e;
    }

    public boolean contain(E e) {
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
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index remove..  wrong");
        }

        E rs = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = null;

        if (size == data.length / 2) {
            resize(data.length / 2);
        }
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
            return;
        }
        System.out.println("removeElement fail");

    }

    @Override
    public String toString() {
        StringBuilder rs = new StringBuilder();
        rs.append(String.format("array: size = %d, capacity = %d\n", size, getCapacity()));
        rs.append("[");
        for (int i = 0; i < size; i++) {
            rs.append(data[i]);
            if (i != size - 1) {
                rs.append(",");
            }
        }
        rs.append("]");
        return rs.toString();
    }
}
