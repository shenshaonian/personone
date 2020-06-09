package 设计模式.抽象工厂.search;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: 范子祺
 **/
public class ExpertSyncJob extends SyncJobBase {
    @Override
    protected void doSync(boolean isFull) {
        super.doSyncWithProvider(isFull, new DoSyncProvider<ExpertRepository>() {

            @Override
            public Long maxId() {
                return null;
            }

            @Override
            public int stepSize() {
                return 0;
            }

            @Override
            public List<ExpertRepository> findByRange(Long startId, Long endId, Date lastUpdateTime) {
                return null;
            }

            @Override
            public void updateByList(List<ExpertRepository> beans) {

            }
        });
    }


}
