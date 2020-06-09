package 设计模式.策略.计算策略;

/**
 * @description: 策略组
 * @author: 范子祺
 **/
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doOperation(a, b);
    }
}
