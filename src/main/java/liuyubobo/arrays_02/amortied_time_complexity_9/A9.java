package liuyubobo.arrays_02.amortied_time_complexity_9;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-31 11:07
 **/
public class A9<E> {
    private E[] data;
    private int size;

    public A9(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public A9() {
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
            throw new IllegalArgumentException("add e at index. index is illegal!");
        }
        if (size == getCapacity()) {
            resize(2 * getCapacity());
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }

    public void addFisrt(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("get el at index.  out of index");
        }
        return data[index];
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("set fail");
        }
        data[index] = e;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == (e)) {
                return true;
            }
        }
        return false;
    }

    //不要用equal的原因是，面对对象的时候，equal应该重写
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("remove failed. index is illegal");
        }

        E rme = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;

        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return rme;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }


    public void removeElement(E e) {
        int index = find(e);
        if (-1 == index) {
            System.out.println(e + "is not exist!");
            return;
        }
        remove(index);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("array: size = %d,capacity = %d\n", size, getCapacity()));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (size - 1 != i) {
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }

    private void resize(int newCapacity) {
        E[] temp = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
}
