package 设计模式.策略.策略组合.实现策略.细化策略;

import 设计模式.策略.策略组合.OrderBusiness;

import java.util.List;

/**
 * @description:发货网点
 * @author: 范子祺
 **/

public class OrderBusinessStartStation implements OrderBusiness {
    @Override
    public List<Object> businessCriteria(List<Object> requestList) {
        System.out.println("2-发货网点----- ");
        return null;
    }
}