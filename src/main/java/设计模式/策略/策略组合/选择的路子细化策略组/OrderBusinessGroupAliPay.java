package 设计模式.策略.策略组合.选择的路子细化策略组;

import 设计模式.策略.策略组合.AbstractOrderBusinessGroup;
import 设计模式.策略.策略组合.OrderBusiness;
import 设计模式.策略.策略组合.实现策略.细化策略.OrderBusinessBeginAcceptTime;
import 设计模式.策略.策略组合.实现策略.细化策略.OrderBusinessCityCode;
import 设计模式.策略.策略组合.实现策略.细化策略.OrderBusinessCoupon;
import 设计模式.策略.策略组合.实现策略.细化策略.OrderBusinessDeliveryMode;
import 设计模式.策略.策略组合.实现策略.细化策略.OrderBusinessEndAcceptTime;
import 设计模式.策略.策略组合.实现策略.细化策略.OrderBusinessExpress;
import 设计模式.策略.策略组合.实现策略.细化策略.OrderBusinessLogistics;
import 设计模式.策略.策略组合.实现策略.细化策略.OrderBusinessShipper;
import 设计模式.策略.策略组合.实现策略.细化策略.OrderBusinessTransportMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:支付宝服务窗业务分组
 * @author: 范子祺
 **/
public class OrderBusinessGroupAliPay extends AbstractOrderBusinessGroup {


    @Override
    public List<OrderBusiness> getGroupBusiness() {
        List<OrderBusiness> businessList = new ArrayList<OrderBusiness>();
        businessList.add(new OrderBusinessBeginAcceptTime());
        businessList.add(new OrderBusinessEndAcceptTime());
        businessList.add(new OrderBusinessCoupon());
        businessList.add(new OrderBusinessTransportMode());
        businessList.add(new OrderBusinessDeliveryMode());
        businessList.add(new OrderBusinessShipper());
        businessList.add(new OrderBusinessCityCode());
        businessList.add(new OrderBusinessExpress());
        businessList.add(new OrderBusinessLogistics());
        return businessList;
    }
}
