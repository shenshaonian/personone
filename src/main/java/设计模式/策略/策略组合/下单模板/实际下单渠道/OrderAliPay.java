package 设计模式.策略.策略组合.下单模板.实际下单渠道;

import 设计模式.策略.策略组合.OrderBusiness;
import 设计模式.策略.策略组合.下单模板.AbstractOrder;
import 设计模式.策略.策略组合.选择的路子细化策略组.OrderBusinessGroupAliPay;

/**
 * @description:阿里服务窗下单
 * @author: 范子祺
 **/
public class OrderAliPay extends AbstractOrder {
    @Override
    public OrderBusiness orderBusinessGroup() {
        return new OrderBusinessGroupAliPay();
    }


}
