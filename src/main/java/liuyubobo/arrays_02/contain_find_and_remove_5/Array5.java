package liuyubobo.arrays_02.contain_find_and_remove_5;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 20:55
 **/
public class Array5 {
    private int[] data;
    private int size;

    public Array5(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array5() {
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

    public void addFirst(int e) {
        add(0, e);
    }

    public void addLast(int e) {
        add(size, e);
    }

    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException();
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return data[index];
    }

    public void set(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        data[index] = e;
    }

    public boolean contains(int e) {
        for (int b : data) {
            if (b == e) {
                return true;
            }
        }
        return false;
    }

    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        int ret = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = 0;
        return ret;
    }

    public int removeFirst() {
        return remove(0);
    }

    public int removeLast() {
        return remove(size - 1);
    }

    public void removeElement(int e) {
        int index = find(e);
        if (-1 != index) {
            remove(index);
            System.out.println("remove success");
            return;
        }
        System.out.println("remove fail");
    }

    @Override
    public String toString() {
        StringBuilder rs = new StringBuilder();
        ;
        rs.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
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
