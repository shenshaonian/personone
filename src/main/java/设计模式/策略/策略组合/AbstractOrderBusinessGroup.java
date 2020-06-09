package 设计模式.策略.策略组合;

import 设计模式.策略.策略组合.实现策略.基础策略.OrderBusinessBlackList;
import 设计模式.策略.策略组合.实现策略.基础策略.OrderBusinessDefault;
import 设计模式.策略.策略组合.实现策略.基础策略.OrderBusinessMobile;
import 设计模式.策略.策略组合.实现策略.基础策略.OrderBusinessSpecialCharacter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 基础策略组合
 * @author: 范子祺
 **/
public abstract class AbstractOrderBusinessGroup implements OrderBusiness {

    //    private List<OrderBusiness> orderBusinessList;
    public abstract List<OrderBusiness> getGroupBusiness();

    @Override
    public List<Object> businessCriteria(List<Object> requestList) {

        /**基础业务组*/
        List<OrderBusiness> baseBusinessList = getBaseOrderGroup();

        List<OrderBusiness> groupBusiness = getGroupBusiness();
        if (null != groupBusiness) {
            baseBusinessList.addAll(groupBusiness);
        }

        for (OrderBusiness s : baseBusinessList) {
            s.businessCriteria(requestList);
        }

        return requestList;
    }

    private List<OrderBusiness> getBaseOrderGroup() {
        ArrayList<OrderBusiness> businessArrayList = new ArrayList<>();
        businessArrayList.add(new OrderBusinessDefault());
        businessArrayList.add(new OrderBusinessBlackList());
        businessArrayList.add(new OrderBusinessMobile());
        businessArrayList.add(new OrderBusinessSpecialCharacter());
        return businessArrayList;
    }
}
