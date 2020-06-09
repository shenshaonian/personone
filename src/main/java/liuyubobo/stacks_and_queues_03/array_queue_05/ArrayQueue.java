package liuyubobo.stacks_and_queues_03.array_queue_05;

/**
 * @description:
 * @author: 范子祺
 **/
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    //1
    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    //2
    public ArrayQueue() {
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
    public void enqueue(E e) {
        array.addLast(e);
    }

    //7
    @Override
    public E dequeue() {
        return array.removeFisrt();
    }

    //8
    @Override
    public E getFront() {
        return array.getFirst();
    }

    //9

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("myQueue:size=%d,capacity=%d :\n", getSize(), getCapacity()));
        stringBuilder.append("[");
        for (int i = 0; i < getSize(); i++) {
            stringBuilder.append(array.get(i));
            if (getSize() - 1 != i) {
                stringBuilder.append(',');
            }
        }
        stringBuilder.append("] tail/last");
//        return array.toString();
        return stringBuilder.toString();

//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(String.format("myStacke: size=%d,capacity=%d :\n",getSize(),getCapacity()));
//        stringBuilder.append('[');
//        for (int i = 0; i < getSize(); i++) {
//            stringBuilder.append(array.get(i));
//            if (getSize()-1 != i){
//                stringBuilder.append(',');
//            }
//        }
//        stringBuilder.append("] top/last");
//        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ArrayQueue<String> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(String.valueOf(i) + "yuansu");
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
        System.out.println(queue);
    }
}
