package liuyubobo.stacks_and_queues_03.array_stack_02;

/**
 * @description:
 * @author: 范子祺
 */
public interface Stack<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peak();
}

