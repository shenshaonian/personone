package liuyubobo.stacks_and_queues_03.array_stack_02;

/**
 * @description:
 * @author: 范子祺
 **/
public class TestArrayStack_02 {
    public static void main(String[] args) {
        ArrayStack<Object> s = new ArrayStack<>();

        for (int i = 0; i < 5; i++) {
            s.push(i);
            System.out.println(s);
        }
        s.pop();
        System.out.println(s);

        System.out.println(s.peak() + "\n" + s.isEmpty());
    }
}
