package 设计模式.策略.策略组合;

import java.util.List;

/**
 * @description: 锦囊
 * @author: 范子祺
 */
public interface OrderBusiness {
    List<Object> businessCriteria(List<Object> requestList);
}

