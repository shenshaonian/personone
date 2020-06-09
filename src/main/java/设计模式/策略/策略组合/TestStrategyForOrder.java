package 设计模式.策略.策略组合;

import 设计模式.策略.策略组合.下单模板.AbstractOrder;
import 设计模式.策略.策略组合.下单模板.实际下单渠道.OrderAliPay;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 范子祺
 **/
public class TestStrategyForOrder {
    public static void main(String[] args) {
        AbstractOrder order = new OrderAliPay();
        List<Object> objects = new ArrayList<>();
        order.createOmsOrder(objects);
    }
}
