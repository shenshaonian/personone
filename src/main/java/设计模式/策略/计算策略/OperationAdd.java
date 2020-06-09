package 设计模式.策略.计算策略;

/**
 * @description: 加法策略
 * @author: 范子祺
 **/
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
