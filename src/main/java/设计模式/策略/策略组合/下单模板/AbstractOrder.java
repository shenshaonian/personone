package 设计模式.策略.策略组合.下单模板;

import 设计模式.策略.策略组合.OrderBusiness;

import java.util.List;

/**
 * @description:
 * @author: 范子祺
 **/
public abstract class AbstractOrder<T extends Object> {

    /**
     * 业务分组
     *
     * @return
     */
    public abstract OrderBusiness orderBusinessGroup();

    public T createOmsOrder(List<Object> requestVO) {

        /** 验证码校验 */
//        if (DepponStringUtils.isEmpty(requestVO.getOrderPerson())) {
//            shortMsgCodeService.verifyShortMsgCode(requestVO.getShipperPhone(),requestVO.getVerifyCode(),ShortMsgType.CREATEORDER_NOLOGIN);
//        }

        /** 参数校验 */
//        checkParam(requestVO);

        /** oms多个订单信息 */
//        List<OrderRequest> omsRequestList = bulidOmsOrderReceiveRequest(requestVO);

        /**
         * 处理业务逻辑
         * */
        List<Object> objects = doBusinessCriteria(requestVO);

        T result = (T) bulidOrderResult(objects);
        return result;

        /** 生成订单号 */
//        generateOrderNumber(omsRequestList,requestVO);
//
//        /**
//         * 订单编号
//         * */
//        List<String> orderNumbers = new ArrayList<String>();
//
//        for (int i = 0; i < omsRequestList.size(); i++) {
//            OrderRequest omsRequest = omsRequestList.get(i);
//
//            /** 分发业务 */
//            distributeBusiness(omsRequest);
//
//            /** 数据埋点需要 用户名 */
//            requestVO.setOrderPerson(omsRequest.getOrderPerson());
//            /** 数据埋点需要 订单号 */
//            requestVO.getReceive().get(i).setOrderNumber(omsRequest.getOrderNumber());
//
//            /** 判断省份是否港澳台，是则走ibs，不是走ows */
//            OrderToOmsOrIbsVO orderToOmsOrIbsVO = checkProvinceCode(omsRequest);
//
//            /** oms下单 */
//            OrderResponse omsResponse = omsCreateOrder(omsRequest, orderToOmsOrIbsVO);
//
//            /** 线程池处理 */
//            asyncThreadPool(omsRequest, omsResponse, requestVO, orderToOmsOrIbsVO);
//
//            /**
//             * 如果订单下单成功
//             * */
//            if (omsResponse.isSuccess()) {
//                orderNumbers.add(omsRequest.getOrderNumber());
//                callItemOrderSuccess(omsRequest, omsResponse, requestVO);
//            } else {
//                throw new OrderServiceException(handelOmsErrorMessage(omsResponse.getExceptionMsg()));
//            }
//        }
//
//        T result = callOrderSuccess(omsRequestList, requestVO);
//
//        if(result==null) {
//            result = (T) bulidOrderResult(orderNumbers);
//        }
//
//        return result;
    }

    /**
     * 构建返回成功的基础参数
     *
     * @param orderNumbers
     * @return
     */
    public Object bulidOrderResult(List<Object> orderNumbers) {
        Object result = new Object();

        return result;
    }

    /**
     * 处理业务逻辑
     *
     * @param omsRequestList
     * @return
     */
    public List<Object> doBusinessCriteria(List<Object> omsRequestList) {
        return orderBusinessGroup().businessCriteria(omsRequestList);
    }
}
