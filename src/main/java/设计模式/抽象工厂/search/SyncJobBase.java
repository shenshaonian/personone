package 设计模式.抽象工厂.search;

import java.util.Date;
import java.util.List;

/**
 * @description: 抽象类和方法，doSync想象成一个人，  DoSyncProvider这个想象成从一个人身上抽取出来的一个行为，
 * 比如说是买菜，做饭，吃饭，清洗。  doSyncWithProvider这个则是两个抽象的联合 人+行为  + 实施步骤，doSyncWithProvider这个
 * 就是一个实施的步骤
 * @author: 范子祺
 **/
public abstract class SyncJobBase {

    protected abstract void doSync(boolean isFull);

    // 提供同步相关接口
    protected static interface DoSyncProvider<T extends SyncBeanBaseInterface> {

        Long maxId();

        int stepSize();

        List<T> findByRange(Long startId, Long endId, Date lastUpdateTime);

        void updateByList(List<T> beans);
    }

    protected <T extends SyncBeanBaseInterface> void doSyncWithProvider(boolean isFull, DoSyncProvider<T> doSyncProvider) {
        Date begin = new Date();
        Long maxId = doSyncProvider.maxId();
        if (maxId == null) {
            return;
        }

//        Date lastUpdateTime = getLastUpdateTime(isFull);
//        int step = doSyncProvider.stepSize();
//
//        Long startId = 0L;
//        while (startId <= maxId) {
//            long endId = startId + step;
//
//            List<T> beanInterfaces = doSyncProvider.findByRange(startId, endId, lastUpdateTime);
//
//            if (CollectionsUtil.isNullOrEmpty(beanInterfaces)){
//                startId = endId;
//                continue;
//            }
//
//            doSyncProvider.updateByList(beanInterfaces);
//            startId = endId;
//            logger.debug("isFull:{}, job:{} processed {}/{}.", isFull, getMarkKey(), startId, maxId);
//        }
//        saveLastUpdateTime(begin);

    }

}
