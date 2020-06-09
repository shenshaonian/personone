package liuyubobo.stacks_and_queues_03.array_queue_05;

/**
 * @description:first in first out
 * @author: 范子祺
 */
public interface Queue<E> {
    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();
}

