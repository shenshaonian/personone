package liuyubobo.stacks_and_queues_03.more_about_leetcode_04;

/**
 * @description:
 * @author: 范子祺
 */
public interface Stack<E> {
    int getSize();

    E pop();

    E peek();

    boolean isEmpty();

    void push(E e);
}

