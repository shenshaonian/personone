package liuyubobo.stacks_and_queues_03.array_stack_02;

/**
 * @description:
 * @author: 范子祺
 **/
public class Array<E> {
    private E[] data;
    private int size;

    //1
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //2
    public Array() {
        this(10);
    }

    //3
    public int getCapacity() {
        return data.length;
    }

    //4
    public int getSize() {
        return size;
    }

    //5
    public boolean isEmpty() {
        return size == 0;
    }

    //6
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("more than size");
        }
        if (size == data.length) {
            resize(2 * data.length);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    //7
    public void addLast(E e) {
        add(size, e);
    }

    //8
    public void addFirst(E e) {
        add(0, e);
    }

    //9
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("more than size");
        }
        return data[index];
    }

    //10
    public E getLast() {
        return get(size - 1);
    }

    //11
    public E getFirst() {
        return get(0);
    }

    //12
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("more than size");
        }
        data[index] = e;
    }

    //13
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //14
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //15
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("more than size");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return ret;
    }

    //16
    public E removeFirst() {
        return remove(0);
    }

    //17
    public E removeLast() {
        return remove(size - 1);
    }

    //18
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
            return;
        }
        System.out.printf(e + "not exist");
    }

    //19
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    //20
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array size=%d,capacity=%d\n", size, getCapacity()));
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
}
