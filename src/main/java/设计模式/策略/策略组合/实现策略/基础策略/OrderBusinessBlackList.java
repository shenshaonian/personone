package 设计模式.策略.策略组合.实现策略.基础策略;

import 设计模式.策略.策略组合.OrderBusiness;

import java.util.List;

/**
 * @description:黑名单校验
 * @author: 范子祺
 **/
public class OrderBusinessBlackList implements OrderBusiness {
    @Override
    public List<Object> businessCriteria(List<Object> requestList) {
        System.out.println("1-黑名单校验-----缓存服务 ---黑名单key前缀");
        return null;
    }
}