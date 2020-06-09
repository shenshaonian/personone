package liuyubobo.stacks_and_queues_03.array_queue_05;

/**
 * @description:
 * @author: 范子祺
 **/
public class Array<E> {
    private E[] data;
    private int size;

    //    1 有参构造数组函数，A(capacity)
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //2 无参构造函数，默认容量n
    public Array() {
        this(10);
    }

    //3 获得数组的容量
    public int getCapacity() {
        return data.length;
    }

    //4 获得数组中元素的个数
    public int getSize() {
        return size;
    }

    //5 判断数组是否为空
    public boolean isEmpty() {
        return 0 == size;
    }

    //6 在索引index处插入元素e
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("> size");
        }
        if (size == getCapacity()) {
            resize(data.length * 2);
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;

    }

    //7 向所有元素后面/在数组末尾添加一个新元素
    public void addLast(E e) {
        add(size, e);
    }

    //8 向所有元素前面/在数组首位添加一个新元素
    public void addFirst(E e) {
        add(0, e);
    }

    //9 获取index索引未知的元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("out size");
        }
        return data[index];
    }

    //10 获得最后一个元素
    public E getLast() {
        return get(size - 1);
    }

    //11 获得第一个元素
    public E getFirst() {
        return get(0);
    }

    //12 修改index索引位置的元素为e
    public void set(E e, int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index out of size");
        }
        data[index] = e;
    }

    //13 查找数组中是否有元素e
    public boolean contains(E e) {
        for (E s : data) {
            if (s.equals(e)) {
                return true;
            }
        }
        return false;
    }

    //14 查找数组中元素e所在的索引，存在返回索引，不存在返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    //  15 从数组中删除index位置的元素，返回删除的元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("out of size");
        }
        E rme = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        data[size - 1] = null;
        size--;
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }

        return rme;
    }

    //16 删除数组中的第一个元素，返回删除的元素
    public E removeFisrt() {
        return remove(0);
    }

    //17 删除数组中最后一个元素，返回删除的元素
    public E removeLast() {
        return remove(size - 1);
    }

    //18 从数组中删除元素e
    public void removeE(E e) {
        int index = find(e);
        if (-1 != index) {
            remove(index);
            return;
        }
        System.out.println(e + "not exist");
    }

//19 重写toString

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("MyArray:size=%d---capacity=%d\n", size, getCapacity()));
        stringBuilder.append('[');
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (size - 1 != i) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    //20 resisze

    public void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
