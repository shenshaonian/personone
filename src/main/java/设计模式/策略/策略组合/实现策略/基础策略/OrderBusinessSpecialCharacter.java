package 设计模式.策略.策略组合.实现策略.基础策略;

import 设计模式.策略.策略组合.OrderBusiness;

import java.util.List;

/**
 * @description:特殊字符处理
 * @author: 范子祺
 **/
public class OrderBusinessSpecialCharacter implements OrderBusiness {

    @Override
    public List<Object> businessCriteria(List<Object> requestList) {
        System.out.println("1-特殊字符处理-----");
        return null;
    }
}
