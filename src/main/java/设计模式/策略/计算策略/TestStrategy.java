package 设计模式.策略.计算策略;

/**
 * @description:
 * @author: 范子祺
 **/
public class TestStrategy {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        int a = context.executeStrategy(1, 2);
        System.out.println(a);
    }
}
