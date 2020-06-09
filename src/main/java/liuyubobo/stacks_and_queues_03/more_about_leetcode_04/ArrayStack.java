package liuyubobo.stacks_and_queues_03.more_about_leetcode_04;

/**
 * @description:
 * @author: 范子祺
 **/
public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    //1
    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    //2
    public ArrayStack() {
        array = new Array<>();
    }


    //3
    @Override
    public int getSize() {
        return array.getSize();
    }


    //4
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    //5
    public int getCapacity() {
        return array.getCapacity();
    }

    //6
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    //7
    @Override
    public E pop() {
        return array.removeLast();
    }


    //8
    @Override
    public E peek() {
        return array.getLast();
    }

    //9
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("myStacke: size=%d,capacity=%d\n", getSize(), getCapacity()));
        stringBuilder.append('[');
        for (int i = 0; i < getSize(); i++) {
            stringBuilder.append(array.get(i));
            if (getSize() - 1 != i) {
                stringBuilder.append(',');
            }
        }
        stringBuilder.append("] top/last");
        return stringBuilder.toString();
    }
}
