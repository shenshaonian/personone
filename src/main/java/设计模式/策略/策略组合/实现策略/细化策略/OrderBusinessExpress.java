package 设计模式.策略.策略组合.实现策略.细化策略;

import 设计模式.策略.策略组合.OrderBusiness;

import java.util.List;

/**
 * @description:针对快递产品逻辑
 * @author: 范子祺
 **/
public class OrderBusinessExpress implements OrderBusiness {
    @Override
    public List<Object> businessCriteria(List<Object> requestList) {
        System.out.println("2-针对快递产品逻辑----- ");
        return null;
    }
}